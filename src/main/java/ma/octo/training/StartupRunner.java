package ma.octo.training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements ApplicationRunner {

    private static final Logger log = LoggerFactory.getLogger(StartupRunner.class);

    @Value("${database.url}")
    private String dbUrl;
    @Value("${cache.ttl:60}")
    private Integer cacheTtl;

    @Override
    public void run(ApplicationArguments args) {
        log.info("Hello World");
        log.info("database URL : {}", dbUrl);
        log.info("cache TTL : {}", cacheTtl);
    }
}
