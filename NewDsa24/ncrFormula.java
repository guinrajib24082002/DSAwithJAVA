public class ncrFormula {

    public static int findfactorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
             f=f*i;
        }
        return f;
    }

    public static int bincoeff(int n,int r){
        int fact_n=findfactorial(n);
        int fact_r=findfactorial(r);
        int fact_nmr=findfactorial(n-r);

        int bincoeff=fact_n/(fact_r* fact_nmr);
        return bincoeff;
    }
    public static void main(String[] args) {
        System.out.println(bincoeff(5,2));

    }
}
