import java.util.*;
import java.io.*;
class tok{
	public static void main(String args[])throws Throwable{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num of nodes :");
		int n=scan.nextInt();
		int m=n-1;
		
		int token=0;
		int ch=0,flag=0;
		for (int i=0;i<n;i++) {
			System.out.println(" "+i);
			
		}
		do {
			
			
				System.out.println("enter sender : ");
				int s=scan.nextInt();
				System.out.println("enter receiver : ");
				int r=scan.nextInt();
				
				System.out.println("enter data : ");
				int a=scan.nextInt();
				
				
				
				System.out.println("Token Passing : ");
				
				for(int i=token,j=token;(i%n)!=s;i++,j=(j+1)%n) {
					System.out.println(" "+j+"->");
				}
				System.out.println(" "+s);
				System.out.println("Sender "+s+"Sending data: "+a); 	
				
				for(int i=s+1;i!=r;i=(i+1)%n) {
					System.out.println("data "+a+"forwarded by "+i);
				}
				System.out.println("receiver "+r+"received data "+a+"\n");
				token=s;
				
				
				
				do {
					try {
						if(flag==1)
							System.out.println("Invalid Input!!...");
						System.out.println("do you want to send again?? enter 1 for yes and 0 for no : ");
						ch=scan.nextInt();
						
						if(ch!=1 && ch!=0)
							flag=1;
						else
							flag=0;
					}
					
					
					
					catch(InputMismatchException e){
						System.out.println("Invalid Input");
					}
				}while(ch!=1 && ch!=0);
					
			}while(ch==1);
	}
}