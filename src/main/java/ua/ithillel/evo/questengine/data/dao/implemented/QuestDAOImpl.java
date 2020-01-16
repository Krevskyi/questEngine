package ua.ithillel.evo.questengine.data.dao.implemented;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.ithillel.evo.questengine.data.dao.QuestDAO;
import ua.ithillel.evo.questengine.data.entity.Quest;
import ua.ithillel.evo.questengine.data.repository.QuestRepository;
import ua.ithillel.evo.questengine.exception.NotFoundException;

import java.util.List;

@Component
public class QuestDAOImpl implements QuestDAO {

    private QuestRepository questRepository;

    @Autowired
    public QuestDAOImpl(QuestRepository repository) {
        this.questRepository = repository;
    }

    @Override
    public Quest findById(Long id) {
        return questRepository.findById(id)
                .orElseThrow(NotFoundException::new);
    }

    @Override
    public List<Quest> getAll() {
        return (List<Quest>) questRepository.findAll();
    }

    @Override
    public void save(Quest quest) {
        questRepository.save(quest);
    }

    @Override
    public void deleteById(Long id) {
        questRepository.deleteById(id);
    }
}
