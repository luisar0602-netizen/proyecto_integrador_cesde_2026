package co.edu.cesde.ga.service.impl;

import co.edu.cesde.ga.models.Student;
import co.edu.cesde.ga.repository.StudentRepository;
import co.edu.cesde.ga.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    // Constructor
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // CREATE
    @Override
    public Student create(Student student) {
        if (isInvalidStudent(student) ||
                studentRepository.existsByDocumentNumber(student.getDocumentNumber())) {
            return null;
        }

        return studentRepository.create(student);
    }

    // DELETE
    @Override
    public boolean delete(Long studentId) {
        if (!studentRepository.existsById(studentId)) {
            return false;
        }
        return studentRepository.delete(studentId);
    }

    // UPDATE
    @Override
    public boolean update(Student studentUpdate) {
        if (isInvalidStudent(studentUpdate)) {
            return false;
        }
        return studentRepository.update(studentUpdate);
    }

    // FIND BY ID
    @Override
    public Student findById(Long studentId) {
        return studentRepository.findById(studentId);
    }

    // EXISTS BY DOCUMENT
    @Override
    public boolean existsByDocumentNumber(String documentNumber) {
        return studentRepository.existsByDocumentNumber(documentNumber);
    }

    // FIND ALL
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    // EXISTS BY ID
    @Override
    public boolean existsById(Long studentId) {
        return studentRepository.existsById(studentId);
    }

    // VALIDACIONES
    private boolean isInvalidStudent(Student student) {
        return student == null
                || !isNotBlank(student.getCode())
                || !isNotBlank(student.getDocumentNumber())
                || !isNotBlank(student.getFirstName())
                || !isNotBlank(student.getLastName())
                || student.getStatus() == null
                || !isNotBlank(student.getBirthDate());
    }

    private boolean isNotBlank(String value) {
        return value != null && !value.isBlank();
    }
}
