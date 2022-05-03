package ua.it.simplefan.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.it.simplefan.dto.SettingsFunDto;
import ua.it.simplefan.services.SettingsFunService;

@Slf4j
@RestController
@RequiredArgsConstructor
public class SimpleFanController {

    private final SettingsFunService settingsFunService;

    @PostMapping({"/cord1"})
    @ResponseStatus(HttpStatus.OK)
    public SettingsFunDto cord1() {

        LOG.info("Handle '/cord1' request.");
        SettingsFunDto settingsFunDto = settingsFunService.pullSpeedCord();
        return settingsFunDto;
    }

    @PostMapping({"/cord2"})
    @ResponseStatus(HttpStatus.OK)
    public SettingsFunDto cord2() {

        LOG.info("Handle '/cord2' request.");
        SettingsFunDto settingsFunDto = settingsFunService.pullDirectionCord();
        return settingsFunDto;
    }
}
