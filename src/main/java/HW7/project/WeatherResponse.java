package HW7.project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    List<Weather> list;

    public List<Weather> getList() {
        return list;
    }

    public void setList(List<Weather> list) {
        this.list = list;
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Weather {
    JsonNode LocalObservationDateTime;
    JsonNode WeatherText;


    public JsonNode getLocalObservationDateTime() {
        return LocalObservationDateTime;
    }

    public void setLocalObservationDateTime(JsonNode localObservationDateTime) {
        this.LocalObservationDateTime = localObservationDateTime;
    }

    public JsonNode getWeatherText() {
        return WeatherText;
    }

    public void setWeatherText(JsonNode weatherText) {
        this.WeatherText = weatherText;
    }

}