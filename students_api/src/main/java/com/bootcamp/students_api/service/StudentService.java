package com.bootcamp.students_api.service;

import com.bootcamp.students_api.interfaces.IStudentRepo;
import com.bootcamp.students_api.interfaces.IStudentService;
import com.bootcamp.students_api.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService implements IStudentService {

    private final IStudentRepo repo;

    @Override
    public Student createStudent(Student student) {
        return repo.save(student);
    }
}
