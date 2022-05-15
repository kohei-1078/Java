
public class Wrapper {

	public static void main(String[] args) {

		System.out.println("Byte: { SIZE(bit):" + Byte.SIZE + ", BYTES: " + Byte.BYTES + ", MIN:" + Byte.MIN_VALUE
				+ ", MAX:" + Byte.MAX_VALUE + " }");

		System.out.println("Integer: { SIZE(bit): " + Integer.SIZE + ", BYTES: " + Integer.BYTES + ", MIN: "
				+ Integer.MIN_VALUE + ", MAX: " + Integer.MAX_VALUE + " }");

		// int -> Integer
		Integer num01 = new Integer(10); //新たなオブジェクトを生成するので効率が悪い
		Integer num02 = Integer.valueOf(10); //キャッシュされたオブジェクトを返す

		// Integer -> int
		int num03 = num02.intValue();

		// String -> Integer
		Integer num04 = new Integer("10"); //新たなオブジェクトが生成するので効率が悪い
		Integer num05 = Integer.valueOf("10"); //キャッシュされたオブジェクトを返す
		Integer num06 = Integer.valueOf("11", 2); //基数（radix）を指定。この場合の値は3

		// String -> int
		int num07 = Integer.parseInt("10");
		int num08 = Integer.parseInt("11", 2); //基数を指定。この場合は３

		//int -> String
		String num09 = Integer.toString(10);

		// integer -> String
		String num10 = num01.toString();

		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num03);
		System.out.println(num04);
		System.out.println(num05);
		System.out.println(num06);
		System.out.println(num07);
		System.out.println(num08);
		System.out.println(num09);
		System.out.println(num10);

		Sample sample = new Sample();
		System.out.println(sample);


	}

}
