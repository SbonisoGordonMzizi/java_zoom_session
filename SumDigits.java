/*


*/

public class SumDigits{
    public static void main(String[] args){
       // System.out.println(sumDigits(3));
       // System.out.println(sumDigits(-1));
        //System.out.println(sumDigits(125));
       
       

        
    }
    private static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
        while (number > 0){
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}