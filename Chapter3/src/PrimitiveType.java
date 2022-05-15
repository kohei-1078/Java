
public class PrimitiveType {

	public static void main(String... args) {

		boolean boolA = true;

		//	int intNum = true; //int型の変数にboolean型の変数を代入しているためコンパイルエラーとなる

		int numberA = 10;

		//	int型の整数リテラル（10進数）
		int num1 = 123;
		System.out.println(num1); //123

		//int型の整数リテラル（8進数）
		int num2 = 010; //先頭に0をつける
		System.out.println(num2); //8

		//int型の整数リテラル（16進数）
		int num3 =0xa; //先頭に0xまたは0Xをつける
		System.out.println(num3); //10

		//int型の整数リテラル（2進数）
		int num4 = 0b11; //先頭に0bまたは0Bをつける
		System.out.println(num4); //3

		//long型の整数リテラル
		long longNum = 1L; //末尾にlまたはLをつける
		System.out.println(longNum); //1

		//float型の浮動小数点リテラル
		float floatNum = 3.14f; //末尾にfまたはFをつける
		System.out.println(floatNum); //3.14

		float floatNum2 = 2f;
		System.out.println(floatNum2); //3.0

		//double型の浮動小数点リテラル
		double doubleNum = 3.14; //小数点はデフォルトでdouble型となる
		System.out.println(doubleNum); //3.14

		double doubleNum2 = 3d; //末尾にdまたはDをつける
		System.out.println(doubleNum2); //3.0

		//真偽リテラル
		boolean bool = true; //trueまたはfalse
		System.out.println(bool); //true

		//文字リテラル
		char c = 'A'; //シングルクォートで囲む
		System.out.println(c); //A

		long amount = 123_456_789L;
		System.out.println(amount); //123456789

		short shortNum = 100;

		int intNum = shortNum; //ワイド人具による自動変換（short->int）
		System.out.println(intNum); //100

//		int intNum2 = 1;
//		short shortNum2 = intNum2; //コンパイルエラー
//		System.out.println(shortNum2);

		int intNum3 = 32767 + 1; //shortの上限値である32767に1を加えた値
		short shortNum3 = (short) intNum3; //short型にキャストする（ナローイング）
		System.out.println(shortNum3); //shortの範囲を超えて-32768となる
	}
}
