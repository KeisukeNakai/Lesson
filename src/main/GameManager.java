package main;

import java.util.Scanner;

import process.Character;
import process.CharacterGenerator;

public class GameManager {
    public static void main(String[] args) {
    	//scannerインスタンスを生成
        Scanner scanner = new Scanner(System.in);

        //コンソールに入力された値を格納する変数
        String name = scanner.nextLine();

        // キャラクターを生成
        Character character = new CharacterGenerator(name);

        // キャラクターのステータスを表示
        System.out.println("こんにちは、" + character.getName() + " さん");
        System.out.println("ステータス");
        System.out.println("HP：" + character.gethitPoint());
        System.out.println("MP：" + character.getmagicPoint());
        System.out.println("攻撃力：" + character.getAttack());
        System.out.println("素早さ：" + character.getSpeed());
        System.out.println("防御力：" + character.getDefense());
        System.out.println("");
        System.out.println("さあ冒険に出かけよう！");

        scanner.close();
    }
}
