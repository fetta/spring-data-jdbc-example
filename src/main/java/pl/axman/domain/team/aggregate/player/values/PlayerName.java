package pl.axman.domain.team.aggregate.player.values;

import javax.validation.ValidationException;
import lombok.Value;
import org.springframework.data.annotation.PersistenceConstructor;

@Value
public class PlayerName {
  public static int MAX_LENGTH = 10;

  String name;

  @PersistenceConstructor
  public PlayerName(String name) {
    validate(name);
    this.name = name;
  }

  public static PlayerName of(String name) {
    return new PlayerName(name);
  }

  private void validate(String value) {
    if (value.length() >= MAX_LENGTH) {
      throw new ValidationException("Player name too long");
    }
  }
}
