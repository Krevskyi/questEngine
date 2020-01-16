package ua.ithillel.evo.questengine.service;

import ua.ithillel.evo.questengine.data.entity.hint.TextHint;

import java.util.List;

public interface TextHintService {

    List<TextHint> getAll();

    void save(TextHint hint);

    void createHintForQuestion(Long questionId, TextHint question);

    void deleteById(Long id);
}
