/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaServicio;

import java.util.ArrayList;
import java.util.List;
import pruebaModelo.Perro;

/**
 *
 * @author Niko
 */
public class PerroServiceImpl implements PerroService{
    public static List<Perro>perroList;
    
    public PerroServiceImpl(){
        this.perroList = new ArrayList<>();
    }
    
    @Override
    public void Crear(Perro perro) {
        this.perroList.add(perro);
    }

    @Override
    public List<Perro> Listar() {
       return this.perroList;
    }
    
}
