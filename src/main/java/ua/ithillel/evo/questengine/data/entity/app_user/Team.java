package ua.ithillel.evo.questengine.data.entity.app_user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
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
public class Team extends AppUser {

    private String name;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "app_user_id")
    @JsonIgnore
    private Set<Player> players = new HashSet<>();

}
