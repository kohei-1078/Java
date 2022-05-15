
public class ReferenceType {

	public static void main(String[] args) {

		String name = new String("Murata"); //Stringインスタンスの参照をname変数に保持する
		System.out.println(name.length()); //6が出力される

		System.out.println(name); //Murataが出力される

		String name2 = "Murata"; //文字列リテラルはダブルクォートで文字列を囲む
		System.out.println(name2.length()); //6が出力される

		String nullStr = null; //nullリテラル
		if (nullStr != null) { //Nullチェック
			System.out.println(nullStr.length());
		} else {
			System.out.println("nullStrはnull"); //こちらが実行される
		}

	}

}
