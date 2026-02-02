//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome String!");
        String str1 = "Hello Arko";
        System.out.println(str1);
        //length of string
        int n = str1.length();
        System.out.println(n);

        //index of characeter
         System.out.println(str1.indexOf("H"));
         System.out.println(str1.lastIndexOf("Arko"));

         //uppercase & lower case
        System.out.println(str1.toUpperCase() + " " + str1.toLowerCase());
        //replace the character
        System.out.println(str1 + " " + str1.replace('H','A'));
        String str2 = " I am a string";
        System.out.println(str2.length());
        String str3 = str2.trim();

        System.out.println(str3);

        //string creation using new keyword
        String s1 = new String("I love java");
        System.out.println(s1);


        }
    }