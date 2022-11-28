package com.example.OneToMany.model;


import javax.persistence.*;


@Entity
@Table(name = "courses")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid")
    private int cid;
    @Column(name = "c_name")
    private String name;



    public Courses(String name) {

        this.name = name;

    }

    public Courses(){}


    public int getId() {
        return cid;
    }

    public void setId(int id) {
        this.cid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Courses{" +
                "id=" + cid +
                ", name='" + name + '\'' +
                '}';
    }
}

//adding new line
