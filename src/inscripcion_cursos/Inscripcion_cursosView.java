package inscripcion_cursos;

import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;

import net.miginfocom.swing.MigLayout;

public class Inscripcion_cursosView {
	
	private JFrame frame;
	private JTextField  JTnumero;
	private JButton btnNumero;
	private JButton btnInscripcion;
	private JComboBox<Object> lstCursos;
	private JLabel DatosPersonales;
	private JTable tabDatos;
	
	public Inscripcion_cursosView() {
		iniciate();
	}
	
     private void iniciate() {
	    	frame = new JFrame();
			frame.setTitle("Inscripción de curso");
			frame.setName("Inscripción");
			frame.setBounds(0, 0, 492, 422);
			frame.setResizable(false); // para que la ventana no pueda cambiar de tamaño 
			frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(new MigLayout("", "[grow]", "[][][grow][][][][][][][][]"));
			
			final JLabel lblinscripción;
			final JLabel lblistacursos;
			lblinscripción= new JLabel("Inscripción para un nuevo curso");
			frame.getContentPane().add(lblinscripción, "cell 0 0 3 1, center"); // texto explicativo de la ventana
			
			final JLabel IntroducirNúmero;
			IntroducirNúmero= new JLabel("Introduzca su número de colegiado:");
			frame.getContentPane().add(IntroducirNúmero, "flowx,cell 0 2");
			
			JTnumero = new JTextField ();
			JTnumero.setName("JTnumero");
			frame.getContentPane().add(JTnumero, "cell 0 2");
			JTnumero.setColumns(15);
			
			 // Agregar KeyListener para restringir la entrada y solo se pueden incluir caracteres numéricos
			JTnumero.addKeyListener(new KeyAdapter() {
	            @Override
	            public void keyTyped(KeyEvent e) { //keytyped registra el evento de teclado y llama al método
	                char c = e.getKeyChar();
	                // Permitir solo números y borrar (backspace)
	                if (!Character.isDigit(c) && c != '\b') { //verifica si el caracter introducido es un número o espacio en blanco(solo borrado)
	                    e.consume(); // Bloquear el carácter
	                }
	            }
	          
	        });
			//Este método hará una consulta con el número del colegiado al hacer enter o en su defecto tmb al hacer click en un boton
			JTnumero.addKeyListener(new KeyAdapter() {
	            @Override
	            public void keyPressed(KeyEvent e) {
	            	if(e.getKeyCode() == KeyEvent.VK_ENTER && !JTnumero.getText().isEmpty())
	            	{
	            		System.out.print("Hará algo mas adelante.....");
	                }
	            }
	          
	        });
			
		btnNumero = new JButton("Comprobar datos");
		IntroducirNúmero.setLabelFor(btnNumero);
		frame.getContentPane().add(btnNumero, "cell 1 2");
		
		lblistacursos = new JLabel("Lista de los cursos disponibles:");
		frame.getContentPane().add(lblistacursos, "cell 0 3");
		
		lstCursos = new JComboBox<>();
		frame.getContentPane().add(lstCursos, "cell 0 4,growx");
		
		JLabel lblDatoscolegiado = new JLabel("Datos personales del colegiado:");
		frame.getContentPane().add(lblDatoscolegiado, "cell 0 5");
		
		tabDatos = new JTable();
		tabDatos.setName("tabDetalle");
		tabDatos.setRowSelectionAllowed(false);
		tabDatos.setDefaultEditor(Object.class, null); //readonly
		tabDatos.setBackground(SystemColor.control);
		JScrollPane tableDetallePanel = new JScrollPane(tabDatos);
		tableDetallePanel.setMinimumSize(new Dimension(200,220));
		tableDetallePanel.setPreferredSize(new Dimension(700,220));
		frame.getContentPane().add(tableDetallePanel, "cell 0 6 2 1");
		
		btnInscripcion = new JButton("Inscribirse");
		IntroducirNúmero.setLabelFor(btnInscripcion);
		frame.getContentPane().add(btnInscripcion, "cell 1 7,alignx right");
			
	    }
     
     	
     
     
	
	
public static void main(String[] args) 
{
	Inscripcion_cursosView obj = new Inscripcion_cursosView();
	obj.frame.setVisible(true);
	
}

}
