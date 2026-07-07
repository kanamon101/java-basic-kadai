package kadai_021;

import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter21 {

	//Stringの配列を受け取って処理するsearchメソッドを定義
		public void search(String[] targets) {
		//まず単語リストを作成
		Map<String, String> fluits = new HashMap<>();
		
		fluits.put("apple", "りんご");
		fluits.put("peach", "桃");
		fluits.put("banana", "バナナ");
		fluits.put("lemon", "レモン");
		fluits.put("pear", "梨");
		fluits.put("kiwi", "キウイ");
		fluits.put("strawberry", "イチゴ");
		fluits.put("grape", "ブドウ");
		fluits.put("muscat", "マスカット");
		fluits.put("cherry", "さくらんぼ");
		
		
		
			
		
		
		for(String word : targets) {
			//単語の意味（word）を辞書（fluits）から取り出す
			String fluitsMeaning = fluits.get(word);
			
			//ここからif文、get下単語の意味がnullじゃなかった場合
			if(fluitsMeaning != null ) {
				System.out.println(word + "の意味は" + fluitsMeaning);			
				
			//ここからelse文、単語の意味がnullだった場合
			} else {
				System.out.println(word + "は辞書に存在しません");
			}
			
		}	

	}

}
