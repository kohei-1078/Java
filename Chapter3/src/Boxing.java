
public class Boxing {

	public static void main(String[] args) {

		int num = 10;

		Integer numInt = 10; // Java1.4ではコンパイルエラー。コンパイル時にInteger.valueOf(10)に自動変換される（オートボクシング）

		Integer sum = num + Integer.valueOf(10); // Java1.4ではコンパイルエラー。numIntがnumInt.intValue()でintに自動変換され（アンチボクシング）、演算結果を再度オートボクシングする。

		Integer num1 = new Integer(3);
		Integer num2 = new Integer(3);

		System.out.println(num1 == num2); // false（num1とnum2は別のオブジェクトであるため）
		System.out.println(num1.equals(num2)); //true

		Integer int1 = 127;
		Integer int2 = 127;
		System.out.println(int1 == int2);

		Integer int3 = 128;
		Integer int4 = 128;
		System.out.println(int3 == int4);



	}

}
