package ro.iot.model.beans;

import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;
import ro.iot.model.properties.Property;

import java.util.List;

/**
 * Created by Stefan_Papin on 8/8/2016.
 */
public class Artefact extends BaseType {

    private List<Property> properties;


    public List<Property> getProperties() {
        return properties;
    }

    public Artefact setProperties(List<Property> properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public JsonObject toJson() {
        JsonObject localJson = super.toJson();
        localJson.put("properties", Json.encodePrettily(properties));
        return localJson;
    }
}
