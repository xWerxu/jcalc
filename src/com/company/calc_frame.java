/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 *
 * @author xwerxu
 */
public class calc_frame extends javax.swing.JFrame {

    /**
     * Creates new form calc_frame
     */
    public calc_frame() {
        initComponents();
    }

    public String scr_val = "";
    public float tmp_val = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        monitor = new javax.swing.JLabel();
        percent = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        div = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        multi = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        comma = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        add = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        clearall = new javax.swing.JButton();
        left_bracket = new javax.swing.JButton();
        right_bracket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        monitor.setBackground(new java.awt.Color(192, 192, 192));
        monitor.setForeground(new java.awt.Color(55, 55, 55));
        monitor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        monitor.setOpaque(true);

        percent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        percent.setText("%");
        percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentActionPerformed(evt);
            }
        });

        num7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        num4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        div.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        div.setText("÷");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        num8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        num5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num2.setText("2");
        num2.setDefaultCapable(false);
        num2.setSelected(true);
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num0.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        num9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        multi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        multi.setText("x");
        multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiActionPerformed(evt);
            }
        });

        num6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        num3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        comma.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comma.setText(",");
        comma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commaActionPerformed(evt);
            }
        });

        minus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        equals.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        equals.setText("=");
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        clearall.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clearall.setText("ClearAll");
        clearall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearallActionPerformed(evt);
            }
        });

        left_bracket.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        left_bracket.setText("(");
        left_bracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                left_bracketActionPerformed(evt);
            }
        });

        right_bracket.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        right_bracket.setText(")");
        right_bracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                right_bracketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(num4, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                                        .addComponent(num7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(num1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(num5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(num2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(num8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(num0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(num3, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(comma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(num9, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(num6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(multi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                                        .addComponent(minus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(clearall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(left_bracket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(right_bracket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(65, 65, 65))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(monitor, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(monitor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(multi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(clearall, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(comma, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(left_bracket, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(right_bracket, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        scr_val += num1.getText();
        monitor.setText(scr_val);
    }

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        scr_val += num2.getText();
        monitor.setText(scr_val);
    }

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        scr_val += num3.getText();
        monitor.setText(scr_val);
    }

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        scr_val += num4.getText();
        monitor.setText(scr_val);
    }

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        scr_val += num5.getText();
        monitor.setText(scr_val);
    }

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        scr_val += num6.getText();
        monitor.setText(scr_val);
    }

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {
        scr_val += num7.getText();
        monitor.setText(scr_val);
    }

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        scr_val += num8.getText();
        monitor.setText(scr_val);
    }

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        scr_val += num9.getText();
        monitor.setText(scr_val);
    }

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        scr_val += num0.getText();
        monitor.setText(scr_val);
    }

    private void commaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        scr_val += comma.getText();
        monitor.setText(scr_val);

    }


    private void percentActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        scr_val += " " + percent.getText() + " ";
        monitor.setText(scr_val);
    }


    private void divActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        scr_val += " " + div.getText() + " ";
        monitor.setText(scr_val);
    }


    private void multiActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        scr_val += " " + multi.getText() + " ";
        monitor.setText(scr_val);
    }


    private void minusActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        scr_val += " " + minus.getText() + " ";
        monitor.setText(scr_val);
    }

    private void addActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        scr_val += " " + add.getText() + " ";
        monitor.setText(scr_val);
    }

    private void left_bracketActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        scr_val += " " + left_bracket.getText() + " ";
        monitor.setText(scr_val);
    }

    private void right_bracketActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        scr_val += " " + right_bracket.getText() + " ";
        monitor.setText(scr_val);
    }

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void clearallActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }



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
            java.util.logging.Logger.getLogger(calc_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calc_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calc_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calc_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private javax.swing.JButton clearall;
    private javax.swing.JButton comma;
    private javax.swing.JButton div;
    private javax.swing.JButton equals;
    private javax.swing.JButton left_bracket;
    private javax.swing.JButton minus;
    private javax.swing.JLabel monitor;
    private javax.swing.JButton multi;
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
    private javax.swing.JButton percent;
    private javax.swing.JButton right_bracket;
    // End of variables declaration
}
