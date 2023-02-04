package com.acme;

public record PersonaRegistro(String nombre, String apellidos) {
    @Override
    public String toString() {
        //Main comente la linea que considero no es necesaria
        //System.out.println("Esta instruccion es inservible");
        return "%s %s" .formatted(nombre, apellidos);

    }
}
