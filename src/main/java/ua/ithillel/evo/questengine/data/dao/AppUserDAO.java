package ua.ithillel.evo.questengine.data.dao;

import ua.ithillel.evo.questengine.data.entity.app_user.Player;

import java.util.List;
import java.util.Optional;

public interface AppUserDAO<T> {

    T getUserByEmailAndAndPassword(String email, String password);

    T findById(Long id);

    List<T> getAll();

    void save(T user);

    void deleteById(Long id);

}
