import java.util.Scanner;
public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "ashu";
        {
            int c = 3500;//no impact bcoz the value assigned in the block stays in the block
            a = 56;
            name = "ASHU";//here the name getss updated as it isn't assigned but it is modified
            System.out.println(name);
        }//anything updated or assign outside the block will get updated inside the block but anything assigned inside the block won't show any change in whole program and can,t be use outside thw block too
        System.out.println(a);
        System.out.println(b);
        //  System.out.println(c); it shows an error like cannot find symbol variable 'c' bcoz the it was initialized inside the block
    }}