/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project__i.tuan34.tuan4;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.BorderFactory;

import javax.swing.border.Border;

/**
 *
 * @author Admin
 */
public class Tuan32 extends javax.swing.JPanel {

    Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
    Bai1 bai1 = new Bai1();

    Bai2 bai2 = new Bai2();

    Bai3 bai3 = new Bai3();

    Bai4 bai4 = new Bai4();

    Bai5 bai5 = new Bai5();

    Bai6 bai6 = new Bai6();

    Bai7 bai7 = new Bai7();

    Bai8 bai8 = new Bai8();

    Bai9 bai9 = new Bai9();

    public Tuan32() {
        initComponents();
        setUp();
        getEx();
    }

    public void setUp() {
        jBBai1.setText("Bai1");
        jBBai2.setText("Bai2");
        jBBai3.setText("Bai3");
        jBBai4.setText("Bai4");
        jBBai5.setText("Bai5");
        jBBai6.setText("Bai6");
        jBBai7.setText("Bai7");
        jBBai8.setText("Bai8");
        jBBai9.setText("Bai9");
    }

    public void getEx() {
        jPanel3.setLayout(new CardLayout());

        CardLayout cardLayout = (CardLayout) jPanel3.getLayout();
        jPanel3.add(bai1, "bai1");
        jPanel3.add(bai2, "bai2");
        jPanel3.add(bai3, "bai3");
        jPanel3.add(bai4, "bai4");
        jPanel3.add(bai5, "bai5");
        jPanel3.add(bai6, "bai6");
        jPanel3.add(bai7, "bai7");
        jPanel3.add(bai8, "bai8");
        jPanel3.add(bai9, "bai9");

        setDeBai("bai1");
        jBBai1.addActionListener((e) -> {
            bai1.setUp();
            cardLayout.show(jPanel3, "bai1");
            setDeBai("bai1");

        });
        jBBai2.addActionListener((e) -> {
            bai2.setUp();
            cardLayout.show(jPanel3, "bai2");
            setDeBai("bai2");
        });
        jBBai3.addActionListener((e) -> {
            bai3.setUp();
            cardLayout.show(jPanel3, "bai3");
            setDeBai("bai3");
        });
        jBBai4.addActionListener((e) -> {
            bai4.setUp();
            cardLayout.show(jPanel3, "bai4");
            setDeBai("bai4");
        });
        jBBai5.addActionListener((e) -> {
            bai5.setUp();
            cardLayout.show(jPanel3, "bai5");
            setDeBai("bai5");
        });
        jBBai6.addActionListener((e) -> {
            bai6.setUp();
            cardLayout.show(jPanel3, "bai6");
            setDeBai("bai6");
        });
        jBBai7.addActionListener((e) -> {
            bai7.setUp();
            cardLayout.show(jPanel3, "bai7");
            setDeBai("bai7");
        });
        jBBai8.addActionListener((e) -> {
            bai8.setUp();
            cardLayout.show(jPanel3, "bai8");
            setDeBai("bai8");
        });
        jBBai9.addActionListener((e) -> {
            bai9.setUp();
            cardLayout.show(jPanel3, "bai9");
            setDeBai("bai9");
        });

    }

