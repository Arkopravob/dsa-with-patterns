/*user defined method - to create user defined method are blocks of code written by programmer to excecute it we first create an object(if obj are non static)
* then call the method using that object */
public class UserDefinedMethod {
    void hello(){
        System.out.println("this is user-defined method");
    }

    public static void main(String[] args) {
        UserDefinedMethod obj = new UserDefinedMethod();
        obj.hello();

    }
}
