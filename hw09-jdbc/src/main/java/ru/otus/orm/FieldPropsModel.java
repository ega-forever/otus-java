package ru.otus.orm;

import ru.otus.orm.constants.Types;

public class FieldPropsModel {
    private Types type;
    private Integer size;

    public FieldPropsModel(Types type, Integer size) {
        this.type = type;
        this.size = size;
    }

    public Types getType() {
        return this.type;
    }

    public Integer getSize() {
        return this.size;
    }

}
