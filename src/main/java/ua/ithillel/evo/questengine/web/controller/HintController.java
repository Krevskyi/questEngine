package ua.ithillel.evo.questengine.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.ithillel.evo.questengine.data.entity.hint.TextHint;
import ua.ithillel.evo.questengine.service.TextHintService;

@RestController
@RequestMapping("/hints")
public class HintController {

    private TextHintService hintService;

    @Autowired
    public HintController(TextHintService hintService) {
        this.hintService = hintService;
    }

    @PostMapping(value = "/question/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> create(@PathVariable Long id, @RequestBody TextHint hint) {
//        HintValidator.validate(hint);
        hintService.createHintForQuestion(id, hint);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
