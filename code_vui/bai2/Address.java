package code_vui.bai2;

public class Address {
    private String district;
    private String city;

    public Address() {
    }

    public Address(String district, String city) {
        this.district = district;
        this.city = city;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address district(String district) {
        setDistrict(district);
        return this;
    }

    public Address city(String city) {
        setCity(city);
        return this;
    }

    @Override
    public String toString() {
        return "Address [district=" + district + ", city=" + city + "]";
    }

}
