import java.util.*;
class hello{
    public static void main(String args[]){
        int a,c=0,i;
        String input[];
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter:");
        input=sc.nextLine().split(" ");
        a=Integer.parseInt(input[0]);
        for (i=1;i<=a;i++){
            if((a%i)==0){
                c+=1;
            }
            
        }
        if(a==2||a==3){
            System.out.print("prime number");
        }
        else{
        if(c>2){
        System.out.print("not a prime number");
        }
        else{
            System.out.print("prime number");
        }}
    }
}