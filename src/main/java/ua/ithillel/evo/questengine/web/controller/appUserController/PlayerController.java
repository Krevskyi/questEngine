package ua.ithillel.evo.questengine.web.controller.appUserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.ithillel.evo.questengine.data.entity.app_user.Player;
import ua.ithillel.evo.questengine.service.appUserService.PlayerService;
import ua.ithillel.evo.questengine.web.controller.AppUserController;

@RestController
@RequestMapping("/players")
public class PlayerController extends AppUserController<Player> {

    @Autowired
    public PlayerController(PlayerService userService) {
        super(userService);
    }

}
