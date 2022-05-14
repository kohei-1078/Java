
public class Status {
//	これは誤った命名
//	private boolean isStarted = false;

//	正しい命名はこちら
	private boolean started = false;

	public boolean isStarted() {
		return this.started;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}
}
