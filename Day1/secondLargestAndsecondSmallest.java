public class secondLargestAndsecondSmallest {


//  function to find second smallest element in an array
    public static int secondLargest(int arr[]){

        int largest=arr[0];
        int secondLargest = Integer.MIN_VALUE; 

        for (int i=1; i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            
            }
            else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
           
        }

        return secondLargest;

    }
    

// function to find second smallest element in an array
    public static int secondSmallest(int arr[]){

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];

            }

            else if( arr[i]!=smallest && arr[i]<secondSmallest){
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;


    }

    public static void main(String[] args) {
     
        int arr[] = {12, 35, 1, 10, 34, 1};
    

       System.out.println("Second Largest Element is: " + secondLargest(arr));
       System.out.println("Second Smallest Element is: " + secondSmallest(arr));
       

    
        
        
    }

}
