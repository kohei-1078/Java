
public class AnnoymousClassSample {

	public static void main(String... args) {
		//TaskHandlerインターフェイスを実装する匿名クラスを定義し、インスタンス化する
		TaskHandler taskHandler = new TaskHandler() {
			public boolean handle(Task task) {
				//taskに関する処理
			}
		};

		Task myTask = new Task();
		taskHandler.handle(myTask);
	}

}
