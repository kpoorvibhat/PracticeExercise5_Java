package com.stackroute;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        if (b.getAge() - a.getAge()!=0) return b.getAge()-a.getAge();
        else if (a.getName().compareTo(b.getName())!=0) return a.getName().compareTo(b.getName());
        else return a.getId()-b.getId();
    }
}
