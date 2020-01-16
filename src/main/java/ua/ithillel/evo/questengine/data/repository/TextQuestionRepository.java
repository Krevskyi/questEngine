package ua.ithillel.evo.questengine.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.ithillel.evo.questengine.data.entity.task.TextQuestion;

@Repository
public interface TextQuestionRepository extends CrudRepository<TextQuestion, Long> {
}
