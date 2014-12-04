package main;

import ui.CommandUI;

import java.time.LocalDate;

public class Test {
    /* TODO:

     */

    public static void main(String[] args){

        Calendar calendar = new Calendar();

        LocalDate start = LocalDate.of(2014, 03, 22);
        LocalDate end = LocalDate.of(2014, 03, 23);
        Task a = new Task(start, end, "blabla", calendar);


        Task b = new Task(LocalDate.now(), LocalDate.of(2014, 12, 5), "dfsa", calendar);
        //System.out.println(b.getStartDate().getDay());

        for(Task t : calendar.getTasks()){
            System.out.println(t.toString());
        }

        System.out.println("================================");

        CommandUI ui = new CommandUI(calendar);


    }
}


