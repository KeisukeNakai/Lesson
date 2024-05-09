package process;

public class ScientificNameAnimal extends Animal {
    public ScientificNameAnimal(String name,double height,int speed) {
        super(name,height,speed); // スーパークラス（Animal）のコンストラクタを呼び出し、仮の値を入れる
        displayAnimalInfo(name, height, speed);//動物名、体長、速度を表示するメソッドを呼び出す
        displayScientificName(name);//学名を表示するメソッドを呼び出す
    }
    //動物名、体長、速度を表示するメソッド
    private void displayAnimalInfo(String name, double height, int speed) {
    	//nullチェック
    	if(name!=null) {
    		System.out.println("動物名: " + name);    	}
        
        System.out.println("体長: " + height + "m");
        System.out.println("速度: " + speed + "km/h");
    }
    //学名を表示するメソッド
    private void displayScientificName(String name) {
        switch (name) {
            case "ライオン":
                System.out.println("学名：パンテラ レオ");
                break;
            case "ゾウ":
                System.out.println("学名：ロキソドンタ・サイクロティス");
                break;
            case "パンダ":
                System.out.println("学名：アイルロポダ・メラノレウカ");
                break;
            case "チンパンジー":
                System.out.println("学名：パン・トゥログロディテス");
                break;
            case "シマウマ":
                System.out.println("学名：チャップマンシマウマ");
                break;
            default:
                System.out.println("学名：不明");
        }
    }
}
