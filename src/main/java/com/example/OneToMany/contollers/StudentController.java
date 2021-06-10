package com.example.OneToMany.contollers;

import com.example.OneToMany.model.Courses;
import com.example.OneToMany.model.Student;
import com.example.OneToMany.repositories.CourseRepo;
import com.example.OneToMany.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {

    @Autowired
    StudentRepo sRepo;
    @Autowired
    CourseRepo cRepo;



    @PostConstruct
    public void init(){


        Student s1 = new Student("name1","grade1");
        Courses c1 = new Courses("course1");

        s1.setCourse(Arrays.asList(c1));
        sRepo.save(s1);
        Student s2 = new Student("name2","grade2");
        Courses c2 = new Courses("course2");
        Courses c3 = new Courses("course3");
        s2.setCourse(Arrays.asList(c2,c3));
        sRepo.save(s2);

        cRepo.save(c1);
        cRepo.save(c2);
        cRepo.save(c3);
        

    }
    @GetMapping("/")
    public List<Student> findAllStudents(){
       return sRepo.findAll();
    }

    @PostMapping("/")
    public Student addStudent(@RequestBody Student student){
        return sRepo.save(student);
    }
}
