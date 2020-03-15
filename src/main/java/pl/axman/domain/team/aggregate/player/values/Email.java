package pl.axman.domain.team.aggregate.player.values;

import lombok.Value;
import org.springframework.data.annotation.PersistenceConstructor;
import pl.axman.domain.team.aggregate.player.validators.EmailValidator;

@Value
public class Email {
  String email;

  @PersistenceConstructor
  public Email(String email) {
    EmailValidator.validateEmail(email);
    this.email = email;
  }

  public static Email of(String email) {
    return new Email(email);
  }
}
