package com.bootcamp.praticatutoriais.service;

import com.bootcamp.praticatutoriais.enums.Status;
import com.bootcamp.praticatutoriais.interfaces.ITutorialService;
import com.bootcamp.praticatutoriais.model.Tutorial;
import com.bootcamp.praticatutoriais.repository.TutorialRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TutorialService implements ITutorialService {

    private final TutorialRepo repo;

    @Override
    public Tutorial create(Tutorial tutorial) {
        if (tutorial == null) {
            throw new InvalidParameterException("O tutorial não pode ser nulo");
        }

        if (tutorial.getId() != null) {
            throw new InvalidParameterException("O tutorial não pode ter ID");
        }

        tutorial.setStatus(Status.DRAFT);

        return repo.save(tutorial);
    }

    @Override
    public Optional<Tutorial> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Tutorial update(Tutorial tutorial) {
        if (tutorial == null) {
            throw new InvalidParameterException("O tutorial não pode ser nulo");
        }

        if (tutorial.getId() == null) {
            throw new InvalidParameterException("O tutorial deve ter uma ID");
        }

        return repo.save(tutorial);
    }

    @Override
    public List<Tutorial> getAll() {
        return null;
    }

    @Override
    public List<Tutorial> getAllPublished() {
        return null;
    }

    @Override
    public List<Tutorial> getAllByTitle(String title) {
        return repo.findByTitleContaining(title);
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Long id) {

    }
}
