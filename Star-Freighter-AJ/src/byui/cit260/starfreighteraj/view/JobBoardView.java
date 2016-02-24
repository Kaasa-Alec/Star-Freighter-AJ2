/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starfreighteraj.view;

import java.util.Scanner;

/**
 *
 * @author AlecSir
 */
public class JobBoardView {
    
    private String menu;

    public JobBoardView() {
        this.menu = "\n************************************************"
                           + "\n*----------------------------------------------*"
                           + "\n*|Guy at the Counter                          |*"
                           + "\n*----------------------------------------------*"
                           + "\n*                                              *"
                           + "\n* 'Oh, those? Those are board postings of jobs *"
                           + "\n* folks need done. A lot of them are transport *"
                           + "\n* so maybe you should consider signing up for  *"
                           + "\n* a few. I've got the money here, so let me    *"
                           + "\n* know which ones you'd like. But be careful   *"
                           + "\n* which you choose. Don't go spending the      *"
                           + "\n* money then changing your mind.'              *"
                           + "\n*                                              *"
                           + "\n************************************************"
                           + "\n                                                "
                           + "\n------------------------------------------------"
                           + "\n| Job Board                                    |"
                           + "\n------------------------------------------------"
                           + "\nA - Job A"
                           + "\nB - Job B"
                           + "\nC - Job C"
                           + "\nD - Job D"
                           + "\nE - Job E"
                           + "\nF - Job F"
                           + "\nQ - Back to Vendor"
                           + "\n------------------------------------------------";
    }
    
    public void displayJobBoardView() {
        
        boolean done = false;
        do {
            
            String jobBoardOption = this.getJobBoardOption();
            if (jobBoardOption.toUpperCase().equals("Q"))
               return;
            
            done = this.doAction(jobBoardOption);
            
        }  while (!done);
        
    }

    private String getJobBoardOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = ""; 
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: The value cannot be blank");
                continue;
            }
            
            break;
        }
        
        return value;
    }

    private boolean doAction(String jobBoardOption) {
        jobBoardOption = jobBoardOption.toUpperCase();
        boolean valid = true;
        switch (jobBoardOption) {
            case "A":
                this.displayJobA();
                break;
            case "B":
                this.displayJobB();
                break;
            case "C":
                this.displayJobC();
                break;
            case "D":
                this.displayJobD();
                break;
            case "E":
                this.displayJobE();
                break;
            case "F":
                this.displayJobF();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                valid = false;
                break;
    }
        return false;
}

    private void displayJobA() {
        System.out.println("*** displayJobA function called ***");
    }

    private void displayJobB() {
        System.out.println("*** displayJobB function called ***");
    }

    private void displayJobC() {
        System.out.println("*** displayJobC function called ***");
    }

    private void displayJobD() {
        System.out.println("*** displayJobD function called ***");
    }

    private void displayJobE() {
        System.out.println("*** displayJobE function called ***");
    }

    private void displayJobF() {
        System.out.println("*** displayJobF function called ***");
    }
}