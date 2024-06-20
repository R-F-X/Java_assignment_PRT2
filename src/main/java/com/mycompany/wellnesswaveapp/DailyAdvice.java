
package com.mycompany.wellnesswaveapp;

import java.util.Random; 

// generate or get quotes
// display a random quote
// read quotes from an external file? 
public class DailyAdvice {
    
    String[] quotes;
    
    DailyAdvice(){
        quotes = new String[]{
            "advice1",
            "advice2"
        };
    }
    
    
    // METHODS
    public String getQuote(){
        Random randomQuote = new Random();
        int index = randomQuote.nextInt(quotes.length);
        
        return this.quotes[index];
    }
    
    
    // MAIN
    public static void main(String[] args){
        DailyAdvice test = new DailyAdvice();
        System.out.println(test.getQuote());
        System.out.println(test.getQuote());
        System.out.println(test.getQuote());
        
        // END
        System.out.println("\n<END OF FILE>");
    }
}
