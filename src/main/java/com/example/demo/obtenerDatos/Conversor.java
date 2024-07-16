package com.example.demo.obtenerDatos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Conversor implements IConversor{

    public ObjectMapper objectMapper = new ObjectMapper();
    public Conversor(){}

    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {
        try {
            return objectMapper.readValue(json, clase);
        }
        catch(JsonProcessingException e)
        {
            throw new RuntimeException(e);
        }
    }
}
