/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Project;
import images.image;
import java.awt.*;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.LineBorder;
/**
 *
 * @author Ezio Auditore
 */
public class GameWindow
{
// Definición de variables estáticas y no estáticas
    static JFrame frm=new JFrame();
    JPanel pnl=new JPanel();
    static JPanel MainPanel=new JPanel();
    static int plyrNum; // Número de jugadores
    static int turn_of_player=1;// Turno del jugador
    static int opp;
    static int pos1,pos2,pos3,pos4; // Posiciones de los jugadores
    static JLabel noti1=new JLabel(); // Notificaciones
    static JLabel noti2=new JLabel();
    static JButton roll=new JButton("Tirar"); // Botón para tirar el dado
    static JLabel pawn2=new JLabel(); // Peones de los jugadores

    static JLabel pawn1=new JLabel(); 
    static JLabel pawn3=new JLabel();
    static JLabel pawn4=new JLabel();
    static JLabel plyr_number=new JLabel(""); // Número del jugador actual
    static JLabel plyrN=new JLabel(); // Texto informativo del juego
    static JLabel plyr=new JLabel(); // Indicador del turno del jugador
    static JLabel board=new JLabel("",SwingConstants.CENTER);  // Representación del dado

    static ActionListener rollAction; // Acción del botón roll
    static JButton backBtn=new JButton("Volver"); // Botón para volver al menú
    static int px1,py1,px2,py2,px3,py3,px4,py4; // Acción del botón roll
    static boolean start=false,start1=false,start2=false,start3=false; // Acción del botón roll
    static boolean turn = false;
    
   
    public static int getOpp()
    {
        return opp;
    }

    public static void setOpp(int opp)
    {
        GameWindow.opp = opp;
    }

    public static int getPos1()
    {
        return pos2;
    }

    public static void setPos1(int pos1)
    {
        GameWindow.pos2 = pos1;
    }

    public boolean isStart()
    {
        return start;
    }

    public void setStart(boolean start)
    {
        this.start = start;
    }

    public boolean isStart1()
    {
        return start1;
    }

    public void setStart1(boolean start1)
    {
        this.start1 = start1;
    }

    public static int getPos()
    {
        return pos1;
    }

    public static void setPos(int pos1)
    {
        GameWindow.pos1 = pos1;
    }

    public GameWindow()
    {
        plyrNum=Design.getPlyr();

        int i,j,k;
        position.pos=0;
        position.pos1=0;
        position.pos2=0;
        ////>>>>main Panel<<<///
        MainPanel.setBounds(0,0,800,600);
        MainPanel.setLayout(null);
        frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);



        backBtn.setBounds(650,570,150,40);
        backBtn.setBackground(new Color(255,255,204));
        backBtn.setBorder(new LineBorder(Color.black, 3, false));
        backBtn.setFont(new Font("SansSerif", Font.BOLD, 24));
        backBtn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/back.png")));
        backBtn.setRolloverEnabled(true);
        backBtn.setCursor(new Cursor(HAND_CURSOR));
        MainPanel.add(backBtn);

        backBtn.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                PopUpFrames.reset();
                GameWindow.roll.removeActionListener(GameWindow.rollAction);
                GameWindow.frm.dispose();
                new Design();


            }
        });

////>>>Board panel<<<<</////
        pnl.setBounds(0,0,500,500);
        pnl.setLayout(new GridBagLayout());
        pnl.setOpaque(false);
        pnl.setFont(new Font("SansSerif", Font.BOLD, 24));

        JLabel ludo=new JLabel(new ImageIcon(this.getClass().getResource("/images/snakes_and_ladders.jpg")));
        ludo.setBounds(0,0,500,500);

        GridBagConstraints grd=new GridBagConstraints();
        grd.gridx=1;
        grd.gridy=1;
        grd.fill=GridBagConstraints.BOTH;
        pnl.add(ludo);
        MainPanel.add(pnl,grd);
////>>>>Rolling board<<<<////
        final ImageIcon dice=new ImageIcon(this.getClass().getResource("/images/graphics-dice-231882.gif"));
//        final JLabel board=new JLabel(dice,SwingConstants.CENTER);
        board.setIcon(dice);
        board.setAlignmentX(SwingConstants.CENTER);
        board.setBounds(525,20,250,200);
//board.setIcon(new ImageIcon("C:\\Users\\Ezio Auditore\\Documents\\graphics-dice-231882.gif"));
//board.setAlignmentX();
        board.setBorder(new LineBorder(Color.black, 7));
        board.setBackground(Color.black);


