package pl.axman.serialization;

import static org.junit.Assert.assertEquals;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class TeamSerializationTest {
  @Autowired
  private ObjectMapper mapper;

  @Test
  public void should_serializeToJson() throws Exception {
//    // given
//    final Player player1 = Player.of("player1");
//    final Player player2 = Player.of("player2");
//    final Team team = Team.of("teamName", player1);
//
//    // when
//    String serialized = mapper.writeValueAsString(team);
//    Team deserialized = mapper.readValue(serialized, Team.class);
//
//    // then
//    assertEquals("teamName", deserialized.getName());
//    assertEquals("player1", deserialized.getPlayers().getName());
//    assertEquals("player2", deserialized.getPlayer2().getName());
  }
}
