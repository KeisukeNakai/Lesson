package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import process.Prefecture;

public class PrefectureViewer {

    public static void main(String[] args) {
    	//配列に生成したインスタンスを格納
        Prefecture[] prefectures = {
            new Prefecture(0,"北海道","札幌市",83424),
            new Prefecture(1,"青森県","青森市",9646),
            new Prefecture(2,"岩手県","盛岡市",15275),
            new Prefecture(3,"宮城県","仙台市",7282),
            new Prefecture(4,"秋田県","秋田市",11638),
            new Prefecture(5,"山形県","山形市",9323),
            new Prefecture(6,"福島県","福島市",13784),
            new Prefecture(7,"茨城県","水戸市",6097),
            new Prefecture(8,"栃木県","宇都宮市",6408),
            new Prefecture(9,"群馬県","前橋市",6362),
            new Prefecture(10,"埼玉県","さいたま市",3798)
        };
        //コンソールへ入力された値を格納する変数を用意
        Scanner scanner = new Scanner(System.in);

        System.out.println("昇順（0）か降順（1）を選んでください:");
        
        //コンソールへ入力された値を受け取る変数を用意
        int sortNum = scanner.nextInt();
                
        //配列を昇順もしくは降順へソートする
        if (sortNum == 0) {
        	//Comparatorを生成して、昇順にソート
            Arrays.sort(prefectures, Comparator.comparingInt(Prefecture::getNumber));
        } else if (sortNum == 1) {
        	//Comparatorを生成して、降順にソート
            Arrays.sort(prefectures, Comparator.comparingInt(Prefecture::getNumber).reversed());
        } else {
        	//0と1以外の入力では終了する
            scanner.close();
            return;
        }

        System.out.println("都道府県の番号を入力してください。※複数の場合はカンマで区切る");
        scanner.nextLine(); // 改行
        
        //コンソールへ入力された値を受け取る変数を用意
        String input = scanner.nextLine();
        
        //入力された値をカンマ区切りで配列に格納
        String[] numbersStr = input.split(",");
        
        //配列の要素（Prefectureオブジェクト）を順番に取り出す
        for (Prefecture prefecture : prefectures) { 
        	//コンソールに入力された値と一致する都道府県を探す
            for (String numberStr : numbersStr) {            	
                int number = Integer.parseInt(numberStr);//String型をint型に変換して変数へ格納
                if (prefecture.getNumber() == number) {//Prefectureオブジェクトの番号と入力された番号が一致する場合
                	prefecture.displayInfo(); // 情報を表示する
                	System.out.println(); // 改行
                    break; // 次の都道府県に移る
                }
            }
        }

        scanner.close();
    }
}
