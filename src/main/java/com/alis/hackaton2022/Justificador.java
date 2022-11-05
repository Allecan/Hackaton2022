package com.alis.hackaton2022;

import java.util.ArrayList;
import java.util.List;

class Justificador {

    private String alinear_medio(String[] texto, int resta_longitud, int i, int j) {
        int espacios_extra;
        int espacios;
        int espacios_restantes;
        int espacios_a;

        espacios_restantes = (j - i - 1);
        espacios = resta_longitud / espacios_restantes;
        espacios_extra = resta_longitud % espacios_restantes;

        if ((espacios_extra - 1) > 0) {
            espacios_extra = 1;

        } else {
            espacios_extra = 0;

        }

        StringBuilder texto_justificado = new StringBuilder(texto[i]);
        for (int h = i + 1; h < j; h++) {
            espacios_a = espacios + espacios_extra;
            texto_justificado.append(" ".repeat(espacios_a) + texto[h]);
        }

        return texto_justificado.toString();

    }

    private String alinear_izquierda(String[] texto, int resta_longitud, int i, int j) {
        int espacios_derecha = resta_longitud - (j - i - 1);

        StringBuilder texto_justificado = new StringBuilder(texto[i]);
        for (int h = i + 1; h < j; h++) {
            texto_justificado.append(" " + texto[h]);
        }
        texto_justificado.append(" ".repeat(espacios_derecha));

        return texto_justificado.toString();
    }

    public List<String> Justificar(String[] texto, int Caracteres_maximos) {
        List<String> texto_justificado = new ArrayList<>();
        int resta_longitud;
        int cantidad_texto;

        int i = 0, n = texto.length;
        while (i < n) {
            int j = i + 1;
            int longitud = texto[i].length();
            while (j < n && (longitud + texto[j].length() + (j - i - 1) < Caracteres_maximos)) {
                longitud += texto[j].length();
                j++;
            }

            resta_longitud = Caracteres_maximos - longitud;
            cantidad_texto = j - i;
            if (cantidad_texto == 1 || j > n) {
                
                texto_justificado.add(alinear_izquierda(texto, resta_longitud, i, j) );
                
            } else {
                texto_justificado.add(alinear_medio(texto, resta_longitud, i, j));
                texto_justificado.add("\n");
            }

            i = j;

        }
        return texto_justificado;
    }

}
