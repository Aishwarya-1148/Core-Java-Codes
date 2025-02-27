package com.Multithreding;


class JoinExample extends Thread
{
	public void run()
	{
		for(int i = 1 ; i <= 5 ; i++)
		{
			System.out.println(Thread.currentThread().getName()+" = "+i);
			try 
			{
				Thread.sleep(1000);
			} 
			catch(InterruptedException e) 
			{
				e.printStackTrace();
			}
		}		
	}
}
public class JoinMethodInJava {
	
	public static void main(String[] args) {
		
		JoinExample t1 = new JoinExample();
		JoinExample t2 = new JoinExample();
		
		t1.start();
//		try 
//		{
//			t1.join();
//		} 
//		catch(InterruptedException e) 
//		{
//			e.printStackTrace();
//		}
		t2.start();
		
		
		System.out.println("The main Thraed is running ...! ");
	}
}
