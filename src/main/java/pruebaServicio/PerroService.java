/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaServicio;

import pruebaModelo.Perro;
import java.util.List;

/**
 *
 * @author Niko
 */
public interface PerroService {
    
    public abstract void Crear(Perro perro);
    public abstract List<Perro>Listar();
    
}
