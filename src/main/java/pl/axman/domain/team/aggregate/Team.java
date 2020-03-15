package pl.axman.domain.team.aggregate;

import java.util.Arrays;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.experimental.Wither;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.Table;
import pl.axman.domain.team.aggregate.player.Player;
import pl.axman.domain.team.aggregate.values.TeamName;

@Table("team")
@Value
@AllArgsConstructor
public class Team {
  @Id
  @Wither
  private final Integer id;
  @Embedded.Empty
  private final TeamName name;
  @Wither
  private final List<Player> players;

  public static Team of(String name, Player player1, Player player2) {
    return new Team(null, TeamName.of(name), Arrays.asList(player1, player2));
  }

  public Player getPlayerOne() {
    return players.get(0);
  }

  public Player getPlayerTwo() {
    return players.get(1);
  }
}
