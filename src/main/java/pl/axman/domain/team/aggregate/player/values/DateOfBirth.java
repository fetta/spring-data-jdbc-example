package pl.axman.domain.team.aggregate.player.values;

import java.time.LocalDate;
import javax.validation.ValidationException;
import lombok.Value;

@Value
public class DateOfBirth {
  private static final int EIGHTEEN = 18;
  LocalDate value;

  public DateOfBirth(LocalDate value) {
    validateOver18(value);
    this.value = value;
  }

  public static DateOfBirth of(LocalDate dateOfBirth) {
    return new DateOfBirth(dateOfBirth);
  }

  private void validateOver18(LocalDate dateOfBirth) {
    if (dateOfBirth.isAfter(LocalDate.now().minusYears(EIGHTEEN))) {
      throw new ValidationException("Date of birth " + dateOfBirth + " invalid, must be over 18");
    }
  }
}
