public class Palindrome{
	public static void main(String args[]){
		int num= 123321, temp=num, rev=0,rem;

		for(;num>0;num=num/10){
		rem=num%10;
		rev=rev*10+ rem;
		}
			
	
 	if(temp==rev){
	System.out.println("Yes Its an Palindrome Number");
}else{
	System.out.println("No Its not an Palindrome Number");
}

	}
}