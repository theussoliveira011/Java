public class ExerciseRandomWords{
	public static void main(String[] args){
	
		String[] wordList1 = {"Rico", "Pobre", "Classe Média", "Classe Média Alta"};
		String[] wordList2 = {"Programador", "Vidente", "Professor", "Editor", "Fotográfo", "Palhaço"};
		String[] wordList3 = {"Casado", "Solteiro", "Namorado", "Enrolado", "Encalhado"};

		int oneLength = wordList1.length;
		int twoLength = wordList2.length;
		int threeLength = wordList3.length;

		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);

		String phrase = "Your profession is: " + wordList2[rand2] + " You are: " + wordList1[rand1] + " Your relation ship status is: " + wordList3[rand3];
 		
		System.out.println(phrase);
	}
}
