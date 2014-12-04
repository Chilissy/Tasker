package main;

import java.util.Date;

public class Test {
    /* TODO:

     */

    public static void main(String[] args){

        Calendar calendar = new Calendar();

        Date start = new Date(2014, 3, 12);
        Date end = new Date(2014, 3, 14);
        Task a = new Task(start, end, "blabla", calendar);

        Date start2 = new Date(2014, 3 , 13);
        Date end2 = new Date(2014, 3 , 15);

        Task b = new Task(start2, end2, "ds23", calendar);

        for(Task t : calendar.getTasks()){
            System.out.println(t.toString());
        }
    }

}


