
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
	}



}
