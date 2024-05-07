
package com.mycompany.wellnesswaveapp;

// desc
// testing the logic and flow of the questionnaire
// 

// notes
// use an interface?
// divide questions into 3 sections

import java.util.Scanner; 

public class Questionnaire {

    Scanner userIn; 
    String d1, d2, d3, d4, d5, d6; 
    int d1Counter, d2Counter, d3Counter, d4Counter, d5Counter, d6Counter;
    
    String[] disorders = {d1, d2, d3, d4, d5, d6}; 
    int[] counters = {d1Counter, d2Counter, d3Counter, d4Counter, d5Counter, d6Counter};

    
    Questionnaire(){
        userIn = new Scanner(System.in);
        d1 = "depression";
        d2 = "anxiety";
        d3 = "bipolar";
        d4 = "suicidal thoughts";
        d5 = "PTSD";
        d6 = "ADHD";
    }
    // -------------------------------
    
    // version1
//    public void question1(){
//        String q1 = "How would you rate your overall mood and emotional state recently?";
//        System.out.println(q1);
//        
//        System.out.println("> ");
//        String response = userIn.nextLine();
//        
//        System.out.println(response);
//    }
    
    // version2
    public void question1(String question){
        String q1 = "Howly?";
        System.out.println(q1);
           
        System.out.println(question);

        
        // scale of 1 rto 5 or 10
        System.out.print("> ");
        String response = userIn.nextLine();
        
        
        switch(response){
            case "1", "2", "3" -> {
                d1Counter += 1;
                System.out.println("low");
            }
            case "4", "5", "6" -> {
                d2Counter += 1;
                System.out.println("medium");
            }
            case "7", "8", "9", "10" -> {
                d3Counter += 1;
                System.out.println("high");
            }

            default -> System.out.print("def\n");
        }
        
        // print all counters
        System.out.println("Counter1 " + d1Counter);
        System.out.println("Counter2 " + d2Counter);
        System.out.println("Counter3 " + d3Counter);
        System.out.println("Counter4 " + d4Counter);
        System.out.println("Counter5 " + d5Counter);
        System.out.println("Counter6 " + d6Counter);
    }
    
    
     
    public void questionBase(String question){
//        String q1 = "Howly?";
//        System.out.println(q1);
           
        System.out.println(question);

        
        // boolean
        System.out.print("> ");
        String response = userIn.nextLine().toLowerCase();
        
        if ("t".equals(response)){
            d1Counter += 1;
        }
        else if ("f".equals(response)){
            d2Counter += 1;
        }
        else{
            System.out.println("invalid input");
        }
        
        
        // print all counters
        System.out.println("Counter1 " + d1Counter);
        System.out.println("Counter2 " + d2Counter);
        System.out.println("Counter3 " + d3Counter);
        System.out.println("Counter4 " + d4Counter);
        System.out.println("Counter5 " + d5Counter);
        System.out.println("Counter6 " + d6Counter);
    }
    
    public void mostLikelyAilment(){
        // maybe use arraylists
        System.out.println(this.counters.length);
        
        int highest = 0;
        int index = 0; 
        for (int a=0; a < this.counters.length; a++){
            System.out.println(counters[a]);
            
            if (counters[a] > highest){
                highest = counters[a];
                index = a;
            }
        }
        
//        System.out.println(highest);
//        System.out.println(index);
//        System.out.println(disorders[index]);
//        System.out.println(d4);
    }
}
