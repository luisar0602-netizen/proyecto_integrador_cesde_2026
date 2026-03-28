package co.edu.cesde.ga.repository;

import co.edu.cesde.ga.models.Student;
import java.util.List;

public interface StudentRepository {

    Student create(Student student);

    boolean delete(Long studentId); // corregido (antes: delate)

    boolean update(Student studentUpdate);

    Student findById(Long studentId);

    boolean existsByDocumentNumber(String documentNumber); // corregido nombre

    List<Student> findAll();

    boolean existsById(Long studentId); // corregido (antes: existById)
}
