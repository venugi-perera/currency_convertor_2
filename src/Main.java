import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private static JLabel amountLabel;
    private static JTextField amountText;
    private static JLabel toLabel;
    private static JComboBox usdCurrency;
    private static JButton button;
    private static JLabel fromLabel;
    private static JComboBox fromrupees;

    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        amountLabel = new JLabel("Amount");
        amountLabel.setBounds(10, 20, 80, 25);
        panel.add(amountLabel);

        amountText = new JTextField(20);
        amountText.setBounds(100, 20, 165, 25);
        panel.add(amountText);

        toLabel = new JLabel("To");
        toLabel.setBounds(10, 50, 80, 25);
        panel.add(toLabel);


        String Tocurrency[] = {"USD"};
        usdCurrency = new JComboBox(Tocurrency);
        usdCurrency.setBounds(100, 50, 165, 25);
        panel.add(usdCurrency);

        fromLabel = new JLabel("From");
        fromLabel.setBounds(10, 90, 80, 25);
        panel.add(fromLabel);

        String Fromcurrency[] = {"Srilankan Rupees", "Indian Rupees"};
        fromrupees = new JComboBox(Fromcurrency);
        fromrupees.setBounds(100, 90, 165, 25);
        panel.add(fromrupees);

        button = new JButton("convert");
        button.setBounds(10, 150, 80, 25);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if ((amountText.getText().isEmpty())) {
                    JOptionPane.showMessageDialog(panel, "please enter the amount");
                } else {
                    double tot;
                    double amount = Double.parseDouble(amountText.getText());


                    String rupees = (String) fromrupees.getSelectedItem();
                    String usd = (String) usdCurrency.getSelectedItem();
                    if ((usd == "USD") && (rupees == "Indian Rupees")) {
                        tot = amount * 70.50;
                        JOptionPane.showMessageDialog(panel, "Your Amount will be " + tot);
                    } else if (((usd == "USD") && (rupees == "Srilankan Rupees"))) {
                        tot = amount * 170.50;
                        JOptionPane.showMessageDialog(panel, "Your Amount will be " + tot);
                    } else if ((amountText.getText().isEmpty())) {
                        JOptionPane.showMessageDialog(panel, "please enter the amount");
                    }

                }
            }
        });
//


        panel.add(button);
        frame.setVisible(true);
    }

}

//                if(usdCurrency.getSelectedItem() =="USD" && fromrupees.getselectedItem()== "Srilankan Rupees");
//            {
//                tot = amount * 70.50;
//            }

//            String fromRupeesVal = String.valueOf(fromrupees.getSelectedItem());
//            String usdCurrencyVal = String.valueOf(usdCurrency.getSelectedItem());
//
//                if (fromRupeesVal == "USD" && usdCurrencyVal == "Srilankan Rupees") {
//                    tot = amount * 179.50;
//                    JOptionPane.showMessageDialog(panel, "Your Amount will be " + tot);
//                } else if (fromrupees.getText() == "USD" && usdCurrency.getSelectedItem() == "Indian Rupees") {
//                    tot = amount * 70.50;
//                    JOptionPane.showMessageDialog(panel, "Your Amount will be " + tot);
//                }
