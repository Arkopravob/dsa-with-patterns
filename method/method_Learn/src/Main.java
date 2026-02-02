
//method :- Method is a block of  code that a perform specific task

//local variable : declare the variable inside the method is called local variable.
//parameter also called local variable.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class  TestMethod{
    int a; // instance variable
    int b;
    public static void updateNum(TestMethod t1){
        t1.a= 10;
        t1.b= 23;

    }
}
public class Main {
   public static int add(int a, int b) {
       return a+b;
   }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(add(1,2));
        TestMethod t1 = new TestMethod(); //object create
        t1.a = 6;
        t1.b = 9;
        System.out.println(t1.a);
        System.out.println(t1.b);
        t1.updateNum(t1);

        System.out.println("after passby referenes");
        System.out.println(t1.a);
        System.out.println(t1.b);

        }
    }
 // parameter  pass by reference

