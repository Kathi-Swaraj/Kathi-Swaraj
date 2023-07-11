import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=5;i++){
             i=sc.nextInt();
          sum+=i;
        }
        
        
        System.out.println("The sum of 5 integers is:"+sum);
        
    }
}