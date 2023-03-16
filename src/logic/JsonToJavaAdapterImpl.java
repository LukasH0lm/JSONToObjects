package logic;

import Objects.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class JsonToJavaAdapterImpl implements JsonToJavaAdapter {
    private String fileName;

    public JsonToJavaAdapterImpl(String fileName) {
        this.fileName = fileName;
    }

    public Employee getEmployee() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            String jsonStr = sb.toString();
            String name = parseValue("name", jsonStr);
            String phone = parseValue("phone", jsonStr);
            String email = parseValue("email", jsonStr);
            String address = parseValue("address", jsonStr);
            String zipCode = parseValue("postalZip", jsonStr);
            String region = parseValue("region", jsonStr);
            String country = parseValue("country", jsonStr);
            String title = parseValue("titel", jsonStr);
            return new Employee(name, phone, email, address, zipCode, region, country, title);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String parseValue(String key, String jsonStr) {

        System.out.println("key: " + key);

        Pattern pattern = Pattern.compile("\"" + key + "\":\\s*\"?([^,\"]*)\"?,?");
        Matcher matcher = pattern.matcher(jsonStr);
        if (matcher.find()) {
            return matcher.group(1);
        } else {
            throw new IllegalArgumentException("Cannot find key \"" + key + "\" in JSON string.");
        }
    }


    @Override
    public List<Employee> convertJsonToJava(String jsonString) {
        return null;
    }
}