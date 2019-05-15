package edu.dmacc.codedsm.finalproject.model;

public class Employee {

    private Integer id;
    private String name;
    private double rate;
    private Integer hoursWorked;
    private double grossPay;
    private double netPay;

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Integer getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Integer hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                ", hoursWorked=" + hoursWorked +
               // ", grossPay=" + grossPay +
             //   ", netPay=" + netPay +
                '}';
    }

}


