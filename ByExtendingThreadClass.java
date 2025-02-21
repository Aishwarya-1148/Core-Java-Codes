package com.Multithreding;

class MyThread extends Thread
{
	public void run()
	{
		int n = 2 ;
		for(int i = 1 ; i <= 10 ; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(n*i);
		}
	}
}
public class ByExtendingThreadClass {
	
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Main Thread is running ...! ");
	
	}
}
