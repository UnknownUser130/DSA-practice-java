public class Fibonacci {
    public static void fib(int n){
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
        }
    public static void main(String[] args){
        fib(5);
    }
}
