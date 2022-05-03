package ua.it.simplefan.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder(builderMethodName = "b", toBuilder = true)
public class SettingsFunDto {
    @JsonProperty("speed")
    private Integer speed;
    @JsonProperty("direction")
    private Boolean direction;
}
