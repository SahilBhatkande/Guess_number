package core_java;
import java.util.*;


public class guesstut {
	
	int userin,random;
	
	guesstut()
	{
		Random rn=new Random();
		random=rn.nextInt(100);
		
	}

	void takeuserinput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number: ");
		userin=sc.nextInt();
		
	}
	boolean iscorrectNumber()
	{
		if (userin==random)
		{
			return true;
		}
		else if(userin>random)
		{
			System.out.println("this is  high.....");
		}
		else
		{
			System.out.println("this is low");
		}
		return false;
	}
	
	public static void main(String args[])
	{
		guesstut t=new guesstut();
		boolean b=false;
		while(!b)
		{
		t.takeuserinput();
		b=t.iscorrectNumber();
		System.out.println(b);
		
		}
	}
}
