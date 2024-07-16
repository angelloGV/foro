package com.example.demo.obtenerDatos;

public interface IConversor {
    <T> T obtenerDatos(String json, Class<T> clase);
}
