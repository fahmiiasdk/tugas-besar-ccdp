/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternbuilder;

/**
 *
 * @author Asus
 */
public class AppointmentSchedule {
    private String date;
    private String time;

    // Getters and Setters
    public void setDate(String date) { this.date = date; }
    public void setTime(String time) { this.time = time; }

    public String getDate() {
		return date;
	}
    
    public String getTime() {
		return time;
	}
   
}