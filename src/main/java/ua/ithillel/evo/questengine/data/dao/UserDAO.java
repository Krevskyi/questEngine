package ua.ithillel.evo.questengine.data.dao;

import ua.ithillel.evo.questengine.data.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserDAO {

    Optional<User> getUserByEmailAndAndPassword(String email, String password);

    Optional<User> findById(Long id);

    List<User> getAll();

    void save(User user);

    void deleteById(Long id);

}
