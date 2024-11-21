import javax.swing.JOptionPane;
public class SolicitarBeca {
    public static void main(String[] args) {
       String nombre;
       String semestre;
       short edad;
       nombre = JOptionPane.showInputDialog("Escribe tu nombre");
       edad = Short.parseShort(JOptionPane.showInputDialog("Igresa tu edad"));
       if (edad<18){
           JOptionPane.showMessageDialog(null,"No tienes la edad suficiente para solicitar esta beca");
           }else if (edad>=18 && edad<=22){
                JOptionPane.showMessageDialog(null, "Cuentas con la edad suficiente para solicitar la beca");
                semestre = JOptionPane.showInputDialog("Para concluir ingresa el semestre que cursas");
                JOptionPane.showMessageDialog(null,"Registro exitoso");
       }else{
            JOptionPane.showMessageDialog(null,"No tienes la edad adecuada para solicitar esta beca");
       }
    }
    
}
