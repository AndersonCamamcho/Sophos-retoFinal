package com.demoqa.models;

public class UserModel {

    private String first_name;
    private String last_name;
    private String email;
    private int age;
    private int salary;
    private String department;

    private String dateandtime;

    private String date;


    private String promp_alert;






    public UserModel() {
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDate() {return date;}
    public void setDate(String date) { this.date = date;}

    public String getDateandtime() {return dateandtime;}
    public void setDateandtime(String dateandtime) {this.dateandtime = dateandtime;}

    public String getPromp_alert() {
        return promp_alert;
    }

    public void setPromp_alert(String promp_alert) {
        this.promp_alert = promp_alert;
    }


}
