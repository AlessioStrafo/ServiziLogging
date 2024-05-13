package co.develhope.ServiziLogging2.Controllers;

import co.develhope.ServiziLogging2.Services.OperationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationController {
    @Autowired
    private OperationService operationService;
    Logger logger = LoggerFactory.getLogger(OperationController.class);
    @GetMapping("/")
    public String welcome() {
        String mess = "Welcome guys";
        logger.info(mess);
        return mess;
    }
    @GetMapping("/exp")
    public int getExponent() {
        return operationService.calcoloEsponente();
    }
    @GetMapping("/get-errors")
    public String getError() {
        String mess = "Error!";
        Error error = new Error("This is a error");
        logger.error("Error: " + error);
        return mess;
    }

}
