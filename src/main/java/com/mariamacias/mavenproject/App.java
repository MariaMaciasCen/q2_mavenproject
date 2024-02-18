package com.mariamacias.mavenproject;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Get the current time
        Date currentTime = new Date();
        
        // Create a SimpleDateFormat to extract the hour from the current time
        SimpleDateFormat hourFormat = new SimpleDateFormat("HH");
        int hour = Integer.parseInt(hourFormat.format(currentTime));

        // Determine the time of day and print a greeting
        String timeGreeting = "";
        if (hour >= 5 && hour < 12) {
            timeGreeting = "Good morning";
        } else if (hour >= 12 && hour < 18) {
        	timeGreeting = "Good afternoon";
        } else {
        	timeGreeting = "Good evening";
        }
        System.out.println(timeGreeting + ", Maria Macias, Welcome to COMP367");
    }
}
