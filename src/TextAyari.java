
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muhammedsimsek
 */
public class TextAyari {
    
    public static void textAyari(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
          
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                String text = textField.getText();

                // Eğer girilen karakter sayı değilse veya 4 karakterden fazla girilmişse karakteri kabul etme
                if (!Pattern.matches("^[0-9]{0,4}$", text + c)) {
                    e.consume(); // Girişi engelle
                }
            }
        });
    }
}