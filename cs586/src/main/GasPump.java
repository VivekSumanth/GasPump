/**
 * 
 */
package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import AllGasPumps.GasPump_1;
import AllGasPumps.GasPump_2;
import AbstractFactoryClasses.*;

/**
 * @author vivek
 *
 */
public class GasPump {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// main method - exectution starts here
		Integer pumpselected;
		pumpselected=selectpump();

		
		if(pumpselected == 1) {   // selecting a Gas Pump 
			GasPump1();
		}
		else if(pumpselected == 2 ) {
			GasPump2();
		}
		else {
			System.out.println("****Invalid Input !! Try Again****");
			}
		}

	public static Integer selectpump() {
		try {
		Integer ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Select a gas pump");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("1 - GasPump1");
		System.out.println("2 - GasPump2");
		System.out.println("---------------------------------------------------------------------");
		ch=sc.nextInt();
		return ch;
	}catch (NumberFormatException e) {
			System.out.println("Number should be in proper");
			e.printStackTrace();
		}  catch (InputMismatchException e) {

		}
		return -1;
	}
	
	
	public static void GasPump1() {
		

		ConcreteFactory1 concreteFactory1 = new ConcreteFactory1(); 
		GasPump_1 gp1 = new GasPump_1(concreteFactory1);
		System.out.println("---------------------------------------------------------------------");
		
        System.out.print(" 			GasPump-1						");
        System.out.print("\n");


        String ch ="start";
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        try {
	      while (ch !="q")
	      {
	    	  System.out.println("---------------------------------------------------------------------");
	          System.out.print("Select Operation: ");
	          System.out.print("\n");
	          System.out.print("	MENU of Operations");
	          System.out.print("\n");
	          System.out.print("          	0. Activate(int)");
	          System.out.print("\n");
	          System.out.print("          	1. Start()");
	          System.out.print("\n");
	          System.out.print("          	2. PayCash(int)");
	          System.out.print("\n");
	          System.out.print("          	3. PayCredit");
	          System.out.print("\n");
	          System.out.print("          	4. Approved()");
	          System.out.print("\n");	
	          System.out.print("          	5. Reject()");
	          System.out.print("\n");
	          System.out.print("          	6. Cancel()");
	          System.out.print("\n");
	          System.out.print("          	7. StartPump()");
	          System.out.print("\n");
	          System.out.print("          	8. PumpLiter()");
	          System.out.print("\n");
	          System.out.print("          	9. StopPump()");
	          System.out.print("\n");
	          System.out.print("          	q. Quit the program");
	          System.out.print("\n");
	          System.out.print("\n");
	          System.out.println("---------------------------------------------------------------------");
	          ch=sc.readLine(); 
	          switch (ch)
	          {
	        case "0": //Activate
	        { 
	                 System.out.print("  Operation:  Activate(int a)");
	                 System.out.print("\n");
	                 System.out.print("  Enter value of the parameter a:");
	                 System.out.print("\n");
	                 try {
	                 int a = Integer.parseInt(sc.readLine());
	                 gp1.Activate(a);
	                 
	                 }
	                 catch (InputMismatchException e) {
	                     System.out.println("Invalid Input - Please Select Again ");
	                 }catch (IOException e) {
	        			System.out.println("Input IO error");
	        		}catch (NumberFormatException e) {
	        			System.out.println("Number should be in proper");
	        		}
	                 break;
	             }

	        case "1": //Start
	        { 
	                    System.out.print("  Operation:  Start()");
	                    System.out.print("\n");
	                gp1.Start();
	                break;
	        }
	        
	        case "2":
	        { //PayCash
	                System.out.print("  Operation:  PayCash(int c)");
	                System.out.print("\n");
	                System.out.print("  Enter value of the parameter c:");
	                System.out.print("\n");
	                try {
	                int c =  Integer.parseInt(sc.readLine());
	                gp1.PayCash(c);
	                
	                }catch (InputMismatchException e) {
	                     System.out.println("Invalid Input - Please Select Again ");
	                 }catch (IOException e) {
	        			System.out.println("Input IO error");
	        		}catch (NumberFormatException e) {
	        			System.out.println("Number should be in proper");
	        		}
	                break;
	               }

	        
	        case "3":
	        { //PayCredit
	                    System.out.print("  Operation:  PayCredit()");
	                    System.out.print("\n");
	                   
	                gp1.PayCredit();
	                break;
	            }
	        
	        case "4":
	        { //Approved
	                    System.out.print("  Operation:  Approved()");
	                    System.out.print("\n");
	                gp1.Approved();
	                break;
	        }

	        case "5":
	        { //Reject
	                    System.out.print("  Operation:  Reject()");
	                    System.out.print("\n");
	                gp1.Reject();
	                break;
	            }


	        case "6": //Cancel
	        { 
	                      System.out.print("  Operation:  Cancel()");
	                      System.out.print("\n");
	                gp1.Cancel();
	                break;
	               }

	        case "7"://StartPump
	        { 
	                    System.out.print("  Operation:  StartPump()");
	                    System.out.print("\n");
	                gp1.StartPump();
	                break;
	        }


	        case "8"://PumpLiter
	        { 
	                    System.out.print("  Operation:  PumpLiter()");
	                    System.out.print("\n");
	                gp1.PumpLiter();
	                break;
	        }

	        case "9": //StopPump
	        { 
	                    System.out.print("  Operation:  StopPump()");
	                    System.out.print("\n");
	                gp1.StopPump();
	                break;
	        }
	        

	        case "q":
	        { //EXIT
	                    System.out.print("  Operation:  Exit");
	                    System.out.print("\n");
	                    System.exit(0);
	                break;
	        }
	        default:{
				System.out.println("Wrong Choice");
				break;
	        }
	      }; // endswitch

	   }; //endwhile
        } catch (NumberFormatException e) {
			System.out.println("Number should be in proper");
		} catch (InputMismatchException e) {
			System.out.println("Input Mismatch");
			
		}catch (IOException e) {
			System.out.println("Input IO error");
		}
        
	}
	
	public static void GasPump2() {
		

		ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
		GasPump_2 gp2 = new GasPump_2(concreteFactory2);
		System.out.println("---------------------------------------------------------------------");
		
        System.out.print(" 			GasPump-2						");
        System.out.print("\n");
		

        String ch="1";
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        try {
	      while (ch !="q")
	      {
	    	  System.out.println("---------------------------------------------------------------------");
	          System.out.print("Select Operation: ");
	          System.out.print("\n");
	          System.out.print("MENU of Operations");
	          System.out.print("\n");
	          System.out.print("          0. Activate(float,float,float)");
	          System.out.print("\n");
	          System.out.print("          1. Start()");
	          System.out.print("\n");
	          System.out.print("          2. PayCredit");
	          System.out.print("\n");
	          System.out.print("          3. Reject()");
	          System.out.print("\n");
	          System.out.print("          4. PayDebit()");
	          System.out.print("\n");
	          System.out.print("          5. Pin()");
	          System.out.print("\n");
	          System.out.print("          6. Cancel()");
	          System.out.print("\n");
	          System.out.print("          7. Approved()");
	          System.out.print("\n");
	          System.out.print("          8. Diesel()");
	          System.out.print("\n");
	          System.out.print("          9. Regular()");
	          System.out.print("\n");
	          System.out.print("          10. StartPump()");
	          System.out.print("\n");
	          System.out.print("          11. PumpGallon()");
	          System.out.print("\n");
	          System.out.print("          12. StopPump()");
	          System.out.print("\n");
	          System.out.print("          13. FullTank()");
	          System.out.print("\n");
	          System.out.print("          14. Super()");
	          System.out.print("\n");
	          System.out.print("          q. Quit the program");
	          System.out.print("\n");
	          System.out.println("---------------------------------------------------------------------");
	          ch=sc.readLine(); 
	        switch (ch)
	        {
	        case "0":
	        { //Activate()

                 try {
	                 System.out.print("  Operation:  Activate(float a, float b, float c )");
	                 System.out.print("\n");
	                 System.out.print("  Enter value of the parameter a:");
	                 System.out.print("\n");
	                 float a = Float.parseFloat(sc.readLine());
	                 System.out.print("\n");
	                 System.out.print("  Enter value of the parameter b:");
	                 System.out.print("\n");
	                 float b = Float.parseFloat(sc.readLine());
	                 System.out.print("\n");
	                 System.out.print("  Enter value of the parameter c:");
	                 System.out.print("\n");
	                 float c = Float.parseFloat(sc.readLine());
	                 
	                 gp2.Activate(a,b,c);
	                 break;
	                 }
	                 catch (InputMismatchException e) {
	                     System.out.println("Invalid Input - Please Select Again ");
	                 }catch (IOException e) {
		         			e.printStackTrace();
		        			System.out.println("Input IO error");
		        	}catch (NumberFormatException e) {
	        			System.out.println("Number should be in proper");
	        		}
	             }

	        case "1":
	        { //Start
	                System.out.print("  Operation:  Start()");
	                System.out.print("\n");
	                gp2.Start();
	                break;
	            }

	        case "2":
	        { //PayCredit
	                    System.out.print("  Operation:  PayCredit()");
	                    System.out.print("\n");
	                gp2.PayCredit();
	                break;
	            }

	        case "3":
	        { //Reject
	                    System.out.print("  Operation:  Reject()");
	                    System.out.print("\n");
	                gp2.Reject();
	                break;
	            }
	        
	        
	        case "4":
	        { //PayDebit
	                    System.out.print("  Operation:  PayDebit()");
	                    System.out.print("\n");
		                System.out.print("  Enter value of the parameter a:");
		                System.out.print("\n");
		                try {
		                String a = sc.readLine(); 
		                gp2.PayDebit(a);
	                break;
		                }
		                 catch (InputMismatchException e) {
		                     System.out.println("Invalid Input - Please Select Again ");
		                 }catch (IOException e) {
			        			System.out.println("Input IO error");
			        	}catch (NumberFormatException e) {
		        			System.out.println("Number should be in proper");
		        		}
	            }

	        case "5":
	        { //Pin
                System.out.print("  Operation:  Pin()");
                System.out.print("\n");
                System.out.print("  Enter value of the parameter a:");
                System.out.print("\n");
                try {
                String pin = sc.readLine(); 
                gp2.Pin(pin);
                break;
                }catch (InputMismatchException e) {
                    System.out.println("Invalid Input - Please Select Again ");
                }catch (IOException e) {
        			System.out.println("Input IO error");
        		}catch (NumberFormatException e) {
        			System.out.println("Number should be in proper");
        		}
	            }

	        case "6": //Cancel
	        { 
	                      System.out.print("  Operation:  Cancel()");
	                      System.out.print("\n");
	                gp2.Cancel();
	                break;
	               }
	        
	        case "7":
	        { //Approved
	                    System.out.print("  Operation:  Approved()");
	                    System.out.print("\n");
	                gp2.Approved();
	                break;
	        }

	        case "8":
	        { //Diesel
	                    System.out.print("  Operation:  Diesel()");
	                    System.out.print("\n");
	                gp2.Diesel();
	                break;
	            }
	        
	        case "9":
	        { //Regular
	                    System.out.print("  Operation:  Regular()");
	                    System.out.print("\n");
	                gp2.Regular();
	                break;
	            }
	        
	        case "10":
	        { //StartPump
	                    System.out.print("  Operation:  StartPump()");
	                    System.out.print("\n");
	                gp2.StartPump();
	                break;
	            }


	        case "11":
	        { //PumpGallon
	                    System.out.print("  Operation:  PumpGallon()");
	                    System.out.print("\n");
	                gp2.PumpGallon();
	                break;
	            }

	        case "12":
	        { //StopPump
	                    System.out.print("  Operation:  StopPump()");
	                    System.out.print("\n");
	                gp2.StopPump();
	                break;
	        }
	        
	        case "13":
	        { //FullTank
	                    System.out.print("  Operation:  FullTank()");
	                    System.out.print("\n");
	                gp2.StopPump();
	                break;
	        }
	        
	        case "14":
	        { //Super
	                    System.out.print("  Operation:  Super()");
	                    System.out.print("\n");
	                gp2.Super();
	                break;
	        }
	        
	        case "q":
	        { //quit
	                    System.out.print("  Operation:  Exit()");
	                    System.out.print("\n");
	                    System.exit(0);
	                break;
	        }
	        default:{
				System.out.println("Wrong Choice");
				break;
	        }
	      }; // endswitch

	   }; //endwhile
	   
        } catch (NumberFormatException e) {
			System.out.println("Number should be in proper");
		} catch (InputMismatchException e) {
			System.out.println("Input Mismatch");
			System.exit(1);
		}catch (IOException e) {
			System.out.println("Input IO error");
			System.exit(1);
		}
	}
	
	}
