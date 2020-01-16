package ua.ithillel.evo.questengine.service;

import java.util.List;

public interface AppUserService<T> {

    T getUserByEmailAndAndPassword(String email, String password);

    List<T> getAll();

    void save(T user);

    void deleteById(Long id);
}
