
public class StaticTestMain {

	public static void main(String[] args) {

		System.out.println(StaticTest.staticField); // World
		System.out.println(StaticTest.staticMethod()); // yay!

		StaticTest.staticField = "Japan";
		System.out.println(StaticTest.staticField); // Japan

		StaticTest test = new StaticTest();
		System.out.println(test.staticField); // Japan
		System.out.println(test.staticMethod()); // yay!
		System.out.println(test.instanceMethod()); // Hello Japan yay!

		test.staticField = "Murata";
		System.out.println(test.instanceMethod()); // Hello Murata yay!

		test.instanceField = "Hi";
		System.out.println(test.instanceMethod()); // Hi Murata yay!

		StaticTest test2 = new StaticTest();

		test2.instanceField = "Okada";
		System.out.println(StaticTest.staticField);
		System.out.println(test.instanceField);
		System.out.println(test2.instanceField);
		System.out.println(test2.instanceMethod());

		test2.instanceField = "Yo";
		System.out.println(test2.instanceMethod());
		System.out.println(test.instanceMethod());

		// (2)final修飾子
		System.out.println(StaticTest.GREETING_MESSAGE); //Hello
		System.out.println(StaticTest.staticField); //World
		System.out.println(StaticTest.staticMethod()); //yay!

//		StaticTest.GREETING_MESSAGE = "Hello!"; //コンパイルエラー

		StaticTest.staticField = "Japan";

		StaticTest test3 = new StaticTest();
		System.out.println(test3.instanceMethod()); // Hello Japan yay!
	}

}
