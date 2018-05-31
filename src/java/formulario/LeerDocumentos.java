/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import strategy.StrategyDocument;


/**
 *
 * @author LABO08
 */
public class LeerDocumentos {

   

    public LeerDocumentos() {

    }

    public String leerDocumento(String doc) {    
        return StrategyDocument.getStrategy(doc).getContent();
    }
}
