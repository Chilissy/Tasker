package service;

import main.Calendar;
import main.Task;

import java.time.LocalDate;
import java.util.ArrayList;

public class TaskService {

    public static boolean datesOverlapInTasks(LocalDate start, LocalDate end, Task task2) {

        LocalDate start2 = task2.getStartDate();
        LocalDate end2 = task2.getEndDate();

        return start.isBefore(start2) && end.isAfter(end2);
    }

    public boolean canCreateTask(LocalDate start, LocalDate end, Calendar calendar) {

        ArrayList<Task> tasks = calendar.getTasks();

        for(Task t: tasks){
            if(datesOverlapInTasks(start, end, t)){
                return false;
            }
        }
        return true;
    }

    public static boolean isTaskToday(Task task) {

        LocalDate start = task.getStartDate();

        if (start.getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
            return true;
        }
        return false;
    }


}
