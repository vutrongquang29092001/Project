/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project__i.tuan34.tuan3;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import project__i.tuan31.Bai_6;

/**
 *
 * @author Admin
 */
public class Bai6 extends javax.swing.JPanel {

    public Bai6() {
        initComponents();
        setUp();

        jButton1.addActionListener((e) -> {
             
          handleJTextFiedlSetText();

        });
    }

    public void setUp() {
        jLabel2.setText("Nhập dãy N: ");
        jLabel5.setText("Kết quả: ");
        jLabel1.setText("Phần tử là USTC");
        jLabel3.setText("của phần tử ");
        jButton1.setText("OK");
        jTextField1.setText("");
        
        jLabel2.setBorder(new LineBorder(Color.BLACK));
        jLabel5.setBorder(new LineBorder(Color.BLACK));
        jLabel1.setBorder(new LineBorder(Color.BLACK));
        jLabel3.setBorder(new LineBorder(Color.BLACK));

        jPanel5.removeAll();
        jPanel6.removeAll();
        
        jPanel5.updateUI();
        jPanel6.updateUI();
    }

    public ArrayList<Integer> handleJTextFiedlGetText() {
        ArrayList<Integer> list = new ArrayList<>();

        String[] s = jTextField1.getText().split(" ");

        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("") == true) {
                continue;
            } else {
                list.add(Integer.parseInt(s[i]));
            }
        }
        return list;
    }

    public void handleJTextFiedlSetText() {

        ArrayList<ArrayList<Integer>> l = new Bai_6().bai_6(handleJTextFiedlGetText());

        jPanel5.setLayout(null);
        jPanel6.setLayout(null);

        int e = 0;

        for (int z = 0; z < l.size(); z++) {
            JLabel temp = new JLabel();

            int W = 115;
            int H = 25;
            int X = 10;
            int Y = 5 * z + 25 * z;

            if (l.get(z).size() == 1) {
                e++;
                continue;

            } else {
                Y = 5 * (z - e) + 25 * (z - e);

                temp.setText(l.get(z) + "");
                temp.setBorder(new LineBorder(Color.WHITE));

                jPanel6.add(temp);
                temp.setBounds(X, Y, W, H);
                jPanel6.updateUI();
            }

            JLabel t = new JLabel();
            W = 50;
            H = 25;
            Y = 5 * (z - e) + 25 * (z - e);

            t.setText(l.get(z).get(0) + "");
            t.setBorder(new LineBorder(Color.WHITE));

            jPanel5.add(t);
            t.setBounds(X, Y, W, H);
            jPanel5.updateUI();

        }

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
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 312, 100, 40);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 100, 350);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(null);

        jPanel3.setLayout(null);

        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(0, 0, 325, 50);
        jPanel3.add(jTextField1);
        jTextField1.setBounds(0, 50, 325, 25);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 325, 350);

        jPanel4.setLayout(null);

        jLabel5.setText("jLabel5");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(0, 0, 325, 25);

        jLabel1.setText("jLabel1");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(0, 25, 164, 25);

        jLabel3.setText("jLabel3");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(164, 25, 160, 25);

        jPanel5.setLayout(null);
        jPanel4.add(jPanel5);
        jPanel5.setBounds(0, 50, 164, 300);

        jPanel6.setLayout(null);
        jPanel4.add(jPanel6);
        jPanel6.setBounds(164, 50, 160, 300);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(325, 0, 325, 350);

        add(jPanel2);
        jPanel2.setBounds(100, 0, 650, 350);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}