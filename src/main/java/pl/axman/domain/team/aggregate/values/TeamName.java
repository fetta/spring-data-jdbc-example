package pl.axman.domain.team.aggregate.values;

import javax.validation.ValidationException;
import lombok.Value;
import org.springframework.data.annotation.PersistenceConstructor;

@Value
public class TeamName {
  private static int MAX_LENGTH = 20;

  String name;

  @PersistenceConstructor
  public TeamName(String name) {
    validateLength(name);
    this.name = name;
  }

  public static TeamName of(String name) {
    return new TeamName(name);
  }

  private void validateLength(String name) {
    if (name.length() > MAX_LENGTH) {
      throw new ValidationException("Team name " + name + " is too long");
    }
  }
}
