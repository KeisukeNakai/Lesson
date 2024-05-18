package process;

public class Person {
    public static int count = 0;
    public String firstName;
    public String lastName;
    public int age;
    public double height, weight;

    // コンストラクタ1：lastNameがない場合
    public Person(String firstName, int age, double height, double weight) {
    	this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
    }

    // コンストラクタ2：lastNameがある場合
    public Person(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        Person.count++;
    }

    // fullNameを返すメソッド
    public String fullName(){
    	return this.firstName + this.lastName;
    }

    // 情報の表示
    public void print() {
        System.out.println("名前は" + this.fullName() + "です");
        System.out.println("年は" + this.age + "です");
    }

    // BMIの計算
    public double bmi() {
    	return this.weight / this.height / this.height;
    }

    // 合計人数の表示
    public static void printCount() {
        System.out.println("合計" + Person.count + "人です");
    }
}
