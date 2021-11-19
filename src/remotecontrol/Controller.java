/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotecontrol;

/**
 *
 * @author lucas
 */
public interface Controller {
    
    public abstract void turnOn();
    public abstract void turnOff();
    public void openMenu();
    public void closeMenu();
    public void turnUp();
    public void turnDown();
    public void muteOn();
    public void muteOff();
    public void play();
    public void pause();
    
}
