package ua.ithillel.evo.questengine.data.dao;

import ua.ithillel.evo.questengine.data.entity.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionDAO {

    Optional<Question> findById(Long id);

    List<Question> getAll();

    void save(Question question);

    void deleteById(Long id);

}
