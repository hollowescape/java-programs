public class q1{
	synchronized public void displayNumber()
	{
		for(int i=1;i<100;i++)
		{
			try{
			if((i%5==0))
			{

			}
			else if(i%2==0)
			{	
				System.out.println("Non divislble are"+i);
				Thread.sleep(1000);
			}
			else
			{ 
			System.out.println(" non divislble are "+i);
			Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{

		}
		}	
	}
}
class q1run extends Thread{
	q1 obj=new q1();
	q1run()
	{

	}
	public void run()
	{
		obj.displayNumber();
	}
}