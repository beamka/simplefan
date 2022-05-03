package ua.it.simplefan.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ua.it.simplefan.dto.SettingsFunDto;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
@RequiredArgsConstructor
@Slf4j
public class SettingsFunServiceImpl implements SettingsFunService {

    private SettingsFunDto currentSettings = SettingsFunDto.b()
            .speed(0)
            .direction(true)
            .build();

    @Override
    public SettingsFunDto pullSpeedCord() {
        Integer speed = currentSettings.getSpeed() == 3 ? 0 : currentSettings.getSpeed()+1;
        currentSettings.setSpeed(speed);
        return currentSettings;
    }

    @Override
    public SettingsFunDto pullDirectionCord(){
        Boolean direction = currentSettings.getDirection();
        currentSettings.setDirection(!direction);
        return currentSettings;
    }
}
