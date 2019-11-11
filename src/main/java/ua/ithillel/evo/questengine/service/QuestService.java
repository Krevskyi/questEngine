package ua.ithillel.evo.questengine.service;

import ua.ithillel.evo.questengine.data.entity.Quest;

import java.util.List;

public interface QuestService {

    List<Quest> getAll();

    void save(Quest quest);

    void createQuestByUser(Long userId, Quest quest);

    void deleteById(Long id);
}
