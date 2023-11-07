package ru.vsuet.annotations;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class JsonSerializer {
    public <T> String serialize(T o) throws IllegalAccessException{
        Class<?> clazz =o.getClass();

        if (clazz.isAnnotationPresent(JsonIgnore.class)){
            return null;
        }

        Map<String,String> jsonElements = new HashMap<>();
        for (Field field : clazz.getDeclaredFields()){
            field.setAccessible(true);
            if (field.isAnnotationPresent(JsonIgnore.class))
            jsonElements.put(field.getName(), field.get(o).toString());
        }
        return jsonElements.entrySet().stream()
                .map(e->String.format("\"%s\":\"%s\"",e.getKey(),e.getValue()))
                .collect(Collectors.joining(", ","{","}")).toString();
    }

}
