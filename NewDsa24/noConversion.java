// //Binary to decimal number conversion

// public class noConversion {

//     public static void bintoDec(int binNum){
//         int mynum=binNum;
//         int pow=0;
//         int decNum=0;
//         while(binNum>0){
//             int ld=binNum%10;
//             decNum=decNum+(ld* (int)Math.pow(2,pow));

//             pow++;
//             binNum=binNum/10;
//         }
//         System.out.println("decimal of" +  mynum+ "="+decNum);

        
//     }
//     public static void main(String[] args) {
//         bintoDec(101);
        
//     }

    
// }


//convert from decimal to binary

public class noConversion{


    public static void dectoBin(int n){
        int pow=0;
        int binNum=0;
        int mynum=n;
        while(n>0){
            int rem=n%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary form of"+ mynum +"is="+binNum);
    }
    public static void main(String[] args) {
        dectoBin(12);
        
    }
    
}


