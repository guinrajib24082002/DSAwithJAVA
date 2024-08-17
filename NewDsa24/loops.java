// public class loops {
//     public static void main(String[] args) {
//         int count=0;
//         while(count<10){
//             System.out.println("hello world");
//             count++;
//         }
//         System.out.println("done 10 times ");
//     }
// }

//print numbers from 1 to 10
// public class loops{
//     public static void main(String[] args) {
//         int i=1;
//         while(i<=10){
//             System.out.print(i+" ");
//             i++;
//         }
//         System.out.println();
//     }
// }

//print numbers from 1 to n

// import java.util.*;
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number");
//         int n=sc.nextInt();
//         int i=1;
//         while(i<=n){
//             System.out.print(i+" ");
//             i++;
//         }
//         System.out.println();


//     }
// }

//print sum of 1st n natural number
import java.util.*;

public class loops{
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nth term");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    
        


    }
}
