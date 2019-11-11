package ua.ithillel.evo.questengine.service.implemented;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.ithillel.evo.questengine.data.dao.QuestDAO;
import ua.ithillel.evo.questengine.data.dao.UserDAO;
import ua.ithillel.evo.questengine.data.entity.Quest;
import ua.ithillel.evo.questengine.data.entity.User;
import ua.ithillel.evo.questengine.service.QuestService;

import java.util.List;

@Service
public class QuestServiceImpl implements QuestService {

    private QuestDAO questDAO;
    private UserDAO userDAO;

    @Autowired
    public QuestServiceImpl(QuestDAO questDAO, UserDAO userDAO) {
        this.questDAO = questDAO;
        this.userDAO = userDAO;
    }

    @Override
    public List<Quest> getAll() {
        return questDAO.getAll();
    }

    @Override
    public void save(Quest quest) {
        questDAO.save(quest);
    }

    @Override
    public void createQuestByUser(Long userId, Quest quest) {
        User user = userDAO.findById(userId).orElse(null);//todo
        user.getQuests().add(quest);
        quest.setAuthor(user);
//        userDAO.save(user);
    }

    @Override
    public void deleteById(Long id) {
        questDAO.deleteById(id);
    }
}
