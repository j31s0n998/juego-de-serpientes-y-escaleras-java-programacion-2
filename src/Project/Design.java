/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import images.image;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author Jeison
 */
public class Design {
    // Variables estáticas para el estado del juego y componentes de la interfaz

    static int plyr = 0;
    static JFrame frm = new JFrame();
    static JPanel mainMenu = new JPanel();
    static int opp;
    static int diff;

    // Getter y setter para el panel del menú principal
    public JPanel getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(JPanel mainMenu) {
        this.mainMenu = mainMenu;
    }

    public static JFrame getFrm() {
        return frm;
    }

    public void setFrm(JFrame frm) {
        this.frm = frm;
    }
    // Getter y setter para el JFrame principal

    public static int getPlyr() {
        return plyr;
    }

    // Constructor de la clase Design
    Design() {
        // Variables locales no utilizadas en el constructor actual

        int i, j, k;
        
// Configuración del JFrame
        frm.setBackground(Color.black);
        frm.show();
        frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
        frm.setBounds(0, 0, 800, 630);
        frm.setResizable(false);
        
// Configuración del panel del menú principal
        final JPanel mainMenu = new JPanel();
        mainMenu.setBounds(0, 0, 800, 650);
        mainMenu.setLayout(null);
        mainMenu.setBackground(Color.DARK_GRAY);
        
// Imagen de fondo del menú principal
        final JLabel background = new JLabel(new ImageIcon(this.getClass().getResource("/images/mainMenu.png")));
        background.setBounds(0, -30, 800, 650);
        background.setLayout(null);
        mainMenu.add(background);

        // Botones del menú principal
        JButton multi = new JButton("Multiplayer");
        JButton option = new JButton("Help");
        JButton exit = new JButton("Exit");

        option.setBounds(0, 420, 262, 70);
        multi.setBounds(540, 320, 250, 70);
        exit.setBounds(540, 420, 250, 70);

        // Los textos de los botones se establecen como vacíos
        multi.setText("");
        option.setText("");
        exit.setText("");

// Configuración de la fuente y color de los botones
        multi.setFont(new Font("Showcard Gothic", 1, 24));
        exit.setFont(new Font("Showcard Gothic", 1, 24));


        multi.setForeground(Color.red);
        option.setForeground(Color.red);
        exit.setForeground(Color.red);

// Configuración del fondo de los botones
        multi.setBackground(new Color(255, 255, 204));
        option.setBackground(new Color(255, 255, 204));
        exit.setBackground(new Color(255, 255, 204));

// Configuración de los iconos de los botones
        multi.setIcon(new ImageIcon(image.class.getResource("multi.png")));
        multi.setContentAreaFilled(false);
        option.setIcon(new ImageIcon(image.class.getResource("help.png")));
        option.setContentAreaFilled(false);
        exit.setIcon(new ImageIcon(image.class.getResource("exit.png")));
        exit.setContentAreaFilled(false);

// Títulos del menú principal
        JLabel title = new JLabel("Serpientes");
        title.setBounds(20, -30, 600, 200);
        title.setFont(new Font("Snap ITC", 1, 88));
        title.setBackground(Color.DARK_GRAY);
        title.setForeground(new Color(255, 250, 138));

        JLabel title2 = new JLabel("&");
        title2.setBounds(150, 60, 600, 200);
        title2.setFont(new Font("Snap ITC", 1, 88));
        title2.setBackground(Color.DARK_GRAY);
        title2.setForeground(Color.blue);

        JLabel title3 = new JLabel("Escaleras");
        title3.setBounds(20, 150, 600, 200);
        title3.setFont(new Font("Snap ITC", 1, 88));
        title3.setBackground(Color.DARK_GRAY);
        title3.setForeground(Color.red);


        final JPanel sub1 = new JPanel();
        sub1.setBounds(350, 350, 100, 120);
        sub1.setLayout(null);
        sub1.setBackground(Color.DARK_GRAY);
        sub1.setVisible(false);


        JButton easy = new JButton("");
        JButton mid = new JButton("");
        JButton hard = new JButton("");


        easy.setBounds(0, 5, 100, 30);
        mid.setBounds(0, 40, 100, 30);
        hard.setBounds(0, 75, 100, 30);



        easy.setBackground(new Color(255, 255, 204));
        mid.setBackground(new Color(255, 255, 204));
        hard.setBackground(new Color(255, 255, 204));

        easy.setBorder(new LineBorder(Color.black, 5));
        mid.setBorder(new LineBorder(Color.black, 5));
        hard.setBorder(new LineBorder(Color.black, 5));

        easy.setFont(new Font("Showcard Gothic", 0, 18));
        mid.setFont(new Font("Showcard Gothic", 0, 18));
        hard.setFont(new Font("Showcard Gothic", 0, 18));

        easy.setForeground(Color.red);
        mid.setForeground(Color.red);
        hard.setForeground(Color.red);

        sub1.add(easy);
        sub1.add(mid);
        sub1.add(hard);

////////----------------------------////////////////
// Submenú para seleccionar el número de jugadores
        final JPanel sub2 = new JPanel();
        sub2.setBounds(300, 350, 177, 120);
        sub2.setLayout(null);
        sub2.setBackground(Color.DARK_GRAY);
        sub2.setVisible(false);

// Botones del submenú de número de jugadores
        JButton twoP = new JButton("");
        JButton threeP = new JButton("");
        JButton fourP = new JButton("");

// Posicionamiento de los botones del submenú de número de jugadores
        twoP.setBounds(0, 5, 177, 30);
        threeP.setBounds(0, 40, 177, 30);
        fourP.setBounds(0, 75, 177, 30);

        twoP.setIcon(new ImageIcon(image.class.getResource("2p.png")));
        twoP.setContentAreaFilled(false);
        threeP.setIcon(new ImageIcon(image.class.getResource("3p.png")));
        threeP.setContentAreaFilled(false);
        fourP.setIcon(new ImageIcon(image.class.getResource("4p.png")));
        fourP.setContentAreaFilled(false);

        twoP.setBackground(new Color(255, 255, 204));
        threeP.setBackground(new Color(255, 255, 204));
        fourP.setBackground(new Color(255, 255, 204));

        twoP.setFont(new Font("Showcard Gothic", 0, 18));
        threeP.setFont(new Font("Showcard Gothic", 0, 18));
        fourP.setFont(new Font("Showcard Gothic", 0, 18));

        twoP.setForeground(Color.red);
        threeP.setForeground(Color.red);
        fourP.setForeground(Color.red);

        sub2.add(twoP);
        sub2.add(threeP);
        sub2.add(fourP);

        sub1.setOpaque(false);
        sub2.setOpaque(false);

        multi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                sub1.setVisible(false);
                sub2.setVisible(true);
            }
        });
        option.addActionListener(new ActionListener() {

            
             // Acción del botón ayuda
            @Override
            public void actionPerformed(ActionEvent e) {
                new Options().setVisible(true);
                sub1.setVisible(false);
                sub2.setVisible(false);
                frm.dispose();

            }
        });
        exit.addActionListener(new ActionListener() {

            
            // Acción del botón Exit
            @Override
            public void actionPerformed(ActionEvent e) {
                sub1.setVisible(false);
                sub2.setVisible(false);
//                frm.dispose();

                System.exit(0);
            }
        });

        easy.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
