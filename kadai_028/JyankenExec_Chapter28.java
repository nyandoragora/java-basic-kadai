package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		
		String myChoice = "";
		String oppChoice = "";
		
		Jyanken_Chapter28 janken = new Jyanken_Chapter28();
		
		myChoice = janken.getMyChoice();
		oppChoice = janken.getRandom();
		janken.playGame(myChoice , oppChoice);
		
	

	}

}
