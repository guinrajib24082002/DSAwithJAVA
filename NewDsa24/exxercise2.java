//write a java method to compute the average of three numbers

// public class exercise2 {

//     public static int findaverage(int a,int b,int c){
//         int sum=a+b+c;
//         return sum/3;
//     }
//     public static void main(String[] args) {
//         System.out.println(findaverage(2,3,4));
//     }
// }

//Question 2 : Write a method named isEven that accepts an int argument. The method
//should return true if the argument is even, or false otherwise. Also write a program to test your
//method

// public class exercise2{


//     public static boolean iseven(int a){
//         boolean iseven=true;
//         if(a%2==0){
//             return true; 
//         }
//         return false;

//     }
//     public static void main(String[] args) {
//         System.out.println(iseven(4));
//         System.out.println(iseven(3));
        
//     }
// }


//Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a
// palindrome, 321 is not)
// A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
// palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
// palindrome because the reverse of 321 is 123, which is not equal to 321
// import java.util.*;

// public class exercise2{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter number:");
//         int n=sc.nextInt();
//         int actualno=n;
//         int sum=0;
//         int rem;
//         while(n>0){
//             rem=n%10;
//             sum=sum*10+rem;
//             n=n/10;

//         }
//         if(sum==actualno){
//             System.out.println("the no is palindrome");
//         }
//         else{
//             System.out.println("the no is not palindrome");
//         }

//     }
// }


//Question 5 :
// Write a Java method to compute the sum of the digits in an integer.
// (Hint : Approach this question in the following way :
// a. Take a variable sum = 0
// b. Find the last digit of the number
// c. Add it to the sum
// d. Repeat a & b until the number becomes 0 )


public class exxercise2{
    public static void main(String[] args) {
       int n=10459;
       int sod=0;
       int rem;
       while(n>0){
        rem=n%10;
        sod=sod+rem;
        n=n/10;
       } 
       System.out.println("sum of digit is:"+sod);
    }
}
