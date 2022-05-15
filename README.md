# GSONBuilder
Utility builder classes for the GSON library.

## Before

```java
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
```

## After

```java
String result = new JsonBuilder()
    .add("text", "This is an example json object, holding an array.")
    .add("names", new JsonArrayBuilder()
         .add("Garry")
         .add("Alex")
         .add("Brian")
         .add("AJ")
         .build()
    )
    .buildToPrettyString();

System.out.println("Result: \n" + result);
```

