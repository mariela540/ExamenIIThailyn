/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class ListaHospital {

    ArrayList<ListaHospital> ListaHospital;
    Pacientes paciente;
    String rojo;
    String amarillo;
    String verde;
    

    public ListaHospital(ArrayList<ListaHospital> ListaHospital) {
        this.ListaHospital = ListaHospital;
    }

    public void agregar(ListaHospital paciente) {

        ListaHospital.add(paciente);
    }

    public ArrayList<ListaHospital> eliminar() {
        ListaHospital.remove(paciente);
        return ListaHospital;
    }

    public void mostrar() {

    }

    public void actualizar() {

    }

    public void buscar() {

    }
}
