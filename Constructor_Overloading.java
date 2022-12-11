import java.util.*;
class A {
    int x;int y;
    A(int l,int b){
        x=l;
        y=b;
        
    }
    A(int a){
        x=a;
        y=a;
        
    }
    public int area(){
        return x*y;
    }
}
class Constructor_Overloading{
    public static void  main(String args[]){
        System.out.println("enter:");
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        A sq= new A(x);
        A rec= new A(x,y);
        System.out.println(sq.area());
        System.out.println(rec.area());
    }
}