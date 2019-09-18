package com.stackroute;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Collections;
import java.util.List;

public class Student {

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> sortStudents(List<Student> studentList){
        Collections.sort(studentList, new StudentSorter());
        for(int i=0; i<5; i++)
        System.out.println(studentList.get(i).name);
        return studentList;
    }
}