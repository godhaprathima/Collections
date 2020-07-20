package com.epam.vnrvjiet.prathima.CollectionFrameworks;
 
import java.util.*;
import java.util.ArrayList;

public class CustomCollections {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner sc=new Scanner(System.in);
        List<String> FruitsList=new ArrayList<>(10);
        int index;
         
        CustomClass a=new CustomClass();
        List<String> lst=a.asList(FruitsList);
        ArrayList al = new ArrayList(FruitsList);
        
        while(true){
        	System.out.println("1:fetch, 2:Add element, 3:Remove element,4:Print list \n Enter your Option");
            int Option=sc.nextInt();
        	
        try {
        	Object o;
        	
        switch(Option) {
        case 1: System.out.println("Enter index from which element to be Fetched:");
        	index=sc.nextInt();
        	o= al.get(index);
        	System.out.println("The retrieved element is: " + o);
        	break;
        case 2:System.out.println("Enter a fruit name to add into list:");
        	String s1=sc.next();
        	FruitsList.add(s1);
        	lst=a.asList(FruitsList);
            al = new ArrayList(FruitsList);
        	break;
        case 3: System.out.println("Enter index from which element should be removed:");
        	index=sc.nextInt();
        	FruitsList.remove(index);
        	break;
        case 4:System.out.println("The list is: " + lst); 
        		index=al.size();
        		System.out.println("Size of list is "+index);
        	break;
        default: System.out.print("Invalid Option");

        }
        System.out.println("Would you like to continue\n Enter y/n");
        char ch=sc.next().charAt(0);
        if(ch=='y')
        	continue;
        else break;
        
        
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        }
        sc.close();
        
    }

}