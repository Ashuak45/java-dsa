import java.util.Scanner;
public class fxn {
    public static void main(String[] args) {

        //     String message=greet();
        //     System.out.println(message);
        String personalized=myGreet("ashu");
        System.out.println(personalized);
    }

    static String myGreet(String name) {
        String message="hello"+" "+ name;
        return message;

    }

 /*   static String greet() {
    String greeting="how r u";
return greeting;
}*/}

