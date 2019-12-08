 class add{
	int a;
	int b;

	 add()
	{
		a=1;
		b=1;
	System.out.println(" the add is"+(a+b));
	}
	int calci(int a,int b)
	{
		this.a=a;
		this.b=b;
		return a+b;
	}
}

 class sub extends add{
	int a;
	int b;

	sub()
	{
		a=1;
		b=1;
	System.out.println(" the sub is"+(a-b));
	}
	int calci(int a,int b)
	{
		this.a=a;
		this.b=b;
		return a-b;
	}
}
 class mul extends sub{
	int a;
	int b;

	 mul()
	{
		a=1;
		b=1;
		System.out.println(" the mul is"+(a*b));
	}
	int calci(int a,int b)
	{
		this.a=a;
		this.b=b;
		return a*b;
	}
}
 class div extends mul{
	int a;
	int b;

	 div()
	{
		a=1;
		b=1;
		System.out.println(" the div is"+(a/b));
	}
	int calci(int a,int b)
	{
		this.a=a;
		this.b=b;
		return a/b;
	}
}


