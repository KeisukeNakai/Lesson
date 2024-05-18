package main;

import process.Person;

public class Main {
    public static void main(String[] args) {
    	
    	//インスタンス1つ目
        Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
        person1.print();
        
        //インスタンス2つ目
        Person person2 = new Person("山田", "花子", 22, 1.5, 40);
        person2.print();

        Person.printCount();//合計人数をカウントするメソッドを呼び出す
    }
}
