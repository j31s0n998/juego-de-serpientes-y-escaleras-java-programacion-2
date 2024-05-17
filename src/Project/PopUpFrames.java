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
import java.awt.event.ComponentListener;
import javax.swing.*;

/**
 *
 * @author Ezio Auditore
 */
public class PopUpFrames
{
        // Se definen varios componentes como JFrames, JPanel, JLabels y JButtons para mostrar ventanas emergentes y su contenido.
  
    static JFrame popup1=new JFrame();
    static JFrame popup2=new JFrame();
    static JFrame popupWin=new JFrame();
    static JPanel update=new JPanel();
    static JLabel ladders=new JLabel();
    static JLabel plyrPOs=new JLabel();
    static JLabel compPOs=new JLabel();
    static JLabel snakes=new JLabel();
    static JLabel win=new JLabel();
    static JButton ok=new JButton("Okay");
    static JButton back=new JButton("volver al menu");
    static JLabel move=new JLabel();
    static JLabel plyr3pos=new JLabel();
    static JLabel plyr4pos=new JLabel();

       // Método para mostrar la ventana emergente de escaleras (ladders).
   
    static void showL()
    {
        GameWindow.frm.setEnabled(false);
        popup1.setBounds(250,270,300,200);
        popup1.setLayout(null);
        move.setAlignmentX(SwingConstants.CENTER);
        ladders.setAlignmentX(SwingConstants.CENTER);

//      ladders.setIcon(new ImageIcon(im.getClass().getResource("")));
        ImageIcon im=new ImageIcon(image.class.getResource("ladder.png"));
        ladders.setIcon(im);
        ladders.setLayout(null);
        ladders.setText("Ladders");
        ladders.setFont(new Font("Rockwell", 1, 32));
        ladders.setBounds(0,0,300,200);
        move.setBounds(0,10,250,130);
        move.setForeground(Color.red);
        move.setFont(new Font("Rockwell", 1, 32));
        ok.setBounds(100,120,100,30);
        ok.setBackground(new Color(255,255,204));

        popup1.add(ladders);
        ladders.add(move);
        ladders.add(ok);

        popup1.show();
        popup1.setLocationRelativeTo(GameWindow.frm);
        ok();
    }
    
    // Método similar al anterior para mostrar la ventana emergente de serpientes (snakes).
   
