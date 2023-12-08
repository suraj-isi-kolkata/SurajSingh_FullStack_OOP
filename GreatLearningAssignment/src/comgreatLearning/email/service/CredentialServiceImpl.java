package comgreatLearning.email.service;
import java.util.Random;
import comgreatLearning.email.model.Employee;


public class CredentialServiceImpl implements CredentialService {
     Random random = new Random();
     private final int PASSWORD_LENGTH = 8;
    // Other code...

    @Override
    public String generateAndSetEmailAddress(Employee employee) {
        String emailAddr = employee.getFirstName() + employee.getLastName() + "@" +
                employee.getDepartment() + COMPANY_NAME;
        employee.setEmailAddress(emailAddr);
        return emailAddr;
    }

    // Other methods...
    @Override
    public String generateAndSetPassword(Employee employee) {
        String password = "";
        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            password = password + ALL_PASSWORD_CHARS.charAt(random.nextInt(ALL_PASSWORD_CHARS.length()));
        }
        employee.setPassword(password);
        return password;
    }
    

    @Override
    public void showCredentials(Employee employee) {
         System.out.println("Dear " + employee.getFirstName() + ", your generated credentials:");
         System.out.println("Email - - - > " + employee.getEmailAddress());
         System.out.println("Password - - - > " + employee.getPassword());
    }
}
