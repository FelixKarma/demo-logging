package fr.diginamic;

import fr.diginamic.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogging {
    private static final Logger logger = LoggerFactory.getLogger(TestLogging.class);

    public static void main(String[] args) {
        logger.info("Hello ! Hello everybody ! Hello !");
        AppService service = new AppService();
        service.executer("TestParameter");
    }
}
