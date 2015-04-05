import java.util.HashMap;


public class DNA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> charCount = new HashMap<String,Integer>();
		String s = 	Util.readFromFileAndReturnAsStringList("rosalind_dna.txt").get(0);//"AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
		
	
		int temp =0;
for(char c : s.toCharArray())
{
	if(charCount.get(c+"")!=null)
	temp = charCount.get(c+"");
	else
		temp =0;
	
	charCount.put(c+"", ++temp);
	
}

System.out.print(charCount.get("A")+" " );
System.out.print(charCount.get("C")+" ");
System.out.print(charCount.get("G")+" ");
System.out.print(charCount.get("T"));
	}

}
