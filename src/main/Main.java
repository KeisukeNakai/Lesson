package main;

import process.Person;

class Main {
	  public static void main(String[] args) {
	    Person person1 = new Person("鈴木太郎", 20, 1.7,60);
	   
	    System.out.println(person1.name);
	    System.out.println(person1.age);
	    System.out.println(person1.height);
	    
	    System.out.println();//改行読み捨て
	    
	     person1.print();//情報を表示するメソッド
	     
	     System.out.println();//改行読み捨て
	     
	     person1.people();//人数（生成されたインスタンスの数）を表示するメソッド
	  }
	}
