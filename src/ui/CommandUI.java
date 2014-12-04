package ui;

import main.Calendar;
import main.Task;
import service.TaskService;

import java.util.ArrayList;

public class CommandUI {

    Calendar calendar;

    public CommandUI(Calendar calendar) {

        this.calendar = calendar;
        displayMenu();


    }

    private void displayMenu() {
        System.out.println("This is tasker!");
        System.out.println("Review for today :");
        displayReview();

    }

    private void displayReview() {

        ArrayList<Task> tasks = calendar.getTasks();

        for (Task t : tasks) {
            if (TaskService.isTaskToday(t)) {
                System.out.println(t.toString());
            }
        }


    }
}
