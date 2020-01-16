package ua.ithillel.evo.questengine.service.implemented.appUserService;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.ithillel.evo.questengine.data.dao.PlayerDAO;
import ua.ithillel.evo.questengine.data.entity.app_user.Player;
import ua.ithillel.evo.questengine.service.appUserService.PlayerService;

import java.util.List;

@Service
@Transactional
public class PlayerServiceImpl implements PlayerService {

    private final PlayerDAO playerDAO;

    public PlayerServiceImpl(PlayerDAO playerDAO) {
        this.playerDAO = playerDAO;
    }

    @Override
    public Player getUserByEmailAndAndPassword(String email, String password) {
        return this.playerDAO.getUserByEmailAndAndPassword(email, password);
    }

    @Override
    public List<Player> getAll() {
        return this.playerDAO.getAll();
    }

    @Override
    public void save(Player user) {
        this.playerDAO.save(user);
    }

    @Override
    public void deleteById(Long id) {
        this.playerDAO.deleteById(id);
    }
}
