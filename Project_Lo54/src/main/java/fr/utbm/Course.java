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
public class Course {
    
    private String code;
    private String title;

    public Course() {
    }

    public Course(String code, String title) {
        this.code  = code;
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }
      
}
