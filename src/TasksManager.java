import java.util.Objects;

public class TasksManager {

    public void tasksManager() {
        Team teamMember= new Team("Haim Kal", "A", "Finance", 5,5,"Itzik Huri");
        System.out.println(teamMember.isSenior());
        Task[] allTasks = new Task[10];
        allTasks[0] = new Task("Coding", "Avi Levi", 2, 1);
        allTasks[1] = new Task("CodeReview", "Itzik Huri", 1, 2);
        allTasks[2] = new Task("Product", "Itzik Huri", 1, 3);
        allTasks[3] = new Task("Coding", "Avi Levi", 1, 4);
        allTasks[4] = new Task("Coding", "Itzik Huri", 2, 1);
        allTasks[5] = new Task("Coding", "Avi Levi", 1, 2);
        allTasks[6] = new Task("Coding", "Itzik Huri", 0, 3);
        allTasks[7] = new Task("Coding", "Avi Levi", 2, 4);
        allTasks[8] = new Task("Coding", "Avi Levi", 1, 1);
        allTasks[9] = new Task("Coding", "Avi Levi", 0, 2); //Avi
        Member mostProductWorker = mostProductiveMember(allTasks);
        System.out.println(mostProductWorker.getFullName());

    }


    public static Member mostProductiveMember(Task[] allTasks) {
        Member mostProductive = null;
       int maxCounterTask = 0;
       int counter = 0;
        Task [] completedTasks = Task.tasksCompleted(allTasks);
        Team [] teams = new Team[4];
        teams [0] = new Team("Avi Levi", "A", "Cleaner", 4,4,"Roni Ron");
        teams [1] = new Team("Kobi Kob", "B", "Roler", 1,1,"Itzik Huri");
        teams [2] = new Team("Coco Jambo", "A", "Banger", 2,2,"Roni Ron");
        teams [3] = new Team("Fireman Sam", "B", "Sleeping", 4,4,"Itzik Huri");

        for (int i = 0; i < teams.length; i++) {
            counter = 0;
            for (int j = 0; j < completedTasks.length; j++) {
                if (Team.workerName(teams [i]).equals(Task.workerName(completedTasks [j]))){
                    counter ++;
                    if (counter > maxCounterTask){
                        mostProductive = teams [i];
                        maxCounterTask = counter;
                    }
                }
            }
        }
        return mostProductive;
        }

}