//           new GridLAy();
//
//
//                frm.dispose();
                mainMenu.setVisible(false);
                opp = 1;
                diff = 1;
                frm.dispose();
                new GameWindow();

            }
        });
        mid.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenu.setVisible(false);
                opp = 1;
                diff = 2;
                frm.dispose();
                new GameWindow();
//                GameWindow.MainPanel.show();
            }
        });
        hard.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                opp = 1;
                System.out.println("opp: " + opp);
                diff = 3;
                mainMenu.setVisible(false);
                frm.dispose();
                new GameWindow();
//                GameWindow.MainPanel.show();

            }
        });
        twoP.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                plyr = 2;
                mainMenu.setVisible(false);
                new GameWindow();
                opp = 0;
                frm.dispose();
            }
        });
        threeP.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                plyr = 3;
                GameWindow.plyr_number.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn3.png")));
                mainMenu.setVisible(false);
                new GameWindow();
                opp = 0;
                frm.dispose();
            }
        });
        
        // Acciones de los botones de jugadores
        fourP.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                plyr = 4;
                mainMenu.setVisible(false);
                new GameWindow();
                opp = 0;
                frm.dispose();
            }
        });
// Añadir elementos al background y al JFrame
        background.add(sub2);
        background.add(sub1);

        background.add(multi);
        background.add(option);
        background.add(exit);

        final JButton contact = new JButton();
        final JLabel contactT = new JLabel("Como Jugar");


        contact.addActionListener(new ActionListener() {

            
            
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        background.add(contactT);

        background.add(contact);

        frm.add(mainMenu);

    }

    public static int getOpp() {
        return opp;
    }

    public static void setOpp(int opp) {
        Design.opp = opp;
    }
// Método principal
    public static void main(String arga[]) {
        new Design();
    }
}
