package Login;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        this.setTitle("ventana");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    private String user = "Luisa05";
    private String pass = "admin84";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_login = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        txt_user = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Ventana"); // NOI18N

        lbl_login.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lbl_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user1.png"))); // NOI18N
        lbl_login.setName("frame"); // NOI18N

        lbl_user.setBackground(new java.awt.Color(0, 204, 204));
        lbl_user.setFont(new java.awt.Font("HelvLight", 0, 14)); // NOI18N
        lbl_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_user.setText("Usuario:");

        lbl_pass.setBackground(new java.awt.Color(0, 204, 204));
        lbl_pass.setFont(new java.awt.Font("HelvLight", 0, 14)); // NOI18N
        lbl_pass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_pass.setText("Contraseña:");

        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acceso.png"))); // NOI18N
        btn_login.setText("Iniciar Sesión");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_user)
                    .addComponent(lbl_pass))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_login)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_user)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_pass))
                .addGap(18, 18, 18)
                .addComponent(btn_login)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        if(txt_user.getText().isEmpty() || txt_pass.getText().isEmpty()){   //evaluar que los campos no esten vacios
            JOptionPane.showMessageDialog(null, "Por favor rellenar todos los campos requeridos");  //alerta
            
        }else if(txt_user.getText().equals(user) && txt_pass.getText().equals(pass)){   //verificar que coincida el user y password
            JOptionPane.showMessageDialog(null, "Bienvenido "+user+", se inició sesion correctamente"); //alerta de inicio de sesion
            txt_user.setText("");
            txt_pass.setText("");   //limpia los campos de texto
        }else{
            txt_user.setText("");
            txt_pass.setText("");
            JOptionPane.showMessageDialog(null, "Sus credenciales son incorrectas. Por favor ingresarlas correctamente");    //alerta
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
