package ua.ithillel.evo.questengine.service.implemented.questService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.ithillel.evo.questengine.data.dao.AppUserDAO;
import ua.ithillel.evo.questengine.data.dao.QuestDAO;
import ua.ithillel.evo.questengine.data.dao.PlayerDAO;
import ua.ithillel.evo.questengine.data.entity.Quest;
import ua.ithillel.evo.questengine.data.entity.app_user.Player;
import ua.ithillel.evo.questengine.service.QuestService;

import java.util.List;

@Service
@Transactional
public class PlayerQuestServiceImpl implements QuestService<Player> {

    private QuestDAO questDAO;
    private PlayerDAO playerDAO;

    @Autowired
    public PlayerQuestServiceImpl(QuestDAO questDAO, PlayerDAO userDAO) {
        this.questDAO = questDAO;
        this.playerDAO = userDAO;
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
        Player user = playerDAO.findById(userId);
        user.getQuests().add(quest);
        quest.setAuthor(user);
        playerDAO.save(user);//or questDAO.save(quest)
    }

    @Override
    public void deleteById(Long id) {
        questDAO.deleteById(id);
    }
}
