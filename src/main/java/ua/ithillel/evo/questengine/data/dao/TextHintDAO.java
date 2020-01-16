package ua.ithillel.evo.questengine.data.dao;

import ua.ithillel.evo.questengine.data.entity.hint.TextHint;

import java.util.List;

public interface TextHintDAO {

    List<TextHint> getAll();

    void save(TextHint hint);

    void deleteById(Long id);
}
