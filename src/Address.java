public class Address {
    private String city;
    private String state;
    private String country;

//    Address(String city, String state, String country) {
//        this.city = city;
//        this.state = state;
//        this.country = country;
//    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String toString() {
        return city + ", " + state + ", " + country;
    }

}
