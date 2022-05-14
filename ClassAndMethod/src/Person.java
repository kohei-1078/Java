
public class Person {
	private String name;

	@Override
	public String toString() {
		return name;
	}

	@Deprecated
	public String get_name() {
		return name;
	}

	public String getName() {
		return name;
	}

}
