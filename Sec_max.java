class Sec_max{
    public int findSecondMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max)
                secondMax=arr[i];
            }
            return secondMax;
        }
        public static void main(String[] args){
            int[] arr={3,2,4,7,10,6,5};
            Sec_max obj=new Sec_max();
            System.out.println("Second maximum element in the array is: "+obj.findSecondMax(arr));
        }
    }