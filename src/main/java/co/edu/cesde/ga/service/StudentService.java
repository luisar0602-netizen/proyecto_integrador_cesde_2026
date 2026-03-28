package co.edu.cesde.ga.service;

import co.edu.cesde.ga.models.Student;
import java.util.List;

public interface StudentService {

    Student create(Student student);

    boolean delete(Long studentId); // corregido

    boolean update(Student studentUpdate);

    Student findById(Long studentId);

    boolean existsByDocumentNumber(String documentNumber); // corregido

    List<Student> findAll();

    boolean existsById(Long studentId); // corregido
}
