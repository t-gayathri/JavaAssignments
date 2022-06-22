package com.java.assignment12;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));


        //1. Print the name of all departments in the college?
        System.out.println("All departments in the college:");
        List<String> allDepartments = studentList.stream()
                .map(Student::getEngDepartment).distinct().collect(Collectors.toList());
        for(String dept : allDepartments){
            System.out.println(dept);
        }
        System.out.println();

        //2.Get the names of all students who have enrolled after 2018?
        System.out.println("Names of all students who enrolled after 2018:");
        List<String> studentNames = studentList.stream()
                .filter(student -> student.getYearOfEnrollment()>2018)
                .map(Student::getName)
                .collect(Collectors.toList());
        for(String name : studentNames)
        {
            System.out.println(name);
        }
        System.out.println();

        //3. Get the details of all male student in the computer science department?
        System.out.println("Details of all Male students in computer science department:");
        List<Student> maleStudents = studentList.stream()
                .filter(student ->student.getGender()=="Male" && student.getEngDepartment()=="Computer Science")
                .collect(Collectors.toList());
        for(int i=0;i<maleStudents.size();i++)
        {
            System.out.println(maleStudents.get(i));
        }
        System.out.println();



        //4. How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)
        System.out.println("Number of Male and Female students:");
        Map<String,Long> studentCount = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
        for(Map.Entry<String,Long> e : studentCount.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println();

        //5.What is the average age of male and female students?
        System.out.println("Average age of male and female students:");
        Map<String,Double> avgAge = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));
        for(Map.Entry<String,Double> e : avgAge.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println();

        //6.Get the details of the highest student having the highest percentage ?
        System.out.println("Student having highest percentage:");
        Optional<Student> maxPercent = studentList.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Student::getPerTillDate)));
        System.out.println(maxPercent.get());
        System.out.println();

        //7.Count the number of students in each department?
        System.out.println("Number of students in each department:");
        Map<String,Long> studentInEachDept = studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.counting()));
        for(Map.Entry<String,Long> e : studentInEachDept.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println();

        //8.What is the average percentage achieved in each department?
        System.out.println("Average percentage achieved in each department:");
        Map<String,Double> avgPercentage = studentList.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.averagingDouble(Student::getPerTillDate)));
        for(Map.Entry<String,Double> e : avgPercentage.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println();

        //9. Get the details of the youngest male student in the Electronic department?
        System.out.println("Details of the youngest male student in the Electronic department:");
        Optional<Student> youngestMale = studentList.stream()
                .filter(student -> student.getGender()=="Male" && student.getEngDepartment()=="Electronic")
                .min(Comparator.comparing(Student::getAge));
        System.out.println(youngestMale.get());
        System.out.println();

        //10.How many male and female students are there in the computer science department?
        System.out.println("Number of Male and Female students in the computer science department:");
        Map<String,Long> studentCountInCSDept = studentList.stream()
                .filter(student -> student.getEngDepartment()=="Computer Science")
                .collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
        for(Map.Entry<String,Long> e : studentCountInCSDept.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }


    }
}
