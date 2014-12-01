package service;

import main.Calendar;
import main.Task;

import java.util.ArrayList;
import java.util.Date;

public class TaskService {

    public static boolean datesOverlapInTasks(Date start1, Date end1, Task task2){

        Date start2 = task2.getStartDate();
        Date end2 = task2.getEndDate();

        return start1.before(end2) && start2.before(end1);
    }

    public boolean canCreateTask(Date start, Date end, Calendar calendar) {

        ArrayList<Task> tasks = calendar.getTasks();

        for(Task t: tasks){
            if(datesOverlapInTasks(start, end, t)){
                return false;
            }
        }
        return true;
    }
}
