package Objects;

public class Employee {

    private String name;
    private String phoneNumber;
    private String email;
    private String adress;
    private String postalZip;
    private String region;
    private String country;
    private String titel;

    public Employee(String name, String phoneNumber, String email, String adress, String postalZip, String region, String country, String titel) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.adress = adress;
        this.postalZip = postalZip;
        this.region = region;
        this.country = country;
        this.titel = titel;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAdress() {
        return adress;
    }

    public String getPostalZip() {
        return postalZip;
    }

    public String getRegion() {
        return region;
    }


    public String getCountry() {
        return country;
    }

    public String getTitel() {
        return titel;
    }


}
