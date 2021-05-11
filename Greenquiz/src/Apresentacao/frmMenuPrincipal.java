/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

import greenquiz.Quiz;

/**
 *
 * @author Gabriel
 */
public class frmMenuPrincipal extends javax.swing.JDialog
{

    /**
     * Creates new form frmMenuPrincipal
     */
    public frmMenuPrincipal(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblTítulo = new javax.swing.JLabel();
        btnJogar = new javax.swing.JButton();
        btnAjuda = new javax.swing.JButton();
        btnCreditos = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();
        btnCreditos1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Green Quiz");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        lblTítulo.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(0, 153, 0));
        lblTítulo.setText("Green Quiz");
        getContentPane().add(lblTítulo);
        lblTítulo.setBounds(280, 50, 260, 49);

        btnJogar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnJogar.setForeground(new java.awt.Color(0, 255, 0));
        btnJogar.setText("JOGAR");
        btnJogar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnJogarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJogar);
        btnJogar.setBounds(289, 180, 237, 70);

        btnAjuda.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAjuda.setForeground(new java.awt.Color(0, 255, 0));
        btnAjuda.setText("AJUDA");
        getContentPane().add(btnAjuda);
        btnAjuda.setBounds(290, 270, 237, 70);

        btnCreditos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCreditos.setForeground(new java.awt.Color(0, 255, 0));
        btnCreditos.setText("CRÉDITOS");
        btnCreditos.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCreditosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreditos);
        btnCreditos.setBounds(290, 380, 237, 70);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 800, 600);

        btnCreditos1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCreditos1.setForeground(new java.awt.Color(0, 255, 0));
        btnCreditos1.setText("CRÉDITOS");
        getContentPane().add(btnCreditos1);
        btnCreditos1.setBounds(289, 356, 237, 70);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreditosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCreditosActionPerformed
    {//GEN-HEADEREND:event_btnCreditosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreditosActionPerformed

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnJogarActionPerformed
    {//GEN-HEADEREND:event_btnJogarActionPerformed
        Quiz quiz = new Quiz();
        
    }//GEN-LAST:event_btnJogarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmMenuPrincipal dialog = new frmMenuPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnCreditos;
    private javax.swing.JButton btnCreditos1;
    private javax.swing.JButton btnJogar;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblTítulo;
    // End of variables declaration//GEN-END:variables
}
