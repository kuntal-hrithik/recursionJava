public class pallindrome {
    boolean pal(String str,int start,int end){
        if(start>=end){
            return true;
        }
        return (str.charAt(start)==str.charAt(end))&&pal(str,start+1,end-1);
    }
    public static void main(String[] args) {
        pallindrome p = new pallindrome();
        String str = "abbba";
        int n = str.length();
        int start = str.charAt(0);
        int end = str.charAt(n-1);
        System.out.println(p.pal(str,start,end));
    }
    
}
