public class linearsearch {

    public static int linearsearchfunction(int number[],int key){
        for(int i=0;i<=number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[]={2,3,6,78,90,23,43};
        int key=90;
        int index=linearsearchfunction(number,key);
        if(index==-1){
            System.out.println("not found at index");
        }else{
            System.out.println("key is at index :"+index);
        }


    }
    
}
