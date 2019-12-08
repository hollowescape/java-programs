public class div3 extends Thread{
	int n;
	public div3(int n)
	{
		this.n=n;
	}
	public void run()
	{  
		try{
		System.out.println(" cube of number is "+n*n*n);
		Thread.sleep(500);
	}
	catch(Exception e)
	{

	}
	}
}