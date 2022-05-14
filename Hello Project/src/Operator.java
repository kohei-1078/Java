
public class Operator {
	public static void main(String... args) {

		// 算術演算子
		int numberA = 10;
		int numberB = 20;
		int numberC = numberA + numberB; //numberAとnumberBの和をnumberCに代入する
		System.out.println(numberC); //numberCの値を出力する

		System.out.println(++numberA); //numberAをインクリメントしてから、numberAを表示する
		System.out.println(numberA); //numberAを表示する
		System.out.println(numberB++); //numberBを表示してから、numberBをインクリメントする
		System.out.println(numberB); //numberBを表示する

		// 関係演算子
		int numberD = 1;
		int numberE = 2;
		boolean result = numberD > numberE; //numberAのほうが大きい場合はtrue
		System.out.println(result);

		// 条件演算子
		int numberF = 10;
		int numberG = numberF > 0 ? 1: -1; // numberFが0より大きい場合は1、そうでない場合は-1となる
		System.out.println(numberG);

		// 論理演算子
		boolean conditionA = true;
		boolean conditionB = false;
		boolean result2 = conditionA || conditionB; //conditionAかconditionBのいずれかがtrueの場合はtrue、そうではない場合はfalseとなる
		System.out.println(result2);

		//ビット演算子
		int number = 0x12345678;
		int lower = number & 0x0000ffff;
		System.out.printf("lower = %x\n", lower);
		int higher = number >> 16;
		System.out.printf("higher = %x\n", higher);

		//代入演算子
		int num = 0;
		num += 100;
		System.out.println("result=" + num);

		//文字列結合に利用する演算子
		String message = "Hello" + " Java"; //HelloとJavaを結合する
		message += " World!";
		System.out.println(message);

	}
}
