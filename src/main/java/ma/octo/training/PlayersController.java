package ma.octo.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayersController {

    @Autowired
    private PlayerRepository repository;

    @GetMapping("/search")
    public List<Player> Players(@RequestParam(name = "club", defaultValue = "LIVERPOOL") String club) {
        if (!Clubs.hasClub(club)) {
            throw new ClubNotFoundException();
        }
        List<Player> players = repository.findByClub(Clubs.valueOf(club));
        if (players.isEmpty()) {
            throw new PlayersNotFoundException();
        }
        return players;
    }

}
