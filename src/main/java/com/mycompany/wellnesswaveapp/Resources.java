package com.mycompany.wellnesswaveapp;

import java.util.ArrayList; 
import java.util.HashMap;  

//import java.util.Arrays;

final public class Resources {
    private String[] arrayOfResources;
    
    // seperate arrays for each disorder
    private String[] disorder1Resources;
    private String[] disorder2Resources;
    private String[] disorder3Resources;
    private String[] disorder4Resources;
    private String[] disorder5Resources;
    private String[] disorder6Resources;

    private ArrayList<String> listOfResources;

    // or use a hash map? 
    private HashMap<String, String> dict;
    
    Resources(){
       this.arrayOfResources = new String[]{
           "testing", "once", "url", "url1", 
           "website1", "website2"
       };
       this.listOfResources = new ArrayList<>();
       this.dict = new HashMap<>();
       
       // adding resources to each disorder array
       this.disorder1Resources = new String[]{
           "disorder1resource1",
           "disorder1resource2",
           "disorder1resource3",
           "disorder1resource4"
       };
    }
    // ----------------------------------------
    
    // METHODS
    // getters 
    public ArrayList<String> getListOfResources() {
        return listOfResources;
    }


    // ----------------------------------------

    // other
//    public void moveToArrayList(String[] array){
//        for (String str : array){
//            System.out.println(str);
//            System.out.println();
//            
//            this.listOfResources.add(str);
//        }
//    }
    

    // may be unnecessary 
    public void moveToArrayList(){
        for (String str : this.arrayOfResources){
            this.listOfResources.add(str);
        }
        
        // or 
//        this.listOfResources.addAll(Arrays.asList(this.arrayOfResources));
    }
    
    // converting array to list may be unnecessary 
    // maybe make it private or protected
    public ArrayList<String> toArrayList(String[] arrayOfStrings){
        ArrayList<String> listOfStrings = new ArrayList<>();
        
        for (String str : arrayOfStrings){
            listOfStrings.add(str);
        }
        
        return listOfStrings; 
    }
    // ----------------------------------------

}
