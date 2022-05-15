
public class StaticTest {
	static String staticField = "World"; //クラスフィールド

	static String staticMethod() { //クラスメソッド
		return "yay!";
	}

	String instanceField = "Hello"; //インスタンスフィールド

	String instanceMethod() { //インスタンスメソッド
		return instanceField + " " + staticField + " " + staticMethod();
	}
}
