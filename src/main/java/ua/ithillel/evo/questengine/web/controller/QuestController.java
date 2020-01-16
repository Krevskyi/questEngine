package ua.ithillel.evo.questengine.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import ua.ithillel.evo.questengine.data.dao.AppUserDAO;
import ua.ithillel.evo.questengine.data.entity.AppUser;
import ua.ithillel.evo.questengine.service.AppUserService;
import ua.ithillel.evo.questengine.service.QuestService;

public abstract class QuestController<T extends AppUserDAO> {

    private final QuestService<T> questService;

    //    @Autowired
    public QuestController(QuestService<T> questService) {
        this.questService = questService;
    }

}
