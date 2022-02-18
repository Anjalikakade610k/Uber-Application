/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author anjalikakade
 */
public class UbercarCatalog {
    private ArrayList<Ubercardetails> catalog;

    public ArrayList<Ubercardetails> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<Ubercardetails> catalog) {
        this.catalog = catalog;
    }

    public Ubercardetails addNewDetails(){
        Ubercardetails uberDetails = new Ubercardetails();
        catalog.add(uberDetails);
        return uberDetails;
    }

    public void updateDetails(Ubercardetails ucd) {
        catalog.add(ucd);
    }
}
