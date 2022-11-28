import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int a,b,c,d,e;
        String[] input;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter:");
        
input=sc.nextLine().split(" ");
a=Integer.parseInt(input[0]);
b=Integer.parseInt(input[1]);
System.out.print(a+b);
}}