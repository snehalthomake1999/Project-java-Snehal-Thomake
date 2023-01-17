package javap;

import java.util.Scanner;

	//Inheritance
	// Base or Super Class
	class runner {
		int person = 60;
	}

	// Inherited or Sub Class
	class statelevel extends runner {
		int qualify = 40;
	}
	           //Polymorphism method
	class hollyboll {
		  // method to players
		  public void players() {
		    System.out.println("Cricket compition ");
		  }
		}

		class Square extends  hollyboll {

		  // players for cricket
		  public void players() {
		    System.out.println("cricket team qulify for state level compition.");
		  }
		}

		class Circle extends hollyboll {

		  // players for footbool
		  public void players() {
		    System.out.println("Footboll team captain name is SUNIL CHATRI.");
		  }
		}
		
		//Java Program to demonstrate the real scenario of Java Method Overriding  
		//where three classes are overriding the method of a parent class.  
		//Creating a parent class.  
		class Bank{  
		int getRateOfInterest(){return 0;}  
		}  
		//Creating child classes.  
		class SBI extends Bank{  
		int getRateOfInterest(){return 8;}  
		}  
		  
		class ICICI extends Bank{  
		int getRateOfInterest(){return 7;}  
		}  
		class AXIS extends Bank{  
		int getRateOfInterest(){return 9;}  
		}  
		
		//Method of abstract class
		abstract class Language {

			  // method of abstract class
			  public void display() {
			    System.out.println("This is Java Programming");
			  }
			}
		//Encapsulation
		class Area {

			  // fields to calculate area
			  int length;
			  int breadth;

			  // constructor to initialize values
			  Area(int length, int breadth) {
			    this.length = length;
			    this.breadth = breadth;
			  }

			  // method to calculate area
			  public void getArea() {
			    int area = length * breadth;
			    System.out.println("Area: " + area);
			  }
			}

		
		//main class is project
	public class project extends Language {
		private String name;

	    // constructor
	    project() {
	      System.out.println("Edubrigde Information:");
	      name = "Snehal Thomake Center=Thane Batch=7670";
	    }
	    //Method overloading
	    //Method Overloading by changing the data type of parameters
	    // this method accepts int
	    private static void display(int a){
	        System.out.println("Got Integer data.");
	    }

	    // this method  accepts String object
	    private static void display(String a){
	        System.out.println("Got String object.");
	    }
	    //REcursion function in java 
	    static int factorial(int n){    
	    	  if (n == 0)    
	    	    return 1;    
	    	  else    
	    	    return(n * factorial(n-1));    
	    	 }    
		public static void main(String[] args) {

		    int num1;
		    int num2;
		    String operation;

		    Scanner input = new Scanner(System.in);

		    System.out.println("Please Enter The First Number");
		    num1 = input.nextInt();

		    System.out.println("Please Enter The Second Number");
		    num2 = input.nextInt();

		    Scanner op = new Scanner (System.in);

		    System.out.println("Please Enter The Operation");
		    operation = op.next();

		    if (operation.equals("+"))
		    {
		        System.out.println("Your Answer is "+(num1 + num2));
		    }
		    else if (operation.equals("-"))
		    {
		        System.out.println("Your Answer is "+(num1 - num2));
		    }       
		    else if (operation.equals("*"))
		    {
		        System.out.println("Your Answer is "+(num1 * num2));
		    }   
		    else if (operation.equals("/"))
		    {
		        System.out.println("Your Answer is "+(num1 / num2));
		    }
		    System.out.println("Inheritance");
		// Java Program to illustrate Inheritance (concise)
		    statelevel E1 = new statelevel();
				System.out.println("Salary : " + E1.person
								+ "\nBenefits : " + E1.qualify);
				
				 System.out.println("Polymorphism");
	// Java Program to illustrate Polymorphism  
					    // create an object of Square
					    Square s1 = new Square();
					    s1.players();

					    // create an object of Circle
					    Circle c1 = new Circle();
					    c1.players();
					    
	                   //Constuctor
					 // constructor is invoked while
					    // creating an object of the MiniProject  class
					    project obj = new project();
					    System.out.println("The name is " + obj.name);
					    System.out.println("Method overiding");
					    //Method overiding
					    SBI s=new SBI();  
					    ICICI i=new ICICI();  
					    AXIS a=new AXIS();  
					    System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
					    System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
					    System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
					   
					    System.out.println("Method overloading");
					//Method Overloading
					    //Method Overloading by changing the data type of parameters
					    display(1);
				        display("Software testing ");
				        
				        
				        System.out.println("Method of abstract class");
				        
				        //Abstract class
				     // create an object of Mini_project
				        project obj1 = new project();

				        // access method of abstract class
				        // using object of Mini_project class
				        obj1.display();
				        
				        System.out.println("Enacapsulation");
				        //Enacapsunation
				        
				        // create object of Area
				        // pass value of length and breadth
				        Area rectangle = new Area(5, 6);
				        rectangle.getArea();
				        System.out.println("For loop");	
				        int x, j, row=6;   
				      //outer loop for rows  
				      for(x=0; x<row; x++)   
				      {   
				      //inner loop for columns  
				      for(j=0; j<=x; j++)   
				      {   
				      //prints stars   
				      System.out.print("* ");   
				      }   
				      //throws the cursor in a new line after printing each line  
				      System.out.println();   
		///Factoria of number using recursion 		        
				          
	}
		}
		
}
