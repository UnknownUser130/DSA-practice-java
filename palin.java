public class palin {
    public int palindrome(int n){
        int dup=n,rev=0,d;
        while(dup>0){
            d=dup%10;
            rev=rev*10+d;
            dup=dup/10;
        }
        return rev;
    }
    public static void main(String[] args){
        palin ob=new palin();
        System.out.println(ob.palindrome(1010));
    }
}
