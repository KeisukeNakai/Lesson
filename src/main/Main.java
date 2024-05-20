package main;

import process.Bicycle;
import process.Car;
import process.Person;

public class Main {
    public static void main(String[] args) {
    	
    	//Personクラスのインスタンスの生成
        Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
        person1.print();//情報を表示するメソッドを呼び出す
        
        //Carクラスのインスタンスの生成
        Car car1 =new Car();
        car1.setOwner(person1.fullName());//セッターを呼び出し、鈴木太郎（person1）を所有者にする
        System.out.println(car1.getOwner());//car1の所有者の名前を出力
        
        //Personクラスのインスタンスの生成
        Person person2 = new Person("山田", "花子", 22, 1.5, 40);
        person2.print();//情報を表示するメソッドを呼び出す
        
        //Bicycleクラスのインスタンスの生成
        Bicycle bicycle1=new Bicycle();
        bicycle1.setOwner(person2.fullName());//セッターを呼び出し、山田花子（person2）を所有者にする
        System.out.println(bicycle1.getOwner());//bicycle1の所有者の名前を出力
        
        //合計人数をカウントするメソッドを呼び出す
        Person.printCount();
        
        //車を購入するメソッドを呼び出す
        person1.buy(car1);
        
        //自転車を購入するメソッドを呼び出す
        person2.buy(bicycle1);
    }
}
