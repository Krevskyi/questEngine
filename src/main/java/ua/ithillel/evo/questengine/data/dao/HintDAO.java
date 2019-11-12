package ua.ithillel.evo.questengine.data.dao;

import ua.ithillel.evo.questengine.data.entity.Hint;

import java.util.List;

public interface HintDAO {

    List<Hint> getAll();

    void save(Hint hint);

    void deleteById(Long id);
}