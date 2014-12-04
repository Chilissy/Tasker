package main;

import java.util.ArrayList;

public class Calendar {
    ArrayList<Task> tasks = new ArrayList<Task>();

    public void addTask(Task task){
        tasks.add(task);
    }

    public boolean taskExists(Task task){

        for (Task t : tasks){
            if (t.equals(task)){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

}
