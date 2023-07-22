package Miniest;

public class Address {
private String province ;
private String district ;
private String commune ;
private String houseNumber ;

    public Address() {
    }

    public Address(String province, String district, String commune, String houseNumber) {
        this.province = province;
        this.district = district;
        this.commune = commune;
        this.houseNumber = houseNumber;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
}
