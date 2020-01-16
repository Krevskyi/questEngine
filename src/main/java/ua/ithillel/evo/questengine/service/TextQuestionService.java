package ua.ithillel.evo.questengine.service;

import ua.ithillel.evo.questengine.data.entity.task.TextQuestion;

import java.util.List;

public interface TextQuestionService {

    List<TextQuestion> getAll();

    void save(TextQuestion question);

    void createQuestionForQuest(Long questId, TextQuestion question);

    void deleteById(Long id);

}
