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
		int isPresent = 1;
		/*
		 * using math.floor 
		 */
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		
		/*
		 * verifying by if else statement
		 */
		
		if (empCheck == isPresent) {
		
			
			System.out.println("Employee is present...");
		} else {
			
			System.out.println("Employee is absent...");
		}
		
		
		
		
		
		
		
		
		

	}

}
