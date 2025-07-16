
public class sortingAlgo {


    // BUbble sort

    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                
            }
        }
    }


    // selction sort

    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int small=i;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[small]>arr[j]){
                    small=j;

                }
            }

            // swap

            int temp=arr[small];

            arr[small]=arr[i];
            arr[i]= temp;
        }
    }


    // insertion Sort

    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {

            int cur=arr[i];

            int prev = i-1;

            // find position

            while(prev>=0 && arr[prev]>cur){
                arr[prev+1]=arr[prev];
                prev--;
            }

            // insset

            arr[prev+1]=cur;

            
        }
    }


    // counting sort 

    public static void countingSort(int arr[]){
        int largest= Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest=Math.max(largest, arr[i]);
        }

        // create count array

        int count[]=new int[largest+1];

        // fill count array

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sort the array

        int j=0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }


    // print Array

    public static void pritnArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
    }

    public static void main(String[] args) {
        int arr []={4,3,5,2,1};



        // bubbleSort(arr);
       // System.out.println("Bubble sort");

       // selectionSort(arr);

        // insertionSort(arr);

        // countingSort(arr);

        

        pritnArray(arr);

        

        
        


    }
    
}
