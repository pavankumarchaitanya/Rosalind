import java.util.HashMap;


public class REVC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =Util.readFromFileAndReturnAsStringList("rosalind_revc.txt").get(0);//"AAAACCCGGT";
		
		s= s.replaceAll("A", "X");
		s= s.replaceAll("T", "A");
		s= s.replaceAll("X", "T");
		
		s= s.replaceAll("C", "X");
		s= s.replaceAll("G", "C");
		s= s.replaceAll("X", "G");
		StringBuffer sb = new StringBuffer(s);
		sb = sb.reverse();
		System.out.println(sb);
	}

}
