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
		// StaticTest.java
		// StaticTestMain.java

		// 3-2-5 継承
		// SuperClass
		// SubClass
		SubClass subClass = new SubClass();
		subClass.superMethod(); //SuperClassクラスのメソッドを使用できる

		// 3-2-6 抽象クラス
		// AbstractItem
		// FileItemクラス
		// Directoryクラス

		// 3-2-7 インターフェイス
		// Foo
		// DefaultFoo
		Foo foo = new DefaultFoo("Hello Foo!");

		System.out.println(foo.say());

		// TaskHandler

		// 3-2-8 匿名クラス
		// TaskHandler
		// AnnoymousClassSample

		// 3-3 型判定とオブジェクトの等価性
		// 3-3-1 instanceof演算子
		// BaseService
		// AbstractBaseService
		// FooService

		Object obj = new FooService("hello");

		System.out.println(obj instanceof FooService);
		System.out.println(obj instanceof AbstractBaseService);
		System.out.println(obj instanceof BaseService);
		System.out.println(obj instanceof Integer);

		if (obj instanceof FooService) {
			FooService service = (FooService) obj;
			System.out.println(service.say());
		}

		// 3-3-2

	}

}
