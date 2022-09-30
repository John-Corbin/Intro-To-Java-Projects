package project_1;
//idea basic cal that takes user input and has a menu selection screen

import java.util.Scanner;
class Corbin_1 {
	
	public static void cPrintln(String message, int n) {  		// code for system.out shortcut
		  for (int i = 0; i < n; i++)
		    System.out.println(message);
		}
		
  public static void main(String[] args) { 				// code for the doubles and scanner inputs.
	  cPrintln("User input for basic math function's", 1);
	  cPrintln("Please only enter numbers, not words.", 1);
	  double in1,in2,sub,add,multi,divd;
	     Scanner input = new Scanner(System.in);		// scanner code for the input 
	     cPrintln("Enter The First Input:", 1);			// first input 
	     in1 = input.nextDouble();
	     cPrintln("Enter The Second Input:", 1);		// second input
	     in2 = input.nextDouble();
	  int userSelected;				// case code for the different options.
		 do {
			 userSelected = MenuData();
			 switch(userSelected) {
			 case 1:
				 add = in1 + in2;						//code for the addition
			     System.out.println("addition = " + add);	// system out shortcut not working with the doubles?
			     cPrintln("............................",1);
				 break;
			 case 2:
				 sub = in1 - in2;						// code for subtraction 
			     System.out.println("subtraction = " + sub);
			     cPrintln("............................",1);
				 break;
			 case 3:
				 multi = in1 * in2;						// code for multiplication
			     System.out.println("multiplication = " + multi);
			     cPrintln("............................",1);
				 break;
			 case 4:
				 divd = in1/in2;  						// code for division
			     System.out.println("division = " + divd);
				 break;
			 default:
				 break;
			 }
		 }
		 while (userSelected > 4);
		}
		
		public static int MenuData()			// code to print the option menu
		{
			int selction;
			Scanner urs = new Scanner (System.in);	//scanner code for the options select
			cPrintln("...............\n", 1);
			cPrintln("1 - Select for addition", 1);
			cPrintln("2 - Select for subtration", 1);
			cPrintln("3 - Select for multiplication", 1);
			cPrintln("4 - Select for division", 1);
			
			System.out.print("You selected option: ");		//print line not a print new line
			selction = urs.nextInt();
			return selction;
			
	   }
}
