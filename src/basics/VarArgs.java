import java.util.Arrays;
import java.util.Scanner;
public class VarArgs {// when we dont know how many inputs  we are giving so we use VarArgs method
   //varargs means variable length arguments
   public static void main(String[] args) {
        //       fun(2,3,4,5);
        multiple(2,3,"ashu","ajak");//variable length argument should always come at the end
    }
    static void multiple(int a,int b,String ...c){

    }

    static void fun(int...a) {
        System.out.println(Arrays.toString(a));
    }
}
