import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame Menu = new JFrame("Menu");
        Menu.setSize(430, 300);
        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu.setLocationRelativeTo(null);
        Menu.setLayout(null);

        JButton Stats = new JButton("Player Stats");
        Stats.setBounds(10, 10, 120, 30);

        JButton Transfer = new JButton("Transfer Rumours");
        Transfer.setBounds(130, 10, 140, 30);

        JButton News = new JButton("News");
        News.setBounds(270, 10, 120, 30);

        Menu.setVisible(true);
        Stats.setVisible(true);
        Transfer.setVisible(true);
        News.setVisible(true);

        Stats.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame Players = new JFrame("Players Stats");
                Players.setSize(400, 600);
                Players.setLocationRelativeTo(null);
                Players.setLayout(null);
                Players.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                JButton Name = new JButton("Name");
                Name.setBounds(10, 10, 120, 20);

                JButton Age = new JButton("Age");
                Age.setBounds(130, 10, 120, 20);

                JButton Nationality = new JButton("Nationality");
                Nationality.setBounds(250, 10, 120, 20);

                JButton Alisson = new JButton("Alisson");
                Alisson.setBounds(10, 30, 120, 20);

                JButton Age1 = new JButton("32");
                Age1.setBounds(130, 30, 120, 20);

                JButton Nationality1 = new JButton("Brazil");
                Nationality1.setBounds(250, 30, 120, 20);

                JButton Frimpong = new JButton("Frimpong");
                Frimpong.setBounds(10, 50, 120, 20);

                JButton Age2 = new JButton("24");
                Age2.setBounds(130, 50, 120, 20);

                JButton Nationality2 = new JButton("Netherlands");
                Nationality2.setBounds(250, 50, 120, 20);

                Players.add(Name);
                Players.add(Age);
                Players.add(Nationality);
                Players.add(Alisson);
                Players.add(Age1);
                Players.add(Nationality1);
                Players.add(Frimpong);
                Players.add(Age2);
                Players.add(Nationality2);

                Players.setVisible(true);
                Name.setVisible(true);
                Age.setVisible(true);
                Nationality.setVisible(true);
                Alisson.setVisible(true);
                Age1.setVisible(true);
                Nationality1.setVisible(true);
                Frimpong.setVisible(true);
                Age2.setVisible(true);
                Nationality2.setVisible(true);

            }
        });


        Menu.add(Stats);
        Menu.add(Transfer);
        Menu.add(News);

    }
}
