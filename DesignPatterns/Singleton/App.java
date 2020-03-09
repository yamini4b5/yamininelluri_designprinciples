package com.Singleton.Singleton;

class Singleton{
	private static Singleton inst=null;
	public String s;
	private Singleton(){
		s="Constructor of singleton class";
	}
	public static Singleton Singleton() {
		if(inst==null)
			inst=new Singleton();
		return inst;
	}
}
public class App 
{
    public static void main( String[] args )
    {
        Singleton x = Singleton.Singleton(); 
        Singleton y = Singleton.Singleton(); 
        Singleton z = Singleton.Singleton(); 
        x.s = (x.s).toUpperCase(); 
        System.out.println("String from x " + x.s); 
        System.out.println("String from y " + y.s); 
        System.out.println("String from z " + z.s);  
        z.s = (z.s).toLowerCase();
        System.out.println("String from x " + x.s); 
        System.out.println("String from y  " + y.s); 
        System.out.println("String from z " + z.s); 
        System.out.println("Object of x if :"+x);
        System.out.println("Object of y if :"+y);
        System.out.println("Object of z if :"+z);
    }
}
