package buoi5.bai1;

import java.util.Scanner;

public class Address {
    private String commune;
    private String district;
    private String city;

    public Address() {
    }

    public Address(String commune, String district, String city) {
        this.commune = commune;
        this.district = district;
        this.city = city;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    Scanner scan = new Scanner(System.in);

    public void input() {
        System.out.print("Input commune: ");
        this.commune = scan.nextLine();
        System.out.print("Input district: ");
        this.district = scan.nextLine();
        System.out.print("Input city: ");
        this.city = scan.nextLine();
    }

    public void output() {
        System.out.printf(" %-20s | %-20s | %-10s |", getCommune(),
                getDistrict(), getCity());
    }

}
