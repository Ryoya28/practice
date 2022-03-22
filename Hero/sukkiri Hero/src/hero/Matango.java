package hero;

public class Matango {

	int hp;//hpの宣言
	final int LEVEL = 10;//finalを先頭に記述することで値を帰ることのできない定数フィールドになる
	char suffix;
	public void run() {
		System.out.println("お化けキノコ"+this.suffix+"は逃げ出した");
	}

}
