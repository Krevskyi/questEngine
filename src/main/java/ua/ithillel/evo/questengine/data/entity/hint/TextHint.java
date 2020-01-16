package ua.ithillel.evo.questengine.data.entity.hint;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import ua.ithillel.evo.questengine.data.entity.Hint;
import ua.ithillel.evo.questengine.data.entity.task.TextQuestion;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode(of = "id")
public class TextHint extends Hint {

//    @Id
//    @GeneratedValue(generator = "increment")
//    @GenericGenerator(name = "increment", strategy = "increment")
//    @Setter(AccessLevel.NONE)
//    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "question_id")
    @JsonIgnore
    private TextQuestion question;

    private Integer countdown;

    @Column(name = "hint_text")
    private String hintText;

}
