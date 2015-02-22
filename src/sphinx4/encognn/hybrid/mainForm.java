/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sphinx4.encognn.hybrid;

/**
 *
 * @author Manu
 */
public class mainForm extends javax.swing.JFrame {
    private boolean nnActive=false;
    private boolean ssActive=false;

    /**
     * Creates new form mainForm
     */
    public mainForm() {
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        mnuInitiate = new javax.swing.JMenu();
        mnuSphinx = new javax.swing.JMenuItem();
        mnuEncogNN = new javax.swing.JMenuItem();
        mnuSeparator = new javax.swing.JPopupMenu.Separator();
        mnuExit = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        desktopPane.setDoubleBuffered(true);

        menuBar.setBackground(new java.awt.Color(215, 228, 242));

        mnuInitiate.setMnemonic('I');
        mnuInitiate.setText("Initiate");
        mnuInitiate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInitiateActionPerformed(evt);
            }
        });

        mnuSphinx.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuSphinx.setMnemonic('S');
        mnuSphinx.setLabel("Sphinx");
        mnuSphinx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSphinxActionPerformed(evt);
            }
        });
        mnuInitiate.add(mnuSphinx);

        mnuEncogNN.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK));
        mnuEncogNN.setMnemonic('N');
        mnuEncogNN.setDoubleBuffered(true);
        mnuEncogNN.setLabel("Neural Network");
        mnuEncogNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEncogNNActionPerformed(evt);
            }
        });
        mnuInitiate.add(mnuEncogNN);
        mnuEncogNN.getAccessibleContext().setAccessibleName("");

        mnuInitiate.add(mnuSeparator);

        mnuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mnuExit.setMnemonic('x');
        mnuExit.setText("Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        mnuInitiate.add(mnuExit);

        menuBar.add(mnuInitiate);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        jMenuItem1.setText("ShowChild");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem1);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuSphinxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSphinxActionPerformed
        // TODO add your handling code here:
        if (ssActive==false){
            
        SphinxTrain sph=new SphinxTrain();
        desktopPane.add(sph);
        sph.setVisible(true);
        ssActive=true;
        }
    }//GEN-LAST:event_mnuSphinxActionPerformed

    private void mnuInitiateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInitiateActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_mnuInitiateActionPerformed

    private void mnuEncogNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEncogNNActionPerformed
        // TODO add your handling code here:
       encogNeuralNet n1=new encogNeuralNet();
       if (nnActive==false){
        
        desktopPane.add(n1);
        
        n1.setVisible(true);
        
        nnActive=true;
        
        }
       else{
        
       }
        
    }//GEN-LAST:event_mnuEncogNNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new mainForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnuEncogNN;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenu mnuInitiate;
    private javax.swing.JPopupMenu.Separator mnuSeparator;
    private javax.swing.JMenuItem mnuSphinx;
    private javax.swing.JMenuItem pasteMenuItem;
    // End of variables declaration//GEN-END:variables
}
