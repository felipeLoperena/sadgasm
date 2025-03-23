package com.example.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class DataTypeConverter {

    public String DateToString(LocalDateTime dateTime, String formatoFecha){
        // Crear un DateTimeFormatter con el formato deseado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatoFecha);
        // Convertir LocalDateTime a String usando DateTimeFormatter
        return dateTime.format(formatter);
    }

    public LocalDateTime StringToDate(String dateTimeString, String formatoFecha) {
        // Definir el formato del String
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatoFecha);

        LocalDateTime dateTime = null;
        try {
            // Convertir el String a LocalDateTime
            dateTime = LocalDateTime.parse(dateTimeString, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha y hora inválido: " + e.getMessage());
        }
        return dateTime;
    }
}
