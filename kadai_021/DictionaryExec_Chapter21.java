package kadai_021;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		//実行クラスのインスタンス（実物）を作成
		Dictionary_Chapter21 dic = new Dictionary_Chapter21();
		
		//次に調べたい単語のリストを用意
			String[] targets = {"apple", "banana", "grape", "orange"};
			
		//辞書を調べるメソッドを引数指定で呼び出し
		dic.search(targets);
	}
}
