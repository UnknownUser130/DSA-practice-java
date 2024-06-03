public class Rev_array {
    static void reverseArray(int numbers[],int start,int end){
        while(start<end){
            int temp=numbers[start];
            numbers[start]=numbers[end];
            numbers[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int arr[]={2,3,4,5,6,7,8,9,10};
       reverseArray(arr,2,6);
         for(int i=0;i<arr.length;i++){
              System.out.println(arr[i]);
         }
    }
}