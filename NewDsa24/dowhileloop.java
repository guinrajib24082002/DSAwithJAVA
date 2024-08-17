// public class dowhileloop {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             if(i==3){
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("i am out of the loop");
//     }
    
// }


//keep entering numbers till user enters a multilple of 10

// import java.util.*;
// public class dowhileloop{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         do{
//             System.out.print("entering numbers: ");
//             int n=sc.nextInt();
//             if(n%10==0){
//                 break;
//             }
//             System.out.println(n);

//         }while(true);

//     }
// }

// public class dowhileloop{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             if(i==3){
//                continue; 
//             }
//             System.out.println(i);
//         }
//     }
// }

// display all numbers entered by user except multiples of 10;

// import java.util.*;
// public class dowhileloop{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         do{
//             System.out.print("enter ur number: ");
//             int n=sc.nextInt();
//             if(n%10==0){
//                 continue;
//             }
//             System.out.println(n);

//         }while(true);
//     }
// }

//check if a number is prime or not;
// import java.util.*;
// public class dowhileloop{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number and check it: ");
//         int n=sc.nextInt();
//         int count=0;
//         for(int i=1;i<=n;i++){
//             if(n%i==0){
//                 count++;
//                 i++;
//             }
//         }
//         if(count==2){
//             System.out.println("the no is prime");
//         }else{
//             System.out.println("the no is not prime");
//         }
//     }
// }

//second method to check a number is prime or not
// import java.util.*;
// public class dowhileloop{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter number for checking: ");
//         int n=sc.nextInt();
//         if(n==2){
//             System.out.println("no is prime");
//         }else{
//             boolean isprime=true;
//         for(int i=2;i<=n-1;i++){
//             if(n%i==0){
//                 isprime=false;
//             }

//         }
//         if(isprime==true){
//             System.out.println("no is prime");
//         }else{
//             System.out.println("no is not prime");
//         }

//         }
        
//     }
// }



