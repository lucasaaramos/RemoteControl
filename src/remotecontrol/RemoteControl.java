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
public class RemoteControl implements Controller {
    
    /**
     * setting all attributes
     * setting controller
     * setting getters and setters
     */
    private int volume;
    private boolean turned;
    private boolean playing;

    public RemoteControl() {
        this.volume = 50;
        this.turned = false;
        this.playing = false;
    }
    
    
    
    /**
     * abstracts methods
     */
    @Override
    public void turnOn(){
        this.setTurned(true);
    }
    
    @Override
    public void turnOff(){
        this.setTurned(false);
    }
    
    @Override
    public void openMenu(){
        if(this.getTurned()){
            System.out.println("-------MENU---------");
            System.out.println("Is this turned on? " + this.getTurned());
            System.out.println("Is this playing? " + this.getPlaying());
            System.out.print("Volume: " + this.getVolume());

                for(int i=0; i <= this.getVolume(); i+=10){
                    System.out.print("|");
                }
                System.out.println("");
        }else{
            System.out.println("Impossible to open the menu before turn on!");
        }
        
    }
    
    @Override
    public void closeMenu(){
        System.out.println("Closing menu...");
    }
    
    @Override
    public void turnUp(){
        if(this.getTurned()){
            setVolume(getVolume() + 5);
        }else{
            System.out.println("Impossible turn volume up!");
        }
    }
    
    @Override
    public void turnDown(){
        if(this.getTurned()){
            setVolume(getVolume() - 5);
        }else{
            System.out.println("Impossible turn volume down!");
        }
    }
    
    @Override
    public void muteOn(){
        if(this.getTurned() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }
    
    @Override
    public void muteOff(){
        if(this.getTurned() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }
    
    @Override
    public void play(){
        if(this.getTurned() && !(this.getPlaying())){
            this.setPlaying(true);
        }else{
            System.out.println("Impossible to play!");
        }
    }
    
    @Override
    public void pause(){
        if(this.getTurned() && (this.getPlaying())){
            this.setPlaying(false);
        }else{
            System.out.println("Impossible to pause!");
        }
    }
    
    
    
    
    
    

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getTurned() {
        return turned;
    }

    private void setTurned(boolean turned) {
        this.turned = turned;
    }

    private boolean getPlaying() {
        return playing;
    }

    private void setPlaying(boolean playing) {
        this.playing = playing;
    }
    
    
    
}


