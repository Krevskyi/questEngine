package ua.ithillel.evo.questengine.service.implemented.appUserService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.ithillel.evo.questengine.data.entity.app_user.Team;
import ua.ithillel.evo.questengine.service.appUserService.TeamService;

import java.util.List;

@Service
@Transactional
public class TeamServiceImpl implements TeamService {

    @Override
    public Team getUserByEmailAndAndPassword(String email, String password) {
        return null;
    }

    @Override
    public List<Team> getAll() {
        return null;
    }

    @Override
    public void save(Team user) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
