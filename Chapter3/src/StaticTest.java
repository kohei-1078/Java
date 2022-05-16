
public class StaticTest {
	static String staticField = "World"; //クラスフィールド
	static final String GREETING_MESSAGE = "Hello"; //クラスフィールドにfinal修飾子をつけてクラス定数を宣言

	static String staticMethod() { //クラスメソッド
		return "yay!";
	}

	String instanceField = GREETING_MESSAGE; //インスタンスフィールド

	String instanceMethod() { //インスタンスメソッド
		return instanceField + " " + staticField + " " + staticMethod();
	}
}
