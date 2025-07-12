public class MergeTwoSortedArray {
    // function to merge two sorted arrays

    public static void mergeSortedArrays(int arr1[], int arr2[], int m, int n) {

        int index= m+n-1;
        int i=m-1;
        int j=n-1;

        while(i>=0 && j>=0){
            if(arr1[i]<arr2[j]){
                arr1[index]=arr2[j];

                index--;
                j--;

            }

            else{
                arr1[index]=arr1[i];
                index--;
                i--;

            }

          
        }

          while(j>=0){
                arr1[index]=arr2[j];
                 j--;
                index--;
               
            }
       
        
        

       
    }
    

    // main function

    public static void main(String[] args) {
          int arr1[] = {1, 3, 5, 7, 0, 0, 0, 0}; // arr1 has extra space
        int arr2[] = {2, 4, 6, 8};
        int m = 4; // initial valid elements in arr1
        int n = 4; // number of elements in arr2
        
          mergeSortedArrays(arr1, arr2, m, n);

        // Print merged array
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        
    }
    



}
