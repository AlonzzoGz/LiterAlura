package com.LiterAlura.AluraCursos.service;

public interface IConvertirDatos {

    <T> T convertirDatos(String json, Class<T> clase);
}
