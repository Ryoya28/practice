package asset;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[] array = {"A","B","C","D"};
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]+"");
			if(array[i].equals("C")) {
				continue;
			}
			System.out.println("end");
			break;
		}
	}	
}
