import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

		// 3-3-2 オブジェクトの等価性
		// Employee
		Employee employee1 = new Employee(1, "山田 太郎");
		Employee employee2 = new Employee(1, "山田 太郎");
		Set<Employee> employees = new HashSet<>();
		employees.add(employee1);
		employees.add(employee2);
		System.out.println(employees.size()); //employeesに入っているオブジェクトの数を表示する

		// Point
		Point point1 = new Point(3,2);
		Point point2 = new Point(3,2);

		System.out.println(point1);
		System.out.println(point2);

		System.out.println(point1.hashCode());
		System.out.println(point2.hashCode());

		System.out.println(point1.equals(point2));

		// 3-4 型にまつわる問題を予防する
		// 3-4-1 列挙型(enum)
		// Task
		// TaskType
		Task task = new Task(TaskType.PRIVATE, "buy milk");
		TaskType type = task.getType();

		System.out.println(TaskType.PRIVATE.equals(type));

		switch (type) {
			case PRIVATE: //TaskType.がつかないことに注意。TaskTypeがつけるとコンパイルエラーになる
				System.out.println("Task[type = " + type + "]");
				break;
			case WORK:
				System.out.println("Task[type = " + type + "]");
				break;
		}

		// HttpStatus
		HttpStatus hs = HttpStatus.OK;
		System.out.println("HttpStatus = " + hs + "[" + hs.getValue() + "]");


		// 3-4-2 ジェネリクス(総称型)

		List list = new ArrayList();
		list.add("Java");
		String element = (String)list.get(0); // キャストが必要
		System.out.println(element); // Java

		List<String> list2 = new ArrayList<String>(); //Java5.0,6.0の書き方
		// List<String> list2 = new ArrayList<>(); //Java7.0以降ならダイヤモンドオペレータが使用可能

		list2.add("Java");
		// list.add(true) //ジェネリクスのより要素の型がStringで固定されるため、コンパイルエラー

		String element2 = list2.get(0); //キャストが不要
		System.out.println(element2); //Java

		// StringStack
		StringStack strStack = new StringStack();
		String strElement = strStack.pop();

		// strElement.equals("Java"); //NullPointerException!!!

		strStack.push("Scala");
		strStack.push("Groovy");
		strStack.push("Java");

		strElement = strStack.pop();

		if (strElement != null) {
			System.out.println(strElement); //Java
		}

		// GenericStack

		GenericStack<String> genStack = new GenericStack<>();

		//genStack.push(true); //型がString型ではないのでfコンパイルエラー
		genStack.push("Scala");
		genStack.push("Groovy");
		genStack.push("Java");

		String genElement = genStack.pop(); //キャストが不要

		if(genElement != null) {
			System.out.println(genElement); //Java
		}

		GenericStack<Integer> genStack2 = new GenericStack<>();

		genStack2.push(100);
		genStack2.push(200);

		Integer genElement2 = genStack2.pop(); // キャストが不要

		if(genElement2 != null) {
			System.out.println(genElement2);
		}

		// GenericStackUtil
		List<String> strList = new ArrayList<>();
		strList.add("Java");
		strList.add("Groovy");
		GenericStack<String> gstack = GenericStackUtil.as(strList);
//		System.out.println(gstack);



	}

}
