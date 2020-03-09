package com.IntrepreterPattern.IntrepreterPattern;

public class App 
{
    public static void main( String[] args )
    { 
    	Expression person1 = new TerminalExpression("Yamini"); 
    Expression person2 = new TerminalExpression("Mini"); 
    Expression isSingle = new OR(person1, person2); 
      
    Expression lakshmi= new TerminalExpression("Lakshmi"); 
    Expression committed = new TerminalExpression("Committed"); 
    Expression isCommitted = new AND(lakshmi, committed);     

    System.out.println(isSingle.interpreter("Yamini")); 
    System.out.println(isSingle.interpreter("Mini")); 
    System.out.println(isSingle.interpreter("lucky")); 
      
    System.out.println(isCommitted.interpreter("Committed, Laskhmi")); 
     
    }
}
