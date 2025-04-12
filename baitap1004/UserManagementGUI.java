import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class UserManagementGUI extends JFrame {
    private UserManager userManager = new UserManager();
    private JTable userTable;
    private DefaultTableModel tableModel;

    public UserManagementGUI() {
        setTitle("User Management");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        JLabel lblUsername = new JLabel("Username:");
        JTextField txtUsername = new JTextField();
        JLabel lblPassword = new JLabel("Password:");
        JPasswordField txtPassword = new JPasswordField();

        JButton btnRegister = new JButton("Register");
        JButton btnLogin = new JButton("Login");
        JButton btnExport = new JButton("Export to XML");
        JButton btnImport = new JButton("Import from XML");

        panel.add(lblUsername);
        panel.add(txtUsername);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(btnRegister);
        panel.add(btnLogin);
        panel.add(btnExport);
        panel.add(btnImport);

        tableModel = new DefaultTableModel(new String[]{"Username"}, 0);
        userTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(userTable);

        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Fill in all fields!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                userManager.registerUser(username, password);
                updateTable();
                JOptionPane.showMessageDialog(null, "User registered successfully!");
            }
        });

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());

                if (userManager.validateLogin(username, password)) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnExport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    XMLUtils.exportToXML("users.xml", userManager.getUserList());
                    JOptionPane.showMessageDialog(null, "Users exported to XML successfully!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error exporting to XML!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnImport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    List<User> importedUsers = XMLUtils.importFromXML("users.xml");
                    userManager.setUserList(importedUsers);
                    updateTable();
                    JOptionPane.showMessageDialog(null, "Users imported from XML successfully!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error importing from XML!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void updateTable() {
        tableModel.setRowCount(0);
        for (User user : userManager.getUserList()) {
            tableModel.addRow(new Object[]{user.getUsername()});
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UserManagementGUI().setVisible(true));
    }
}