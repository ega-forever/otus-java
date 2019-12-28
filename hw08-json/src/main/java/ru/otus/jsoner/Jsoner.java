package ru.otus.jsoner;


import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Jsoner {

    public String toJSON(Object object) {

        JsonObjectBuilder jsonObject = Json.createObjectBuilder();


        for (Field field : object.getClass().getFields()) {
            field.setAccessible(true);
            try {
                Object value = field.get(object);
                addPropertyToJson(jsonObject, field.getName(), value, field);
            } catch (Exception e) {

            }
        }


        return jsonObject.build().toString();
    }


    private void addPropertyToJson(JsonObjectBuilder jsonObject, Object key, Object value, Field field) {

        if (value.getClass().equals(Integer.class)) {
            jsonObject.add(key.toString(), (Integer) value);
        } else if (value.getClass().equals(String.class)) {
            jsonObject.add(key.toString(), (String) value);
        } else if (value.getClass().equals(Float.class)) {
            jsonObject.add(key.toString(), (Float) value);
        } else if (value.getClass().equals(Double.class)) {
            jsonObject.add(key.toString(), (Double) value);
        } else if (value.getClass().equals(Boolean.class)) {
            jsonObject.add(key.toString(), (Boolean) value);
        } else if (field != null && List.class.isAssignableFrom(value.getClass())) {
            JsonArrayBuilder builder = Json.createArrayBuilder();
            ParameterizedType listType = (ParameterizedType) field.getGenericType();
            Class<?> listTypeClass = (Class<?>) listType.getActualTypeArguments()[0];
            addPropertyToJsonArray(builder, listTypeClass, (List<?>) value);
            jsonObject.add(field.getName(), builder);
        } else if (field != null && Map.class.isAssignableFrom(value.getClass())) {
            JsonObjectBuilder builder = Json.createObjectBuilder();

            for(Object mapKey: ((Map) value).keySet()){
                this.addPropertyToJson(builder, mapKey, ((Map) value).get(mapKey), null);
            }


        jsonObject.add(key.toString(), builder);
    }
    }


    private void addPropertyToJsonArray(JsonArrayBuilder jsonObject, Class<?> arrayTypeClazz, List<?> array) {

        if (arrayTypeClazz.equals(Integer.class)) {
            for (Integer value : (List<Integer>) array) {
                jsonObject.add(value);
            }
        } else if (arrayTypeClazz.equals(String.class)) {
            for (String value : (List<String>) array) {
                jsonObject.add(value);
            }
        } else if (arrayTypeClazz.equals(Float.class)) {
            for (Float value : (List<Float>) array) {
                jsonObject.add(value);
            }
        } else if (arrayTypeClazz.equals(Double.class)) {
            for (Double value : (List<Double>) array) {
                jsonObject.add(value);
            }
        } else if (arrayTypeClazz.equals(Boolean.class)) {
            for (Boolean value : (List<Boolean>) array) {
                jsonObject.add(value);
            }
        }
    }
}
