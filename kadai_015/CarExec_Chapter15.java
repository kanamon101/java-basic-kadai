package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		
		//ここから車のインスタンス（設計図→実物の→のこと）を書く
		Car_Chapter15 myCar = new Car_Chapter15(); //この()は、初期設定（コンストラクタ）は何も指定しないという意味
		
		myCar.changeGear(3);
		myCar.run();
		
	}
	
}
