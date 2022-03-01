package ma.octo.training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements ApplicationRunner {

    private static final Logger log = LoggerFactory.getLogger(StartupRunner.class);

    @Autowired
    PlayerRepository repository;

    @Override
    public void run(ApplicationArguments args) {
        log.info("creating players START");
        repository.save(new Player("Cristiano", "Ronaldo", Clubs.MANCHESTER_UNITED));
        repository.save(new Player("Lionel", "Messi", Clubs.PSG));
        repository.save(new Player("Kilian", "Mbappe", Clubs.PSG));
        repository.save(new Player("Lucas", "Modric", Clubs.REAL_MADRID));
        repository.save(new Player("Hakim", "Ziyach", Clubs.CHELSEA));
        repository.save(new Player("Salah", "Mohamed", Clubs.LIVERPOOL));
        repository.save(new Player("Sadio", "Mané", Clubs.LIVERPOOL));
        repository.save(new Player("Karim", "Benzema", Clubs.REAL_MADRID));
        log.info("creating players END");

        // fetch all players
        log.info("Players found with findAll():");
        log.info("-------------------------------");
        for (Player player : repository.findAll()) {
            log.info(player.toString());
        }
        log.info("");

        // fetch an individual player by ID
        Player player = repository.findById(1L);
        log.info("Player found with findById(1L):");
        log.info("--------------------------------");
        log.info(player.toString());
        log.info("");

        // fetch players by club
        log.info("Player found with findByClub('PSG'):");
        log.info("--------------------------------------------");
        repository.findByClub(Clubs.PSG).forEach(bauer -> {
            log.info(bauer.toString());
        });

    }
}
