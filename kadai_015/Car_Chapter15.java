package kadai_015;

public class Car_Chapter15 {
	
	//車のフィールド（情報）を示す

	private int gear	= 1;
	private int speed	= 10;
	
	public void changeGear(int afterGear) {
		
		//最初は一速ですよってことをここで宣言
		int beforeGear = this.gear;
		
		//ここから、gearを変化させた時の対応を宣言している
		this.gear	= afterGear;
		this.speed	= switch(afterGear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		};
	
		System.out.println("ギアが" + beforeGear + "から" + gear + "に変更されました");
	}
	public void run() {
		
		System.out.println("現在の速度は、" + this.speed + "です。");
	}
}
