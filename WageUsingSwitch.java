
public class WageUsingSwitch {

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage calculation");
		int min = 0;  
		int max = 2;  
		int employeeStatus = (int)(Math.random()*(max-min+1)+min);
		switch(employeeStatus) {
		case 0:
			System.out.println("Employee is absent");
			break;
		case 1:
			System.out.println("Employee is fulltime and his wages is "+20*8);
			break;
		case 2:
			System.out.println("Employee is parttime and his wages is "+20*4);
			break;
		}
		
	}

}
