package com.sapient.training.ui;

import com.sapient.training.ui.services.Calculatot;

public class App {
    public static void main( String[] args )    {
    	Calculatot cm = new Calculatot();
        System.out.println( "Hello World!" );
        
        System.out.println( cm.addition(2.0, 3.0) );
        System.out.println( cm.substraction(10, 5) );
    }
}
