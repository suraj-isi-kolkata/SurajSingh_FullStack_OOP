package comgreatLearning.email.service;
import comgreatLearning.email.model.Employee;

public interface CredentialService {
    final String COMPANY_NAME = "gl.com";
    final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    final String UPPER = LOWER.toUpperCase();
    final String NUM = "0123456789";
    final String SPL = "!@#$%^&*()";
    final String ALL_PASSWORD_CHARS = LOWER + UPPER + NUM + SPL;

    String generateAndSetEmailAddress(Employee employee);
    String generateAndSetPassword(Employee employee);
    void showCredentials(Employee employee);
}
