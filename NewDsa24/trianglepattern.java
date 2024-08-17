public class trianglepattern {

    public static void triangle_pattern(int n){
        //outer loop
        for (int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
       
    }

    public static void main(String[] args) {
        
        triangle_pattern(5);
    }

    
}
