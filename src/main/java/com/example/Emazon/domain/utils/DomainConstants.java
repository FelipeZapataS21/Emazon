package com.example.Emazon.domain.utils;

import com.example.Emazon.domain.exceptions.MaximumLengthException;

public final class DomainConstants{

    public static final String FIELD_MAX_LENGTH = "this value exceed the maximun length";
    public static final String FIELD_VALUE_REQUIRED = "this value is required";
    public static final String FIELD_ALREDY_DECLARED_VALUE = "this value already exists";

    public DomainConstants() {
        throw new AssertionError("Cannot instantiate the class");
    }
}
