package com.cognizantdxbatch.jdbc;


import java.sql.Date;

public class BeanClass {
    private int RegisterationNo;
    private String name;
    private Date da;

    private  String Dept;
    private String mobileNo;

    public Date getDa() {
        return da;
    }

    public void setDa(Date da) {
        this.da = da;
    }

    public int getRegisterationNo() {
        return RegisterationNo;
    }

    public void setRegisterationNo(int registerationNo) {
        RegisterationNo = registerationNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }


}
