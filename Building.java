/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gis;

/**
 *
 * @author User
 */
public final class Building extends Environment {
    private String type;
    private String address;
    
    public Building (String add,String type){
        this.address=add;
        this.type=type;
    
    }
    public String get(){
        return (type+"\n"+ address);
    }
    
}
