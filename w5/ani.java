abstract class ani{

	abstract void eat();
	abstract void moves();
	abstract void sleep();
}

class whale extends ani{
	void eat()
	{
		System.out.println(" the whale is eating\n");
	}
	void moves()
	{
		System.out.println(" the whale is moving\n");
	}
	void sleep()
	{
		System.out.println(" the whale is sleeping");
	}
}
class bat extends ani{
	void eat()
	{
		System.out.println(" the bat is eating\n");
	}
	void moves()
	{
		System.out.println(" the bat is moving\n");
	}
	void sleep()
	{
		System.out.println(" the bat is sleeping");
	}
}
class dog extends ani{
	void eat()
	{
		System.out.println(" the dog is eating\n");
	}
	void moves()
	{
		System.out.println(" the dog is moving\n");
	}
	void sleep()
	{
		System.out.println(" the dog is sleeping");
	}
}