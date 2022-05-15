package net.bruhitsalex.gsonbuilder;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

public class JsonArrayBuilder {

    private final JsonArray jsonArray = new JsonArray();

    public JsonArrayBuilder add(JsonElement jsonElement) {
        jsonArray.add(jsonElement);
        return this;
    }

    public JsonArrayBuilder add(String string) {
        jsonArray.add(string);
        return this;
    }

    public JsonArrayBuilder add(Boolean Boolean) {
        jsonArray.add(Boolean);
        return this;
    }

    public JsonArrayBuilder add(Number number) {
        jsonArray.add(number);
        return this;
    }

    public JsonArrayBuilder add(Character character) {
        jsonArray.add(character);
        return this;
    }

    public int getSize() {
        return jsonArray.size();
    }

    public JsonArray build() {
        return jsonArray;
    }

    public String buildToString() {
        return JsonBuilder.GSON.toJson(jsonArray);
    }

    public String buildToString(Gson gson) {
        return gson.toJson(jsonArray);
    }

}
