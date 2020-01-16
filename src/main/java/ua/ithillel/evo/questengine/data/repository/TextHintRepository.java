package ua.ithillel.evo.questengine.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.ithillel.evo.questengine.data.entity.hint.TextHint;

@Repository
public interface TextHintRepository extends CrudRepository<TextHint, Long> {
}
