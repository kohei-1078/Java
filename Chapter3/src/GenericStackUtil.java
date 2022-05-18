import java.util.List;

public class GenericStackUtil {

	public static <T> GenericStack<T> as(List<T> list) {
		GenericStack<T> stack = new GenericStack<>();
		list.forEach(stack::push); //この書き方の詳細は「5-1-3 メソッド参照」を参照
		return stack;
	}

}
