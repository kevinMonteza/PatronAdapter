/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptador;

/**
 *
 * @author LABO08
 */
public interface IFTarget {
    
    public String getTittle();
    public String getAbstract();
    public String getIndex();
    public String getBody();
    public String getConclusions();
    public String getTranslation(String text);
}
