public class floydstriangle {



    public static void floyds_triangle(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            //inner loops for number print
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();

        }
        
    }
    public static void main(String[] args) {
        floyds_triangle(5);
        floyds_triangle(5); 
        
    }
    
}
