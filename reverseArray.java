public class reverseArray {
    static void fun(int i,int n,int arr[]){
        if(i>=n/2)
        return;
        int temp=0;
        temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        fun(i+1,n,arr);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int n=arr.length;
        fun(0,n,arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    
}
