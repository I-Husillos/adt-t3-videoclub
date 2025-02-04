package com.videoclub.dao;

import com.videoclub.model.Pelicula;

import java.sql.SQLException;
import java.util.List;

public interface PeliculaDAO {
    void insertarPelicula(Pelicula pelicula) throws SQLException;
    Pelicula obtenerPelicula(int id) throws SQLException;
    List<Pelicula> obtenerTodasPeliculas() throws SQLException;
    void actualizarPelicula(Pelicula pelicula) throws SQLException;
    void eliminarPelicula(int id) throws SQLException;



}
