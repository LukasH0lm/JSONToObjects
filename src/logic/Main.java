package logic;

import Objects.Employee;


public class Main {
    public static void main(String[] args) {

        //we can replace this with a loop to read all files in a folder

        JsonToJavaAdapterImpl adapter = new JsonToJavaAdapterImpl("src/json/1.json");
        Employee employee = adapter.getEmployee();
        System.out.println(employee.getName());
        System.out.println(employee.getPhoneNumber());
        System.out.println(employee.getEmail());
        System.out.println(employee.getAdress());
        System.out.println(employee.getPostalZip());
        System.out.println(employee.getRegion());
        System.out.println(employee.getCountry());
        System.out.println(employee.getTitel());

    }
}