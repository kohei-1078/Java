
public class Student {
	//	フィールドを宣言する
	String name;
	int score;
	static final int MAX_SCORE = 100;

	// 名前と点数を渡すコンストラクタ
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}

//	名前だけを渡すコンストラクタ（点数は0にする）
	Student(String name){
		this(name, 0);
	}


	//	引数のないメソッド
	//	戻り値のないメソッド。return文は不要
	//	void printScore() {
	//		System.out.println(name + "さんの点数は" + score + "点です。");
	//	}

	//	メソッドを宣言する
	void printScore(int maxScore) {
		System.out.println(name + "さんは" + maxScore + "点満点中、" + score + "点です。");
	}

	void printScore() {
		printScore(MAX_SCORE);
	}

	//	整数の戻り値を返すメソッド
	int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

	//	引数を1つ渡すメソッド
	void setScore(int newScore) {
		this.score = newScore;
	}

	public void setName(String name) {
		this.name = name;
	}
}
