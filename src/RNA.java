import java.util.HashMap;


public class RNA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = Util.readFromFileAndReturnAsStringList("rosalind_rna.txt").get(0);//"AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
		
		s= s.replaceAll("T", "U");
		
		System.out.println(s);
	}

}
