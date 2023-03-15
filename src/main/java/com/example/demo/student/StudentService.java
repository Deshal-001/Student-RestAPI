package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService  {

    private final StudentRepository studentRepository;


    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
       Optional<Student> studentOptional= studentRepository.findStudentByEmail(student.getEmail());
       if(studentOptional.isPresent()){
           throw  new IllegalStateException("email taken");
       }
       studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
       boolean exist= studentRepository.existsById(id);
       if(!exist){
           throw new IllegalStateException(
                   "student id " + id+" is not exists"
           );
       }
       studentRepository.deleteById(id);
    }
}
