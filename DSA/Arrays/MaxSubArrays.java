public class MaxSubArrays {
public static void maxSubarrays(int arr[]){

    int maxSum= Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        int start = i;
        for(int j=i;j<arr.length;j++){
            int end = j;
            int sum=0;
            for(int k=start;k<=end;k++){
                sum+=arr[k];
            }
            System.out.println(sum);

            if(sum>maxSum){
                maxSum=sum;
            }

        }
        
    }
    System.out.println("Maximum Sum of SubArray Is =" + maxSum);
}


    public static void main(String[] args) {
        int arr[]={1,5,6,4,3,7,6};     

        maxSubarrays(arr);


    }
    
}
