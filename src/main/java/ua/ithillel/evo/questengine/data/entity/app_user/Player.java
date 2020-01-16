package ua.ithillel.evo.questengine.data.entity.app_user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import ua.ithillel.evo.questengine.data.entity.AppUser;
import ua.ithillel.evo.questengine.data.entity.Quest;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode(of = "id")
//@Table(name = "app_user")
public class Player extends AppUser {

//    @Id
//    @GeneratedValue(generator = "increment")
//    @GenericGenerator(name = "increment", strategy = "increment")
//    @Setter(AccessLevel.NONE)
//    private Long id;

    @Column(unique = true)
    private String email;

    private String password;

}
