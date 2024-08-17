//function overloading using no of parameters
// public class overloading {

//     public static int sum(int a,int b){
//         return a+b;
//     }

//     public static int sum(int a,int b,int c){
//         return a+b+c;
//     }
//     public static void main(String[] args) {
//         System.out.println(sum(1,2));
//         System.out.println(sum(2,3,4));
        
//     }
    
// }

//using datatypes

// public class overloading {

//     public static int sum(int a,int b){
//         return a+b;
//     }

//     public static double sum(double a,double b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         System.out.println(sum(1,2));
//         System.out.println(sum(2.4,3.5));
        
//     }
    
// }

//check prime or not using function

// public class overloading{
    
//     public static boolean isprime(int n){
//         boolean isprime=true;
//         for(int i=2;i<=n-1;i++){
//             if(n%i==0){
//                 isprime=false;
//                 break;
//             }
//         }
//         return isprime;
//     }
//     public static void main(String[] args) {
//         System.out.println(isprime(5));
//     }
    
// }


//optimized code for prime no

// public class overloading{


//     public static boolean isprime(int n){

//         if(n==2){
//             return true;
//         }
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         System.out.println(isprime(1007));
//     }
// }


//print all primes in a range, range=10;
public class overloading{

    public static boolean isprime(int n){
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        primeinrange(200);//range 2 to 20
    
        
    }
}

