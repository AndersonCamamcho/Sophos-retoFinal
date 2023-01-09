package com.demoqa.controllers;

import com.demoqa.models.UserModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserController {
    private Properties properties = new Properties();
    private UserModel userEntity;

    public UserController(){
        userEntity = new UserModel();
    }

    public UserModel userGenerator() {
        try {
            this.properties.load(new FileInputStream(new File("C:\\Users\\usuario\\IdeaProjects\\Prueba\\src\\main\\resources\\utilities\\testData.properties")));

            userEntity.setFirst_name(this.properties.get("FIRST_NAME").toString());
            userEntity.setLast_name(this.properties.get("LAST_NAME").toString());
            userEntity.setEmail(this.properties.get("EMAIL").toString());
            userEntity.setAge(Integer.parseInt(this.properties.get("AGE").toString()));
            userEntity.setSalary(Integer.parseInt(this.properties.get("SALARY").toString()));
            userEntity.setDepartment(this.properties.get("DEPARTMENT").toString());
            userEntity.setDate(this.properties.get("DATE").toString());
            userEntity.setDateandtime(this.properties.get("DATEANDTIME").toString());
            userEntity.setPromp_alert(this.properties.get("PROMP_ALERT").toString());


            return userEntity;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return userEntity;
    }


}


