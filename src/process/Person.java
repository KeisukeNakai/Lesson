package process;

public class Person {
	private static int count=0;
	
	
	//インスタンスフィールドの定義(問題では、ゲッターを使用しないのでpublic)
	public String name;
	public int age;
	public double height;
	public double weight;
	
	//コンストラクタの定義
	public Person(String name,int age,double height,double weight) {
		this.name=name;
		this.age=age;
		this.height=height;	
		this.weight=weight;
		
		count++;
	}
	
	//BMIを計算して戻り値を返すインスタンスメソッド
    public double bmi() {
    	return this.weight/(this.height*this.height);
    }
    
    //情報を表示するインスタンスメソッド
    public void print() {
    	System.out.println("名前は"+this.name+"です");
    	System.out.println("年は"+this.age+"才です");
    	System.out.println("BMIは"+Math.floor(bmi())+"です");//小数点以下切り捨て
    }
    //生成されたインスタンスの数を表示するメソッド
    public void people() {
    	System.out.println("合計"+count+"人です");
    }
}
