package process;

public class Prefecture {
	//フィールドの宣言
	private int number;//番号
	private String name;//県名
	private String capitalCity;//県庁所在地
	private int area;//面積
	
	//コンストラクタの定義
	public Prefecture(int number,String name,String capitalCity,int area) {
		this.number=number;
		this.name=name;
		this.capitalCity=capitalCity;
		this.area=area;
		
	}
	//ゲッター(今回はセッターの必要性がないので省略)
	public int getNumber() {
        return number;
    }
	public String getName() {
        return name;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public int getArea() {
        return area;
    }

    //コンソールへ出力するメソッド
    public void displayInfo() {
    	System.out.println("都道府県:"+name);
    	System.out.println("県庁所在地:"+capitalCity);
    	System.out.println("面積:"+(double)area+"km2");//キャストして出力する
    }
}
