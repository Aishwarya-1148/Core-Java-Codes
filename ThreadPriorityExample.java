package com.Multithreding;

public class ThreadPriorityExample {
	public static void main(String[] args) {
		
		Thread t1 = new Thread()
		{
			public void run()
			{
				System.out.println("Thread 1 is running with priority : = "+
						Thread.currentThread().getPriority());
			}
		};
		
		Thread t2 = new Thread()
		{
			public void run()
			{
				System.out.println("Thread 2 is running with priority : = "+
						Thread.currentThread().getPriority());
			}
		};
		
		t1.setPriority(Thread.MIN_PRIORITY); // 1 
		t2.setPriority(Thread.NORM_PRIORITY); // 10 
		
				
		t1.start();
		t2.start();
		
		System.out.println("The Priority of Main tHread is : = "+
					Thread.currentThread().getPriority());
		
		
	}
}
