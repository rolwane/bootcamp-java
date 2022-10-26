package com.bootcamp.praticatutoriais.repository;

import com.bootcamp.praticatutoriais.enums.Status;
import com.bootcamp.praticatutoriais.model.Tutorial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TutorialRepoTest {

    @Autowired
    private TutorialRepo repo;

    @BeforeEach
    public void setup() {
        repo.deleteAll();
    }

    @Test
    public void save_GivenAValidTutorial_returnTutorial() {
        Tutorial newTutorial = new Tutorial(null, "Java para iniciantes", "Description is here...", Status.DRAFT);

        Tutorial returnedTutorial = repo.save(newTutorial);

        assertThat(returnedTutorial.getId()).isPositive();
        assertThat(returnedTutorial.getStatus()).isEqualTo(Status.DRAFT);
        assertThat(returnedTutorial.getTitle()).isEqualTo(newTutorial.getTitle());
        assertThat(returnedTutorial.getDescription()).isEqualTo(newTutorial.getDescription());
    }

    @Test
    public void findById_returnTutorial_whenTutorialExist() {
        Tutorial newTutorial = new Tutorial(null, "Java para iniciantes", "Description is here...", Status.DRAFT);

        Tutorial returnedTutorial = repo.save(newTutorial);

        Optional<Tutorial> tutorialOptional = repo.findById(returnedTutorial.getId());

        assertThat(tutorialOptional.isPresent()).isTrue();
        assertThat(tutorialOptional.get().getStatus()).isEqualTo(Status.DRAFT);
        assertThat(tutorialOptional.get().getTitle()).isEqualTo(newTutorial.getTitle());
        assertThat(tutorialOptional.get().getDescription()).isEqualTo(newTutorial.getDescription());
    }
}
