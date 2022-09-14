public class printNaturalNo {
    static void fun(int n){
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int x = 4;
        fun(x);
    }
}
//time complexity theta n
//tail recursion=when the parent fn is having nothing to do when the child fun gives it  control back