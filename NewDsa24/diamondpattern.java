public class diamondpattern {

    public static void diamondpattern1(int n){
        for(int i=1;i<=n;i++){
            //spaces print
            for(int j=1;j<=n-i;j++){
                System.out.print("");
            }

            //star print 
            for(int j=i;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half code
        for(int i=n;i>=1;i--){
            //spaces print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //star print 
            for(int j=i;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        diamondpattern1(7);
        
    }
    
}
