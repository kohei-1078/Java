// 3-2
public class ClassCreation {

	public static void main(String[] args) {

		// 3-2-1 クラスを定義する
		//		SampleClass
		SampleClass sample = new SampleClass();

		String response = sample.action();

		System.out.println(response); // Sample> Action

		// 3-2-2 パッケージ
		// AccountController

		// 3-2-3 アクセス修飾子
		// PrintCounter
		PrintCounter printCounter = new PrintCounter();
		printCounter.print(); //１が表示される
		printCounter.print(); //２が表示される
		printCounter.print(); //３が表示される
		printCounter.count = 10;
		printCounter.print(); //１１が表示される

		// 3-2-4 その他のよく利用する修飾子
		// (1)static修飾子
		//	StaticTest.java
		//	StaticTestMain.java
		//	(2)final修飾子
	}

}
