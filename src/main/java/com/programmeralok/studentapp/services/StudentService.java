package com.programmeralok.studentapp.services;

import com.programmeralok.studentapp.dao.StudentDao;
import com.programmeralok.studentapp.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(studentDao.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<Student> createStudent(Student student) {
        Student savedStudent = studentDao.save(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

}
