/*
  Author: Sboniso Gordon Mzizi
  Date: 13/04/2021
               problem statement
  1) Create a for statement using a range og numbers from 1 to 1000 inclusive.
  2) Sum all the numbers that can be devided with both 3 and 5.
  3) for those numbers that met the above conditions, print out.
  4) Break out of the loop once you find 5 numbers that met the above conditions.
  5) after breaking out of the loop print the sum of the number that met the abouve conditions.
*/
public class Sum3And5{
    public static void main(String[] args) {
        long sum = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++){
            if(i % 3 ==0 && i % 5 ==0){
                
                if(count == 5){
                    break;
                }
                sum += i;
                System.out.println("number found  "+i);
                count++;
            }          
        }
        System.out.println("Sum of numbers that a deviceble by 3 and 5  "+sum);
    }
}