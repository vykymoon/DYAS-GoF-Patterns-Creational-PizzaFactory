
package edu.unisabana.pizzafactory.model;

public interface AFabricaPizza {
    AmasadorPizza crearAmasador();
    HorneadorPizza crearHorneador();
    MoldeadorPizza crearMoldeador();
}

// TODO: Complete aquí la Fábrica Abstracta (ver enunciado del taller, Parte I).
// Debe declarar los métodos de creación de los productos abstractos
// (amasador, horneador, moldeador) que cada variante de máquina implementará.
