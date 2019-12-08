public class table{
	synchronized public void display(int n)
	{
		for(int i=1;i<=10;i++)
		{
			try{
			System.out.println(""+n+"*"+i+"="+n*i);
			Thread.sleep(1000);
		    }
		    catch(Exception e)
		    {

		    }

		}
	}

}