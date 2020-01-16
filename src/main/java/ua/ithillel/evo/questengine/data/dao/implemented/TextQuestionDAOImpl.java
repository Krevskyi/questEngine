package ua.ithillel.evo.questengine.data.dao.implemented;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.ithillel.evo.questengine.data.dao.TextQuestionDAO;
import ua.ithillel.evo.questengine.data.entity.task.TextQuestion;
import ua.ithillel.evo.questengine.data.repository.TextQuestionRepository;
import ua.ithillel.evo.questengine.exception.NotFoundException;

import java.util.List;

@Component
public class TextQuestionDAOImpl implements TextQuestionDAO {

    private TextQuestionRepository textQuestionRepository;

    @Autowired
    public TextQuestionDAOImpl(TextQuestionRepository repository) {
        this.textQuestionRepository = repository;
    }

    @Override
    public TextQuestion findById(Long id) {
        return textQuestionRepository.findById(id)
                .orElseThrow(NotFoundException::new);
    }

    @Override
    public List<TextQuestion> getAll() {
        return (List<TextQuestion>) textQuestionRepository.findAll();
    }

    @Override
    public void save(TextQuestion question) {
        textQuestionRepository.save(question);
    }

    @Override
    public void deleteById(Long id) {
        textQuestionRepository.deleteById(id);
    }
}
