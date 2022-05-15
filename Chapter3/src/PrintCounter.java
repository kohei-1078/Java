
public class PrintCounter {

	public int count = 0; //printメソッドが呼ばれた回数を保持する

	public void print() {
		count++;
		System.out.println("呼ばれた回数：" + count);
	}

}
