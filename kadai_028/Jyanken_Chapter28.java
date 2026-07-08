package kadai_028;

//playGameで使う、Mapとhashmapをimportする
import java.util.HashMap;
import java.util.Map;

public class Jyanken_Chapter28 {
	//じゃんけんの定数（グーチョキパー）の定義（書き換えられないようにfinalつける）
		public static final String Rock = "r";
		public static final String Scissors = "s";
		public static final String Paper = "p";
		
	//メソッドgetMyChoiceの()中にString choiceを入れる、メソッドの()中が空だと何を判定すればいいかわからない
	//voidをつけるのは、データを取り込むだけで文字として出す必要がないから
	//↑これは間違っていた。実行クラスでMyChoiceをString型で使うから。
	public String getMyChoice(String myChoice) {
		//switch文を使ってじゃんけんの手が正しく入力されるか見る
		switch(myChoice) {
		case "r":
		case "s":
		case "p":
			return myChoice;
			
		//正しいときは何もしないでswitch文を抜ける(return choice;で返す）
			
		//r,s,p以外の文字を入力するとき
		default:
			System.out.println("エラー：r,s,pのいずれかを入力してください");
			return "";
		}

	}
	
	public String getRamdom() {
		//とりあえず三個分のString（文字）が入る箱作る
		String[] hands = new String[3];
		
		//箱の中にじゃんけんの手（インデックス）を指定して中身居れる
		hands[0] = "r";
		hands[1] = "s";
		hands[2] = "p";
		
		//乱数を使って対戦相手のじゃんけん手を選ぶ
		//まず、0~2の数字をランダムに生成するコードを作る
		int ramdomNumber = (int) Math.floor(Math.random() * 3);
		
		//returnで返す。returnの後に何をString型（hands[]）で返すのかを記述する
		//hands()は、箱と定義したモノと違う。hands[]が定義した箱。
		return hands[ramdomNumber];
		
	}
	
	//まず、playGameをして、()に二つの文字列(myChoice, opponentChoice)を受け取れるようにする
	public void playGame(String myChoice, String opponentChoice) {
		//mapを作成する。今回は<文字,　文字>で作るのでString、
		Map<String, String> jyankenChoice = new HashMap<String, String>();
		
		//データを追加する
		jyankenChoice.put("r", "グー");
		jyankenChoice.put("s", "チョキ");
		jyankenChoice.put("p", "パー");
		
		//自分と対戦相手がそれぞれ何を出したかで文字を出力する
		String MyChoice = jyankenChoice.get(myChoice);
		String OpponentChoice = jyankenChoice.get(opponentChoice);
		System.out.println("自分の手は" + MyChoice + ",");
		System.out.println("対戦相手の手は" + OpponentChoice);
		
		//じゃんけんの勝敗を設定する。あいこ、勝ちの条件を作って、それ以外を負けに設定する
		if(MyChoice.equals(OpponentChoice)) {
			System.out.println("あいこです");
			
		} else if((MyChoice.equals("r") && OpponentChoice.equals("s")) || (MyChoice.equals("s") && OpponentChoice.equals("p")) 
				|| (MyChoice.equals("p") && OpponentChoice.equals("r"))) {
			System.out.println("自分の勝ちです");
			
		} else {
			System.out.println("あなたの負けです");
		}
		
	}
	
		
	
}
