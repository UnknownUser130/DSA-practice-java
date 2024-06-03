import java.util.Scanner;
public class Inverse_Num {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int num=0,pos=1;
        while(n!=0){
            int d=n%10;
            num=num+pos*(int)Math.pow(10,d-1);
            n=n/10;
            pos++;
        }
        System.out.println(num);
        sc.close();
    }
}
