/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gis;

import java.util.Set;

/**
 *
 * @author User
 */
public abstract class Environment {
    private String ID;
    private Set coordinates;
    
   public void setEnvironment(String id,Set position){
       this.ID=id;
       this.coordinates.addAll(position);
   
   }
   
   public  Set getEnvironment(){
       return coordinates;
   }
    
}
