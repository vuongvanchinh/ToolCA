/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmt;


/**
 *
 * @author Dell
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        bit = new javax.swing.JTextField();
        bit1 = new javax.swing.JTextField();
        bit2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        content1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        content2 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        content3 = new javax.swing.JTextPane();
        numberToBit = new javax.swing.JButton();
        bitToNumber = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nhập số đổi bit");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nhập bit đổi số");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Cộng trừ nhân chia bit");

        number.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        number.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhập số", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N

        bit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bit.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhập bit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 204, 204))); // NOI18N

        bit1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bit1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhập số hạng 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N

        bit2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bit2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhập số hạng 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        bit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bit2ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(content1);

        jScrollPane2.setViewportView(content2);

        jScrollPane3.setViewportView(content3);

        numberToBit.setText("Tính");
        numberToBit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberToBitActionPerformed(evt);
            }
        });

        bitToNumber.setText("Tính");
        bitToNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitToNumberActionPerformed(evt);
            }
        });

        addBtn.setText("Tính");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(bit)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bitToNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addBtn)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(bit2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bit1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(numberToBit))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bit1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bit2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBtn)
                    .addComponent(bitToNumber))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numberToBit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numberToBitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberToBitActionPerformed
        // TO DO add your handling code here:
        try {
            double input = Double.parseDouble(number.getText().trim());
            StringBuilder output = new StringBuilder();
            int integer = (int) input;
            double decimal = input - integer;
            System.out.println(decimal);
            System.out.println(integer);
            String binary;
            binary = Integer.toBinaryString(Math.abs(integer));
            binary += decimalBinary(Math.abs(decimal));
            output.append(String.format("Số %f có biểu diễn nhị phân: %s" + "\n",Math.abs(input), binary));
            if (input < 0) { // so am
                // dao bit 
                String dao = binary.replace("0", "2").replace("1", "0");
                String cb1 = dao.replace("2", "1");
                String cb2 = addBinary(cb1, "1");
                output.append(String.format("%f: đảo bit: %s" + "\n",input, cb1));
                if (decimal == 0) { // so nguyen;
                    output.append(String.format("%f chuan bu 1: %s" +"\n", input, cb1));
                    output.append(String.format("%f dao bit cong 1 chuan bu 2: %s" + "\n", input, cb2));
                } else { // neu la so thuc.
                    output.append(String.format("%f chuan so thuc dau phay tinh:<dao bit + 1> %s" + "\n",input,cb2));
                    // chuan so thuc dau phay dong do chinh xac don.
                    output.append(String.format("%f chuan so thuc dau phay dong single precision: %s" +"\n",
                            input, convertFloat(input, 8, 23)));           
                    output.append(String.format("%f chuan so thuc dau phay dong double precision: %s" +"\n",
                        input,convertFloat(input, 11, 52)));
                }
            } else {
                output.append(String.format("%f so duong => cb1 = cb2 : %s" +"\n",input,binary));
                if (decimal != 0) {
                    output.append(String.format("%f chuan so thuc dau phay dong single precision: %s" +"\n",
                                        input, convertFloat(input, 8, 23)));           
                    output.append(String.format("%f chuan so thuc dau phay dong double precision: %s" +"\n",
                                        input,convertFloat(input, 11, 52)));
                }
            }
            content1.setText(output.toString());
           
        } catch (Exception e) {
            //TO DO: handle exception
            e.printStackTrace();
        }
    }//GEN-LAST:event_numberToBitActionPerformed

    private void bitToNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bitToNumberActionPerformed
        // TODO add your handling code here:
        try {
            String input = bit.getText();
            String[] binary = new String[2];
            int position = input.indexOf(".");
            if (position > -1) {
                binary[0] = input.substring(0, position);
                binary[1] = input.substring(position + 1); 
            } else {
                binary[0] = input;
                binary[1] = "";
            }
            System.out.println(binary[0]);
            int integer = Integer.parseInt(binary[0], 2);  
            
            double decimal = 0;
            if (binary.length == 2) {
                for (int i = 0; i < binary[1].length(); i++) {
                    decimal += Math.pow(0.5, i + 1);
                }
            }
            
            double result = integer + decimal;
            content2.setText(result + "");
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }//GEN-LAST:event_bitToNumberActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TO DO add your handling code here:
        try {
            String input1 = bit1.getText();
            String input2 = bit2.getText();
            StringBuilder result = new StringBuilder();
            result.append(String.format("%s + %s = %s" +"\n", input1, input2, addBinary(input1, input2)));
            result.append(String.format("%s x %s = %s" +"\n", input1, input2, multiplyBinary(input1, input2)));
            
            content3.setText(result.toString());
        } catch (Exception e) {
            //TO DO: handle exception
            e.printStackTrace();
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void bit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bit2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bit2ActionPerformed

    /**
     * 
     * @param input số cần xử lý
     * @param exp số chữ số biểu diễn của exp vd: độ chính xác đơn là: 8.
     * @param decimal số chữ số đằng sau dấu phẩy ví dụ độ chính xác đơn là 23.
     * @return chuoi.
     */
    static String convertFloat(double input, int numberExp, int numberDecimal) {
        StringBuilder result = new StringBuilder();
        result.append((input > 0)? "0 | " : "1 | ");// sign;

        int integer =(int) input;
        double decimal = Math.abs(input - integer);
        System.out.println("decimal " + decimal);

        String real = Integer.toBinaryString(Math.abs(integer));
        String ima = decimalBinary(decimal).substring(1);// ao;
        System.out.println("ima " + ima);
        int mu = real.length() - 1;
        mu += (numberExp == 8) ? 127 : 1023;
        System.out.println("Exp: " + mu);

        String exp = Integer.toBinaryString(mu); //exp;
        String afterPoint = real.substring(1) + ima;

        for (int i = 0; i < numberExp - exp.length(); i++) {
            result.append("0");
        }
        result.append(exp);
        result.append(" | ");
        result.append(afterPoint);
        for (int i = 0; i < numberDecimal - afterPoint.length(); i++) {
            result.append("0");
        }
        return result.toString();
    }

    static String decimalBinary(double num) 
    { 
        // Check Number is Between 0 to 1 or Not 
        if (num >= 1 || num <= 0) 
            return ""; 
  
        StringBuilder binary = new StringBuilder(); 
        binary.append("."); 
        while (num > 0) 
        { 
            /* Setting a limit on length: 32 characters, 
               If the number cannot be represented 
               accurately in binary with at most 32 
               character  */
            if (binary.length() >= 4) 
                return binary.toString();
  
            // Multiply by 2 in num to check it 1 or 0 
            double r = num * 2; 
            if (r >= 1) 
            { 
                binary.append(1); 
                num = r - 1; 
            } 
            else
            { 
                binary.append(0); 
                num = r; 
            } 
        } 
        return binary.toString(); 
    }
    static String multiplyBinary(String a, String b) {
        String kq = "0";
        String temp;
        int lb = b.length();
        for (int i = 0; i < lb; i++) {
            if (b.charAt(lb -1 -i)  =='1') {
                temp = a;
                for (int j = 0; j < i; j++) {
                    temp += "0";
                }
                kq = addBinary(kq, temp);
            }
        }
        return kq;
    } 

    static String addBinary(String o1, String b) 
    { 
        // Initialize result 
        String result = "";  
        String a = o1.replace(".", "");
        // Initialize digit sum 
        int s = 0;          
  
        // Traverse both strings starting  
        // from last characters 
        int i = a.length() - 1, j = b.length() - 1; 
        while (i >= 0 || j >= 0 || s == 1) 
        {     
            // if (i > 0 && a.charAt(i) == '.'){
            //     i --;
            //     continue;
            // } 
            // Com put sum of last  
            // digits and carry 
            s += ((i >= 0)? a.charAt(i) - '0': 0); 
            s += ((j >= 0)? b.charAt(j) - '0': 0); 
  
            // If current digit sum is  
            // 1 or 3, add 1 to result 
            result = (char)(s % 2 + '0') + result; 
  
            // Compute carry 
            s /= 2; 
  
            // Move to next digits 
            i--; j--;

            
            
        } 
          
    return result; 
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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
                //System.out.println(addBinary("1111", "1"));
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField bit;
    private javax.swing.JTextField bit1;
    private javax.swing.JTextField bit2;
    private javax.swing.JButton bitToNumber;
    private javax.swing.JTextPane content1;
    private javax.swing.JTextPane content2;
    private javax.swing.JTextPane content3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField number;
    private javax.swing.JButton numberToBit;
    // End of variables declaration//GEN-END:variables
}
