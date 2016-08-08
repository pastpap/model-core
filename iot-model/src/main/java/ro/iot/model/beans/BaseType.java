package ro.iot.model.beans;

import io.vertx.core.json.JsonObject;

/**
 * Created by Stefan_Papin on 8/8/2016.
 */
public class BaseType {

    private String id;

    private String name;

    private String description;

    public BaseType() {
        this.id = "";
    }

    public BaseType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public BaseType(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public JsonObject toJson() {
        JsonObject json = new JsonObject()
                .put("name", name)
                .put("description", description);
        if (id != null) {
            json.put("_id", id);
        }
        return json;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public BaseType setName(String name) {
        this.name = name;
        return this;
    }

    public BaseType setDescription(String description) {
        this.description = description;
        return this;
    }

    public BaseType setId(String id) {
        this.id = id;
        return this;
    }


}
