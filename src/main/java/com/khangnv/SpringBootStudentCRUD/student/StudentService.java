package com.khangnv.SpringBootStudentCRUD.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException("email has been taken");
        } else
            studentRepository.save(student);
    }

    public void deleteStudent(Long studentID) {
        boolean isExisted = studentRepository.existsById(studentID);
        if (!isExisted) {
            throw new IllegalStateException("Not found student has id: " + studentID);
        } else
            studentRepository.deleteById(studentID);
    }

    @Transactional
    // the entity goes into a managed state
    //  thực thi thành công hết hoặc không có hoạt động nào được thực thi xuống database.
    public void updateStudent(Long studentId, String name, String email) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException(
                        "Do not exist student has id: " + studentId
                ));
        if (name != null && name.length() > 0 && !Objects.equals(student.getName(), name))
            student.setName(name);

        if (email != null && email.length() > 0 && !Objects.equals(student.getEmail(), email)) {
            Optional<Student> studentOptional = studentRepository.findStudentByEmail(email);
            if (studentOptional.isPresent())
                throw new IllegalStateException("email has been taken");
            else
                student.setEmail(email);
        }
    }
}
