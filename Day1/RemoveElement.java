public class RemoveElement {
    // function to remove elemnet fron an array

    public static int removeElement(int arr[], int val) {

        int k=0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]!=val){
                arr[k]=arr[i];
                k++;
            
            }
        }
        return k;
    }
        


    public static void main(String[] args) {
     int  arr[] = {0,1,2,2,3,0,4,2};
     int val = 2;
        
     

        System.out.println(removeElement(arr, val));

       
       
       
    }

}
