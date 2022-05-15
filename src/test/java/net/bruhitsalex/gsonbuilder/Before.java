package net.bruhitsalex.gsonbuilder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Before {

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        JsonObject json = new JsonObject();
        json.addProperty("text", "This is an example json object, holding an array.");

        JsonArray array = new JsonArray();
        array.add("Garry");
        array.add("Alex");
        array.add("Brian");
        array.add("AJ");

        json.add("names", array);

        String result = gson.toJson(json);
        System.out.println("Result: \n" + result);
    }

}
