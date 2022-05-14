
public class StudentSample {

	public static void main(String... args) {
		//		処理内容をここに書く
		Student murata = new Student("村田"); //murataインスタンスを作る
		//		murata.name = "村田"; //名前を設定する
		murata.score = 80; //点数を設定する
		murata.printScore(); //インスタンスのprintScoreメソッドを呼ぶ

		Student okada = new Student("岡田", 90); //同様にokadaインスタンスを作る
		//		okada.name = "岡田";
		//		okada.score = 90;
		okada.printScore();
	}

}
