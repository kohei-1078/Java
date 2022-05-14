import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class ControlParse {
	public static void main(String... args) {

		// if文
		int second = LocalDateTime.now().getSecond();

		if (second % 2 == 0) {
			System.out.println(second + "は偶数です");
		} else {
			System.out.println(second + "は奇数です");
		}

		int month1 = LocalDate.now().getMonthValue();
		if (3 <= month1 && month1 <= 5) {
			System.out.println(month1 + "月は春です");
		} else if (6 <= month1 && month1 <= 8) {
			System.out.println(month1 + "月は夏です");
		} else if (9 <= month1 && month1 <= 11) {
			System.out.println(month1 + "月は秋です");
		} else {
			System.out.println(month1 + "月は冬です");
		}

		// switch文
		Month month2 = LocalDateTime.now().getMonth();

		switch (month2) {
		case MARCH:
		case APRIL:
		case MAY:
			System.out.println(month2 + "は春です");
			break;
		case JUNE:
		case JULY:
		case AUGUST:
			System.out.println(month2 + "は夏です");
			break;
		case SEPTEMBER:
		case OCTOBER:
		case NOVEMBER:
			System.out.println(month2 + "は秋です");
			break;
		default:
			System.out.println(month2 + "は冬です");
			break;
		}

		// for文
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println(i + "回目：" + sum);
		}

		int[] numbers = { 1, 1, 2, 3, 5, 8, 13, 21 };
		for (int number : numbers) {
			System.out.println(number);
		}

		// while文/do ... while
		Scanner in = new Scanner(System.in);
		System.out.println("パスワードを入力してください");
		String str = in.nextLine();

		while (!str.equals("abc")) {
			System.out.println("パスワードが違います。正しいパスワードを入力してください");
			str = in.nextLine();
		}
		System.out.println("OK!");

		System.out.println("パスワードを入力してください");
		str = in.nextLine();

		while (true) {
			if (str.equals("abc")) {
				break;
			}

			System.out.println("パスワードが違います。正しいパスワードを入力してください");
			str = in.nextLine();
		}

		System.out.println("OK!");
	}
}
