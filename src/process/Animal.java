package process;

public class Animal {
	//フィールドの宣言
	private String name;
	private double height;
	private int speed;
	
	
	//コンストラクタの定義
	public Animal(String name,double height,int speed) {
		this.name=name;
		this.height=height;
		this.speed=speed;
	}
	
	//ゲッターとセッター
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
