import java.util.Random;
public class multithread extends Thread{
	Random r=new Random();
	
	
	public void run()
	{	int number,n=10;
		
			try{
            for(int i=1;i<10;i++)
            	{number=r.nextInt(10);
     		div3 t1=new div3(number);
     		div2 t2 =new div2(number);       
            if(number%2==0)
            {
            	t2.start();
            }
            else
            {
            	t1.start();
            }
            n--;
            Thread.sleep(1000);
        }
    }
        catch(Exception e)
        {

        }
		}
	}
