package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	HashMap<String , String> dictionary = new HashMap<String , String>(); 
	
	public Dictionary_Chapter21() {
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウイ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}
	
	public void checkDictionary(String[] engList) {
		
		for(int i = 0; i < engList.length; i++) {
			
			if(dictionary.get(engList[i])==null) {
				System.out.println(engList[i] + "は辞書に存在しません");
			}
			else {
				System.out.println(engList[i] + "の意味は" + dictionary.get(engList[i]));
			}
		}
	}
	
}
