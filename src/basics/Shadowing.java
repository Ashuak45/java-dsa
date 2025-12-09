public class Shadowing {
    static int x=87;//static is basically used here for making it object independent
    //the above line gets shadowed at line 9
    public static void main(String[] args) {
        System.out.println(x);//here it prints the value as 87
        int x=40;//but here a local scope is introduced so it overrides the value of the previous x
        System.out.println(x);//and it prints 40
        //scope will only begin when value is initalized
        fun();
    }
    static void fun(){
        System.out.println(x);//again it gives 87
    }
}
