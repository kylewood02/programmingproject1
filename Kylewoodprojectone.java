package kylewoodprojectone;
import java.util.*;
public class Kylewoodprojectone
{
	public static void main(String[] args) {
	    Scanner scr=new Scanner(System.in);
	    double price,mpg,kwh,utility,miles,savings; //declaring the variables
	    System.out.println("-- Welcome to EV savings estimator --");
	    System.out.println("Please enter the following information: ");
	    //below are the functions asking for user input 
		System.out.print("Local gas price/gallon: "); // asking user for local gas price
	    price=scr.nextDouble();
		System.out.print("Estimated MPG of gas vehicle: "); // asking user for the MPG of their vehicle
		mpg=scr.nextDouble();
		System.out.print("Estimated watt-hour consumption per mile of EV: "); // asking the user the watts per hour consumption of their electric vehicle
		kwh=scr.nextDouble();
		System.out.print("Utility kWh rate: "); // asking the user the utility kWh rate
		utility=scr.nextDouble();
		System.out.print("Total miles are driven per year: "); // asking the user the total miles per year that they drive in their car
		miles=scr.nextDouble();
		//calculate savings
		double pricepermilegas, pricepermileev; // declaring variables for the price per mile of gas / ev vehicle(s) to make savings calculation less confusing
		pricepermilegas =price / mpg; // the calculation to find the price per mile of gas, as on canvas
		pricepermileev = (utility / 1000) * kwh; // the calculation to find the price per mile of the ev vehicle, as on canvas
		System.out.println("the price per mile gas is " + pricepermilegas); // print statement letting the user know how much it costs to drive one mile of a gas car
		System.out.println("the price per mile ev is " + pricepermileev); // print statement letting the user know how much it costs to drive one mile with an ev
		savings = (pricepermilegas - pricepermileev)*miles ; 
		; // calculation to figure out the savings per year for the user
		//display savings
		System.out.print("\n Calculating ..."); // print statement letting the user know their savings are being calculated
		System.out.print("\n Based on the data provided, you can save $ " +savings + " per year by driving an EV."); // print statement letting the user know their savings per year
	}
}

