package ua.ithillel.evo.questengine.web.controller.questController;

import com.sun.tools.javac.code.Attribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.ithillel.evo.questengine.data.dao.PlayerDAO;
import ua.ithillel.evo.questengine.data.entity.AppUser;
import ua.ithillel.evo.questengine.data.entity.Quest;
import ua.ithillel.evo.questengine.data.entity.app_user.Player;
import ua.ithillel.evo.questengine.exception.NotFoundException;
import ua.ithillel.evo.questengine.service.QuestService;
import ua.ithillel.evo.questengine.web.controller.QuestController;

@RestController
@RequestMapping("/quests")
public class PlayerQuestController extends QuestController<PlayerDAO> {

    @Autowired
    public PlayerQuestController(QuestService questService) {
        super(questService);
    }

    @PostMapping(value = "/{user}/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> create(@PathVariable String user, @PathVariable Long id, @RequestBody Quest quest) {
//        QuestValidator.validate(quest);

        questService.createQuestByUser(id, quest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
