/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

/**
 *
 * @author LABO08
 */
public abstract class  Documento {
    private String titulo;
    private String autor;
    private String indice;
    
    public abstract String getContent();
}
