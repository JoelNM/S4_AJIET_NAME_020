import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[]={5,4,3,7,2,6,1};
        int register=arr[0];
        int cut=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<register){
                cut++;
                register=arr[i];
            }
        }
        System.out.println(cut);
    
    }
}
