
package prt2.assignment;

import java.util.ArrayList; 
import java.util.Random; 

public class App {
    
//    ArrayList<Integer> nums; 
    
    
    // METHODS
    public static void populateListWithInts(int numOfElements){
        ArrayList<Integer> nums = new ArrayList<>(); 

        Random random = new Random(); 
        
        
        for (int a=0; a < numOfElements; a++){
            int randInt = random.nextInt(1000);
            nums.add(randInt);
        }
        
        System.out.println(nums);
    }
    
}
