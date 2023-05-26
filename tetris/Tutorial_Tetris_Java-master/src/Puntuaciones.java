/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;

public class Puntuaciones {
    private List<Integer> puntos;

    public Puntuaciones() {
        puntos = new ArrayList<>();
    }

    public void agregarPuntaje(int puntaje) {
        puntos.add(puntaje);
    }

    public List<Integer> obtenerPuntajes() {
        return puntos;
    }
}

