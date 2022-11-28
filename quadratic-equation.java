import java.util.*;
import java.math.*;
class HelloWorld {
    public static void main(String[] args) {
        double a,b,c,f1,f2;
        String[] input;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the values of a,b,c for eq:a(x^2)+bx+c :");
        
input=sc.nextLine().split(" ");
a=Integer.parseInt(input[0]);
b=Integer.parseInt(input[1]);
c=Integer.parseInt(input[2]);
f1=((-b+(Math.sqrt(b*b-4*a*c)))/2);
f2=((-b-(Math.sqrt(b*b-4*a*c)))/2);

System.out.print(f1);
System.out.print(" , ");
System.out.print(f2);


}}