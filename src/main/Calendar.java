package main;

import java.util.ArrayList;

public class Calendar {
    ArrayList<Task> tasks = new ArrayList<Task>();

    public boolean taskExists(Task task){

        for (Task t : tasks){
            if (t.equals(task)){
                return true;
            }
        }
        return false;
    }

    public boolean datesOverlap(){

        return false;
    }

}
