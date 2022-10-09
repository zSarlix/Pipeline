package com.utest.utils;

import com.utest.utils.ExcelReader;

import java.util.List;
import java.util.Map;

import static com.utest.utils.ExcelReader.ruta;

public class ConsultExcel  {
    int fila;
    String columna;
    String celda;

    private  ExcelReader reader = new ExcelReader();
    List<Map<String, String>> testData = reader.getData(ruta, "Register");
    public String consultCell (int fila, String columna){
       celda = testData.get( fila ).get( columna );

        return celda ;
   }


}
