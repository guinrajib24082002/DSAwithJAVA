// public class froloops {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             System.out.println("rajibguin");
//         }
//     }
    
// }


//print square pattern
// public class forloops{
//     public static void main(String[] args) {
//         for(int l1=1;l1<=4;l1++){
//             System.out.println("****");
//         }
//     }
    
// }

//print reverser of a number

// public class forloops{
//     public static void main(String[] args) {
//         int n=1234561;
//         while(n>0){
//             int lastdigit=n%10;
//             System.out.print(lastdigit+"");
//             n=n/10;

//         }
//         System.out.println();
//     }
// }

//reverse the given number
public class forloops{
    public static void main(String[] args) {
         int reverse=0;
         int n=10899;
         while(n>0){
            int ld=n%10;
            reverse=(reverse*10)+ld;
            n=n/10;
         }
         System.out.println(reverse);
    }
}

