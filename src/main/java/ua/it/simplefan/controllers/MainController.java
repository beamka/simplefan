package ua.it.simplefan.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MainController {
    @RequestMapping({"/", "/index"})
    public String index() {
        LOG.info("Handle '/index' request.");
        return "index";
    }
}
