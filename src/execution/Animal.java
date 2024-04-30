package execution;

import process.Item;

public class Animal {

    public static void main(String[] args) {
        // インスタンスの作成と値の初期化
        Item item = new Item("",0.0,0);

        // セッターで値を設定
        item.setName("ライオン");
        item.setHeight(2.1);
        item.setSpeed(80);
        
        // NULLチェックしてから出力
        if (item.getName() != null) {
        	System.out.println("動物名：" + item.getName());
        }
        
        //基本データ型（double,int）なので、NULLチェック不要	
        System.out.println("体長：" + item.getHeight() + "m");       
        System.out.println("速度：" + item.getSpeed() + "km/h");
       
        
        
    }

}
