package com.epam.vnrvjiet.prathima.CollectionFrameworks;
import java.io.*;
import java.util.*;

class ArrayList<String> extends AbstractList<String> {
	private List<String> x;  
    ArrayList(List<String> array) {  
        x = array;  
    }  
    public String get(int index) {  
        return x.get(index);  
    }  
    public String set( String element) {  
         System.out.println("The  is: " +x); 
         return element;
    }  
    public int size() {  
        return x.size();  
    }  

}