    public void setDeBai(String str) {
        jLDeBai.setBorder(border);
        if (str.equals("bai1")) {
            jLDeBai.setText("");
            String s = "\tB??i 1: Cho tr?????c 1 x??u k?? t??? l?? h??? t??n ng?????i ?????y ????? nh??ng khi nh???p c?? th??? th???a m???t s??? d???u c??ch. \n"
                    + "\t       H??y x??a ??i c??c d???u c??ch th???a v?? in ra h??? t??n ch??nh x??c";
            jLDeBai.append(s);

            jPanel2.updateUI();
        } else if (str.equals("bai2")) {
            jLDeBai.setText("B??i 2: Cho tr?????c x??u k?? t??? b???t k???. H??y ?????m xem trong x??u c?? bao nhi??u l???n xu???t hi???n x??u con ???abc???");

            jPanel2.updateUI();
        } else if (str.equals("bai3")) {
            jLDeBai.setText("B??i 3: Cho tr?????c 1 x??u k?? t??? l?? h??? t??n ng?????i ?????y ?????, h??y t??ch ra ph???n t??n c???a ng?????i n??y");
        } else if (str.equals("bai4")) {
            jLDeBai.setText("B??i 4: Cho tr?????c 1 x??u k?? t??? l?? h??? t??n ng?????i ?????y ?????, h??y t??ch ra ph???n h??? c???a ng?????i n??y");
        } else if (str.equals("bai5")) {
            jLDeBai.setText("B??i 5: Cho m???t x??u k?? t??? bao g???m to??n c??c k?? t??? 0,1. H??y bi???n ?????i x??u n??y theo c??ch 0->1, 1->0 v?? in ra k???t qu???");
        } else if (str.equals("bai6")) {
            jLDeBai.setText("B??i 6: Cho tr?????c x??u k?? t??? S, in ra x??u S1 ng?????c l???i x??u S.");

        } else if (str.equals("bai7")) {
            jLDeBai.setText("B??i 7: Cho danh s??ch h??? t??n ?????y ????? h???c sinh. H??y ?????m xem c?? bao nhi??u b???n t??n ???An???.");

        } else if (str.equals("bai8")) {
            jLDeBai.setText("B??i 8: Cho danh s??ch h??? t??n ?????y ????? h???c sinh. H??y ?????m xem c?? bao nhi??u b???n c?? ph???n ?????m l??  ???Th??????.");

        } else if (str.equals("bai9")) {
            jLDeBai.setText("B??i 9: Cho danh s??ch h??? t??n ?????y ????? h???c sinh. H??y ?????m xem c?? bao nhi??u b???n  c?? t??n b???t ?????u b???ng ch??? ???H???.");

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
        jBBai1 = new javax.swing.JButton();
        jBBai2 = new javax.swing.JButton();
        jBBai3 = new javax.swing.JButton();
        jBBai4 = new javax.swing.JButton();
        jBBai5 = new javax.swing.JButton();
        jBBai6 = new javax.swing.JButton();
        jBBai7 = new javax.swing.JButton();
        jBBai8 = new javax.swing.JButton();
        jBBai9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLDeBai = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(null);

        jBBai1.setText("jButton1");
        jPanel1.add(jBBai1);
        jBBai1.setBounds(0, 0, 100, 43);

        jBBai2.setText("jButton2");
        jPanel1.add(jBBai2);
        jBBai2.setBounds(0, 44, 100, 43);

        jBBai3.setText("jButton3");
        jPanel1.add(jBBai3);
        jBBai3.setBounds(0, 88, 100, 43);

        jBBai4.setText("jButton4");
        jPanel1.add(jBBai4);
        jBBai4.setBounds(0, 132, 100, 43);

        jBBai5.setText("jButton5");
        jPanel1.add(jBBai5);
        jBBai5.setBounds(0, 176, 100, 43);

        jBBai6.setText("jButton6");
        jPanel1.add(jBBai6);
        jBBai6.setBounds(0, 220, 100, 43);

        jBBai7.setText("jButton1");
        jPanel1.add(jBBai7);
        jBBai7.setBounds(0, 264, 100, 43);

        jBBai8.setText("jButton2");
        jPanel1.add(jBBai8);
        jBBai8.setBounds(0, 308, 100, 43);

        jBBai9.setText("jButton3");
        jPanel1.add(jBBai9);
        jBBai9.setBounds(0, 352, 100, 44);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 100, 400);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(null);

        jPanel3.setLayout(null);
        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 50, 750, 350);

        jLDeBai.setColumns(20);
        jLDeBai.setRows(5);
        jPanel2.add(jLDeBai);
        jLDeBai.setBounds(0, 0, 750, 50);

        add(jPanel2);
        jPanel2.setBounds(100, 0, 750, 400);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBai1;
    private javax.swing.JButton jBBai2;
    private javax.swing.JButton jBBai3;
    private javax.swing.JButton jBBai4;
    private javax.swing.JButton jBBai5;
    private javax.swing.JButton jBBai6;
    private javax.swing.JButton jBBai7;
    private javax.swing.JButton jBBai8;
    private javax.swing.JButton jBBai9;
    private javax.swing.JTextArea jLDeBai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
