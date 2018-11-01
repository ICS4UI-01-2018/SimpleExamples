/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 *
 * @author lamon
 */
public class ImagePanel extends JComponent{
    
    private BufferedImage image;
    
    public ImagePanel(){
        image = null;
    }
    
    public void setImage(String file){
        BufferedImage img = null;
        try{
            img = ImageIO.read(new File(file));
        }catch(Exception e){
            e.printStackTrace();
        }
        
        this.image = img;
    }
    
    @Override
    public void paintComponent(Graphics g){
        if(this.image != null){
            g.drawImage(this.image, 0, 0, this.getWidth(), this.getHeight(),null);
        }
    }
    
}
