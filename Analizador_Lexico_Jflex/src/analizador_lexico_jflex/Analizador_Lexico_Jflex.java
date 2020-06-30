package analizador_lexico_jflex;
/**
 *
 * @author Adrian
 */
import javax.swing.UIManager;
public class Analizador_Lexico_Jflex {
   
    public static void main(String[] args) {
        try {
          UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (Exception ex) {
            System.out.println("Gebe de agregar libreria");
        }
       Jflex v1 = new Jflex();
       v1.setVisible(true);
    }
    
}
