package pl.axman

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import pl.axman.domain.team.TeamRepository
import pl.axman.domain.team.aggregate.Team
import pl.axman.domain.team.aggregate.player.Player
import spock.lang.Specification

@SpringBootTest
class TeamRepositoryTest extends Specification {
    @Autowired
    TeamRepository teamRepository

    def "Should persist an entity and then load it"() {
        given: "A Team entity"
        def rick = Player.of("Rick", "rick@mailinator.com")
        def morty = Player.of("Morty", "morty@mailinator.com")
        def team = Team.of("Rick and Morty", rick, morty)

        when: "Saving the team"
        def savedTeam = teamRepository.save(team)

        then: ""
        def savedTeamOpt = teamRepository.findById(savedTeam.id)
        Team retrievedTeam = savedTeamOpt.get()
        retrievedTeam.id == savedTeam.id
        retrievedTeam.name.name == "Rick and Morty"
        retrievedTeam.playerOne.name.name == "Rick"
        retrievedTeam.playerTwo.name.name == "Morty"

    }
}
