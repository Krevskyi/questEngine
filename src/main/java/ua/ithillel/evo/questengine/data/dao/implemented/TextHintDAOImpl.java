package ua.ithillel.evo.questengine.data.dao.implemented;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.ithillel.evo.questengine.data.dao.TextHintDAO;
import ua.ithillel.evo.questengine.data.entity.hint.TextHint;
import ua.ithillel.evo.questengine.data.repository.TextHintRepository;

import java.util.List;

@Component
public class TextHintDAOImpl implements TextHintDAO {

    private TextHintRepository textHintRepository;

    @Autowired
    public TextHintDAOImpl(TextHintRepository repository) {
        this.textHintRepository = repository;
    }

    @Override
    public List<TextHint> getAll() {
        return (List<TextHint>) textHintRepository.findAll();
    }

    @Override
    public void save(TextHint hint) {
        textHintRepository.save(hint);
    }

    @Override
    public void deleteById(Long id) {
        textHintRepository.deleteById(id);
    }
}
