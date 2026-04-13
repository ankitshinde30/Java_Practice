package module4;

public class ArraySortAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,7,23,4,62,5};
		
			for(int i=0;i<arr.length-1;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			
			System.out.println("\nAscending order: ");
			for(int i=0; i<arr.length;i++) {
				System.out.println(arr[i]+" ");
			}
		
	}

}
