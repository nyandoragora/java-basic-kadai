package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {

		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		String[] engList = {"apple" , "banana" , "grape" , "orange"};
		
		for(int i=0; i<engList.length; i++) {
			dictionary.checkDictionary(engList[i]);
		}
		
	}

}
