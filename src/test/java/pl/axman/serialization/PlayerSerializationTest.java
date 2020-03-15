package pl.axman.serialization;

import static org.junit.Assert.assertEquals;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.axman.domain.team.aggregate.player.Player;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class PlayerSerializationTest {
  @Autowired
  private ObjectMapper mapper;

  @Test
  public void should_serializeToJson() throws Exception {
    // given
    final String playerName = "JUZEK";
    Player player = Player.of(playerName, "juzek@mailinator.com");

    // when
    String serialized = mapper.writeValueAsString(player);
    log.info("serialized to {}", serialized);
    Player deserialized = mapper.readValue(serialized, Player.class);

    // then
    assertEquals(playerName, deserialized.getName());
  }
}
