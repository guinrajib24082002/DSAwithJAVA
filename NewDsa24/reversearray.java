public class reversearray {

    public static void reversearray1(int numbers[]){
        int start=0;
        int end=numbers.length-1;
        while(start<end){
            //swapping
            int temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;

            start++;
            end--;

        }

    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,13};
        reversearray1(numbers);
        //print the array
        for(int i=0;i<numbers.length-1;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();   
    }
    
}
