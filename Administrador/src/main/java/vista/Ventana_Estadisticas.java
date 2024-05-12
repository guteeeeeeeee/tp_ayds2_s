/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;

/**
 *
 * @author ignacio
 */
public class Ventana_Estadisticas extends javax.swing.JFrame implements IVista{

    /**
     * Creates new form Ventana_Estadisticas
     */
    public Ventana_Estadisticas() {
    	setMinimumSize(new Dimension(640, 480));
    	setSize(new Dimension(640, 480));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        this.jPanel1.setBackground(new Color(153, 153, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout(0, 0));
        this.jPanel1.setLayout(new GridLayout(4, 2, 0, 0));
        
        this.personasAtendidasLabel = new JLabel("Personas atendidas");
        this.personasAtendidasLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        this.jPanel1.add(this.personasAtendidasLabel);
        
        this.cantPersonasAtendidasLabel = new JLabel("5");
        this.cantPersonasAtendidasLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        this.jPanel1.add(this.cantPersonasAtendidasLabel);
        
        this.tiempoPromedioLabel = new JLabel("Tiempo promedio por persona");
        this.tiempoPromedioLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        this.jPanel1.add(this.tiempoPromedioLabel);
        
        this.cantTPLabel = new JLabel("5:25");
        this.cantTPLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        this.jPanel1.add(this.cantTPLabel);
        
        this.tiempoLabel = new JLabel("Tiempo desde tu clockin");
        this.tiempoLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        this.jPanel1.add(this.tiempoLabel);
        
        this.cantTiempoLabel = new JLabel("6:55:34");
        this.cantTiempoLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        this.jPanel1.add(this.cantTiempoLabel);
        getContentPane().add(this.jPanel1);
        
        this.panel = new JPanel();
        this.panel.setPreferredSize(new Dimension(100, 100));
        this.panel.setMinimumSize(new Dimension(100, 100));
        this.panel.setBackground(new Color(153, 153, 255));
        getContentPane().add(this.panel, BorderLayout.SOUTH);
        
        this.actualizarButton = new JButton("Actualizar");
        this.actualizarButton.setFont(new Font("Segoe UI", Font.BOLD, 24));
        this.actualizarButton.setActionCommand("ACTUALIZAR");
        this.panel.add(this.actualizarButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Estadisticas().setVisible(true);
            }
        });
    }
    private javax.swing.JPanel jPanel1;
    private JLabel personasAtendidasLabel;
    private JLabel cantPersonasAtendidasLabel;
    private JLabel tiempoPromedioLabel;
    private JLabel cantTPLabel;
    private JLabel tiempoLabel;
    private JLabel cantTiempoLabel;
    private JPanel panel;
    private JButton actualizarButton;
    // End of variables declaration//GEN-END:variables

@Override
 	public void setActionListener(ActionListener controlador) {
		this.actualizarButton.addActionListener(controlador);
 	}

 	@Override
 	public void setWindowListener(WindowListener controlador) {
 		
 	}

 	@Override
 	public void ejecutar() {
        setTitle("Ventana Principal");
         pack();
         setVisible(true);
         setLocationRelativeTo(null);	
 	}

 	@Override
 	public void cerrarVentana() {
            setVisible(false); //Oculto la ventana
 	    dispose(); //Cierro la ventana	
 	}



 	@Override
 	public void lanzarVentanaEmergente(String mensaje) {
         JFrame jFrame = new JFrame();
         JOptionPane.showMessageDialog(jFrame, mensaje);		
 	}

	public void keyPressed(KeyEvent e) {
		
	}
	public void keyReleased(KeyEvent e) {
	}
	
	
	public void setKeyListener() {
	}

	public JLabel getPersonasAtendidasLabel() {
		return personasAtendidasLabel;
	}

	public void setPersonasAtendidasLabel(JLabel personasAtendidasLabel) {
		this.personasAtendidasLabel = personasAtendidasLabel;
	}

	public JLabel getCantPersonasAtendidasLabel() {
		return cantPersonasAtendidasLabel;
	}

	public void setCantPersonasAtendidasLabel(JLabel cantPersonasAtendidasLabel) {
		this.cantPersonasAtendidasLabel = cantPersonasAtendidasLabel;
	}

	public JLabel getTiempoPromedioLabel() {
		return tiempoPromedioLabel;
	}

	public void setTiempoPromedioLabel(JLabel tiempoPromedioLabel) {
		this.tiempoPromedioLabel = tiempoPromedioLabel;
	}

	public JLabel getCantTPLabel() {
		return cantTPLabel;
	}

	public void setCantTPLabel(JLabel cantTPLabel) {
		this.cantTPLabel = cantTPLabel;
	}

	public JLabel getTiempoLabel() {
		return tiempoLabel;
	}

	public void setTiempoLabel(JLabel tiempoLabel) {
		this.tiempoLabel = tiempoLabel;
	}

	public JLabel getCantTiempoLabel() {
		return cantTiempoLabel;
	}

	public void setCantTiempoLabel(JLabel cantTiempoLabel) {
		this.cantTiempoLabel = cantTiempoLabel;
	}
	
}
