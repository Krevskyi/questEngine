package ua.ithillel.evo.questengine.data.entity.task;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import ua.ithillel.evo.questengine.data.entity.hint.TextHint;
import ua.ithillel.evo.questengine.data.entity.Quest;
import ua.ithillel.evo.questengine.data.entity.Task;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode(of = "id")
public class TextQuestion extends Task {

//    @Id
//    @GeneratedValue(generator = "increment")
//    @GenericGenerator(name = "increment", strategy = "increment")
//    @Setter(AccessLevel.NONE)
//    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "quest_id")
    @JsonIgnore
    private Quest quest;

    private String text;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<TextHint> hints = new LinkedList<>();

}
