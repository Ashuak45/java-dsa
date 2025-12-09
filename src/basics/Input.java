import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //array of primitives
        int[] arr=new int[5];
        arr[0]=1;
        arr[1]=83;
        arr[2]=234;
        arr[3]=124;
        arr[4]=83;
        for(int i=0;i<arr.length;i++) {
            arr[i] = in.nextInt();
        }
       // System.out.println(Arrays.toString(arr));
        //for(int i=0;i<arr.length;i++)//arr.length is used to find the length of an array
        //     System.out.println(arr[i]+" ");


  // for(int num : arr){//for every element in array,print the element
       //System.out.println(num+" ");//here num represent element of an array

//system.out.println(arr[i]);
   // array of objects
    String[]str=new String[4];
   for(int i=0;i<str.length;i++)
    {
        str[i] = in.next();
    }
   system.out.println(Arrays.toString(arr));//modify
}
}
}
