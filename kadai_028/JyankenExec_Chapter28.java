package kadai_028;

import java.util.Scanner;

public class JyankenExec_Chapter28 {
	//まず実行クラスのメインですよってことを宣言する
	public static void main(String[] args) {
		//Jyanken_Chapter28のクラス（設計図）をこの実行クラスで使える用インスタンス化する
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
		
		//自分のじゃんけんの手を入力
		//まず、自分のじゃんけん出す手をScannerする
		Scanner scanner = new Scanner(System.in);
		//文字入れるように画面に出す（r,s.pが入力されるまで無限ループさせる、while文を使う
		//スコープの壁を解決するため、ここでString myChoiceを宣言
		String myChoice = "";
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
		while(true) {
			
			String input = scanner.next();
			
			//myChoiceに入力した文字を入れ込む
			myChoice = jyanken.getMyChoice(input);
			
			//ここでr,s,p以外ならループさせる
			
			//r,s,pを入力したとき
			if(!myChoice.equals("")) {
				
				break;
			}
		}
		
		//scannerを閉じる
		scanner.close();
		
		//相手のじゃんけんの手を入力
		String opponentChoice = jyanken.getRamdom();
		
		//じゃんけんの結果を出力する
		jyanken.playGame(myChoice, opponentChoice);
	}
}
