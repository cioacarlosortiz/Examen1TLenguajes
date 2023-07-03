package com.example.tlenguajes2023.configuracion;

public class ConfigDB
{
    // Configuracion de los parametros de la base de datos local en sqlite
    //Nombre de la base de datos
    public static final String namebd = "DBTLeng";

    // Tablas de las bases de datos
    public static final String tblfutbol = "FUTBOL";

    // Campos de la tabla personas
    public static final String id = "id";
    public static final String nombres = "nombres";
    public static final String apellidos = "apellidos";

    public static final String pais = "pais";

    public static final String posicion = "posicion";
    public static final String edad = "edad";


    // Creacion de objetos DDL - CREATE - DROP - ALTER
    public static final String CreateTBFutbol = "CREATE TABLE FUTBOL (id INTEGER PRIMARY KEY AUTOINCREMENT, nombres TEXT," +
            "apellidos TEXT, pais TEXT, posicion TEXT, edad INTEGER)";

    public static final String DropTBFutbol = "DROP TABLE IF EXISTS FUTBOL";

    // Creacion de objetos DML para poder seleccionar informacion de la base de datos
    public static final String SelectTBFutbol = "SELECT * FROM " + ConfigDB.tblfutbol;

    public static final String Empty = "";

}