////>>>>Roll button<<<<<//////
        roll.setBorder(new LineBorder(Color.black, 7, true));
        roll.setBackground(new Color(255,255,204));
        roll.setForeground(Color.red);
        roll.setBounds(550,250,200,100);
        roll.setFont(new Font("Showcard Gothic", Font.BOLD, 36));
        roll.setCursor(new Cursor(HAND_CURSOR));
        opp=Design.getOpp();
        System.out.println(""+opp);


        if(turn==false && opp==1)
            plyr.setText("Turno de ");
        else if(opp==0)
            plyr.setText("  Turno de     ");

        plyr.setBounds(520,350,250,100);
        plyr.setFont(new Font("Segoe UI Semilight", 1, 36));
        plyr_number.setBounds(700,350,250,100);
        plyr_number.setFont(new Font("Segoe UI Semilight", 1, 48));

        JLabel lbl=new JLabel();
        lbl.setIcon(dice);
        lbl.setBounds(0,0,100,200);


        if(opp==0)
            plyrN.setText("Numero total de jugadores "+plyrNum);
        else if(opp==1)
        {
            plyrN.setText("Player vs computer game");

        }
        plyrN.setBounds(20,510,400,40);
        plyrN.setFont(new Font("Serif",1,24));
//        roll.removeActionListener(roll.getAction());
/////>>>>>>>>Adding everything into the frame<<<<<////
        MainPanel.add(plyrN);
        MainPanel.add(plyr_number);
        MainPanel.add(plyr);

        MainPanel.add(roll);
        MainPanel.add(board);
//frm.add(pnl);
        frm.show();
//        MainPanel.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
        frm.setBounds(0, 0, 800, 650);

        MainPanel.setBackground(new Color(255,255,204));
        MainPanel.add(lbl);
        frm.add(MainPanel);
//        Design.getFrm().add(MainPanel);



        final JFrame newF=new JFrame();
        newF.setLocationRelativeTo(frm);
        newF.setBounds(250,270,300,200);
//        newF.setForeground(Color.black);
        newF.show();
        newF.setLayout(null);

        JButton ok=new JButton("OKAY!!");
        ok.setBounds(90,120,90,30);
        ok.setBackground(new Color(255,255,204));
        ok.setBorder(new LineBorder(Color.black, 2));
        newF.add(ok);

        JLabel color1=new JLabel("",SwingConstants.CENTER);
        JLabel color2=new JLabel("",SwingConstants.CENTER);
        JLabel color3=new JLabel("",SwingConstants.CENTER);
        JLabel color4=new JLabel("",SwingConstants.CENTER);


        color1.setForeground(Color.red);
        color2.setForeground(Color.BLUE);
        color3.setForeground(Color.orange);
        color4.setForeground(Color.GREEN);

        color1.setFont(new Font("Times New Roman", 1, 16));
        color2.setFont(new Font("Times New Roman", 1, 16));
        color3.setFont(new Font("Times New Roman", 1, 16));
        color4.setFont(new Font("Times New Roman", 1, 16));

        color1.setBounds(0,0,300,50);
        color2.setBounds(0,20,300,50);
        color3.setBounds(0,40,300,50);
        color4.setBounds(0,60,300,50);
        color1.setText("    Jugador 1");

        color2.setText("    Jugador 2");
        color3.setText("    Jugador 3");
        color4.setText("    Jugador 4");



        noti1.setBounds(550,430,200,100);
        noti1.setAlignmentX(SwingConstants.CENTER);
        noti1.setFont(new Font("Showcard Gothic", 2, 40));
        noti2.setBounds(550,500,200,100);
        noti2.setAlignmentX(SwingConstants.CENTER);
        noti2.setFont(new Font("Showcard Gothic", 0, 30));



        MainPanel.add(noti1);
        MainPanel.add(noti2);

        switch(opp)
        {
        case 0:
            if(plyrNum==2)
            {
                newF.setLayout(new GridLayout(3, 0, 2, 0));

                color1.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn1.png")));
                color2.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn2.png")));

                newF.add(color1);
                newF.add(color2);
            }
            else if(plyrNum==3)
            {
                newF.setBounds(250,270,300,250);
                newF.setLayout(new GridLayout(4, 0, 2, 0));
                color1.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn1.png")));
                color2.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn2.png")));
                color3.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn3.png")));
                newF.add(color1);
                newF.add(color2);
                newF.add(color3);

            }
            else if(plyrNum==4)
            {
                newF.setBounds(250,230,300,280);
                newF.setLayout(new GridLayout(5, 0, 2, 0));
                color1.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn1.png")));
                color2.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn2.png")));
                color3.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn3.png")));
                color4.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn4.png")));

                newF.add(color1);
                newF.add(color2);
                newF.add(color3);
                newF.add(color4);

            }

            break;
        case 1:
            newF.add(color1);

            color1.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn1.png")));
            color1.setText("Player");
            color2.setBounds(0,60,300,50);
            color2.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn2.png")));

            color2.setText("Computer");
            newF.add(color2);

            break;
        }

        newF.add(ok);
