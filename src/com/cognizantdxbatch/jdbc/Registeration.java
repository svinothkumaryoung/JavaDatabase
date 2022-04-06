package com.cognizantdxbatch.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Registeration {
    InputStreamReader inputStreamReader=new InputStreamReader(System.in);
    BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
    BeanClass beanClass=new BeanClass();
    String date;
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    void getData() throws IOException, ParseException
    {
        System.out.println("Enter your Register No ");
        beanClass.setRegisterationNo(Integer.parseInt(bufferedReader.readLine()));
        System.out.println("Enter the Name");
        beanClass.setName(bufferedReader.readLine());
        System.out.println("Enter the Department ");
        beanClass.setDept(bufferedReader.readLine());
        //System.out.println("Enter the Date of Birth yyyy-MM-dd");
        //Date d= sdf.parse(bufferedReader.readLine());

       // beanClass.setDa((java.sql.Date) d);

        System.out.println("Enter the Mobile Number ");
        beanClass.setMobileNo(bufferedReader.readLine());
    }
    void storeDate()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/dxbatches","root","12345678");
            PreparedStatement p=c.prepareStatement("insert into studentRegisteration(registerationNumber,name,dept,mobileNo)values(?,?,?,?)");
            p.setInt(1,beanClass.getRegisterationNo());
            p.setString(2,beanClass.getName());
            p.setString(3,beanClass.getDept());

            p.setString(4,beanClass.getMobileNo());
            int i=p.executeUpdate();
            if(i>0)
            {
                System.out.println("Inserted Successfully");
            }
            else
            {
                System.out.println("Error in Insertion");
            }


        }
       catch (Exception e){
            System.out.println(e);
       }
    }

    public static void main(String[] args)throws IOException, ParseException {
        Registeration re=new Registeration();
        re.getData();
        re.storeDate();
    }
}
