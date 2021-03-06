package thymeleaf.service;


import org.springframework.stereotype.Service;
import thymeleaf.model.Course;
import thymeleaf.repositories.CourseRepository;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }

    public void save(Course course) {
        System.out.println(course.getName());
        courseRepository.save(course);
        System.out.println("course successfully saved!");
    }
}
