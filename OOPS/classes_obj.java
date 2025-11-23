package OOPS;

public class classes_obj {
 
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

     
         Animal a = new Animal();
         a.setName("Lion") ;
         a.getNumber(50); ;
         System.out.println(a.Name);
         System.out.println(a.Number);

    }   
}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Animal{
    String Name;
    int Number;
    void setName(String NewName){
        Name = NewName;
    }
    void getNumber(int NewNumber){
        Number = NewNumber;
    }

}