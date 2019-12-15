package ru.otus.main;

import com.google.gson.Gson;
import ru.otus.jsoner.Jsoner;

public class Main {

    public static void main(String[] args){

        Gson gson = new Gson();
        StrangeObject strangeObject = new StrangeObject(1, "test", 12f);
        strangeObject.addToList(188);
        strangeObject.addToMap("super_key", true);
        String json = gson.toJson(strangeObject);

        System.out.println(json);

        Jsoner jsoner = new Jsoner();

        String json2 = jsoner.toJSON(strangeObject);

       System.out.println("are equal: " + json.equals(json2));
    }


}
