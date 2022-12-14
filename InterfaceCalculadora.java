/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProjetoCalculadora;

import java.awt.Color;
import java.text.DecimalFormat;

/**
 *
 * @author Pichau
 */
public class InterfaceCalculadora extends javax.swing.JFrame {

    Double valor1, valor2;
    String operador;

    public InterfaceCalculadora() {
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

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        visor = new javax.swing.JTextField();
        num9 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        ponto = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        divisao = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        subtracao = new javax.swing.JButton();
        soma = new javax.swing.JButton();
        multiplicacao = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        apagar = new javax.swing.JButton();
        visorSup = new javax.swing.JTextField();

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setText("jTextField1");

        jButton1.setText("jButton1");

        jButton11.setText("jButton2");

        jButton14.setText("jButton2");

        jButton17.setText("jButton2");

        jButton19.setText("jButton2");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        visor.setBackground(new java.awt.Color(0, 0, 0));
        visor.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        visor.setForeground(new java.awt.Color(102, 255, 0));
        visor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        visor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visorActionPerformed(evt);
            }
        });

        num9.setBackground(new java.awt.Color(0, 51, 102));
        num9.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        num9.setForeground(new java.awt.Color(255, 255, 255));
        num9.setText("9");
        num9.setBorder(null);
        num9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num9MouseClicked(evt);
            }
        });

        num7.setBackground(new java.awt.Color(0, 51, 102));
        num7.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        num7.setForeground(new java.awt.Color(255, 255, 255));
        num7.setText("7");
        num7.setBorder(null);
        num7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        num7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num7MouseClicked(evt);
            }
        });

        num8.setBackground(new java.awt.Color(0, 51, 102));
        num8.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        num8.setForeground(new java.awt.Color(255, 255, 255));
        num8.setText("8");
        num8.setBorder(null);
        num8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num8MouseClicked(evt);
            }
        });

        num4.setBackground(new java.awt.Color(0, 51, 102));
        num4.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        num4.setForeground(new java.awt.Color(255, 255, 255));
        num4.setText("4");
        num4.setBorder(null);
        num4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num4MouseClicked(evt);
            }
        });

        num5.setBackground(new java.awt.Color(0, 51, 102));
        num5.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        num5.setForeground(new java.awt.Color(255, 255, 255));
        num5.setText("5");
        num5.setBorder(null);
        num5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num5MouseClicked(evt);
            }
        });

        num6.setBackground(new java.awt.Color(0, 51, 102));
        num6.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        num6.setForeground(new java.awt.Color(255, 255, 255));
        num6.setText("6");
        num6.setBorder(null);
        num6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num6MouseClicked(evt);
            }
        });
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        ponto.setBackground(new java.awt.Color(51, 51, 51));
        ponto.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        ponto.setForeground(new java.awt.Color(255, 255, 255));
        ponto.setText(".");
        ponto.setBorder(null);
        ponto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ponto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pontoMouseClicked(evt);
            }
        });

        num2.setBackground(new java.awt.Color(0, 51, 102));
        num2.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        num2.setForeground(new java.awt.Color(255, 255, 255));
        num2.setText("2");
        num2.setBorder(null);
        num2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num2MouseClicked(evt);
            }
        });
        num2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                num2KeyPressed(evt);
            }
        });

        igual.setBackground(new java.awt.Color(0, 204, 102));
        igual.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        igual.setForeground(new java.awt.Color(255, 255, 255));
        igual.setText("=");
        igual.setBorder(null);
        igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                igualMouseClicked(evt);
            }
        });

        divisao.setBackground(new java.awt.Color(51, 51, 51));
        divisao.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        divisao.setForeground(new java.awt.Color(255, 255, 255));
        divisao.setText("/");
        divisao.setBorder(null);
        divisao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divisaoMouseClicked(evt);
            }
        });

        num0.setBackground(new java.awt.Color(0, 51, 102));
        num0.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        num0.setForeground(new java.awt.Color(255, 255, 255));
        num0.setText("0");
        num0.setBorder(null);
        num0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num0MouseClicked(evt);
            }
        });
        num0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                num0KeyPressed(evt);
            }
        });

        subtracao.setBackground(new java.awt.Color(51, 51, 51));
        subtracao.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        subtracao.setForeground(new java.awt.Color(255, 255, 255));
        subtracao.setText("-");
        subtracao.setBorder(null);
        subtracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subtracaoMouseClicked(evt);
            }
        });

        soma.setBackground(new java.awt.Color(51, 51, 51));
        soma.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        soma.setForeground(new java.awt.Color(255, 255, 255));
        soma.setText("+");
        soma.setBorder(null);
        soma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                somaMouseClicked(evt);
            }
        });
        soma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                somaKeyPressed(evt);
            }
        });

        multiplicacao.setBackground(new java.awt.Color(51, 51, 51));
        multiplicacao.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        multiplicacao.setForeground(new java.awt.Color(255, 255, 255));
        multiplicacao.setText("*");
        multiplicacao.setBorder(null);
        multiplicacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        multiplicacao.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        multiplicacao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        multiplicacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplicacaoMouseClicked(evt);
            }
        });

        num3.setBackground(new java.awt.Color(0, 51, 102));
        num3.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        num3.setForeground(new java.awt.Color(255, 255, 255));
        num3.setText("3");
        num3.setBorder(null);
        num3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num3MouseClicked(evt);
            }
        });

        num1.setBackground(new java.awt.Color(0, 51, 102));
        num1.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        num1.setForeground(new java.awt.Color(255, 255, 255));
        num1.setText("1");
        num1.setBorder(null);
        num1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1MouseClicked(evt);
            }
        });
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        apagar.setBackground(new java.awt.Color(51, 51, 51));
        apagar.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        apagar.setForeground(new java.awt.Color(255, 255, 255));
        apagar.setText("CE");
        apagar.setBorder(null);
        apagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apagarMouseClicked(evt);
            }
        });

        visorSup.setBackground(new java.awt.Color(0, 0, 0));
        visorSup.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        visorSup.setForeground(new java.awt.Color(255, 255, 255));
        visorSup.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        visorSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visorSupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(visor)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ponto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num4, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(num7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(num0, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(num8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(num3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(divisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subtracao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(multiplicacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(igual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(visorSup)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(visorSup, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(num7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soma, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num6ActionPerformed

    private void visorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visorActionPerformed

    }//GEN-LAST:event_visorActionPerformed

    private void num7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num7MouseClicked
    visor.setText(visor.getText() + "7");

    }//GEN-LAST:event_num7MouseClicked

    private void num8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num8MouseClicked
    visor.setText(visor.getText() + "8");
    }//GEN-LAST:event_num8MouseClicked

    private void num9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num9MouseClicked
    visor.setText(visor.getText() + "9");
    }//GEN-LAST:event_num9MouseClicked

    private void num4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num4MouseClicked
    visor.setText(visor.getText() + "4");
    }//GEN-LAST:event_num4MouseClicked

    private void num5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num5MouseClicked
    visor.setText(visor.getText() + "5");
    }//GEN-LAST:event_num5MouseClicked

    private void num6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num6MouseClicked
    visor.setText(visor.getText() + "6");
    }//GEN-LAST:event_num6MouseClicked

    private void num1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1MouseClicked
    visor.setText(visor.getText() + "1");
    }//GEN-LAST:event_num1MouseClicked

    private void num2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num2MouseClicked
    visor.setText(visor.getText() + "2");
    }//GEN-LAST:event_num2MouseClicked

    private void num3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num3MouseClicked
    visor.setText(visor.getText() + "3");
    }//GEN-LAST:event_num3MouseClicked

    private void pontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pontoMouseClicked
    visor.setText(visor.getText() + ".");

    }//GEN-LAST:event_pontoMouseClicked

    private void num0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num0MouseClicked
    visor.setText(visor.getText() + "0");
    }//GEN-LAST:event_num0MouseClicked

    private void apagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apagarMouseClicked
        valor1 = null;
        valor2 = null;
        visorSup.setText(" ");
        visor.setText(" ");
    }//GEN-LAST:event_apagarMouseClicked

    private void divisaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisaoMouseClicked
        valor1 = Double.parseDouble(visor.getText());
        visor.setText(visor.getText() + "/");
        visor.setText("");
        operador = "/";
    }//GEN-LAST:event_divisaoMouseClicked

    private void multiplicacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplicacaoMouseClicked
        valor1 = Double.parseDouble(visor.getText());
        visor.setText(visor.getText() + "*");
        visor.setText("");
        operador = "*";
    }//GEN-LAST:event_multiplicacaoMouseClicked

    private void subtracaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtracaoMouseClicked
        valor1 = Double.parseDouble(visor.getText());
        visor.setText(visor.getText() + "-");
        visor.setText("");
        operador = "-";
    }//GEN-LAST:event_subtracaoMouseClicked

    private void somaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_somaMouseClicked
        valor1 = Double.parseDouble(visor.getText());
        visor.setText(visor.getText() + "+");
        visor.setText("");
        operador = "+";


    }//GEN-LAST:event_somaMouseClicked

    private void igualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_igualMouseClicked
        valor2 = Double.parseDouble(visor.getText());

        if (operador == "+") {
            visor.setText(String.valueOf(valor1 + valor2));
        } else if (operador == "-") {
            visor.setText(String.valueOf(valor1 - valor2));
        } else if (operador == "*") {
            visor.setText(String.valueOf(valor1 * valor2));
        } else if (operador == "/") {
            visor.setText(String.valueOf(valor1 / valor2));
        }

        visorSup.setText(String.valueOf(valor1 + " " + operador + " " + valor2) 
                + " = ");

    }//GEN-LAST:event_igualMouseClicked


    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num1ActionPerformed

    private void visorSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visorSupActionPerformed

    }//GEN-LAST:event_visorSupActionPerformed

    private void num0KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num0KeyPressed
        
    }//GEN-LAST:event_num0KeyPressed

    private void somaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_somaKeyPressed
       
    }//GEN-LAST:event_somaKeyPressed

    private void num2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num2KeyPressed
        
    }//GEN-LAST:event_num2KeyPressed

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
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagar;
    private javax.swing.JButton divisao;
    private javax.swing.JButton igual;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton multiplicacao;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JButton ponto;
    private javax.swing.JButton soma;
    private javax.swing.JButton subtracao;
    private javax.swing.JTextField visor;
    private javax.swing.JTextField visorSup;
    // End of variables declaration//GEN-END:variables

}
