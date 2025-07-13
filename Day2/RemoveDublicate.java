

public class RemoveDublicate {

    public static int RemoveDublicate(int arr[]){

        int k=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[k]){
                arr[k+1]=arr[i];
                k++;
            }
        }

        return k+1;

    }


    public static void main(String[] args) {
        int arr []= {0,0,1,1,1,2,2,3,3,4};

        System.out.println(RemoveDublicate(arr));

        


    }
    
}