    static void showS()
    {

        GameWindow.frm.setEnabled(false);
        popup2.setBounds(250,270,300,200);
        popup2.setLayout(null);
        snakes.setAlignmentX(SwingConstants.CENTER);
        move.setAlignmentX(SwingConstants.CENTER);
        ImageIcon im=new ImageIcon(image.class.getResource("snake.png"));
        snakes.setIcon(im);
        snakes.setText("Snakes");
        snakes.setFont(new Font("Rockwell", 1, 32));
        snakes.setBounds(0,0,300,200);
        move.setBounds(0,10,250,130);
        move.setForeground(Color.red);
        move.setFont(new Font("Rockwell", 1, 32));
        ok.setBounds(100,120,100,30);

        ok.setBackground(new Color(255,255,204));
        snakes.add(ok);
        snakes.add(move);
        popup2.add(snakes);
        popup2.show();
        popup2.setLocationRelativeTo(GameWindow.frm);
        ok();
    }
// Método para gestionar el botón "Ok" de las ventanas emergentes.
    static void ok()
    {
        ok.addActionListener(new ActionListener()
        {
// Se agrega un ActionListener al botón "ok".
            @Override
            public void actionPerformed(ActionEvent e)
            {
                 // Se realizan diferentes acciones dependiendo del estado del juego y de los jugadores.
           // Luego, se vuelve a activar la ventana principal del juego y se cierran las ventanas emergentes.
            
                int x1,y1,x2,y2,x3,y3;
                switch (GameWindow.opp)
                {
                case 1:
                    if(GameWindow.turn==false)
                    {
                        x1=position.specialX(position.pos);
                        y1=position.specialY(position.pos);
                        GameWindow.pawn1.setBounds(x1,y1,50,50);
                    }
                    else
                    {
                        x2=position.specialX(position.pos1);
                        y2=position.specialY(position.pos1);
                        GameWindow.pawn2.setBounds(x2,y2,50,50);
                    }
                    break;
                case 0:
                    switch(GameWindow.plyrNum)
                    {
                    case 3:
                        if(GameWindow.turn_of_player==2)
                        {
                            GameWindow.pawn1.setBounds(position.specialX(position.pos),position.specialY(position.pos),50,50);
                        }
                        else if(GameWindow.turn_of_player==3)
                        {
                            GameWindow.pawn2.setBounds(position.specialX(position.pos1),position.specialY(position.pos1),50,50);
                        }
                        else if(GameWindow.turn_of_player==1)
                        {
                            GameWindow.pawn3.setBounds(position.specialX(position.pos2),position.specialY(position.pos2),50,50);
                        }
                        break;
                    case 2:
                        if(GameWindow.turn_of_player==2)
                        {
                            GameWindow.pawn1.setBounds(position.specialX(position.pos),position.specialY(position.pos),50,50);
                        }
                        else if(GameWindow.turn_of_player==1)
                        {
                            GameWindow.pawn2.setBounds(position.specialX(position.pos2),position.specialY(position.pos2),50,50);
                        }
                        break;
                    case 4:
                        if(GameWindow.turn_of_player==2)
                        {
                            GameWindow.pawn1.setBounds(position.specialX(position.pos),position.specialY(position.pos),50,50);
                        }
                        else if(GameWindow.turn_of_player==3)
                        {
                            GameWindow.pawn2.setBounds(position.specialX(position.pos1),position.specialY(position.pos1),50,50);
                        }
                        else if(GameWindow.turn_of_player==1)
                        {
                            GameWindow.pawn4.setBounds(position.specialX(position.pos3),position.specialY(position.pos3),50,50);
                        }
                        else if(GameWindow.turn_of_player==4)
                        {
                            GameWindow.pawn3.setBounds(position.specialX(position.pos2),position.specialY(position.pos2),50,50);
                        }
                        break;


                    }
                    break;

                }

                GameWindow.frm.setEnabled(true);
                popup1.dispose();
                popup2.dispose();
            }
        });

    }
    // Método para mostrar la ventana emergente de victoria.
    static void showWin()
    {
        GameWindow.frm.setEnabled(false);
        popupWin.setBounds(190,240,445,300);
        popupWin.setBackground(new Color(255,255,204));
        popupWin.setLayout(null);
//popupWin.pack();
        win.setBounds(0,0,400,250);
        back.setBounds(40,220,300,30);
        win.setFont(new Font("Tekton Pro Ext",0,24));
        back.setFont(new Font("Tekton Pro Ext",0,24));

        popupWin.add(win);
        popupWin.add(back);

        back.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {

                win.setIcon(null);
                reset();
                GameWindow.roll.removeActionListener(GameWindow.rollAction);
                GameWindow.frm.dispose();
                popupWin.dispose();
//                Design.frm.dispose();
//        GameWindow.MainPanel.removeAll();
//                GameWindow.MainPanel.hide();
                GameWindow.MainPanel.remove(update);
                GameWindow.MainPanel.removeAll();
                Design.frm.remove(GameWindow.MainPanel);
                Design.mainMenu.show();
                Design.frm.setEnabled(true);
//                Design.frm.dispose();
                new Design();
            }
        });
        popupWin.show();
    }
 // Método para mostrar una actualización en el juego (posiciones de los jugadores, etc.).
    void showUpdate()
    {

        update.setOpaque(false);
        update.setLayout(null);
        GameWindow.MainPanel.add(update);
        update.setBounds(500,440,300,170);
        plyrPOs.setBounds(30,0,200,50);
        compPOs.setBounds(150,0,200,50);
        plyr3pos.setBounds(30,70,200,50);
        plyr4pos.setBounds(150,70,200,50);

        plyrPOs.setFont(new Font("Showcard Gothic",0,36));
        compPOs.setFont(new Font("Showcard Gothic",0,36));
        plyr3pos.setFont(new Font("Showcard Gothic",0,36));
        plyr4pos.setFont(new Font("Showcard Gothic",0,36));


        plyrPOs.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn1.png")));
        compPOs.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn2.png")));
        plyr3pos.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn3.png")));
        plyr4pos.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn4.png")));


        if(GameWindow.opp==0 && GameWindow.plyrNum!=2)
            update.add(plyr3pos);
        if(GameWindow.opp==0 && GameWindow.plyrNum==4)
            update.add(plyr4pos);

        update.add(plyrPOs);
        update.add(compPOs);

    }
    // Este método limpia y reinicia el juego.
    static void reset()
    {
        GameWindow.MainPanel.removeAll();

        position.pos=0;
        position.pos1=0;
        position.pos2=0;
        position.pos3=0;

        GameWindow.roll.disable();
        Design.frm.dispose();
        GameWindow.start=false;
        GameWindow.start1=false;
        GameWindow.start2=false;
        GameWindow.start3=false;
        GameWindow.turn=false;

        GameWindow.pawn1.setBounds(-50,-50,50,50);
        GameWindow.pawn2.setBounds(-50,-50,50,50);
        Design.opp=0;
        GameWindow.turn_of_player=1;
        position.turn=false;
    }

}

