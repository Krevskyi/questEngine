package ua.ithillel.evo.questengine.service.implemented;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.ithillel.evo.questengine.data.dao.TextHintDAO;
import ua.ithillel.evo.questengine.data.dao.TextQuestionDAO;
import ua.ithillel.evo.questengine.data.entity.hint.TextHint;
import ua.ithillel.evo.questengine.data.entity.task.TextQuestion;
import ua.ithillel.evo.questengine.service.TextHintService;

import java.util.List;

@Service
@Transactional
public class TextHintServiceImpl implements TextHintService {

    private TextHintDAO hintDAO;
    private TextQuestionDAO questionDAO;

    @Autowired
    public TextHintServiceImpl(TextHintDAO hintDAO, TextQuestionDAO questionDAO) {
        this.hintDAO = hintDAO;
        this.questionDAO = questionDAO;
    }

    @Override
    public List<TextHint> getAll() {
        return hintDAO.getAll();
    }

    @Override
    public void save(TextHint hint) {
        hintDAO.save(hint);
    }

    @Override
    public void createHintForQuestion(Long questionId, TextHint hint) {
        TextQuestion question = questionDAO.findById(questionId);
        question.getHints().add(hint);
        hint.setQuestion(question);
        questionDAO.save(question);//or hintDAO.save(hint)
    }

    @Override
    public void deleteById(Long id) {
        hintDAO.deleteById(id);
    }
}
