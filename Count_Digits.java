public class Count_Digits {
    public static int countDigits(int n){
        int dup=n,c=0;
        while(dup!=0){
            dup=dup/10;
            c++;
        }
        return c;
    }
    public static void main(String args[]){
       System.out.println(Count_Digits.countDigits(1908));
    }
}
