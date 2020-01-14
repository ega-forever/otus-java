package ru.otus.orm.utils;

import ru.otus.orm.annotations.BigInt;
import ru.otus.orm.annotations.Int;
import ru.otus.orm.annotations.Varchar;
import ru.otus.orm.constants.Types;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Utils {

    public static Map<Field, Map<String, String>> objectToMapType(Class<?> clazz){

        Map<Field, Map<String, String>> fieldStringMap = new HashMap<>();

        for (Field field : clazz.getDeclaredFields()) {

            Map<String, String> props = new HashMap<>();

            if (field.getAnnotation(BigInt.class) != null) {
                props.put("type", Types.BIGINTEGER.getType());
                props.put("size", String.valueOf(field.getAnnotation(BigInt.class).size()));
            }

            if (field.getAnnotation(Int.class) != null) {
                props.put("type", Types.INTEGER.getType());
                props.put("size", String.valueOf(field.getAnnotation(Int.class).size()));
            }

            if (field.getAnnotation(Varchar.class) != null) {
                props.put("type", Types.VARCHAR.getType());
                props.put("size", String.valueOf(field.getAnnotation(Varchar.class).size()));
            }

            fieldStringMap.put(field, props);
        }


        return fieldStringMap;

    }

}
