/*
 * employee wage calculation
 */
public class employee_wage {
	
	

	public static void main(String[] args) {
		/*
		 * welcome message
		 */
		System.out.println("Welcome to employee wage computation programme");
		/*
		 * taking variable
		 */
		int empFullTime = 1;
		int empPartTime = 2;
		int wagePerHour = 20;
		int workingHours = 0;
		int employeeWage = wagePerHour * workingHours;
		/*
		 * using math.floor 
		 */
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		
		/*
		 * verifying by if else statement
		 */
		
		if (empCheck == empFullTime) {
			
			System.out.println("Employee is present for full time...");
			workingHours = 8;
			
		} else if (empCheck == empPartTime) {
			
			System.out.println("Employee is present for part time...");
			workingHours = 4;
			
		} else {
			
			System.out.println("Employee is absent...");
			workingHours = 0;
		}
		
		/*
		 * printing employee wage
		 */
		employeeWage = wagePerHour * workingHours;
		System.out.println("employee wage = " + employeeWage);
		
		
		
		
		
		
		
		

	}

}
