/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Student
 */
public class Pacientes {
    private String Cedula;
    private String Nombre;
    private String Fecha;
    private String HoraIn;
    private String HoraOut;
    private String Clasificación;

    public Pacientes(String Cedula, String Nombre, String Fecha, String HoraIn, String HoraOut, String Clasificación) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.HoraIn = HoraIn;
        this.HoraOut = HoraOut;
        this.Clasificación = Clasificación;
    }
    

    public String getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getHoraIn() {
        return HoraIn;
    }

    public String getHoraOut() {
        return HoraOut;
    }

    public String getClasificación() {
        return Clasificación;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setHoraIn(String HoraIn) {
        this.HoraIn = HoraIn;
    }

    public void setHoraOut(String HoraOut) {
        this.HoraOut = HoraOut;
    }

    public void setClasificación(String Clasificación) {
        this.Clasificación = Clasificación;
    }
   
   
}
