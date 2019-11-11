package ua.ithillel.evo.questengine.service.implemented;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.ithillel.evo.questengine.data.dao.QuestDAO;
import ua.ithillel.evo.questengine.data.dao.QuestionDAO;
import ua.ithillel.evo.questengine.data.entity.Quest;
import ua.ithillel.evo.questengine.data.entity.Question;
import ua.ithillel.evo.questengine.service.QuestionService;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionDAO questionDAO;
    private QuestDAO questDAO;

    @Autowired
    public QuestionServiceImpl(QuestionDAO questionDAO, QuestDAO questDAO) {
        this.questionDAO = questionDAO;
        this.questDAO = questDAO;
    }

    @Override
    public List<Question> getAll() {
        return questionDAO.getAll();
    }

    @Override
    public void save(Question question) {
        questionDAO.save(question);
    }

    @Override
    public void createQuestionForQuest(Long questId, Question question) {
        Quest quest = questDAO.findById(questId).orElse(null);//todo
        quest.getQuestions().add(question);
        question.setQuest(quest);
//        questDAO.save(quest);
    }

    @Override
    public void deleteById(Long id) {
        questionDAO.deleteById(id);
    }
}
