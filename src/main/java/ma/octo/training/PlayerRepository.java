package ma.octo.training;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerRepository extends CrudRepository<Player, Long> {

    List<Player> findByClub(Clubs club);

    Player findById(long id);
}