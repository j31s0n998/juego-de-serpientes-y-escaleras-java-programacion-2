/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Project;

import images.image;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ezio Auditore
 */
public class position
{
    static int px,py,px1,py1,px2,py2,px3,py3;
    static int pos=0,pos1=0,pos2=0,pos3=0;
    static boolean turn;
    static int v;

    PopUpFrames p=new PopUpFrames();
    public static int getPx1()
    {
        return px1;
    }

    public static void setPx1(int px1)
    {
        position.px1 = px1;
    }

    public static int getPy1()
    {
        return py1;
    }

    public static void setPy1(int py1)
    {
        position.py1 = py1;
    }

    public static int getPos1()
    {
        return pos1;
    }

    public static void setPos1(int pos1)
    {
        position.pos1 = pos1;
    }
    public static int getPx()
    {
        return px;
    }

    public static void setPx(int px)
    {
        position.px = px;
    }

    public static int getPy()
    {
        return py;
    }

    public static void setPy(int py)
    {
        position.py = py;
    }

    public static int getPos()
    {
        return pos;
    }

    public static boolean isTurn()
    {
        return turn;
    }

    public static void setTurn(boolean turn)
    {
        position.turn = turn;
    }

    public static void setPos(int pos)
    {
        position.pos = pos;
    }
    static int posx()
    {
        return py;
    }
    /////////////////////////////////player 3////////////////////////////////////////////
    static int pos3y()
    {
        if(pos3>=1 && pos3<=10)
            py3=450;
        else if(pos3>=11 && pos3<=20)
            py3=400;
        else if(pos3>=21 && pos3<=30)
            py3=350;
        else if(pos3>=31 && pos3<=40)
            py3=300;
        else if(pos3>=41 && pos3<=50)
            py3=250;
        else if(pos3>=51 && pos3<=60)
            py3=200;
        else if(pos3>=61 && pos3<=70)
            py3=150;
        else if(pos3>=71 && pos3<=80)
            py3=100;
        else if(pos3>=81 && pos3<=90)
            py3=50;
        else if(pos3>=91 && pos3<=100)
            py3=0;
        switch(pos3)
        {
        case 4:
            pos3=14;
            PopUpFrames.move.setText("     Move to 14");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 9:
            pos3=31;
            PopUpFrames.move.setText("     Move to 31");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 20:
            pos3=38;
            PopUpFrames.move.setText("     Move to 38");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 28:
            pos3=84;
            PopUpFrames.move.setText("     Move to 84");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 40:
            pos3=59;
            PopUpFrames.move.setText("     Move to 59");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 63:
            pos3=81;
            PopUpFrames.move.setText("     Move to 81");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 51:
            pos3=67;
            PopUpFrames.move.setText("     Move to 67");
            PopUpFrames.showL();
            break;
        case 17:
            pos3=7;
            PopUpFrames.move.setText("     Move to 7");
            PopUpFrames.showS();
            break;
        case 64:
            pos3=60;
            PopUpFrames.move.setText("     Move to 60");
            PopUpFrames.showS();
            break;
        case 89:
            pos3=26;
            PopUpFrames.move.setText("     Move to 26");
            PopUpFrames.showS();
            break;
        case 95:
            pos3=75;
            PopUpFrames.move.setText("     Move to 73");
            PopUpFrames.showS();
            break;
        case 99:
            pos3=78;
            PopUpFrames.move.setText("     Move to 78");
            PopUpFrames.showS();
            break;
        }


        return py3;
    }
    static int pos3x()
    {
        int temp=pos3;
        pos3=pos3+GameWindow.pos4;
        if(pos3>100)
        {
            pos3=temp;
            System.out.println(""+pos3);
        }
        else if(pos3==100)
        {
            PopUpFrames.win.setText("     Player 4 Wins!!");
            PopUpFrames.win.setIcon(new ImageIcon(image.class.getResource("plyr4win.png")));

            PopUpFrames.showWin();
        }
        switch(pos3)
        {
        case 1:
        case 20:
        case 21:
        case 40:
        case 41:
        case 60:
        case 61:
        case 80:
        case 81:
        case 100:
            px3=0;
            break;
        case 2:
        case 19:
        case 22:
        case 39:
        case 42:
        case 59:
        case 62:
        case 79:
        case 82:
        case 99:
            px3=50;
            break;
        case 3:
        case 18:
        case 23:
        case 38:
        case 43:
        case 58:
        case 63:
        case 78:
        case 83:
        case 98:
            px3=100;
            break;
        case 4:
        case 17:
        case 24:
        case 37:
        case 44:
        case 57:
        case 64:
        case 77:
        case 84:
        case 97:
            px3=150;
            break;
        case 5:
        case 16:
        case 25:
        case 36:
        case 45:
        case 56:
        case 65:
        case 76:
        case 85:
        case 96:
            px3=200;
            break;
        case 6:
        case 15:
        case 26:
        case 35:
        case 46:
        case 55:
        case 66:
        case 75:
        case 86:
        case 95:
            px3=250;
            break;
        case 7:
        case 14:
        case 27:
        case 34:
        case 47:
        case 54:
        case 67:
        case 74:
        case 87:
        case 94:
            px3=300;
            break;
        case 8:
        case 13:
        case 28:
        case 33:
        case 48:
        case 53:
        case 68:
        case 73:
        case 88:
        case 93:
            px3=350;
            break;
        case 9:
        case 12:
        case 29:
        case 32:
        case 49:
        case 52:
        case 69:
        case 72:
        case 89:
        case 92:
            px3=400;
            break;
        case 10:
        case 11:
        case 30:
        case 31:
        case 50:
        case 51:
        case 70:
        case 71:
        case 90:
        case 91:
            px3=450;
            break;
        }

        return px3;

    }






