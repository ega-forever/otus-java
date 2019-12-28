package hw08;


import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.otus.jsoner.Jsoner;

public class MainTest {

    private Gson gson;
    private Jsoner jsoner;

    @Before
    public void init() {
        this.gson = new Gson();
        this.jsoner = new Jsoner();

    }


    @Test
    public void checkToJSON(){

        Gson gson = new Gson();
        StrangeObject strangeObject = new StrangeObject(1, "test", 12f);
        strangeObject.addToList(188);
        strangeObject.addToMap("super_key", true);
        String json = gson.toJson(strangeObject);

        Jsoner jsoner = new Jsoner();

        String json2 = jsoner.toJSON(strangeObject);

        Assert.assertEquals(json, json2);

    }


}
