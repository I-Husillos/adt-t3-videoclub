package com.videoclub;

import com.videoclub.dao.PeliculaDAO;
import com.videoclub.dao.PeliculaDAOImpI;
import com.videoclub.model.Pelicula;

import java.sql.SQLException;
import java.util.List;

public class PruebaPeliculaDAO {
    public static void main(String[] args) {
        PeliculaDAO peliculaDAO = new PeliculaDAOImpI();

        //insertar pelicula
        /*try {
            peliculaDAO.insertarPelicula(new Pelicula("La vida es bella", "Roberto Benigni", 1997, "Drama", 2.5f));
            System.out.println("Pelicula Insertada");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/

        //leer pelicula
        /*try {
            Pelicula peliculaLeida = peliculaDAO.obtenerPelicula(1);
            System.out.println(peliculaLeida);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/


        //leer todas las peliculas
        try {
            List<Pelicula> peliculasLeidas = peliculaDAO.obtenerTodasPeliculas();
            for (Pelicula pelicula : peliculasLeidas) {
                System.out.println(pelicula);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