    static int pos2y()
    {
        if(pos2>=1 && pos2<=10)
            py2=450;
        else if(pos2>=11 && pos2<=20)
            py2=400;
        else if(pos2>=21 && pos2<=30)
            py2=350;
        else if(pos2>=31 && pos2<=40)
            py2=300;
        else if(pos2>=41 && pos2<=50)
            py2=250;
        else if(pos2>=51 && pos2<=60)
            py2=200;
        else if(pos2>=61 && pos2<=70)
            py2=150;
        else if(pos2>=71 && pos2<=80)
            py2=100;
        else if(pos2>=81 && pos2<=90)
            py2=50;
        else if(pos2>=91 && pos2<=100)
            py2=0;
        switch(pos2)
        {
        case 4:
            pos2=14;
            PopUpFrames.move.setText("     Move to 14");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 9:
            pos2=31;
            PopUpFrames.move.setText("     Move to 31");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 20:
            pos2=38;
            PopUpFrames.move.setText("     Move to 38");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 28:
            pos2=84;
            PopUpFrames.move.setText("     Move to 84");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 40:
            pos2=59;
            PopUpFrames.move.setText("     Move to 59");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 63:
            pos2=81;
            PopUpFrames.move.setText("     Move to 81");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 51:
            pos2=67;
            PopUpFrames.move.setText("     Move to 67");
            PopUpFrames.showL();
            break;
        case 17:
            pos2=7;
            PopUpFrames.move.setText("     Move to 7");
            PopUpFrames.showS();
            break;
        case 64:
            pos2=60;
            PopUpFrames.move.setText("     Move to 60");
            PopUpFrames.showS();
            break;
        case 89:
            pos2=26;
            PopUpFrames.move.setText("     Move to 26");
            PopUpFrames.showS();
            break;
        case 95:
            pos2=75;
            PopUpFrames.move.setText("     Move to 73");
            PopUpFrames.showS();
            break;
        case 99:
            pos2=78;
            PopUpFrames.move.setText("     Move to 78");
            PopUpFrames.showS();
            break;
        }


        return py2;
    }
    static int pos2x()
    {
        int temp=pos2;
        pos2=pos2+GameWindow.pos3;
        if(pos2>100)
        {
            pos2=temp;
            System.out.println(""+pos2);
        }
        else if(pos2==100)
        {
            PopUpFrames.win.setText("     Player 3 Wins!!");
            PopUpFrames.win.setIcon(new ImageIcon(image.class.getResource("plyr3win.png")));

            PopUpFrames.showWin();
        }
        switch(pos2)
        {
        case 1:
        case 20:
        case 21:
        case 40:
        case 41:
        case 60:
        case 61:
        case 80:
        case 81:
        case 100:
            px2=0;
            break;
        case 2:
        case 19:
        case 22:
        case 39:
        case 42:
        case 59:
        case 62:
        case 79:
        case 82:
        case 99:
            px2=50;
            break;
        case 3:
        case 18:
        case 23:
        case 38:
        case 43:
        case 58:
        case 63:
        case 78:
        case 83:
        case 98:
            px2=100;
            break;
        case 4:
        case 17:
        case 24:
        case 37:
        case 44:
        case 57:
        case 64:
        case 77:
        case 84:
        case 97:
            px2=150;
            break;
        case 5:
        case 16:
        case 25:
        case 36:
        case 45:
        case 56:
        case 65:
        case 76:
        case 85:
        case 96:
            px2=200;
            break;
        case 6:
        case 15:
        case 26:
        case 35:
        case 46:
        case 55:
        case 66:
        case 75:
        case 86:
        case 95:
            px2=250;
            break;
        case 7:
        case 14:
        case 27:
        case 34:
        case 47:
        case 54:
        case 67:
        case 74:
        case 87:
        case 94:
            px2=300;
            break;
        case 8:
        case 13:
        case 28:
        case 33:
        case 48:
        case 53:
        case 68:
        case 73:
        case 88:
        case 93:
            px2=350;
            break;
        case 9:
        case 12:
        case 29:
        case 32:
        case 49:
        case 52:
        case 69:
        case 72:
        case 89:
        case 92:
            px2=400;
            break;
        case 10:
        case 11:
        case 30:
        case 31:
        case 50:
        case 51:
        case 70:
        case 71:
        case 90:
        case 91:
            px2=450;
            break;
        }

        return px2;

    }
    ////////////////////////////////////
///////////computer/player 2/////////////////////////////////
    static int pos1y()
    {
        if(pos1>=1 && pos1<=10)
            py1=450;
        else if(pos1>=11 && pos1<=20)
            py1=400;
        else if(pos1>=21 && pos1<=30)
            py1=350;
        else if(pos1>=31 && pos1<=40)
            py1=300;
        else if(pos1>=41 && pos1<=50)
            py1=250;
        else if(pos1>=51 && pos1<=60)
            py1=200;
        else if(pos1>=61 && pos1<=70)
            py1=150;
        else if(pos1>=71 && pos1<=80)
            py1=100;
        else if(pos1>=81 && pos1<=90)
            py1=50;
        else if(pos1>=91 && pos1<=100)
            py1=0;
        switch(pos1)
        {
        case 4:
            pos1=14;
            PopUpFrames.move.setText("     Move to 14");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 9:
            pos1=31;
            PopUpFrames.move.setText("     Move to 31");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 20:
            pos1=38;
            PopUpFrames.move.setText("     Move to 38");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 28:
            pos1=84;
            PopUpFrames.move.setText("     Move to 84");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 40:
            pos1=59;
            PopUpFrames.move.setText("     Move to 59");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 63:
            pos1=81;
            PopUpFrames.move.setText("     Move to 81");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 51:
            pos1=67;
            PopUpFrames.move.setText("     Move to 67");
            PopUpFrames.showL();
            break;
        case 17:
            pos1=7;
            PopUpFrames.move.setText("     Move to 7");
            PopUpFrames.showS();
            break;
        case 64:
            pos1=60;
            PopUpFrames.move.setText("     Move to 60");
            PopUpFrames.showS();
            break;
        case 89:
            pos1=26;
            PopUpFrames.move.setText("     Move to 26");
            PopUpFrames.showS();
            break;
        case 95:
            pos1=75;
            PopUpFrames.move.setText("     Move to 73");
            PopUpFrames.showS();
            break;
        case 99:
            pos1=78;
            PopUpFrames.move.setText("     Move to 78");
            PopUpFrames.showS();
            break;
        }


        return py1;
    }

