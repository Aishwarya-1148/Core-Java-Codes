package com.Multithreding;

class IsDeamonThreadExample extends Thread 
{	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(Thread.currentThread().getName()+" : Deamon Thread Works ...! ");
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" : User Thraed Works....!");
		}
	}
}
public class IsDeamonThread {
	public static void main(String[] args) {
		
		IsDeamonThreadExample t1 = new IsDeamonThreadExample();
		IsDeamonThreadExample t2 = new IsDeamonThreadExample();
		IsDeamonThreadExample t3 = new IsDeamonThreadExample();
		
		t1.setName("Thraed-1");
		t2.setName("Thraed-2");
		t3.setName("Thraed-3");
		
		// to create any thared a deamon thread 
		t1.setDaemon(true);// its a deamon thared 
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