//        pawn1.setBounds(px1,py1,50,50);
        pawn1.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn1.png")));
        ludo.add(pawn1);


//        pawn2.setBounds(px2,py2,50,50);
        pawn2.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn2.png")));
        ludo.add(pawn2);

        pawn3.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn3.png")));
        ludo.add(pawn3);

        pawn4.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn4.png")));
        ludo.add(pawn4);

        if(plyrNum==3 || plyrNum==2 ||plyrNum==4)
            plyr_number.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn1.png")));


        ok.addActionListener(new ActionListener()
        {


            @Override
            public void actionPerformed(ActionEvent e)
            {
                GameWindow.frm.setEnabled(true);
                MainPanel.setEnabled(true);
                newF.dispose();

            }
        });

        MainPanel.setEnabled(false);

        rollAction=new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                int check;
                if(e.getSource()==roll)
                {

                    System.out.println("opp: "+Design.opp);
                    System.out.println("turno "+turn);
                    System.out.println("turno "+turn_of_player);


                    try
                    {

                        Thread.sleep(1000);

                        Random rand=new Random();
//           board.setIcon(null);
                        board.setFont(new Font("Segoe UI Semilight", 1, 110));
                        board.setForeground(new Color(rand.nextInt(255),rand.nextInt(100),rand.nextInt(255)));
//                    pos1=rand.nextInt(5)+1;
                        switch (opp)
                        {
                        case 0:
                            if(plyrNum==2)
                            {
                                if(turn_of_player==1)
                                {
                                    plyr_number.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn2.png")));
                                    pos1=rand.nextInt(6)+1;
                                    board.setText(""+pos1);
                                    System.out.println("Jugador 1");

                                    if(pos1==1)
                                        start=true;

                                    if(start==true)
                                    {
                                        px1=position.pos0x();
                                        py1=position.pos0y();

                                        pawn1.setBounds(px1,py1,50,50);

                                    }

                                }
//                                plyr_number.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn1.png")));
                                else if(turn_of_player==2)
                                {
                                    plyr_number.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn1.png")));
                                    pos2=rand.nextInt(6)+1;
                                    board.setText(""+pos2);


                                    if(pos2==1)
                                        start1=true;
                                    if(start1==true)
                                    {
                                        px2=position.pos1x();
                                        py2=position.pos1y();

                                        pawn2.setBounds(px2,py2,50,50);

                                    }

                                }
//                                plyr_number.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn2.png")));

                                turn_of_player++;
                                if(turn_of_player>2)
                                    turn_of_player=1;



                            }
                            if(plyrNum==3)
                            {
                                if(turn_of_player==1)
                                {
                                    plyr_number.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn2.png")));
                                    pos1=rand.nextInt(6)+1;
                                    board.setText(""+pos1);
                                    System.out.println("Jugador 1");

                                    if(pos1==1)
                                        start=true;

                                    if(start==true)
                                    {
                                        px1=position.pos0x();
                                        py1=position.pos0y();

                                        pawn1.setBounds(px1,py1,50,50);

                                    }
                                }
                                else if(turn_of_player==2)
                                {
                                    plyr_number.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn3.png")));
                                    pos2=rand.nextInt(6)+1;
                                    board.setText(""+pos2);


                                    if(pos2==1)
                                        start1=true;
                                    if(start1==true)
                                    {
                                        px2=position.pos1x();
                                        py2=position.pos1y();

                                        pawn2.setBounds(px2,py2,50,50);

                                    }

                                }
                                else if(turn_of_player==3)
                                {
                                    plyr_number.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn1.png")));
                                    pos3=rand.nextInt(6)+1;
                                    board.setText(""+pos3);

                                    if(pos3==1)
                                        start2=true;
                                    if(start2==true)
                                    {
                                        px3=position.pos2x();
                                        py3=position.pos2y();

                                        pawn3.setBounds(px3,py3,50,50);

                                    }

                                }

                                turn_of_player++;
                                if(turn_of_player>3)
                                    turn_of_player=1;

                            }
                            if(plyrNum==4)
                            {
                                if(turn_of_player==1)
                                {
                                    plyr_number.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn2.png")));
                                    pos1=rand.nextInt(6)+1;
                                    board.setText(""+pos1);
                                    System.out.println("Jugador 1");

                                    if(pos1==1)
                                        start=true;

                                    if(start==true)
                                    {
                                        px1=position.pos0x();
                                        py1=position.pos0y();

                                        pawn1.setBounds(px1,py1,50,50);

                                    }

                                }
//                                plyr_number.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn1.png")));
                                else if(turn_of_player==2)
                                {
                                    plyr_number.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn3.png")));
                                    pos2=rand.nextInt(6)+1;
                                    board.setText(""+pos2);


                                    if(pos2==1)
                                        start1=true;
                                    if(start1==true)
                                    {
                                        px2=position.pos1x();
                                        py2=position.pos1y();

                                        pawn2.setBounds(px2,py2,50,50);

                                    }

                                }
//                                    plyr_number.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn2.png")));
                                else if(turn_of_player==3)
                                {
                                    plyr_number.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn4.png")));
                                    pos3=rand.nextInt(6)+1;
                                    board.setText(""+pos3);

                                    if(pos3==1)
                                        start2=true;
                                    if(start2==true)
                                    {
                                        px3=position.pos2x();
                                        py3=position.pos2y();

                                        pawn3.setBounds(px3,py3,50,50);

                                    }

                                }
//                                plyr_number.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn3.png")));
                                else if(turn_of_player==4)
                                {

                                    plyr_number.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn1.png")));
                                    pos4=rand.nextInt(6)+1;
                                    board.setText(""+pos4);

                                    if(pos4==1)
                                        start3=true;
                                    if(start3==true)
                                    {
                                        px4=position.pos3x();
                                        py4=position.pos3y();

                                        pawn4.setBounds(px4,py4,50,50);

                                    }

                                }
//                                plyr_number.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn4.png")));

                                turn_of_player++;
                                if(turn_of_player>4)
                                    turn_of_player=1;
                            }
                            break;
                        case 1:
                        {
                            position.setTurn(turn);
                            turn=position.turnC();


                            if(turn==false)
                            {

                                pos1=rand.nextInt(5)+1;
                                board.setText(""+pos1);

                                plyr.setText("Turno de ");

                                if(pos1==1)
                                    start=true;

                                if(start==true)
                                {
                                    px1=position.pos0x();
                                    py1=position.pos0y();
//                        position.check0(pos1);

                                    pawn1.setBounds(px1,py1,50,50);

                                }

                            }
                            else if(turn=true)
                            {
                                if(Design.diff==1)
                                {
                                    check=rand.nextInt(30);
                                    if((check%13)==0)
                                        pos2=6;
                                    else if((check%7)==0)
                                        pos2=5;
                                    else if((check%8)==0)
                                        pos2=4;
                                    else
                                    pos2=rand.nextInt(2)+1;
                                }
                                    
                                else if(Design.diff==2)
                                {
                                    check=rand.nextInt(30);
                                    if((check%13)==0)
                                        pos2=6;
                                    else if((check%7)==0)
                                        pos2=5;
                                    else 
                                        pos2=rand.nextInt(4)+1;
                                }
                                    
                                else if(Design.diff==3)
                                    pos2=rand.nextInt(6)+1;
                                board.setText(""+pos2);
                                plyr.setText("Turno del jugador");


                                if(pos2==1)
                                    start1=true;
                                if(start1==true)
                                {
                                    px2=position.pos1x();
                                    py2=position.pos1y();
//                        position.check1(pos2);

                                    pawn2.setBounds(px2,py2,50,50);

                                }

                            }

                        }
                        plyrN.setText("Player vs computer game");
                        break;
                        }

//                    if(opp==1)

                        if(opp==1)
                        {
                            PopUpFrames.compPOs.setText("   "+position.pos1);
                            PopUpFrames.plyrPOs.setText("   "+position.pos);
                        }
                        else if(opp==0)
                        {
                            PopUpFrames.compPOs.setText("   "+position.pos1);
                            PopUpFrames.plyrPOs.setText("   "+position.pos);
                            PopUpFrames.plyr3pos.setText("   "+position.pos2);
                            PopUpFrames.plyr4pos.setText("   "+position.pos3);

                        }


                        PopUpFrames p=new PopUpFrames();
                        p.showUpdate();
                    }
                    catch(InterruptedException IE )
                    {

                    }

                }
                else
                {

                }
            }
        };
        roll.addActionListener(rollAction);
    }


}
