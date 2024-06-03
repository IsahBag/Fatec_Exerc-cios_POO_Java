import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Avaliacao extends JFrame implements ActionListener
{
    JLabel     L1,L2,L3,L4;
    JButton    B1,B2;
    JTextField T1,T2,T3,T4;

    public static void main(String args[])
    {
        JFrame janela = new Avaliacao();
        janela.show();

        WindowListener x = new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        };

        janela.addWindowListener(x);
    }

    Avaliacao()
    {
        setTitle("Cálculo de conceitos finais");
        setSize(500,200);
        getContentPane().setLayout(new GridLayout(5,2));
        L1 = new JLabel("R.A.:");
        L2 = new JLabel("NOME:");
        L3 = new JLabel("NOTA DE PROVA OFICIAL:");
        L4 = new JLabel("NOTA DE AVALIAÇÃO CONTINUADA:");

        B1 = new JButton("OK");
        B1.addActionListener(this);
        B2 = new JButton("Limpar");
        B2.addActionListener(this);

        T1 = new JTextField();
        T2 = new JTextField();
        T3 = new JTextField();
        T4 = new JTextField();

        getContentPane().add(L1);
        getContentPane().add(T1);
        getContentPane().add(L2);
        getContentPane().add(T2);
        getContentPane().add(L3);
        getContentPane().add(T3);
        getContentPane().add(L4);
        getContentPane().add(T4);
        getContentPane().add(B1);
        getContentPane().add(B2);
    }

    public void actionPerformed(ActionEvent e)
    {
        double prova = 0, ac = 0, nf;
        
        if(e.getSource()==B1)
        {
            try
            {
                prova = Double.parseDouble(T3.getText());
                ac = Double.parseDouble(T4.getText());
                if(prova < 0 || prova > 7)
                {
                    JOptionPane.showMessageDialog(null,"Valor de prova inválido!");
                    T3.setText("");
                    T3.requestFocus();
                }
                if(ac < 0 || ac > 3)
                {
                    JOptionPane.showMessageDialog(null, "Valor de A.C. inválido!");
                    T4.setText("");
                    T4.requestFocus();
                }
                if((prova >= 0 && prova <= 7) && (ac >= 0 && ac <=3))
                {
                    nf = prova + ac;
                    if(nf >= 7)
                        JOptionPane.showMessageDialog(null, T2.getText() + "R.A. " + T1.getText() + " APROVADO " + " com média final " + nf);
                    else 
                        if (nf >= 4)
                            JOptionPane.showMessageDialog(null, T2.getText() + "R.A. " + T1.getText() + " de EXAME FINAL " + " com média final " + nf);
                        else
                            JOptionPane.showMessageDialog(null, T2.getText() + "R.A. " + T1.getText() + " REPROVADO " + " com média final " + nf);
                }
            }
            catch(NumberFormatException erro)
            {
                JOptionPane.showMessageDialog(null,"Erro na nota");
            }            
        }
        else
        {
            T1.setText("");
            T2.setText("");
            T3.setText("");
            T4.setText("");
        }
    }
}