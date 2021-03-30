/*
  zoom session class 
  date: 30/03/2021
  this code snippet demonstrate the difference between Primitive and Reference variable
*/
public class VarType{
    public static void main(String[] args){
        //Primitive Variable
        int num1 = 20; 
        System.out.println(num1);

        //Reference Variable
        Human person1 = new Human("Gordon","Mzizi");
        Human person2 = new Human("Vice","Unkown");
        person1.display();
        person2.display();
    }
}

class Human{
    private String Name;
    private String Surname;

    Human(String Name, String Surname){
      this.Name = Name;
      this.Surname = Surname;  
    }

    public void display(){
        System.out.println(this.Name+"\t"+this.Surname);
    }

}
