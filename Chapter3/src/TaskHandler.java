
public interface TaskHandler {
	int TASK_TYPE_PRIVATE = 0;
	int TASK_TYPE_WORK = 1;

	boolean handle(Task task);
}
