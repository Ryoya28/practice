package asset;

public class Computer extends TangibleAsset{

	//継承していないフィールドを宣言
	String makerName;
	
	public Computer(String name,int price,String color,String makerName) {
		super(name,price,color);
		this.makerName = makerName;
	}
	
	//メソッドを宣言
	public String getMakerName() {
		return this.makerName;
	}
	
}
