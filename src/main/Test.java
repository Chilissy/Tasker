package main;

import ui.CommandUI;

import java.util.Date;

public class Test {
    /* TODO:

     */

    public static void main(String[] args){

        Calendar calendar = new Calendar();

        Date start = new Date(2014, 3, 12);

        Date end = new Date(2014, 3, 14);
        Task a = new Task(start, end, "blabla", calendar);

        System.out.println(a.toString());

        Task b = new Task(new Date(), new Date(2014, 12, 04, 23, 10), "dfsa", calendar);



        for(Task t : calendar.getTasks()){
            System.out.println(t.toString());
        }

        System.out.println("================================");

        CommandUI ui = new CommandUI(calendar);

    }
}


