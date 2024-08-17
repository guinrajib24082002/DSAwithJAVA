// import java.util.*;

// public class array {
//     public static void main(String[] args) {
//         int marks[]=new int[20];
//         Scanner sc=new Scanner(System.in);

//         marks[0]=sc.nextInt();//phy
//         marks[1]=sc.nextInt();//chem
//         marks[2]=sc.nextInt();//math

//         System.out.println("phy:"+marks[0]);
//         System.out.println("chem:"+marks[1]);
//         System.out.println("math:"+marks[2]);

//         //marks updation
//         // marks[2]=marks[2]+1;
//         // System.out.println("math:"+marks[2]);

//         //calculate percentage
//         int percentage=(marks[0]+marks[1]+marks[2])/3;
//         System.out.println("percentage of marks:"+percentage+"%");

//         //length of marks array
//         System.out.println("length of marks array is:"+marks.length);


        
//     }
    
// }


//passing array as AN argument
// public class array{

//     public static void update(int marks[]){
//         for(int i=0;i<marks.length;i++){
//             marks[i]=marks[i]+1;

//         }
//     }
//     public static void main(String[] args) {
//         int marks[]={97,98,99};
//         update(marks);

//         //print marks
//         for(int i=0;i<marks.length;i++){
//             System.out.print(marks[i]+" ");
//         }
//         System.out.println();

//     }
// }


//find the largest number in an array
import java.util.*;
public class array{

    public static int getLargest(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }

        }
        return largest;

    }
    public static void main(String[] args) {
        int number[]={2,3,4,1,5,7};
        System.out.println("largest number in the array is:"+getLargest(number));

    }
}