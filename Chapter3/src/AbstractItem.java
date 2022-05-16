
public abstract class AbstractItem { //abstractメソッドを持つクラスにはabstractの指定が必要

	protected String name;

	public AbstractItem(String name) {
		this.name = name;
	}

	public abstract void print(String parentPath); // 抽象メソッド。子クラスで実装する
}
