import java.util.*;
import java.lang.*;

public class ayush {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a,i,combo1=0,combo2=0,j,g;
        
        int arr[] = new int[4];
        System.out.println("Enter a number :");
        a=sc.nextInt();
        int number=a,c=0,n=0,l=0,k=0;
        
          int temp=a;
          while (temp>0){
              temp=temp/10;
              n++;
          }
          System.out.print("The number is of "+n+" places.\n");
          for (g=0;g<n;g++){
              arr[g]=a%10;
                a=a/10;
          }
            for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    if(i!=j){
                        combo1=arr[i]*10+arr[j];
                        combo2=arr[(n-1)-i]*10+arr[(n-1)-j];
                        if((combo1*combo2)==number){                            
                            System.out.println("It is a vampire number.\n");
                            break;
                        }
                        else{
                            System.out.print("Not a vampire number");
                        }
                    } 
                    }
                }
            }
}