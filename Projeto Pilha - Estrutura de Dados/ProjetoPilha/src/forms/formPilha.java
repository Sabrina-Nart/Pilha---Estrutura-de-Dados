
package forms;

import javax.swing.JOptionPane;
import tad.Pilha;

public class formPilha extends javax.swing.JDialog {

    private Pilha pilha = new Pilha(5);

    public formPilha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textValor = new javax.swing.JTextField();
        buttonPush = new javax.swing.JButton();
        buttonPop = new javax.swing.JButton();
        buttonTop = new javax.swing.JButton();
        buttonMostraPilha = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Valor");

        textValor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        buttonPush.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonPush.setText("Push");
        buttonPush.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204)));
        buttonPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPushActionPerformed(evt);
            }
        });

        buttonPop.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonPop.setText("Pop");
        buttonPop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204)));
        buttonPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPopActionPerformed(evt);
            }
        });

        buttonTop.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonTop.setText("Top");
        buttonTop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204)));
        buttonTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTopActionPerformed(evt);
            }
        });

        buttonMostraPilha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonMostraPilha.setText("Mostrar");
        buttonMostraPilha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204)));
        buttonMostraPilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMostraPilhaActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        area.setRows(5);
        area.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204)));
        jScrollPane1.setViewportView(area);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMostraPilha, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textValor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(buttonPush, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonPop, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(buttonTop, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPush, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(buttonMostraPilha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPushActionPerformed
        if (textValor.getText().trim().isEmpty()){ 
            JOptionPane.showMessageDialog(null, "Obrigátorio");
            textValor.requestFocus();
            return;
        }
        
        area.append(pilha.pushStack(textValor.getText()) ? "Adicionado no topo \n" : "Stack OverFlow \n");
        textValor.setText("");
    }//GEN-LAST:event_buttonPushActionPerformed

    private void buttonPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPopActionPerformed

        area.append(pilha.popStack() ? "Removido\n" : "Stack UnderFlow \n");
    }//GEN-LAST:event_buttonPopActionPerformed

    private void buttonTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTopActionPerformed
        area.append(pilha.isEmptyStack() ? "A pilha está vazia \n" :  pilha.topStack() + "\n");
    }//GEN-LAST:event_buttonTopActionPerformed

    private void buttonMostraPilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMostraPilhaActionPerformed

        Pilha temp = null; 

        try {
            temp = pilha.clone();
        } catch (CloneNotSupportedException ex) {
        }

        if (pilha.isEmptyStack()){
            area.append("Pilha Vázia");
            return;
        }

        area.setText("---Conteúdo da Pilha---\n");
        while(!pilha.isEmptyStack()) {  
            area.append(pilha.topStack() + "\n"); 
            pilha.popStack();
        }
    }//GEN-LAST:event_buttonMostraPilhaActionPerformed


   
    
    
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formPilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formPilha dialog = new formPilha(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton buttonMostraPilha;
    private javax.swing.JButton buttonPop;
    private javax.swing.JButton buttonPush;
    private javax.swing.JButton buttonTop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textValor;
    // End of variables declaration//GEN-END:variables
}
