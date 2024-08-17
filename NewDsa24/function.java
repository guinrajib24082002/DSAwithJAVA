// public class function {
//     public static void printmessage(){
//         System.out.println("hello world");
//     }
//     public static void main(String[] args) {
//         //body of function
//         printmessage();  
//     }

// }

//syntax of function
// import java.util.*;
// public class function{
//     public static void calculatesum(){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int sum=a+b;
//         System.out.println("sum is:"+sum);
//     }
//     public static void main(String[] args) {
//        calculatesum(); 

//     }
// }

// import java.util.*;
// public class function{
//     public static int calculatesum(int a,int b){//paarameter or formal parameter
//         int sum=a+b;
//         return sum;

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int sum=calculatesum(a, b);//arguments or actual parameter
//         System.out.println("sum is:"+sum);
//     }
// }

//call by value and call by reference with the help of swapping values
// public class function{

//     public static void swap(int a, int b){
//         //swap
//         int temp=a;
//         a=b;
//         b=temp;
//         System.out.println("a=:"+a);
//         System.out.println("b=:"+b);
//     }
//     public static void main(String[] args) {
//         int a=3;
//         int b=4;
//         swap(a,b);
//     }
// }

// //find product of a and  b
// public class function {

//     public static int calculateproduct(int a,int b){
//         int x=a*b;
//         return x;
//     }
//     public static void main(String[] args) {
//         int a=2;
//         int b=3;
//         int x=calculateproduct(a,b);
//         System.out.println(x);
        
//     }
// }

//factorial using function

// public class function{
//     public static void main(String[] args) {
//         int f=1;
//         int n=5;
//         for(int i=1;i<=n;i++){
//             f=f*i;
//         }
//         System.out.println("factorial is:"+f);
//     }
// }

// public class function{
//     public static int findfactorial(int n){
//         int f=1;
//         for(int i=1;i<=n;i++){
//              f=f*i;
//         }
//         return f;
//     }

//     public static void main(String[] args) {
//         int n=15;
//         int fact=findfactorial(n);
//         System.out.println("factorial is:"+fact);
//     }

// }