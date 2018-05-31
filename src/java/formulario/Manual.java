/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import adaptador.Adaptador;
import adaptador.IFTarget;
import entidades.Asignatura;
import libreria.InternationalJournal;
import libreria.TranslatorEng2Esp;

/**
 *
 * @author LABO08
 */
public class Manual extends Documento{
     private Asignatura asignatura;
     private IFTarget adaptador;

    public Manual() {
        this.asignatura = new Asignatura();
        this.adaptador= new Adaptador();
    }
     
     
    
    @Override
     public String getContent(){
         String content=""
                 + "<!DOCTYPE html>"
                 + "<html>"
                     + "<head>"
                         + "<title>Este es el Manual</title>"
                     + "</head>"
                     + "<body>"
                     + "<header>"
                         + "<h1>Titulo de Manual " + adaptador.getTittle() + "</h1>"
                     + "</header>"
                     + "<section>"
                     + "<h3> MANUAL"+
                        adaptador.getIndex()
                     + "</h3>"
                         + "<h4>"
                            + adaptador.getAbstract()
                         + "</h4>"
                         + "<p>"+adaptador.getBody() +"</p>"
                     + "</section>"
                     + "<footer>"+
                       adaptador.getConclusions()
                     + "</footer>"  
                     + "</body>"
                  + "</html>";
         return content;
     }
}
