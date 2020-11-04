
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


public class canva extends JPanel{
    private BufferedImage image;
    private BufferedImage logo;
    private BufferedImage copy;
    private int x,y;

    public canva(){
        try {
            image = ImageIO.read(new URL("https://i.pinimg.com/originals/26/cc/3b/26cc3b81c7825f634554e6c02ed9dc3f.jpg"));
            logo = ImageIO.read(new URL("https://i.ibb.co/pnRyvdB/logo.png"));

        } catch (MalformedURLException ex) {
            Logger.getLogger(canva.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(canva.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
    

    public void setLogoPosition(int x,int y){
        this.x = x;
        this.y = y;
        Graphics g = this.getGraphics();
        this.update(g);
        g.drawImage(copy,0,0,getWidth(),getHeight(),null);
        g.drawImage(logo,x,y,null);
    }
    
    public void applyFilter(){
        Graphics g = this.getGraphics();
        g.drawImage(copy = filter.seleccionarComponentes(image, 
                ImageColorFilter.redCheckBox.isSelected(), 
                ImageColorFilter.greenCheckBox.isSelected(),
                ImageColorFilter.blueCheckBox.isSelected()),
                0,0,getWidth(),getHeight(),null); 
        g.drawImage(logo,x,y,null);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image,0,0,getWidth(),getHeight(),null);
    }
}
