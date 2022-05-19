import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// 4-1 配列で複数のデータを扱う
		// 4-1-1 配列の基本を知る

		int[] array = new int[10];
		array[0] = 1;
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[4] = 5;
		System.out.println(array[0]);
		System.out.println(array[4]);

		int[] array2 = new int[11];
		for (int i = 0; i < 11; i++) {
			if(i == 0) {
				array2[i] = 0;
			} else if(i == 1) {
				array2[i] = 1;
			} else {
				array2[i] = array2[i-1] + array2[i-2];
			}
		}

//		for(int value : array2) {
//			System.out.println(value);
//		}

		// 4-1-2 配列を初期化する
		int[] array1 = new int[10];

		int[] array3 = {1, 2, 3, 4, 5};

		int[] array4 = new int[] {10, 9, 8, 7, 6};

		System.out.println(array1.length);
		System.out.println(array3.length);
		System.out.println(array4.length);

		// 4-1-3 配列への代入取り出し
		int[] array4_1_3 = { 1, 1, 2, 3, 5, 8, 13};

		array4_1_3[5] = 8;
		int value = array4_1_3[6];

		System.out.println(array4_1_3[5]);
		System.out.println(value);

		// 4-1-4 配列のサイズを変更する
		int[] array414 = {1, 1, 2, 3, 5, 8, 13};

		int[] newArray1 = new int[array.length + 3];
		System.arraycopy(array414,  0,  newArray1, 0,  array414.length);

		int[] newArray2 = Arrays.copyOf(array414, array414.length + 3);

		newArray1[7] = 21;
		newArray1[8] = 34;
		newArray1[9] = 55;
//		newArray1[10] = 89;

		// 4-1-5 Arraysクラスを利用して配列を操作する
		int[] array415 = {1, 1, 2, 3, 5, 8, 13};
		System.out.println(array415);
		System.out.println(Arrays.toString(array415));

		int[] array4152 = { 3, 1, 13, 2, 8, 5, 1};
		Arrays.sort(array4152);
		System.out.println(Arrays.toString(array4152));

		Integer[] array4153 = { 3, 1, 13, 2, 8, 5, 1};
		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		};

		Arrays.sort(array4153, c);
		System.out.println(Arrays.deepToString(array4153));

		// Student
		Student[] students = { new Student("Ken", 100), new Student("Shin", 60), new Student("Takuya", 80)};

		Comparator<Student> comparator = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o2.getScore(), o1.getScore());
			}
		};

		Arrays.sort(students, comparator);
		for(Student student : students) {
			System.out.println(student.getName() + ":" + student.getScore());
		}

		int[] array4154 = { 1, 1, 4, 5, 7, 8, 11, 12, 17, 21, 24};
		int found = Arrays.binarySearch(array4154, 5);
		System.out.println(found);

		int notFound = Arrays.binarySearch(array4154, 6);
		System.out.println(notFound);

		int[] array4155 = { 3, 1, 13, 2, 8, 5, 1};
		int value2 = Arrays.binarySearch(array4155, 8);
		System.out.println(value2);

		// 4-1-6 可変長引数でメソッドを定義する
//		log("ユーザーを登録しました", new String[]{"userName", "Ken"});
//		log("エラーが発生しました", new String[]{"Cannot load file"});
//		log("処理を終了しました", new String[0]);
		log("ユーザを登録しました", "userName", "Ken");
		log("エラーが発生しました", "Cannot load file");
		log("処理を終了しました");


		// 4-2 コレクションフレームワークで複数のデータを扱う
		// 4-1-2 配列の限界とコレクションの特徴

		// 4-3 配列に近い方法で複数の要素を扱う ～Listインターフェース
		// 4-3-1 Listインターフェースの基本
		// 4-3-2 Listを作成する

		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(62);
		list.add(31);
		list.add(1);
		list.add(54);
		list.add(31);

//		List<Integer> integerList = Arrays.asList(1, 62, 31, 1, 54, 31);
		List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 62, 31, 1, 54, 31));

		// 4-3-3 Listの代表的なメソッド
		List<String> names = new ArrayList<>();

		names.add("Ken");
		names.add("Shin");
		names.add("Takuya");
		System.out.println("①リストの中身：" + names.toString());

		names.add(2, "Satoshi");
		System.out.println("②リストの中身：" + names.toString());

		names.set(0, "Makoto");
		System.out.println("③リストの中身：" + names.toString());

		String thirdName = names.get(2);
		System.out.println("④2番目の要素：" + thirdName);

		names.remove(1);
		System.out.println("⑤リストの中身：" + names.toString());

		int size = names.size();
		System.out.println("⑥要素の数：" + size);

		int takuyaIndex = names.indexOf("Takuya");
		System.out.println("⑦Takuyaの位置：" + takuyaIndex);

		boolean exists = names.contains("Shin");
		System.out.println("⑧Shinが含まれているか：" + exists);

		// 4-3-4 Listをソートする
		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(1);
		list2.add(13);
		list2.add(2);
		Comparator<Integer> c2 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		};

		Collections.sort(list2, c2);
		System.out.println(list2);

		// 4-3-5 Listを検索する

	}

	// 4-1-6 可変長引数でメソッドを定義する
//	public static void log(String message, String[] args) {
//		System.out.println(message);
//		System.out.println("パラメータ：");
//		for (String arg : args) {
//			System.out.println(arg);
//		}
//	}

	public static void log(String message, String... args) {
		System.out.println(message);
		System.out.println("パラメータ：");
		for (String arg : args) {
			System.out.println(arg);
		}
	}
}