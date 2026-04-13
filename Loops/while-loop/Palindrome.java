public class Palindrome{
	public static void main(String args[]){
		int num= 123321, temp=num, rev=0,rem;

		while(num>0){
		rem=num%10;
		rev=rev*10+ rem;
		num=num/10;
			
	}
 	if(temp==rev){
	System.out.println("Yes Its an Palindrome Number");
}else{
	System.out.println("No Its not an Palindrome Number");
}

	}
}