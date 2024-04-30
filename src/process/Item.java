package process;


public class Item {

	//（コンストラクタ）メンバー変数の宣言
		private String name;
		private double height;
		private int speed;
		
		public Item(String name,double height,int speed) {
			
			this.name=name;
			this.height=height;
			this.speed=speed;
		}
		
		//ゲッター
		public  String  getName() {
			return name;
			
		}
		
		public  double  getHeight() {
			return height;
			
		}
		
		public  int  getSpeed() {
			return speed;
			
		}
		
		//セッター
		public void setName(String name) {
			this.name=name;
		}
		
		public void setHeight(double height) {
			this.height=height;
		}
		
		public void setSpeed(int speed) {
			this.speed=speed;
		}
		
}