    static int pos1x()
    {
        int temp=pos1;
        pos1=pos1+GameWindow.getPos1();
        if(pos1>100)
        {
            pos1=temp;
            System.out.println(""+pos1);
        }
        else if(pos1==100)
        {
            switch(GameWindow.opp)
            {
            case 1:
                PopUpFrames.win.setText("     You Loose!!");

                PopUpFrames.win.setIcon(new ImageIcon(image.class.getResource("loose.png")));
                PopUpFrames.showWin();
                break;
            case 0:
                PopUpFrames.win.setIcon(new ImageIcon(image.class.getResource("plyr2win.png")));

                PopUpFrames.win.setText("     Player 2 Wins!!");
                break;

            }
            PopUpFrames.showWin();
        }
        switch(pos1)
        {
        case 1:
        case 20:
        case 21:
        case 40:
        case 41:
        case 60:
        case 61:
        case 80:
        case 81:
        case 100:
            px1=0;
            break;
        case 2:
        case 19:
        case 22:
        case 39:
        case 42:
        case 59:
        case 62:
        case 79:
        case 82:
        case 99:
            px1=50;
            break;
        case 3:
        case 18:
        case 23:
        case 38:
        case 43:
        case 58:
        case 63:
        case 78:
        case 83:
        case 98:
            px1=100;
            break;
        case 4:
        case 17:
        case 24:
        case 37:
        case 44:
        case 57:
        case 64:
        case 77:
        case 84:
        case 97:
            px1=150;
            break;
        case 5:
        case 16:
        case 25:
        case 36:
        case 45:
        case 56:
        case 65:
        case 76:
        case 85:
        case 96:
            px1=200;
            break;
        case 6:
        case 15:
        case 26:
        case 35:
        case 46:
        case 55:
        case 66:
        case 75:
        case 86:
        case 95:
            px1=250;
            break;
        case 7:
        case 14:
        case 27:
        case 34:
        case 47:
        case 54:
        case 67:
        case 74:
        case 87:
        case 94:
            px1=300;
            break;
        case 8:
        case 13:
        case 28:
        case 33:
        case 48:
        case 53:
        case 68:
        case 73:
        case 88:
        case 93:
            px1=350;
            break;
        case 9:
        case 12:
        case 29:
        case 32:
        case 49:
        case 52:
        case 69:
        case 72:
        case 89:
        case 92:
            px1=400;
            break;
        case 10:
        case 11:
        case 30:
        case 31:
        case 50:
        case 51:
        case 70:
        case 71:
        case 90:
        case 91:
            px1=450;
            break;
        }

        return px1;

    }
    /////////////////////////////////////////////////////////////////////
    ///player 1/////////////////////////////////////////////////////////

