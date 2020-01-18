package ru.otus.orm.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigInteger;

@Retention(RetentionPolicy.RUNTIME)
public @interface BigInt {

    int size() default 10;


}
