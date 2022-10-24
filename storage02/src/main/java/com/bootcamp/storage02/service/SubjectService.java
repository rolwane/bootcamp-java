package com.bootcamp.storage02.service;

import com.bootcamp.storage02.exception.NotFoundException;
import com.bootcamp.storage02.model.Subject;
import com.bootcamp.storage02.repository.ISubjectRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SubjectService implements ISubjectService {

    private final ISubjectRepo repo;

    @Override
    public Subject getById(long id) {
        Optional<Subject> subjectOptional = repo.findById(id);

        if (subjectOptional.isEmpty()) {
            throw new NotFoundException("Subject Not Found");
        }

        return subjectOptional.get();
    }
}
