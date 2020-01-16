package ua.ithillel.evo.questengine.service.implemented.questService;

import ua.ithillel.evo.questengine.data.dao.AppUserDAO;
import ua.ithillel.evo.questengine.data.dao.PlayerDAO;
import ua.ithillel.evo.questengine.data.dao.QuestDAO;
import ua.ithillel.evo.questengine.service.QuestService;

public abstract class QuestServiceImpl<T extends AppUserDAO> implements QuestService {

    private QuestDAO questDAO;
    private AppUserDAO<T> appUserDAO;

}
