/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.time.Month;

public class Trabajador {
    protected String numEmpleado;
    protected Float Salario;
    protected String Nombre;
    protected String ApellidoP;
    protected String ApellidoM;
    
    LocalDate FechaInicioLab = LocalDate.of(2023, 8, 22);
    
    public Trabajador(){
        
    }
    public String getnumEmpleado(){
        return numEmpleado;
    }
    public void setnumEmpleado(String numEmpleado){
        this.numEmpleado=numEmpleado;
    }
    public Float getSalario(){
        return Salario;
    }
    public void setSalario(Float Salario){
        this.Salario=Salario;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    public String getApellidoP(){
        return ApellidoP;
    }
    public void setApellidoP(String ApellidoP){
        this.ApellidoP=ApellidoP;
    }
    public String getApellidoM(){
        return ApellidoP;
    }
    public void setApellidoM(String ApellidoP){
        this.ApellidoP=ApellidoM;
    }
    
    
    
    
}
