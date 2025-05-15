package com.methaporce.vista;

import com.methaporce.modelo.Pelicula;
import com.methaporce.modelo.GestorPelicula;

public class Main {
    public static void main(String[] args) {
        GestorPelicula gestor = new GestorPelicula();

        Pelicula p1 = new Pelicula(1, "Matrix", true);
        Pelicula p2 = new Pelicula(2, "Titanic", false);
        Pelicula p3 = new Pelicula(3, "Interstellar", true);

        gestor.agregarPelicula(p1);
        gestor.agregarPelicula(p2);
        gestor.agregarPelicula(p3);

        gestor.eliminarPelicula(1);

        gestor.marcarPeliculaComoDisponible(2);

        System.out.println("Películas NO disponibles:");
        for (Pelicula p : gestor.obtenerPeliculasNoDisponibles()) {
            System.out.println(p);
        }

        System.out.println("\nPelículas disponibles:");
        for (Pelicula p : gestor.obtenerPeliculasDisponibles()) {
            System.out.println(p);
        }
    }
}
