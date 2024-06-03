public class Prime_No{
    static void prime_no(int n){
        int k=0;
        for(int i=2;i*i<n;i++){
            if(n%i==0)
               k++;
               break;
        }
        if(k==0)
          System.out.println("Prime");
        else
          System.out.println("Not prime");
    }
    public static void main(String args[]){
        Prime_No.prime_no(5);
    }
}