/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm;

/**
 *
 * @author gfelmann
 */
public class Location {
    
    private int    ID;
    private String city;

    public Location() {
    }

    public Location(int ID, String city) {
        this.ID   = ID;
        this.city = city;
    }

    public int getID() {
        return ID;
    }

    public String getCity() {
        return city;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCity(String city) {
        this.city = city;
    }    
    
}
