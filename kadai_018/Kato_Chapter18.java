package kadai_018;

abstract class Kato_Chapter18 {
	
	//姓名、住所のフィールド
	public String familyName = "加藤";
	
	public String givenName;
	
	public String address = "住所は東京都中野区〇×です";
	
	
	
	//親クラスのメソッド
	
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println(address);
	}
	
	//ここは各々違うこと書いてるので抽象メソッド
	public abstract void eachIntroduce();
	
	
	//自己紹介の実行コマンド
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		
	}
	
	
}
