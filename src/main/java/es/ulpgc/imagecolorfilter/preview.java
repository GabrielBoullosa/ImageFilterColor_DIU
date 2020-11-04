/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ulpgc.imagecolorfilter;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Cristina
 */
public class preview extends JPanel{
    private BufferedImage image;
    
    public preview() {
        try {
            image = ImageIO.read(new URL("https://i.pinimg.com/originals/26/cc/3b/26cc3b81c7825f634554e6c02ed9dc3f.jpg"));
        } catch (MalformedURLException ex) {
            Logger.getLogger(preview.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(preview.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void previewInitialStatus(boolean red,boolean green ,boolean blue){
        Graphics g = this.getGraphics();
        g.drawImage(filter.seleccionarComponentes(image, 
            red,green,blue),0,0,getWidth(),getHeight(),null);   
    }
    
    public void applyFilter(){
        Graphics g = this.getGraphics();
        g.drawImage(filter.seleccionarComponentes(image, 
                ImageColorFilter.redCheckBox.isSelected(), 
                ImageColorFilter.greenCheckBox.isSelected(),
                ImageColorFilter.blueCheckBox.isSelected()),
                0,0,getWidth(),getHeight(),null);   
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 0, 0,getWidth(),getHeight(), null); 
    }

}
