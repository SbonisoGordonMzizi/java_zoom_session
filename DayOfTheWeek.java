public class DayOfTheWeek{
    public static void main(String[] args){
          printDayOfTheWeek(3);
    }
    private static void printDayOfTheWeek(int dayOfTheWeek){
        switch(dayOfTheWeek){
           
            case 0:
               System.out.println("Sunday");
            break;
            case 1:
               System.out.println("Monday");
            break;
            case 2:
               System.out.println("Tuesday");
            break;
            case 3:
               System.out.println("Wenesday");
            break;
            case 4:
               System.out.println("Thurday");
            break;
            case 5:
               System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
         break;
            default:
              System.out.println("Invalid Day");
            break;
        }
    }
}