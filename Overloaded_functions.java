import java.util.*;
class Overloaded_functions{
    public static void main(String args[]){
        System.out.println("Ayush Shah");
        System.out.println("60004210128");
        System.out.println("enter a single input for a square and 2 inputs seperated by space to find the area of rectangle");
        //String []input;
        Scanner sc= new Scanner(System.in);
        //input=sc.nextLine().split(" ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("ennter choice 1 or 2:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                area(a);
                break;
            case 2:
                area(a,b);
                break;
              
        }  
        }
        
        
    
    public static int area(int a){
        int area=(a*a);
        System.out.println(area);
        return area;
    }
    public static int area(int a ,int b){
        int area=a*b;
        System.out.println(area);
        return area;
    }
}