public class div2 extends Thread{
	int n;
	public div2(int n)
	{
		this.n=n;
	}
	public void run()
	{
		try{
			System.out.println("the number is"+n*n);
			Thread.sleep(500);
		}
		catch(Exception e)
		{

		}
	}
}