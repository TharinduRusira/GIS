/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gis;

/**
 *
 * @author User
 */
public final class Nature extends Environment {
    private String detail;
    
    public Nature(String detail){
        this.detail=detail;
    }
   public String get(){
   return detail;
   }
    
}
