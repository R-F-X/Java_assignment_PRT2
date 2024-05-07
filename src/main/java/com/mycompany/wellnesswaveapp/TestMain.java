
package com.mycompany.wellnesswaveapp;

public class TestMain {

    public static void main(String[] args) {
        // TESTING
        System.out.println("\n<TESTING>");

        Resources testObj = new Resources();
        testObj.moveToArrayList();
        System.out.println(testObj.getListOfResources()); 
        
        // END
        System.out.println("\n<END OF TEST>");
    }
}
