package ua.ithillel.evo.questengine.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.ithillel.evo.questengine.data.entity.task.TextQuestion;
import ua.ithillel.evo.questengine.service.TextQuestionService;

@RestController
@RequestMapping("/questions")
public class TaskController {

    private TextQuestionService questionService;

    @Autowired
    public TaskController(TextQuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping(value = "/quest/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> create(@PathVariable Long id, @RequestBody TextQuestion question) {
//        QuestionValidator.validate(question);
        questionService.createQuestionForQuest(id, question);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
