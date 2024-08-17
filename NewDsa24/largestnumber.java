import java.util.*;
public class largestnumber {

    public static int Getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest number is:"+smallest);
        return largest;
    }
    public static void main(String[] args) {

        int numbers[]={2,4,8,10,1};
        System.out.println("largest number is:"+Getlargest(numbers));
        
    }
    
}
