import java.util.HashMap;

public class FIB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = 	Util.readFromFileAndReturnAsStringList("rosalind_fib.txt").get(0);
		int n = Integer.parseInt(s.split(" ")[0]), k = Integer.parseInt(s.split(" ")[1]);
		int month = 1;
		long NumberOfAdultRabbits = 0;
		long NumberOfKidRabbits = 1;
		long currentGenerationKidRabbits;
		while (month < n) {
			month++;
			currentGenerationKidRabbits = NumberOfKidRabbits;
			NumberOfKidRabbits = NumberOfAdultRabbits * k;

			NumberOfAdultRabbits = NumberOfAdultRabbits
					+ currentGenerationKidRabbits;

		}

		System.out.println(NumberOfAdultRabbits+NumberOfKidRabbits);
	}

}
