package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MainTest {
    private static Student student;

    @BeforeClass
            public static void setup(){
        student = new Student();
    }

    @AfterClass
            public static void teardown(){
        student=null;
    }

    @Test
    public void testStudentSorter_GivenStudentObjects_ShouldReturnSortedList() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        student1.setId(1); student1.setName("Poorvi"); student1.setAge(22);
        student2.setId(2); student2.setName("Vinod"); student2.setAge(22);
        student3.setId(3); student3.setName("Poorvi"); student3.setAge(22);
        student4.setId(4); student4.setName("Nishchith"); student4.setAge(25);
        student5.setId(5); student5.setName("Vaishnavi"); student5.setAge(18);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        List<Student> sortedList = new ArrayList<>();
        sortedList.add(student4);
        sortedList.add(student1);
        sortedList.add(student3);
        sortedList.add(student2);
        sortedList.add(student5);

        assertThat(sortedList, is(student.sortStudents(studentList)));
    }
}