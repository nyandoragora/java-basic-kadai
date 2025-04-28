package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMyChoice() {
		
		String inputHand = "";
		boolean flag = true;
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		Scanner s = new Scanner(System.in);
		
		while(flag) {
			inputHand = s.next();
			
			switch(inputHand) {
				case "r","s","p" : flag = false;
								   break;
					   		   
				default : System.out.println("入力に誤りがあります。もう一度入力してください。");
				
			};
			
			
		}
		s.close();
		return inputHand;
	}

	public String getRandom() {
		
		String[] vsHand = {"r" , "s" , "p"};
		int serect = (int)Math.floor(Math.random() * 3);
		
		return vsHand[serect];
	}
	
	public void playGame(String myChoice , String oppChoice) {
		
		HashMap<String , String> choiceHand = new HashMap<>();
		choiceHand.put("r", "グー");
		choiceHand.put("s", "チョキ");
		choiceHand.put("p", "パー");
		
		String myHand = choiceHand.get(myChoice);
		String oppHand = choiceHand.get(oppChoice);
		
		System.out.println("自分の手は" + myHand + "、対戦相手の手は" + oppHand);
		
		if(myHand == "グー") {
			if(myHand.equals(oppHand)) {
				System.out.println("あいこです、");
			}
			else if(oppHand == "チョキ") {
				System.out.println("自分の勝ちです、");
			}
			else {
				System.out.println("自分の負けです、");
			}
		}
		if(myHand == "チョキ") {
			if(myHand.equals(oppHand)) {
				System.out.println("あいこです、");
			}
			else if(oppHand == "パー") {
				System.out.println("自分の勝ちです、");
			}
			else {
				System.out.println("自分の負けです、");
			}
		}
		if(myHand == "パー") {
			if(myHand.equals(oppHand)) {
				System.out.println("あいこです、");
			}
			else if(oppHand == "グー") {
				System.out.println("自分の勝ちです、");
			}
			else {
				System.out.println("自分の負けです、");
			}
		}
		
		
	}
}
