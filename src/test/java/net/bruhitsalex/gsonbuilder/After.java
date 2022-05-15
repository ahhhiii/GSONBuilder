package net.bruhitsalex.gsonbuilder;

public class After {

    public static void main(String[] args) {
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
    }

}
