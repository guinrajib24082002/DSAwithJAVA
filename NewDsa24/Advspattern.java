// public class Advspattern {

//     public static void hollow_rectangle(int total_row,int total_column ){
//         //outer loop
//         for(int i=1;i<=total_row;i++){
//             //inner-columns
//             for(int j=1;j<=total_column;j++){
//                 //cell-(i,j)
//                 if(i==1 || i==total_row || j==1 || j==total_column){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }

//             }
//             System.out.println();
//         }

//     }
//     public static void main(String[] args) {
//         hollow_rectangle(4,5);
//     }
    
// }


//inverted half pyramid

// public class Advspattern{

//     public static void inverted_rotated_half_pyramid(int n){
//         //outer loop
//         for(int i=1;i<=n;i++){
//             //spaces print
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");

//             }
//             //stars print
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }


//     }
//     public static void main(String[] args) {
//         inverted_rotated_half_pyramid(4);
//     }
// }


//inverted hal_pyramid with numbers
public class Advspattern{


    public static void inverted_half_pyramid_no(int n){
        for(int i=1;i<=n;i++){
            //inner loop for numbers
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        inverted_half_pyramid_no(5);
        
    }
}