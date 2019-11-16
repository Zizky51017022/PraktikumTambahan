/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2grafis;

/**
 *
 * @author ASUS
 */
import java.awt.*;
public class Latihan2Grafis extends Panel {
    Font f;
    String text = "HALLO ZISKY";
    Latihan2Grafis(){
        setBackground(Color.GRAY);}
    /**
     * @param args the command line arguments
     */
    public void paint(Graphics g) {
        // TODO code application logic here
        f = new Font ("Helvatica",Font.BOLD,48);
        //Kotak Hijau
        g.setColor(Color.GREEN);
        g.drawRect(8, 8, 335, 105);
        //Warna Hitam Pinggiran
        g.setColor(Color.GREEN);
        g.drawRect(8, 8, 335, 105);
        
        g.setColor(Color.pink);
        g.fillOval(10, 10, 330, 100);
        //Diberi pinggiran warna merah tebal (3x)
        g.setColor(Color.red);
        g.drawOval(10, 10, 330, 100);
        g.drawOval(9, 9, 332, 102);
        g.drawOval(8, 8, 334, 104);
        //Tulisan Warna HitamDengan Font Helvetica
        g.setColor(Color.black);
        g.setFont(f);
        g.drawString(text, 40, 75); }
    public static void main (String[] args) {
        Frame f = new Frame("Testing Graphics Panel");
        Latihan2Grafis gp = new Latihan2Grafis();
        f.add(gp);
        f.setSize(900, 900);
        f.setVisible(true);  
    }
    }