    static int pos0y()
    {
        if(pos>=1 && pos<=10)
            py=450;
        else if(pos>=11 && pos<=20)
            py=400;
        else if(pos>=21 && pos<=30)
            py=350;
        else if(pos>=31 && pos<=40)
            py=300;
        else if(pos>=41 && pos<=50)
            py=250;
        else if(pos>=51 && pos<=60)
            py=200;
        else if(pos>=61 && pos<=70)
            py=150;
        else if(pos>=71 && pos<=80)
            py=100;
        else if(pos>=81 && pos<=90)
            py=50;
        else if(pos>=91 && pos<=100)
            py=0;

        switch(pos)
        {
        case 4:
            pos=14;
            PopUpFrames.move.setText("     Move to 14");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 9:
            pos=31;
            PopUpFrames.move.setText("     Move to 31");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 20:
            pos=38;
            PopUpFrames.move.setText("     Move to 38");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 28:
            pos=84;
            PopUpFrames.move.setText("     Move to 84");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 40:
            pos=59;
            PopUpFrames.move.setText("     Move to 59");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 63:
            pos=81;
            PopUpFrames.move.setText("     Move to 81");
            PopUpFrames.showL();
            System.out.println("Ladders!!!");
            break;
        case 51:
            pos=67;
            PopUpFrames.move.setText("     Move to 67");
            PopUpFrames.showL();
            break;
        case 17:
            pos=7;
            PopUpFrames.move.setText("     Move to 7");
            PopUpFrames.showS();
            break;
        case 64:
            pos=60;
            PopUpFrames.move.setText("     Move to 60");
            PopUpFrames.showS();
            break;
        case 89:
            pos=26;
            PopUpFrames.move.setText("     Move to 26");
            PopUpFrames.showS();
            break;
        case 95:
            pos=75;
            PopUpFrames.move.setText("     Move to 73");
            PopUpFrames.showS();
            break;
        case 99:
            pos=78;
            PopUpFrames.move.setText("     Move to 78");
            PopUpFrames.showS();
            break;
        }


        return py;
    }


