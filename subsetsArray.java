import java.util.ArrayList;


public class subsetsArray {
    static void print(int arr[],int index,ArrayList<Integer>path){
        if(index==arr.length){
            System.out.println(path);
        }
        else{
            print(arr,index+1,path);
            path.add(arr[index]);
            print(arr,index+1,path);
            path.remove(path.size()-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={3,2,1};
        ArrayList<Integer>path= new ArrayList<Integer>(); 
        print(arr,0,path);

    }
    
}
