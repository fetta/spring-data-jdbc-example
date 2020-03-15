package pl.axman.domain.team.aggregate.player.validators;

import java.util.regex.Pattern;
import javax.validation.ValidationException;

/**
 * Java email validation program
 *
 * @author pankaj
 *
 */
public class EmailValidator {
  private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
  private static Pattern pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);

  public static void validateEmail(String email) {
    if (emailDoesntMatch(email)) {
      throw new ValidationException("Invalid email String: " + email);
    }
  }

  private static boolean emailDoesntMatch(String email) {
    return !pattern.matcher(email).matches();
  }
}