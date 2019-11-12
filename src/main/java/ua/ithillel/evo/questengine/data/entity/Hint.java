package ua.ithillel.evo.questengine.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Hint {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Setter(AccessLevel.NONE)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "question_id")
    @JsonIgnore
    private Question question;

    @Temporal(TemporalType.TIMESTAMP)
    private Date countdown;

    @Column(name = "hint_text")
    private String hintText;

}
