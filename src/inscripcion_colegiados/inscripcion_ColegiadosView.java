package inscripcion_colegiados;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class inscripcion_ColegiadosView {
    
    private JFrame frame;
    
    private JTextField nombretxt;
    private JTextField apellidostxt;
    private JTextField DNItxt;
    private JTextField direcciontxt;
    private JTextField poblaciontxt;
    private JTextField cuentatxt;
    private JTextField titulaciontxt;
    
    private JButton btnInscribir;

    public inscripcion_ColegiadosView() {
        initialize();
    }
    
    public static void main(String[] args) {
    	inscripcion_ColegiadosView objeto = new inscripcion_ColegiadosView();
        objeto.frame.setVisible(true);
    }
    
    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Inscripcion Colegiados");
        frame.setBounds(0, 0, 400, 275);
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  		frame.getContentPane().setLayout(new MigLayout("", "[grow]", "[][][grow][][][][][][][][]"));
  		frame.setLocationRelativeTo(null);

        // Título
        JLabel tagInscripcion = new JLabel("Simulación de una inscripción de colegiado");
        frame.getContentPane().add(tagInscripcion, "span, center, wrap");

        // Nombre
        frame.getContentPane().add(new JLabel("Nombre:"));
        nombretxt = new JTextField(20);
        frame.getContentPane().add(nombretxt, "growx, wrap");

        // Apellidos
        frame.getContentPane().add(new JLabel("Apellidos:"));
        apellidostxt = new JTextField(20);
        frame.getContentPane().add(apellidostxt, "growx, wrap");

        // DNI
        frame.getContentPane().add(new JLabel("DNI:"));
        DNItxt = new JTextField(20);
        frame.getContentPane().add(DNItxt, "growx, wrap");

        // Dirección
        frame.getContentPane().add(new JLabel("Dirección:"));
        direcciontxt = new JTextField(20);
        frame.getContentPane().add(direcciontxt, "growx, wrap");

        // Población
        frame.getContentPane().add(new JLabel("Población:"));
        poblaciontxt = new JTextField(20);
        frame.getContentPane().add(poblaciontxt, "growx, wrap");

        // Cuenta
        frame.getContentPane().add(new JLabel("Cuenta:"));
        cuentatxt = new JTextField(20);
        frame.getContentPane().add(cuentatxt, "growx, wrap");

        // Titulación
        frame.getContentPane().add(new JLabel("Titulación:"));
        titulaciontxt = new JTextField(20);
        frame.getContentPane().add(titulaciontxt, "growx, wrap");

        // Botón de inscripción
        btnInscribir = new JButton("Inscribir un colegiado");
        frame.getContentPane().add(btnInscribir, "span, center, wrap");

         
    }
}