package com.Multithreding;

/*
// synchronized block 
class Table
{
	public void print(int n )
	{
		// synchronized block 
		synchronized(this)
		{
			for(int i = 1 ; i<= 10 ; i++)
			{
				try 
				{
					System.out.println(n*i);
					Thread.sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}
class Thread1 extends Thread 
{

	Table t ;
	public Thread1(Table t )
	{
		this.t = t ;
	}
	public void run()
	{
		t.print(5);
	}
	
}
class Thread2 extends Thread 
{
	Table t ;
	public Thread2(Table t )
	{
		this.t = t ;
	}
	public void run()
	{
		t.print(7);
	}
	
}
public class SynchronizedBlock {
	public static void main(String[] args) {
		Table obj = new Table();
		
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		
		t1.start();
		t2.start();
		
	}
}
*/

/*
//synchronized method 
class Table
{
	// synchronized Method
	synchronized public void print(int n )
	{
		
			for(int i = 1 ; i<= 10 ; i++)
			{
				try 
				{
					System.out.println(n*i);
					Thread.sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		
	}
}
class Thread1 extends Thread 
{

	Table t ;
	public Thread1(Table t )
	{
		this.t = t ;
	}
	public void run()
	{
		t.print(5);
	}
	
}
class Thread2 extends Thread 
{
	Table t ;
	public Thread2(Table t )
	{
		this.t = t ;
	}
	public void run()
	{
		t.print(7);
	}
	
}
public class SynchronizedBlock {
	public static void main(String[] args) {
		Table obj = new Table();
		
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		
		t1.start();
		t2.start();
		
	}
}

*/

//static synchronized 
class Table
{
	// static synchronized 
	static synchronized public void print(int n )
	{
			for(int i = 1 ; i<= 10 ; i++)
			{
				try 
				{
					System.out.println(n*i);
					Thread.sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
	}
}
class Thread1 extends Thread 
{

	Table t ;
	public Thread1(Table t )
	{
		this.t = t ;
	}
	public void run()
	{
		t.print(5);
	}
	
}
class Thread2 extends Thread 
{
	Table t ;
	public Thread2(Table t )
	{
		this.t = t ;
	}
	public void run()
	{
		t.print(7);
	}
	
}
public class SynchronizedBlock {
	public static void main(String[] args) {
		Table obj = new Table();
		
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		
		t1.start();
		t2.start();
		
	}
}































