package pl.axman.domain.team;

import org.springframework.data.repository.CrudRepository;
import pl.axman.domain.team.aggregate.Team;

public interface TeamRepository extends CrudRepository<Team, Integer> {

}
