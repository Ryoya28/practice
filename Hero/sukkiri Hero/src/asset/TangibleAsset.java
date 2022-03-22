package asset;

//抽象メソッド
public abstract class TangibleAsset extends Asset{
	//フィールド
	String name;
	int price;
	String color;

	public TangibleAsset(String name,int price,String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}
/*
 * ここは共通のものじゃないから抽象クラスには記述しない
	String isbn;
	String makerName;
*/
	//抽象メソッド
	public String getName() {return this.name;}
	public int getPrice() {return this.price;}
	public String getColor() {return this.color;}
}
