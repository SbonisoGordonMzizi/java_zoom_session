public class SwitchClass{
    public static void main(String[] args){
        char value = 'a';
        switch (value.toUpperCase()) {
            case 'A':
                System.out.println(value+" Found");
                break;
            case 'B':
                System.out.println(value+" Found");
                break;
            case 'C':
                System.out.println(value+" Found");
                break;
            case 'D':
                System.out.println(value+" Found");
                break;
            case 'E':
                System.out.println(value+" Found");
            break;
            default:
                System.out.println("No value Found");
                break;
        }
    }
}