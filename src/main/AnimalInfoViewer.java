package main;

import java.util.Scanner;

import process.ScientificNameAnimal;

public class AnimalInfoViewer {

    public static void main(String[] args) {
        // Scannerインスタンスを生成
        Scanner scanner = new Scanner(System.in);

        System.out.println("コンソールに文字を入力してください");
        
        
        // コンソールに入力された値を格納する変数
        String input = scanner.nextLine();
        System.out.println("");//改行
        
        // 入力された値をカンマで分割して配列へ格納
        String[] animals = input.split(",");
       
        for (String animalStr : animals) {
            // コロンで分割
            String[] parts = animalStr.split(":");
            
            String name = parts[0];
            double height = Double.parseDouble(parts[1]);
            int speed = Integer.parseInt(parts[2]);

            // 動物の学名を含めて表示するクラスのインスタンスを生成
             new ScientificNameAnimal(name, height, speed);
            System.out.println("");
        }

        // Scannerを閉じる
        scanner.close();
    }

}
