/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feijao;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author eltia
 */
@Named(value = "feijao")
@Dependent
public class Feijao {

    /**
     * Creates a new instance of Feijao
     */
    public Feijao() {
    }
    
    public String montarPagina(){
        return "adm/adm.xhtml"; 
    }
    
}
