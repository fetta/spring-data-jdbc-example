package pl.axman.domain.team.aggregate.player;

import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.experimental.Wither;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.Table;
import pl.axman.domain.team.aggregate.player.values.Email;
import pl.axman.domain.team.aggregate.player.values.PlayerName;

@Table("player")
@Value
@AllArgsConstructor
public class Player {
  @Id
  @Wither
  private final Integer id;
  @Embedded.Empty
  private final PlayerName name;
  @Embedded.Empty
  private final Email email;

  public static Player of(String name, String email) {
    return new Player(null, PlayerName.of(name), Email.of(email));
  }
}
