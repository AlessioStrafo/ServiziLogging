package co.develhope.ServiziLogging2.Services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
@Service
public class OperationService {
    Logger logger = LoggerFactory.getLogger(OperationService.class);

    @Value("${custom.num1}")
    private int num1;

    @Value("${custom.num2}")
    private int num2;

    public int calcoloEsponente() {
        logger.info("Inizio calcolo dell' esponente: ");
        int risultato = (int) Math.pow(num1, num2);
        logger.info("Risultato fine calcolo dell' esponente: ", risultato);
        return risultato;
    }

}
