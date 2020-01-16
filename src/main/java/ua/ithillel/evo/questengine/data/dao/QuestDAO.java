package ua.ithillel.evo.questengine.data.dao;

import ua.ithillel.evo.questengine.data.entity.Quest;

import java.util.List;
import java.util.Optional;

public interface QuestDAO {

    Quest findById(Long id);

    List<Quest> getAll();

    void save(Quest quest);

    void deleteById(Long id);

}
