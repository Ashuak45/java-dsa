import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //String fruit=in.next();

        //  switch (fruit) {
        //      case "Apple" -> System.out.println("A sweet red fruit");
        //   case "Orange" -> System.out.println("round fruit");
        //      case "Mango" -> System.out.println("king of fruits");
        //        default -> System.out.println("plz enter a valid fruit");
        // }
        System.out.println("enter the  no. of day");
        int day=in.nextInt();
        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("error");
        }
    }}