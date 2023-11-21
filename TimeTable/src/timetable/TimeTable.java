/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */

public class TimeTable {

    private String teacher; 
    private ArrayList<String> C_Name = new ArrayList(); 
    
    public void make_timetable() {
     String[] Dates ={"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};    
     String[] times={"08:00 - 09:00" , "09:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 01:00", "01:00 - 01:45", "01:45 - 02:40", "02:40 - 03:35", "03:35 - 04:30"};
        System.out.print("enter name of teacher : ");
        Scanner scanner = new Scanner(System.in);
        teacher = scanner.next();         
        int index = 0;
        System.out.println("* Timetable creator *");
        for (String date : Dates) {
            System.out.println("\n# Add your courses " + date + "\n");
            for (String time : times) {
                System.out.println(time);
                String input = scanner.nextLine();
                C_Name.add(input);
            }
        }
        for (String date : Dates) {
            System.out.println("\n# courses for " + date + "\n");
            for (String time : times) {
                System.out.println(time + " : " + C_Name.get(index));
                index++;
            }
        }
        System.out.println("Time table for teacher: "+teacher);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TimeTable TT = new TimeTable();
        TT.make_timetable();
    }

}
    
    

