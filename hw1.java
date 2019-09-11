import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class hw1 {
	
    public static void main(String[] args) throws FileNotFoundException
    {
    	int where = 10;
    	for ( int i=0; i<args.length; i++)
    	{
    		if(args[i].equals("WHERE")&&i==0){
    			System.out.print("Error!");
    			break;
    		}
    		else if(args[i].equals("WHERE")&&i>3){
    			System.out.print("Error!");
    			break;
    		}
    		else if(args[i].equals("WHERE")&&i!=0){
    			where = i;
    		}
    	}
    	
    	int lines = 0;
        //creating File instance to reference text file in Java
        File text = new File(args[0]);
     
        //Creating Scanner instnace to read File in Java
        Scanner scan = new Scanner(text);
        Scanner scan2 = new Scanner(text);
    	while (scan2.hasNextLine()) {
    	    lines++;
    	    scan2.nextLine();
    	}
    	Employee[] employees = new Employee[lines-1];
    	for ( int i=0; i<employees.length; i++) {
    		employees[i] = new Employee();
    	}

    	int count = 0;
        int num = 0;
        while (scan.hasNextLine()) {
        	//prints out the attributes
        	if(count ==0){
        		String Attributes = scan.nextLine();
                System.out.println(Attributes);
        		
        	}
        		
        	String line = scan.nextLine();
        	String[] stringArray = line.split("	");

        	employees[num].FNAME = stringArray[0];
        	employees[num].LNAME = stringArray[1];
        	employees[num].SALARY = Integer.parseInt(stringArray[2]);
        	employees[num].MANAGER_ID = Integer.parseInt(stringArray[3]);
        	num++;
        	
        	
        	count++;
        }

    	for ( int i=0; i<employees.length; i++) {
    		System.out.print(employees[i].FNAME + "	");
    		System.out.print(employees[i].LNAME+ "	");
    		System.out.print(employees[i].SALARY+ "	");
    		System.out.print(employees[i].MANAGER_ID);
    		System.out.println();
    	}      
  
    }  

  
}
