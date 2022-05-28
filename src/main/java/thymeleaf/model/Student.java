package thymeleaf.model;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Setter@Getter
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id;

    private String name;

    private String email;


    @ManyToMany
    private List<Course> courses = new ArrayList<>();


    public Student() {
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void setCourse(Course course) {
        this.courses.add(course);
    }
}
