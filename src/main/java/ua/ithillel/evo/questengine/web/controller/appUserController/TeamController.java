package ua.ithillel.evo.questengine.web.controller.appUserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.ithillel.evo.questengine.data.entity.app_user.Team;
import ua.ithillel.evo.questengine.service.appUserService.TeamService;
import ua.ithillel.evo.questengine.web.controller.AppUserController;

@RestController
@RequestMapping("/teams")
public class TeamController extends AppUserController<Team> {

    @Autowired
    public TeamController(TeamService userService) {
        super(userService);
    }

}
