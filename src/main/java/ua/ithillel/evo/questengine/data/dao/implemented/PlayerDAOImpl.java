package ua.ithillel.evo.questengine.data.dao.implemented;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.ithillel.evo.questengine.data.dao.PlayerDAO;
import ua.ithillel.evo.questengine.data.entity.app_user.Player;
import ua.ithillel.evo.questengine.data.repository.PlayerRepository;
import ua.ithillel.evo.questengine.exception.NotFoundException;

import java.util.List;

@Component
public class PlayerDAOImpl implements PlayerDAO {

    private PlayerRepository playerRepository;

    @Autowired
    public PlayerDAOImpl(PlayerRepository repository) {
        this.playerRepository = repository;
    }

    @Override
    public Player getUserByEmailAndAndPassword(String email, String password) {
        return this.playerRepository.findPlayerByEmailAndAndPassword(email, password)
                .orElseThrow(NotFoundException::new);
    }

    @Override
    public Player findById(Long id) {
        return playerRepository.findById(id)
                .orElseThrow(NotFoundException::new);
    }

    @Override
    public List<Player> getAll() {
        return (List<Player>) playerRepository.findAll();
    }

    @Override
    public void save(Player player) {
        this.playerRepository.save(player);
    }

    @Override
    public void deleteById(Long id) {
        this.playerRepository.deleteById(id);
    }
}
