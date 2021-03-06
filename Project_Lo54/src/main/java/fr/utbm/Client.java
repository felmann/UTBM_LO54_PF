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
public class Client {
    
    private int    id;
    private String lastname;
    private String firstname;
    private String address;
    private String phone;
    private String email;
    private int    course_session_id;

    public Client() {
    }

    public Client(int id, String lastname, String firstname, String address, String phone, String email, int course_session_id) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.course_session_id = course_session_id;
    }

    public int getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getCourse_session_id() {
        return course_session_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse_session_id(int course_session_id) {
        this.course_session_id = course_session_id;
    }
    
}
