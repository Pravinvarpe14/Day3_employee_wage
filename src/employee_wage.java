/*
 * employee wage calculation
 */
public class employee_wage {
	
	public static final int wagePerHour = 20;
	public static final int empFullTime = 1;
	public static final int empPartTime = 2;
	

	public static void main(String[] args) {
		/*
		 * welcome message
		 */
		System.out.println("Welcome to employee wage computation programme");
		/*
		 * taking variable
		 */
		int employeeWage = 0;
		int workingHours = 0;
		/*
		 * using math.floor 
		 */
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		
		/*
		 * verifying by switch case
		 */
		
		switch (empCheck) {

		case empFullTime:
			
			System.out.println("Employee is present for full time...");
			workingHours = 8;
			break;
			
		case empPartTime:
			
			System.out.println("Employee is present for part time...");
			workingHours = 4;
			break;
			
		default:
			System.out.println("Employee is absent...");
			workingHours = 0;
		}
		
		employeeWage = wagePerHour * workingHours;
		System.out.println("employee wage = " + employeeWage);
		
		
		
		
		
		
		
		

	}

}