    static int pos0x()
    {
        int temp=pos;
        pos=pos+GameWindow.getPos();
        if(pos>100)
        {
            pos=temp;
            System.out.println(""+pos);
        }
        else if(pos==100)
        {
            switch(GameWindow.opp)
            {
            case 1:
                PopUpFrames.win.setText("     You Win!!");

                PopUpFrames.win.setIcon(new ImageIcon(image.class.getResource("win.png")));
                PopUpFrames.showWin();
                break;
            case 0:
                PopUpFrames.win.setIcon(new ImageIcon(image.class.getResource("plyr1win.png")));

                PopUpFrames.win.setText("     Player 1 Wins!!");
                break;

            }
            PopUpFrames.showWin();
        }
        switch(pos)
        {
        case 1:
        case 20:
        case 21:
        case 40:
        case 41:
        case 60:
        case 61:
        case 80:
        case 81:
        case 100:
            px=0;
            break;
        case 2:
        case 19:
        case 22:
        case 39:
        case 42:
        case 59:
        case 62:
        case 79:
        case 82:
        case 99:
            px=50;
            break;
        case 3:
        case 18:
        case 23:
        case 38:
        case 43:
        case 58:
        case 63:
        case 78:
        case 83:
        case 98:
            px=100;
            break;
        case 4:
        case 17:
        case 24:
        case 37:
        case 44:
        case 57:
        case 64:
        case 77:
        case 84:
        case 97:
            px=150;
            break;
        case 5:
        case 16:
        case 25:
        case 36:
        case 45:
        case 56:
        case 65:
        case 76:
        case 85:
        case 96:
            px=200;
            break;
        case 6:
        case 15:
        case 26:
        case 35:
        case 46:
        case 55:
        case 66:
        case 75:
        case 86:
        case 95:
            px=250;
            break;
        case 7:
        case 14:
        case 27:
        case 34:
        case 47:
        case 54:
        case 67:
        case 74:
        case 87:
        case 94:
            px=300;
            break;
        case 8:
        case 13:
        case 28:
        case 33:
        case 48:
        case 53:
        case 68:
        case 73:
        case 88:
        case 93:
            px=350;
            break;
        case 9:
        case 12:
        case 29:
        case 32:
        case 49:
        case 52:
        case 69:
        case 72:
        case 89:
        case 92:
            px=400;
            break;
        case 10:
        case 11:
        case 30:
        case 31:
        case 50:
        case 51:
        case 70:
        case 71:
        case 90:
        case 91:
            px=450;
            break;
        }

        return px;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////
    static boolean turnC()
    {
        if(turn==false)
            turn=true;
        else if(turn==true)
            turn=false;
        return turn;
    }
    static int specialY(int pos_S)
    {
        int y = 0;
        if(pos_S>=1 && pos_S<=10)
            y=450;
        else if(pos_S>=11 && pos_S<=20)
            y=400;
        else if(pos_S>=21 && pos_S<=30)
            y=350;
        else if(pos_S>=31 && pos_S<=40)
            y=300;
        else if(pos_S>=41 && pos_S<=50)
            y=250;
        else if(pos_S>=51 && pos_S<=60)
            y=200;
        else if(pos_S>=61 && pos_S<=70)
            y=150;
        else if(pos_S>=71 && pos_S<=80)
            y=100;
        else if(pos_S>=81 && pos_S<=90)
            y=50;
        else if(pos_S>=91 && pos_S<=100)
            y=0;

        return y;

    }
    static int specialX(int pos_S)
    {
        int x = 0;
        switch(pos_S)
        {
        case 1:
        case 20:
        case 21:
        case 40:
        case 41:
        case 60:
        case 61:
        case 80:
        case 81:
        case 100:
            x=0;
            break;
        case 2:
        case 19:
        case 22:
        case 39:
        case 42:
        case 59:
        case 62:
        case 79:
        case 82:
        case 99:
            x=50;
            break;
        case 3:
        case 18:
        case 23:
        case 38:
        case 43:
        case 58:
        case 63:
        case 78:
        case 83:
        case 98:
            x=100;
            break;
        case 4:
        case 17:
        case 24:
        case 37:
        case 44:
        case 57:
        case 64:
        case 77:
        case 84:
        case 97:
            x=150;
            break;
        case 5:
        case 16:
        case 25:
        case 36:
        case 45:
        case 56:
        case 65:
        case 76:
        case 85:
        case 96:
            x=200;
            break;
        case 6:
        case 15:
        case 26:
        case 35:
        case 46:
        case 55:
        case 66:
        case 75:
        case 86:
        case 95:
            x=250;
            break;
        case 7:
        case 14:
        case 27:
        case 34:
        case 47:
        case 54:
        case 67:
        case 74:
        case 87:
        case 94:
            x=300;
            break;
        case 8:
        case 13:
        case 28:
        case 33:
        case 48:
        case 53:
        case 68:
        case 73:
        case 88:
        case 93:
            x=350;
            break;
        case 9:
        case 12:
        case 29:
        case 32:
        case 49:
        case 52:
        case 69:
        case 72:
        case 89:
        case 92:
            x=400;
            break;
        case 10:
        case 11:
        case 30:
        case 31:
        case 50:
        case 51:
        case 70:
        case 71:
        case 90:
        case 91:
            x=450;
            break;
        }

        return x;

    }

}
