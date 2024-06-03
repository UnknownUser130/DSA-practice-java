public class Count_dig {
    //Brute-Force
    public int countDigits(int n) {
        int count=0;
        while(n!=0){
            ++count;
            n=n/10;
        }
        return count;
    }
    //Optimal sol
    public int countDigits2(int n) {
        return (int)(Math.log10(n)+1);
    }
    public static void main(String[] args){
         Count_dig obj=new Count_dig();
         System.out.println(obj.countDigits(1019273));
         System.out.println(obj.countDigits2(1019273));
    }
}
