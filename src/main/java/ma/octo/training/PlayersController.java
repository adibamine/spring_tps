package ma.octo.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PlayersController {

    @Autowired
    PlayerRepository repository;

    @GetMapping("/search")
    public String Players(@RequestParam(name = "club", defaultValue = "LIVERPOOL") Clubs club, Model model) {
        List<Player> players = repository.findByClub(club);
        model.addAttribute("players", players);
        return "players";
    }

}
