package process;

public class Character {
	
	//フィールドの宣言
    private String name;//キャラクターの名前
    private int hitPoint;//キャラクターの体力
    private int magicPoint;//キャラクターのマジックポイント
    private int attack;//キャラクターの攻撃力
    private int speed;//キャラクターのスピード
    private int defense;//キャラクターの防御力

    //コンストラクタの定義
    public Character(String name, int hitPoint, int magicPoint, int attack, int speed, int defense) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.magicPoint = magicPoint;
        this.attack = attack;
        this.speed = speed;
        this.defense = defense;
    }

    // ゲッターとセッター
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int gethitPoint() {
        return hitPoint;
    }

    public void sethitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getmagicPoint() {
        return magicPoint;
    }

    public void setmagicPoint(int magicPoint) {
        this.magicPoint = magicPoint;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
