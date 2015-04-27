/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sphinx4.encognn.hybrid;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.encog.Encog;
import org.encog.engine.network.activation.ActivationSigmoid;
import org.encog.ml.data.MLData;
import org.encog.ml.data.MLDataPair;
import org.encog.ml.data.MLDataSet;
import org.encog.ml.data.basic.BasicMLData;
import org.encog.ml.data.basic.BasicMLDataSet;
import org.encog.neural.networks.BasicNetwork;
import org.encog.neural.networks.layers.BasicLayer;
import org.encog.neural.networks.training.propagation.resilient.ResilientPropagation;
import org.encog.persist.EncogDirectoryPersistence;
import sphinx4.encognn.hybrid.nn.encog.recognizer.Recognizer;
import sphinx4.encognn.hybrid.util.FeatureExtractor;
import sphinx4.encognn.hybrid.util.FileProcessor;
import sphinx4.encognn.hybrid.util.Labeler;
//import sphinx4.encognn.hybrid.util.SpeechTagger;

/**
 *
 * @author Manu
 */
public class encogNeuralNet extends javax.swing.JInternalFrame {
    private int INPUT_NODES;
    private int OUTPUT_NODES;
    private List<File> files;
    double ACCURACY;
    int HIDDEN_NODES;
    boolean shutDown;
    BasicNetwork network;
File savedInstance ;
    /**
     * Creates new form encogNeuralNet
     */
    public encogNeuralNet() {
        initComponents();
        this.INPUT_NODES=13;
        this.OUTPUT_NODES=31;
        this.shutDown=false;
       this.savedInstance= new File("network.csv");
        this.network = new BasicNetwork();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblSpeaker1 = new javax.swing.JLabel();
        lblSpeaker2 = new javax.swing.JLabel();
        lblSpeaker3 = new javax.swing.JLabel();
        lblSpeaker4 = new javax.swing.JLabel();
        lblSpeaker5 = new javax.swing.JLabel();
        txtSpeaker1 = new javax.swing.JTextField();
        txtSpeaker2 = new javax.swing.JTextField();
        txtSpeaker3 = new javax.swing.JTextField();
        txtSpeaker4 = new javax.swing.JTextField();
        txtSpeaker5 = new javax.swing.JTextField();
        btnSpeaker1 = new javax.swing.JButton();
        btnSpeaker2 = new javax.swing.JButton();
        btnSpeaker3 = new javax.swing.JButton();
        btnSpeaker4 = new javax.swing.JButton();
        btnSpeaker5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtDirectoryPath = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        btnBeginTraining = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        btnclear = new javax.swing.JButton();
        btnBeginTraining1 = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        numofhnodes = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        errorSpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Encog Neural Network");
        setDesktopIcon(getDesktopIcon());
        setDoubleBuffered(true);
        setLayer(1);
        setMinimumSize(new java.awt.Dimension(960, 520));
        setName("");
        setOpaque(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Load Speakers"));

        lblSpeaker1.setText("Speech Directory 1");

        lblSpeaker2.setText("Speech Directory 2  ");

        lblSpeaker3.setText("Speech Directory 3");

        lblSpeaker4.setText("Speech Directory 4 ");

        lblSpeaker5.setText("Speech Directory 5");

        btnSpeaker1.setText("Load Speech");
        btnSpeaker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeaker1ActionPerformed(evt);
            }
        });

        btnSpeaker2.setText("Load Speech");
        btnSpeaker2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeaker2ActionPerformed(evt);
            }
        });

        btnSpeaker3.setText("Load Speech");
        btnSpeaker3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeaker3ActionPerformed(evt);
            }
        });

        btnSpeaker4.setText("Load Speech");
        btnSpeaker4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeaker4ActionPerformed(evt);
            }
        });

        btnSpeaker5.setText("Load Speech");
        btnSpeaker5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeaker5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblSpeaker5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSpeaker5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblSpeaker1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSpeaker1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSpeaker3)
                            .addComponent(lblSpeaker4)
                            .addComponent(lblSpeaker2))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSpeaker3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSpeaker2)
                            .addComponent(txtSpeaker4, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSpeaker3)
                    .addComponent(btnSpeaker1)
                    .addComponent(btnSpeaker2)
                    .addComponent(btnSpeaker4)
                    .addComponent(btnSpeaker5)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpeaker1)
                    .addComponent(txtSpeaker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSpeaker1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSpeaker2)
                    .addComponent(btnSpeaker2)
                    .addComponent(lblSpeaker2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpeaker3)
                    .addComponent(txtSpeaker3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSpeaker3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpeaker4)
                    .addComponent(txtSpeaker4)
                    .addComponent(btnSpeaker4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpeaker5)
                    .addComponent(txtSpeaker5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSpeaker5)))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Load Dictionary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));

        jButton1.setText("Load Dictionary");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Dictionary File");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDirectoryPath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(1, 1, 1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirectoryPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Train Network"));

        btnBeginTraining.setText("Train Network");
        btnBeginTraining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeginTrainingActionPerformed(evt);
            }
        });

        txtOutput.setColumns(20);
        txtOutput.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        txtOutput.setRows(5);
        txtOutput.setDoubleBuffered(true);
        jScrollPane1.setViewportView(txtOutput);
        txtOutput.getAccessibleContext().setAccessibleName("");

        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnBeginTraining1.setText("Save Network");
        btnBeginTraining1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeginTraining1ActionPerformed(evt);
            }
        });

        btnStop.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnStop.setText("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBeginTraining, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBeginTraining1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnStop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnBeginTraining, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBeginTraining1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Network Properties"));

        numofhnodes.setModel(new javax.swing.SpinnerNumberModel(13, 13, 130, 13));
        numofhnodes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("Hidden Layer Nodes");

        errorSpinner.setModel(new javax.swing.SpinnerListModel(new String[] {"0.5", "0.375", "0.25", "0.175", "0.1", "0.0875", "0.075", "0.0625", "0.05", "0.0375", "0.025", "0.0125", "0.01", "0.00875", "0.0075", "0.00625", "0.005", "0.00375", "0.0025", "0.00125", "0.001"}));
        errorSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        errorSpinner.setOpaque(false);

        jLabel3.setText("Error");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorSpinner)
                    .addComponent(numofhnodes)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numofhnodes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errorSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(5, 5, 5))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {errorSpinner, numofhnodes});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSpeaker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeaker1ActionPerformed
     
 txtSpeaker1.setText(Dialog());
    
    }//GEN-LAST:event_btnSpeaker1ActionPerformed
 
    private String Dialog(){
      String  replyString = null;
        final JFileChooser fc=new JFileChooser();
      
            fc.setDialogTitle("Open Speech Directory");
            
            fc.setDialogType(JFileChooser.OPEN_DIALOG);
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fc.setName("Select");
        
        
            int returnVal=fc.showOpenDialog(this);
            if (returnVal==1){
               
            }else{
                try {
                    //System.out.println(returnVal);
                    replyString = fc.getSelectedFile().getCanonicalFile().toString();
                } catch (IOException ex) {
                    Logger.getLogger(encogNeuralNet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return replyString;
 }
    
     private String fileDialog(){
      String  replyString = null;
     
        final JFileChooser fc=new JFileChooser();
      
            fc.setDialogTitle("Open Speech Dictionary");
            fc.setFileFilter(new FileNameExtensionFilter("Dictionary File(*.dic)", "*.dic") );
            fc.setDialogType(JFileChooser.OPEN_DIALOG);
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fc.setName("Select");
        
        
            int returnVal=fc.showOpenDialog(this);
            if (returnVal==1){
               
            }else{
                try {
                    //System.out.println(returnVal);
                    replyString = fc.getSelectedFile().getCanonicalFile().toString();
                } catch (IOException ex) {
                    Logger.getLogger(encogNeuralNet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return replyString;
 }
    
    
    private void btnSpeaker2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeaker2ActionPerformed
        // TODO add your handling code here:
        txtSpeaker2.setText(Dialog());
      
    }//GEN-LAST:event_btnSpeaker2ActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
     
     
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnSpeaker3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeaker3ActionPerformed
        // TODO add your handling code here:
       txtSpeaker3.setText(Dialog());
    }//GEN-LAST:event_btnSpeaker3ActionPerformed

    private void btnSpeaker4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeaker4ActionPerformed
        // TODO add your handling code here:
       txtSpeaker4.setText(Dialog());
    }//GEN-LAST:event_btnSpeaker4ActionPerformed

    private void btnSpeaker5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeaker5ActionPerformed
        // TODO add your handling code here:
        txtSpeaker5.setText(Dialog());
    }//GEN-LAST:event_btnSpeaker5ActionPerformed

    private void btnBeginTrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeginTrainingActionPerformed
        // TODO add your handling code here:
        btnclear.doClick();
            FileProcessor fp=new FileProcessor();
            String inputAudioFiles[]={txtSpeaker1.getText(),txtSpeaker2.getText(),txtSpeaker3.getText(),txtSpeaker4.getText(),txtSpeaker5.getText()};
      shutDown=false;
            files=fp.wavFileProcessor(inputAudioFiles);
            ACCURACY=Double.valueOf(errorSpinner.getValue().toString());
            HIDDEN_NODES=Integer.valueOf(numofhnodes.getValue().toString());
       /*
             * Recognizer rec=new Recognizer();
            rec.recognizer(files);
            * 
            */
        try {
            start();

        } catch (InterruptedException ex) {
            Logger.getLogger(encogNeuralNet.class.getName()).log(Level.SEVERE, null, ex);
        }
	
            
                    
    }//GEN-LAST:event_btnBeginTrainingActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        txtDirectoryPath.setText(fileDialog());
        initDict();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        txtOutput.selectAll();
        txtOutput.replaceSelection("");
        txtOutput.removeAll();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnBeginTraining1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeginTraining1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBeginTraining1ActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
shutDown      =true;
    }//GEN-LAST:event_btnStopActionPerformed
