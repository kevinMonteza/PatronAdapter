/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import formulario.ArchivoAyuda;
import formulario.Documento;
import formulario.Manual;
import formulario.Monografia;

/**
 *
 * @author LABO08
 */
public class StrategyDocument {

    Documento documento;

    public StrategyDocument() {

    }

    public static  Documento getStrategy(String doc) {
        Documento obj = null;
        switch (doc) {
            case "Manual":
                obj = new Manual();
                break;
            case "Monografia":
                obj = new Monografia();

                break;
            case "Archivo":
                obj = new ArchivoAyuda();
                break;
            default:
                return null;
        }
        return obj;
    }

}
