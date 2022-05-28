package thymeleaf.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;
@Entity
@Table(name = "courses")
@Getter@Setter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;

    private String address;
    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

    public void setStudent(Student student) {
        this.students.add(student);
    }
}
