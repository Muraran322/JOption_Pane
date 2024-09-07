
package joption_pane;
import javax.swing.JOptionPane;


public class JOption_pane {
    
    public static void main(String[] args) {
        String x =JOptionPane.showInputDialog("Enter radius ");
        int r =Integer.parseInt(x);
        double area =3.142*r*r;
        JOptionPane.showMessageDialog(null,"The Area of the circle is "+area);
        
        
    }
    
}
