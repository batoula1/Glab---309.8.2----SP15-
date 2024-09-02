package service;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentDTO studentDTO);
    Student findStudentByEmail(String email);
    List<StudentDTO> findAllStudents();
}
