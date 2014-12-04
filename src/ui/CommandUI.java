package ui;

import main.Calendar;
import main.Task;
import service.TaskService;

import java.util.ArrayList;
import java.util.Date;

public class CommandUI {

    Calendar calendar;

    public CommandUI(Calendar calendar) {

        this.calendar = calendar;
        displayMenu();


    }

    private void displayMenu() {
        System.out.println("This is tasker!");
        System.out.println("Review for today :");
        displayRewiew();

    }

    private void displayRewiew() {

        Date today = new Date();

        ArrayList<Task> tasks = calendar.getTasks();

        for (Task t : tasks) {
            if (TaskService.isTaskToday(t, today)) {
                System.out.println(t.toString());
            }
        }


    }
}
