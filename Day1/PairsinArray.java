public class PairsinArray {
    // function to create pairs in an array
    public static void createPairs(int arr[]){
        for(int i= 0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+ arr[i] + ", " + arr[j] + ") ");
            }

            System.out.println();

            


            
            


           

        }
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        createPairs(arr);
        System.out.println();
    }
    
}
