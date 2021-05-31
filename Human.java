public class Human{
    //instance variables
    String fname;
    String lname;
    int age;
    
    //constructor 
    public Human(String fname, String lname, int age){
     this.fname = fname;
     this.lname = lname;
     this.age = age;
    }

    //instance methods
    void run(){
        System.out.println(fname+" "+lname+" is Running");
    }
    void eat(){
        System.out.println(fname+" "+lname+" is eating");
    }
}