package ru.otus.orm.utils;

import ru.otus.orm.FieldPropsModel;
import ru.otus.orm.annotations.BigInt;
import ru.otus.orm.annotations.Int;
import ru.otus.orm.annotations.Varchar;
import ru.otus.orm.constants.Types;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Utils {

    public static Map<Field, FieldPropsModel> objectToMapType(Class<?> clazz) {

        Map<Field, FieldPropsModel> fieldStringMap = new HashMap<>();

        for (Field field : clazz.getDeclaredFields()) {

            FieldPropsModel props = null;

            if (field.getAnnotation(BigInt.class) != null) {
                props = new FieldPropsModel(Types.BIGINTEGER, field.getAnnotation(BigInt.class).size());
            }

            if (field.getAnnotation(Int.class) != null) {
                props = new FieldPropsModel(Types.INTEGER, field.getAnnotation(Int.class).size());
            }

            if (field.getAnnotation(Varchar.class) != null) {
                props = new FieldPropsModel(Types.VARCHAR, field.getAnnotation(Varchar.class).size());
            }

            if (props != null)
                fieldStringMap.put(field, props);
        }

        return fieldStringMap;

    }

}
