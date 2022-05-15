package net.bruhitsalex.gsonbuilder;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonBuilder {

    public static final Gson GSON = new Gson();

    private final JsonObject jsonObject = new JsonObject();

    public JsonBuilder add(String key, JsonElement element) {
        jsonObject.add(key, element);
        return this;
    }

    public JsonBuilder addProperty(String key, String value) {
        jsonObject.addProperty(key, value);
        return this;
    }

    public JsonBuilder addProperty(String key, Number value) {
        jsonObject.addProperty(key, value);
        return this;
    }

    public JsonBuilder addProperty(String key, Boolean value) {
        jsonObject.addProperty(key, value);
        return this;
    }

    public JsonBuilder addProperty(String key, Character value) {
        jsonObject.addProperty(key, value);
        return this;
    }

    public int getSize() {
        return jsonObject.size();
    }

    public JsonObject build() {
        return jsonObject;
    }

    public String buildToString() {
        return GSON.toJson(jsonObject);
    }

    public String buildToString(Gson gson) {
        return gson.toJson(jsonObject);
    }

}
