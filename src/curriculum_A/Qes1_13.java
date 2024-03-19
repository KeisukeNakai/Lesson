package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/*
		 * 1問目
		 * 
		 */
		
		// 数値を扱う変数
		 byte b;
		 short s;
		 int i;
		 long l;
		 float f;
		 double d;
		 
		 // 文字を扱う変数
		 char ch;
		 String str;
		 
		 // 真偽値を扱う変数
		 boolean bo;
		 
		 System.out.println("\n");
		 
		/*
		 * 2問目
		 * 
		 */
		 
		 // 各変数に値の初期化を行う------------
		 b =0;
		 s=0;
		 i=0;
		 l=0L;
		 f=0.0f;
		 d =0.0d;
		 ch='\u0000';
		 str =null;
		 bo=false;
		 // ------------------------------
		 
		 System.out.println("\n"); // 改行を挟む
		 /*
		 * 3問目
		 * 
		 */
		 
		 // 各変数に決められた値を代入する---------------------
		 b =10;
		 s=100;
		 i=1000;
		 l=10000;
		 f=9.5f;
		 d =10.5;
		 ch='a';
		 str ="ハロー";
		 bo=true;
		 // -------------------------------------
		 
		 System.out.println("\n"); // 改行を挟む
		 
		 /*
		 * 4問目
		 * 
		 */
		 
		 // 演算と文字結合-----------------------
		 System.out.println(b+s+i+l);
		 System.out.println(b*2);
		 System.out.println(ch+" "+str+" "+bo);
		 
		 
		 // 型変換-----------
		 int temp=0;// 計算結果を格納する変数を初期化	 
		 temp=(int)(b+s+i+l+f+d);// int型へ型変換して代入
		 // -------------------------
		 
		 System.out.println(temp);// 型変換が行われた値を参照して出力する
		
		 System.out.println(b*s*i*l);
		 System.out.println(d/s);
		 
		 System.out.println(b-s);
		 
		// -------------------------------------
		 
		 System.out.println("\n");// 改行を挟む
		 
		 /*
		 * 5問目
		 * 
		 */
		  
		 String num="20";// 文字列型
		 int num1=23;// 整数型
		 System.out.println("ハローJAVA"+(Integer.parseInt(num)+num1));// 文字列型の数値を整数型へ変換し和算する
		 
		 System.out.println("\n"); // 改行を挟む
		 
		 /*
		  * 6問目
		  * 
		  */
		 
		 String name ="山田太郎";
		 int age =18;
		 double height =170.5;
		 double weight =62.2;
		 String favoriteFood="寿司";
		 
		 
		 printProfile(name, age, height, weight, favoriteFood);// プロフィールを出力するメソッドを呼び出す
		 
		 System.out.println("\n"); // 改行を挟む
		 /*
		  * 7問目
		  * 
		  */
		 printBMI(height,weight);// BMIを計算して出力するメソッドを呼び出す
		 
		 
		 System.out.println("\n"); // 改行を挟む
		 
		 /*
		  * 8問目
		  * 
		  */
		 
		 // 定義済みの変数へ値を再代入する---
		 name ="鈴木一郎";
		 age =24;
		 height =168.5;
		 weight =64.2;
		 favoriteFood="オムライス";
		 //---------------------------------
		 
		 printProfile(name, age, height, weight, favoriteFood);// プロフィールを出力するメソッドを呼び出す
		 		 
		 printBMI(height,weight);// BMIを計算して出力するメソッドを呼び出す
		 
		 System.out.println("\n"); // 改行を挟む
		 /*
		  * 9問目
		  * 
		  */
		 
		 // 自己代入する-----
		 age=age*2;
		 height=height*2;
		 weight=weight*2;
		 //-------------------
		 
		 printProfile(name, age, height, weight, favoriteFood);// プロフィールを出力するメソッドを呼び出す
 		 
		 printBMI(height,weight);// BMIを計算して出力するメソッドを呼び出す
		 
		 System.out.println("\n"); // 改行を挟む
		 
		 /*
		  * 10問目
		  * 
		  */
		 
		 boolean OverTwentyFive;  // 真偽値を扱う変数の定義
		 OverTwentyFive = false;  // 変数の初期化

		
		 OverTwentyFive = (age >= 25);// trueになる条件を定義
		 
		 System.out.println(OverTwentyFive);// 真偽値を出力する
		 
		 System.out.println("\n"); // 改行を挟む
		 
		 /*
		  * 11問目
		  * 
		  */
		 
		 // 文字列型に型変換し文字列型の変数へ値を格納---------
		 String strAge =String.valueOf(age);
		 String strHeight =String.valueOf(height);
		 String strWeight =String.valueOf(weight);
		 // ---------------------------------------------------
		 
		 System.out.println("【年齢："+strAge+"・身長："+strHeight+"・体重："+strWeight+"】");// 文字列を連結して出力
		 
		 System.out.println("\n"); // 改行を挟む
		 
		 /*
		  * 12問目
		  * 
		  */
		 
		 // 小数型の値を整数型へ型変換し、整数型の変数へ格納--------
		 int intAge =(int)Double.parseDouble(strAge);
		 int intHeight =(int)Double.parseDouble(strHeight);
		 // -------------------------------------------------------
		 System.out.println("【年齢："+intAge+"・身長"+intHeight+"】");
		 

		 System.out.println("\n"); // 改行を挟む
		 
		 /*
		  * 13問目
		  * 
		  */
		 
		 boolean sort;  // 真偽値を扱う変数の定義
		 sort = false;  // 変数の初期化

		
		 sort = (intAge == 25 || intHeight>=160); // trueになる条件を定義
	
		 System.out.println(sort);
		 
	}
	
		/*
		 * ----------------------------------
		 * [概要]自己紹介を出力するメソッド
		 * ----------------------------------
		 */
		public static void printProfile(String name,int age,double height,double weight,String favoriteFood) {
			
			 System.out.println("「初めまして"+name+"です」");
				
			 System.out.println("「年齢は"+age+"歳です」");
				 
			 System.out.println("「身長は"+height+"cmです」");
				 
			 System.out.println("「体重は"+weight+"kgです」");
				 
			 System.out.println("「好きな食べ物は"+favoriteFood+"です」");
			
			
		}
		
		/*
		 * -----------------------------------
		 * [概要]BMIを計算して出力するメソッド
		 * -----------------------------------
		 */
		
		public static void printBMI(double height, double weight) {
	        int roundingFactor = 100;
	        double bmi = weight / ((height / roundingFactor) * (height / roundingFactor));
	        double roundedBMI = Math.ceil(bmi * roundingFactor) / roundingFactor;
	        System.out.println("「BMIは" + roundedBMI + "です」");
	    }
		

}
