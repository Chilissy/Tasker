package main;

import service.TaskService;

import java.util.Date;

public class Task {
    Date startDate;
    Date endDate;
    String desc;

    public Task(Date start, Date end, String desc, Calendar calendar){

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

    public Date getEndDate() {
        return endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    @Override
    public String toString() {
        return "### " + desc + " | " +  startDate + " | " + endDate + " ###";

    }
}