private void initDict(){
    Path dirPath=Paths.get(txtDirectoryPath.getText());
        //SpeechTagger sT=new SpeechTagger();
      // sT.loadDict(dirPath);
}
private void start()throws InterruptedException{
        txtOutput.setForeground(Color.BLACK);
    SwingWorker<Void,String> worker=new SwingWorker<Void,String>(){
            private String report="Completed training and testing";

           
       protected Void doInBackground() throws Exception {
               
	FeatureExtractor fe=new FeatureExtractor();
                MLDataSet trainingSet = new BasicMLDataSet();
                int i=0;
    		for (File f : files) {
    			txtOutput.append(f.getAbsolutePath()+"\n");
    		txtOutput.setCaretPosition(txtOutput.getText().length());
				List<double[]> data;
				try {
					data = fe.fileProcessor(f);
					MLData mldataIn = new BasicMLData(data.get(0));
					double[] out = new double[OUTPUT_NODES];
					//Integer index = new Integer(Labeler.getLabel(f));
                        
				
                                      //System.out.println(index);
                        
					out[i] = 1.;
                                       
					MLData mldataout = new BasicMLData(out);
					trainingSet.add(mldataIn, mldataout);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e){
                                    e.printStackTrace();
                                }
                    if (i < 30) {
                        i++;
                    } else {
                        i = 0;
                    }

    	}
    	
    		BasicNetwork network = new BasicNetwork();
    		network.addLayer(new BasicLayer(INPUT_NODES));
                
    		network.addLayer(new BasicLayer(new ActivationSigmoid(), true, HIDDEN_NODES));
    		//network.addLayer(new BasicLayer(new ActivationSigmoid(), true, 2 * NUM_IN));
    		network.addLayer(new BasicLayer(new ActivationSigmoid(), false, OUTPUT_NODES));
    		network.getStructure().finalizeStructure();
    		network.reset();
     
    		// train the neural network
    		ResilientPropagation train = new ResilientPropagation(network, trainingSet);
     
    		//System.out.println("Training Set: "+ trainingSet.size());
                txtOutput.append("**********************************************************************\n");
             txtOutput.append("Training Set: "+trainingSet.size()+" Input Nodes:"+INPUT_NODES+" Hidden Nodes:"+HIDDEN_NODES+" Output Nodes:"+OUTPUT_NODES+" Train to accuracy:"+ACCURACY+"\n");
                
                txtOutput.append("****************************************************************Begining Training\n");
                txtOutput.setCaretPosition(txtOutput.getText().length());
    		int epoch = 1;
     btnStop.setForeground(Color.red);
    		do {
    			train.iteration();
    			//System.out.println("Epoch:" + epoch + " Error-->" + train.getError());
                       txtOutput.append("Epoch:" + epoch + " Error-->" + train.getError()+"\n");
                       txtOutput.setCaretPosition(txtOutput.getText().length());
                       if (shutDown==true){
                              
                               
                            txtOutput.append("Thread Excecution terminated!");
//                     txtOutput.setSelectionStart(    txtOutput.getText().length()-31);
//                               txtOutput.setSelectionEnd(    txtOutput.getText().length());  
                            report="Terminated training and testing"; 
                 
                           Encog.getInstance().shutdown();  
                         
                           txtOutput.setForeground(Color.red);
                        return null;
                          
                       }
    			epoch++;
    		} while(train.getError() > ACCURACY);
    		train.finishTraining();
              // System.out.println("****************************************************************Begin Testing");
             
    		// test the neural network
    		int WER=0;
                OutputStream stream = null;
    		for(MLDataPair pair: trainingSet ) {
    			final MLData output = network.compute(pair.getInput());
    			//System.out.println("actual-->" + Labeler.getWord(output) + ", ideal-->" + Labeler.getWord(pair.getIdeal()));
                      txtOutput.append("\nactual--->" + Labeler.getWord(output) + ", ideal--->" + Labeler.getWord(pair.getIdeal()));
                      txtOutput.setCaretPosition(txtOutput.getText().length());
             for(double x:pair.getInputArray()){
                       //System.out.println(x);
                }
             
    		EncogDirectoryPersistence.saveObject(savedInstance, network);
     		Encog.getInstance().shutdown();  
     		btnStop.setForeground(Color.BLACK);
               
            }
        return null;
        
                
       }
            
           
            @Override
            protected void done() {
               txtOutput.append("\n****************************************************************"+report+"\n");
            }

          
            @Override
            protected void process(List<String> chunks) {
                String value=chunks.get(chunks.size()-1);
                txtOutput.append(value);
            }

        


    };
    worker.execute();
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeginTraining;
    private javax.swing.JButton btnBeginTraining1;
    private javax.swing.JButton btnSpeaker1;
    private javax.swing.JButton btnSpeaker2;
    private javax.swing.JButton btnSpeaker3;
    private javax.swing.JButton btnSpeaker4;
    private javax.swing.JButton btnSpeaker5;
    private javax.swing.JButton btnStop;
    private javax.swing.JButton btnclear;
    private javax.swing.JSpinner errorSpinner;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSpeaker1;
    private javax.swing.JLabel lblSpeaker2;
    private javax.swing.JLabel lblSpeaker3;
    private javax.swing.JLabel lblSpeaker4;
    private javax.swing.JLabel lblSpeaker5;
    private javax.swing.JSpinner numofhnodes;
    private javax.swing.JTextField txtDirectoryPath;
    public javax.swing.JTextArea txtOutput;
    private javax.swing.JTextField txtSpeaker1;
    private javax.swing.JTextField txtSpeaker2;
    private javax.swing.JTextField txtSpeaker3;
    private javax.swing.JTextField txtSpeaker4;
    private javax.swing.JTextField txtSpeaker5;
    // End of variables declaration//GEN-END:variables

}

