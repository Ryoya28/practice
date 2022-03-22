package hero;

public class Hero {

	//フィールドを用いる時は「this」を省略しない！
	//ローカル変数や引数に同じ変数名があると上手く動作しない
	String name = "ミナト"; //名前の宣言
	int hp = 100;;//hpの宣言

	public void attack(Matango m) {
		System.out.println(this.name+"の攻撃");
		m.hp = -5;
	}

	public void run() {
		System.out.println(this.name+"は逃げた");
	}

}

