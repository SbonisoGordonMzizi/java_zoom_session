/*
  zoom session class 
  date: 30/03/2021
  this code snippet demonstrate the needs of Wrapper Classes
*/

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        // Autoboxing
        Boolean bool = true;
        Character charVar = 'a';
        Byte byte1 = 10;
        Double double1 = 10.00;
        Integer int1 = 100;
        
        //Autounboxing
        System.out.println(int1);
        
        //the following statement will raise exception becouse Collection Objects do not support Primitive data type
        ArrayList<int> listOfInt1 = new ArrayList<>();
        //the following statement will execute, Wrapper Class of Integer is used
        ArrayList<Integer> listOfInt2 = new ArrayList<>();
        

    }
}
