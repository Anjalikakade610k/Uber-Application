/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author anjalikakade
 */
public class Ubercardetails {
     private String carbrand;
     private String manufacture;
     private Integer seatcount;
     private String serialNumber;
     private String ModelNumber;
     private String City;
     private String Ubertype;
     private String available;
     private String MaintenanceCertificate;
     private String fleetcatalogEntrydate;
     private String fleetcatalogUpdatedate;
     private Long vehicleInsurance; 

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public Integer getSeatcount() {
        return seatcount;
    }

    public void setSeatcount(Integer seatcount) {
        this.seatcount = seatcount;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return ModelNumber;
    }

    public void setModelNumber(String ModelNumber) {
        this.ModelNumber = ModelNumber;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getUbertype() {
        return Ubertype;
    }

    public void setUbertype(String Ubertype) {
        this.Ubertype = Ubertype;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getMaintenanceCertificate() {
        return MaintenanceCertificate;
    }

    public void setMaintenanceCertificate(String MaintenanceCertificate) {
        this.MaintenanceCertificate = MaintenanceCertificate;
    }

    public String getFleetcatalogEntrydate() {
        return fleetcatalogEntrydate;
    }

    public void setFleetcatalogEntrydate(String fleetcatalogEntrydate) {
        this.fleetcatalogEntrydate = fleetcatalogEntrydate;
    }

    public String getFleetcatalogUpdatedate() {
        return fleetcatalogUpdatedate;
    }

    public void setFleetcatalogUpdatedate(String fleetcatalogUpdatedate) {
        this.fleetcatalogUpdatedate = fleetcatalogUpdatedate;
    }

    public Long getVehicleInsurance() {
        return vehicleInsurance;
    }

    public void setVehicleInsurance(Long vehicleInsurance) {
        this.vehicleInsurance = vehicleInsurance;
    }
}
