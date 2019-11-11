package ua.ithillel.evo.questengine.service;

import ua.ithillel.evo.questengine.data.entity.Hint;

import java.util.List;

public interface HintService {

    List<Hint> getAll();

    void save(Hint hint);

    void createHintForQuestion(Long questionId, Hint question);

    void deleteById(Long id);
}
