package ua.ithillel.evo.questengine.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.ithillel.evo.questengine.data.entity.AppUser;
import ua.ithillel.evo.questengine.service.AppUserService;

import java.util.List;

//@RestController
//@RequestMapping("/users")
public abstract class AppUserController<T extends AppUser> {

    private final AppUserService<T> userService;

//    @Autowired
    public AppUserController(AppUserService<T> userService) {
        this.userService = userService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<T>> getAll() {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> create(@RequestBody T user) {
        userService.save(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
