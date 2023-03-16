package logic;

import Objects.Employee;

import java.util.List;

public interface JsonToJavaAdapter {
    public List<Employee> convertJsonToJava(String jsonString);
}