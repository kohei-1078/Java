import java.util.ArrayList;
import java.util.List;

public class StringStack {

	public List<String> taskList;

	public StringStack() {
		taskList = new ArrayList<>();
	}

	public boolean push(String task) {
		return taskList.add(task);
	}

	public String pop() {
		if(taskList.isEmpty()) {
			return null; //要素が1つも登録されていない場合はnullを返す
		}

		return taskList.remove(taskList.size() - 1);
	}

}
