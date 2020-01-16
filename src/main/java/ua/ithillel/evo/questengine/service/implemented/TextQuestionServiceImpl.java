package ua.ithillel.evo.questengine.service.implemented;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.ithillel.evo.questengine.data.dao.QuestDAO;
import ua.ithillel.evo.questengine.data.dao.TextQuestionDAO;
import ua.ithillel.evo.questengine.data.entity.Quest;
import ua.ithillel.evo.questengine.data.entity.task.TextQuestion;
import ua.ithillel.evo.questengine.service.TextQuestionService;

import java.util.List;

@Service
@Transactional
public class TextQuestionServiceImpl implements TextQuestionService {

    private TextQuestionDAO questionDAO;
    private QuestDAO questDAO;

    @Autowired
    public TextQuestionServiceImpl(TextQuestionDAO questionDAO, QuestDAO questDAO) {
        this.questionDAO = questionDAO;
        this.questDAO = questDAO;
    }

    @Override
    public List<TextQuestion> getAll() {
        return questionDAO.getAll();
    }

    @Override
    public void save(TextQuestion question) {
        questionDAO.save(question);
    }

    @Override
    public void createQuestionForQuest(Long questId, TextQuestion question) {
        Quest quest = questDAO.findById(questId);
        quest.getQuestions().add(question);
        question.setQuest(quest);
        questDAO.save(quest);//or questionDAO.save(question)
    }

    @Override
    public void deleteById(Long id) {
        questionDAO.deleteById(id);
    }
}
