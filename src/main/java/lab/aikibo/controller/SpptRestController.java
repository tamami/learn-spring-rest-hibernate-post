package lab.aikibo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by tamami on 08/11/16.
 */
public class SpptRestController {

    @Autowired
    SpptServices spptServices;

    @Autowired
    PembayaranServices pembayaranServices;

    @Autowired
    ReversalServices reversalServices;

    static final Logger logger = Logger.getLogger(SpptRestController.class);

    public static Logger getLogger() {
        return logger;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Status login() {

    }

}
