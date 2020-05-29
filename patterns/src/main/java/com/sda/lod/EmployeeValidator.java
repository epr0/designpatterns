package com.sda.lod;

/**
 * For any class C, a method M belonging to C may only invoke following:
 * The object class C itself
 * Members of class C
 * An argument of the method M
 * Object created within the method M
 * Global objects
 */
public class EmployeeValidator {

    public static void main(String args[]) {
        Employee employee = new Employee();
        employee.setName("Employee1");

        Email email = new Email();
        email.setPrimaryEmailAddress("mail1@gmail.com");

        ContactNumber contactNumber = new ContactNumber();
        contactNumber.setMobile(987654321);

        employee.setEmail(email);
        employee.setContactNumber(contactNumber);

        boolean isValidEmployee = isValidEmployee(employee);
        System.out.println("Is Valid Employee : " + isValidEmployee);
    }

    private static boolean isValidEmployee(Employee employee) {
        // Notice method chaining
        String primaryEmailAddress = employee.getEmail().getPrimaryEmailAddress();
        
        //better
        String primeEmail = employee.getPrimaryEmailAddress();
        // Notice method chaining
        long mobile = employee.getContactNumber().getMobile();

        // some good conditions
        if (primaryEmailAddress != null && mobile != 0) {
            return true;
        }
        return false;
    }


    private static boolean isValidEmployeeClean(Employee employee) {
        boolean isValidPrimaryEmailAddress = employee.isValidPrimaryEmailAddress();

        boolean isValidMobile = employee.isValidMobile();

        // some good conditions
        if (isValidPrimaryEmailAddress && isValidMobile) {
            return true;
        }
        return false;
    }
}