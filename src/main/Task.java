package main;

import service.TaskService;

import java.time.LocalDate;

public class Task {
    LocalDate startDate;
    LocalDate endDate;
    String desc;

    public Task(LocalDate start, LocalDate end, String desc, Calendar calendar) {

        TaskService service = new TaskService();

        if(!service.canCreateTask(start, end, calendar)){
            System.err.println("Cannot create task, dates overlap!");
            return;
        }

        this.startDate = start;
        this.endDate = end;
        this.desc = desc;

        calendar.addTask(this);
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    @Override
    public String toString() {
        return "### " + desc + " | " +  startDate + " | " + endDate + " ###";

    }
}
