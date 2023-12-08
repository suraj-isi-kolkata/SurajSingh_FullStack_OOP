package comgreatLearning.email.driver;
import java.util.Scanner;
import comgreatLearning.email.model.Employee;
import comgreatLearning.email.service.CredentialService;
import comgreatLearning.email.service.CredentialServiceImpl;




public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CredentialService credService = new CredentialServiceImpl();
        
        System.out.println("Enter the employee first name: ");
        String firstName = sc.nextLine();
        
        System.out.println("Enter the employee last name: ");
        String lastName = sc.nextLine();
        
        Employee employee = new Employee(firstName, lastName);
        
        System.out.println("Select the department from the below list:");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        int dept = sc.nextInt();
        switch (dept) {
            case 1:
                employee.setDepartment("tech");
                break;
            case 2:
                employee.setDepartment("admin");
                break;
            case 3:
                employee.setDepartment("hr");
                break;
            case 4:
                employee.setDepartment("legal");
                break;
            default:
                System.out.println("Invalid department selection");
        }
        
        if (employee.getFirstName() != null && employee.getLastName() != null) {
            credService.generateAndSetEmailAddress(employee);
            credService.generateAndSetPassword(employee);
            credService.showCredentials(employee);
        }
        sc.close();
    }
}
