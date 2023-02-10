public class Task {
    private String text;
    private String fullName;
    private int status;
    private int sort;

    public Task(String text, String fullName, int status, int sort) {
        this.text = text;
        this.fullName = fullName;
        this.status = status;
        this.sort = sort;
    }


    protected static Task[] tasksCompleted(Task[] tasks) {
        int completedCounter = 0;
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].status == 2) {
                completedCounter++;
            }
        }
        Task[] completedTasks = new Task[completedCounter];
        for (int i = 0; i < tasks.length; i++) {
            for (int j = 0; j < completedTasks.length; j++) {
                if (tasks[i].status == 2) {
                    if (completedTasks[j] == null) {
                        completedTasks[j] = tasks[i];
                        break;
                    }
                }
            }
        }
        return completedTasks;
    }

protected static String workerName (Task completed){
    return completed.fullName;
    }


}
