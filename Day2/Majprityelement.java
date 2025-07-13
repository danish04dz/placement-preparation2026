public class Majprityelement {

    public static int majorityElemnt(int arr[]){
        int count=0;
        int ans=0;

        for (int i = 0; i < arr.length; i++) {
            if(count==0){
                ans=arr[i];

            }
            if(arr[i]==ans){
                count++;
            }
                
            else{
                count--;
            }
            
        }

        int check=0;

     for (int i = 0; i < arr.length; i++) {

        if(ans==arr[i]){
            check++;
        }    
        
     }

     if(check>arr.length/2){
        return ans;

     }
     else{
        return -1;
     }
        
    }



    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};

        System.out.println(majorityElemnt(arr));
    }
}
