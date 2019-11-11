package ua.ithillel.evo.questengine.service;

import ua.ithillel.evo.questengine.data.entity.Question;

import java.util.List;

public interface QuestionService {

    List<Question> getAll();

    void save(Question question);

    void createQuestionForQuest(Long questId, Question question);

    void deleteById(Long id);

}
