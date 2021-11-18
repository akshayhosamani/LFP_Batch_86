
public class EmployeeWageCalculation {
	public static void main( String args[] )   
	{ 
		System.out.println("Welcome to employee wage calculation");
	int min = 0;  
	int max = 2;  
	int employeeStatus = (int)(Math.random()*(max-min+1)+min);  
	if (employeeStatus==0) {
		System.out.println("Employee is absent");
	}else if(employeeStatus==1) {
		int wage = 20*8;
		System.out.println("Employee is fulltime and wages is "+wage);
	}
	else if(employeeStatus==2){
		int wage = 20*4;
		System.out.println("Employee is fulltime and wages is "+wage);
	}
}
}