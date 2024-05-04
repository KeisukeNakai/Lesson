package process;

import java.util.Random;

//Characterクラスを継承したCharacterGeneratorクラスを定義
public class CharacterGenerator extends Character {
    public CharacterGenerator(String name) {
        super(name, 0, 0, 0, 0, 0); //スーパークラス（Character）のコンストラクタを呼び出し、仮の値を入れる
        generateStats();//キャラクターの各ステータスの値を生成するメソッドを呼び出す
        }

    private void generateStats() {

        // 各ステータスに入る1から1000の間のランダムな値を生成
        Random random = new Random();
        sethitPoint(random.nextInt(1000) + 1); 
        setmagicPoint(random.nextInt(1000) + 1); 
        setAttack(random.nextInt(1000) + 1); 
        setSpeed(random.nextInt(1000) + 1); 
        setDefense(random.nextInt(1000) + 1);
    }
}
