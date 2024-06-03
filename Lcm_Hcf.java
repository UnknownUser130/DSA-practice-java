public class Lcm_Hcf {
    public static void calc(long n1, long n2){
        long gcd=1;
        long min=Math.min(n1,n2);
        for(long i=1;i<=min;i++){
            if(n1%i==0 && n2%i==0)
                gcd=i;
        }
        System.out.println(gcd);
    }
    public static void main(String[] args) {
        Lcm_Hcf.calc(14,8);
    }
}
