package cons;

public class constructor {
	
	constructor()
	{
		this(1,2,3);
		System.out.println("defalt");
	}
	constructor( int a)
	{	this(2,3);
		System.out.println("one parametarized");
	}
	constructor( int a,int b)
	{
		this();
		System.out.println("two parametarized");
	}
	constructor( int a,int b,int c)
	{ 
		
		System.out.println("three parametarized");
	}
	constructor( int a,int b,int c,int d)
	{
		this (2);
		System.out.println(" four parametarized");
	}
		public static void main(String[] args) 
	{

		constructor obj=new constructor(1,2,3,4);
	



	}

}
