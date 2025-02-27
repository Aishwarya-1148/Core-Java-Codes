package com.Multithreding;

class MyRunable implements Runnable
{
	@Override
	public void run() {
		for(int i = 1 ; i <= 10 ; i++)
		{
			// to print the name of current thread 
			System.out.println(Thread.currentThread().getName()+" = "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class RunableInterface {
	
	public static void main(String[] args) {
			
		MyRunable m1 = new MyRunable();
		MyRunable m2 = new MyRunable();
		MyRunable m3 = new MyRunable();
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m1);
		Thread t3 = new Thread(m1);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
