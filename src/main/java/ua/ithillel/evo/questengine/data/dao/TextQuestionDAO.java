package ua.ithillel.evo.questengine.data.dao;

import ua.ithillel.evo.questengine.data.entity.task.TextQuestion;

import java.util.List;
import java.util.Optional;

public interface TextQuestionDAO {

    TextQuestion findById(Long id);

    List<TextQuestion> getAll();

    void save(TextQuestion question);

    void deleteById(Long id);

}
