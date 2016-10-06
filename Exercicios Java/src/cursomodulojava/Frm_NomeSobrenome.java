package cursomodulojava;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Frm_NomeSobrenome extends javax.swing.JFrame
{

    ArrayList<Pessoa> ListaDePessoas = new ArrayList<>();

    public Frm_NomeSobrenome()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Txt_Sobrenome = new javax.swing.JTextField();
        Txt_Nome = new javax.swing.JTextField();
        Btm_Mesclar = new javax.swing.JButton();
        lbl_idade = new javax.swing.JLabel();
        Txt_Idade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seu primeiro nome:");

        jLabel2.setText("Seu sobre nome:");

        Btm_Mesclar.setText("Cadastrar");
        Btm_Mesclar.setToolTipText("Mesclar nomes");
        Btm_Mesclar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Btm_MesclarActionPerformed(evt);
            }
        });

        lbl_idade.setText("Sua idade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Btm_Mesclar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1)))
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Txt_Nome, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                .addComponent(Txt_Sobrenome))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_idade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(Txt_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(262, 262, 262)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Nome)
                            .addComponent(jLabel1))
                        .addGap(22, 22, 22)
                        .addComponent(Txt_Sobrenome)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_idade))
                .addGap(26, 26, 26)
                .addComponent(Btm_Mesclar)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("Lbl_Nome");
        jLabel2.getAccessibleContext().setAccessibleName("Lbl_Sobrenome");
        Txt_Sobrenome.getAccessibleContext().setAccessibleName("");
        Txt_Sobrenome.getAccessibleContext().setAccessibleDescription("");
        Txt_Nome.getAccessibleContext().setAccessibleName("");
        Txt_Nome.getAccessibleContext().setAccessibleDescription("");
        Btm_Mesclar.getAccessibleContext().setAccessibleName("");
        lbl_idade.getAccessibleContext().setAccessibleName("Sua idade:");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btm_MesclarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Btm_MesclarActionPerformed
    {//GEN-HEADEREND:event_Btm_MesclarActionPerformed
        
        if (Txt_Nome.getText().isEmpty() || Txt_Sobrenome.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane, "O usuário deve preencher o nome e o sobrenome!", "Erro", JOptionPane.ERROR_MESSAGE);
        } 
        else
        {
           //String Menssagem = Txt_Nome.getText() + " " + Txt_Sobrenome.getText();

            //JOptionPane.showMessageDialog(rootPane, Menssagem, "Nome Completo", JOptionPane.INFORMATION_MESSAGE);

            //VetorNome.add(Txt_Nome.getText());

            //System.out.println(VetorNome);
            
            Pessoa pessoaBase = new Pessoa();
            
            pessoaBase.SetNome( Txt_Nome.getText());
            pessoaBase.SetSobrenome( Txt_Sobrenome.getText()); 
            int idade  =  Integer.parseInt(Txt_Idade.getText());
            pessoaBase.SetIdade(idade);
            
            ListaDePessoas.add(pessoaBase);
            System.out.println(ListaDePessoas);
        }
    }//GEN-LAST:event_Btm_MesclarActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Frm_NomeSobrenome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btm_Mesclar;
    private javax.swing.JTextField Txt_Idade;
    private javax.swing.JTextField Txt_Nome;
    private javax.swing.JTextField Txt_Sobrenome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_idade;
    // End of variables declaration//GEN-END:variables
}
