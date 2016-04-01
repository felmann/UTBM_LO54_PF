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
public class Course_session {
    
    private int    id;
    private String start_date;
    private String end_date;
    private String course_code;
    private int    location_id;

    public Course_session() {
    }

    public Course_session(int id, String start_date, String end_date, String course_code, int location_id) {
        this.id          = id;
        this.start_date  = start_date;
        this.end_date    = end_date;
        this.course_code = course_code;
        this.location_id = location_id;
    }

    public int getId() {
        return id;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public String getCourse_code() {
        return course_code;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }
    
}
