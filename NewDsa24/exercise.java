// import java.util.*;
// public class exercise{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int number;
//         int choice;
//         int even_sum=0;
//         int odd_sum=0;
//         do{
//             System.out.println("enter the number; ");
//              number=sc.nextInt();
//             if(number %2 ==0){
//                 even_sum+=number;
//             }else{
//                 odd_sum+=number;
//             }
//             System.out.println("do u want to continue? press 1 for yes and press 0 for no");
//             choice=sc.nextInt();
//         }while(choice==1);
//         System.out.println("sum of even numbers is:"+even_sum);
//         System.out.println("sum of odd numbers is:"+odd_sum);
//     }
// }


//factorial of any number
// import java.util.*;
// public class exrecise{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number:");
//         int f=1;
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             f=f*i;
//         }
//         System.out.println("factorial of given number is:"+f);

//     }
// }


//multiplication table of a number 
import java.util.*;
public class exercise{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number for multiplication table:");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+ n*i);
        }
    }
}