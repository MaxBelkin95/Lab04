import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
 
public class Frame extends JFrame {
	
     String USA = "<html><h1>���</h1>" +
             "<font face=�verdana� size = 2>" +
             " <b><font style='color:green'>������ ��������:</font></b> ����������� ����� �������.<br>" +
             " <b><font style='color:green'>�������:</font></b> ���������. <br>" +
             " <b><font style='color:green'>�������:</font></b> 9 629 091 ��2. <br>" +
             " <b><font style='color:green'>������������:</font></b> ��� �� �������� ��������� ����������� � ����.<br>" +
             " ������������� �� ���������� �� ������ �� �������������� ������. <br>" +
             " �� ��������� ��� � ��������� �� ������ �� ����������� ��� �� �������. <br>" +
             " <b><font style='color:green'>���������������� �������:</font></b> 50 ������ ������ � ������ ���:<br>" +
             " ����������� (���������) ����� �������� � 48 ������� ������,<br>" +
             " � ��� �� ������ � ������.<br>" +
             " <b><font style='color:green'>����� ���������: </font></b>���������� � ������������ ��������������� �����������.<br>" +
             " <b><font style='color:green'>��������������� ����:</font></b> ����������.</html>";
     
     String RU = "<html><h1>������</h1>" +
    		 "<font face=�verdana� size = 2>" +
             " <b><font style='color:green'>������ ��������:</font></b> ���������� ���������.<br>" +
             " <b><font style='color:green'>�������:</font></b> ������.<br>" +
             " <b><font style='color:green'>�������:</font></b> 17 101 500 ��2<br>" +
             " <b><font style='color:green'>������������:</font></b> ����������� ����������� �� ���� ���������������� � ������.<br>" +
             " �� ���-������� � �� ��� � �������� � ������, �� ���-������� � � �������� ������,<br>" +
             " �� ���� �����������, �������, ������������� <br>" +
             " � ���������, �� ���-������� ��������,<br>" +
             " �� ������ � � ���������, �������, ��������, ��������� � ����������.<br>" +
             " <b><font style='color:green'>���������������� �������:</font></b> � ������ ���������� ��������� ������ <br>" +
             " 49 ��������, 22 ����������, 6 �����, 10 ���������� �������, ���������� �������,<br>" +
             " ������ ������������ �������� �����-���������, ������ � �����������.<br>" +
             " <b><font style='color:green'>����� ���������:</font></b> ���������� � ������������ ��������������� �����������.<br>" +
             " <b><font style='color:green'>��������������� ����:</font></b> �������.</html>";
     
     String ITA = "<html><h1>������</h1>" +
    		 "<font face=�verdana� size = 2>" +
             " <b><font style='color:green'>������ ��������:</font></b> ����������� ����������<br>" +
             " <b><font style='color:green'>�������:</font></b> ���<br>" +
             " <b><font style='color:green'>�������:</font></b> 301 340 ��?<br>" +
             " <b><font style='color:green'>������������:</font></b> �������� � �������� �� ������-������, <br>" +
             " �� ���������� � �������� � �� ������ � �� ����������� ������-�������.<br>" +
             " ����� ����� ���������� ������� � ��������� (3,2 ��) � ���-������ (39 ��).<br>" +
             " �������� ����������� ����������, ���������� ���������� (��������� �����),<br>" +
             " ��������� �������, ����� ������ ����, ������� �������, <br>" +
             " �������� � ��� ������ ��������.<br>" +
             " <b><font style='color:green'>���������������� �������:</font></b> � ������ ����������� ���������� ������ <br>" +
             " 20 ��������. � �������� ���� ���� ���������� � ��������� ������ <br>" +
             " � ������������� � ������<br>" +
             " ��� �������, ����� �����-������, ������� �� ���������, ������� ������������� 110<br>" +
             " <b><font style='color:green'>����� ���������:</font></b> ������������� ����������<br>" +
             " <b><font style='color:green'>��������������� ����:</font></b> �����������. </html>";
     
     JPanel htmlPanel = new JPanel();
     JLabel htmlLabel = new JLabel();
     Font font;
     Icon icon;
     Border solidBorder = BorderFactory.createLineBorder(Color.BLUE, 2);
 
     public Frame() {
          super("���������� �����");
          createGUI();
     }
 
     public void createGUI() {
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
          JPanel panel = new JPanel();
          panel.setLayout(new FlowLayout());
          
          JButton button1 = new JButton("���", new ImageIcon("United-States.gif"));
          panel.add(button1);
 
          JButton button2 = new JButton("������", new ImageIcon("Russia.gif"));
          panel.add(button2);
 
          JButton button3 = new JButton("������", new ImageIcon("Italy.gif"));
          panel.add(button3);
 
          //htmlLabel.setText(HI);
          //htmlLabel.setFont(font);
          
          ActionListener actionListenerUSA = new ActionListenerUSA();
          ActionListener actionListenerRU = new ActionListenerRU();
          ActionListener actionListenerITA = new ActionListenerITA();
           
          button1.addActionListener(actionListenerUSA);
          button2.addActionListener(actionListenerRU);
          button3.addActionListener(actionListenerITA); 
          
          getContentPane().add(panel);
          setPreferredSize(new Dimension(700, 450));
          panel.add(htmlPanel, BorderLayout.CENTER);
          htmlPanel.add(htmlLabel);
     }
 
     public class ActionListenerUSA implements ActionListener {
          public void actionPerformed(ActionEvent e) {
        	  htmlLabel.setText(USA);
        	  htmlLabel.setBorder(solidBorder);
        	  htmlLabel.setIcon(new ImageIcon("USA.gif"));
        	 
          }
     }
     
     public class ActionListenerRU implements ActionListener {
         public void actionPerformed(ActionEvent e) {
       	  	 htmlLabel.setText(RU);
       	  	 htmlLabel.setBorder(solidBorder);
       	  	 htmlLabel.setIcon(new ImageIcon("RUS.gif"));
            
         }
     }
     
     public class ActionListenerITA implements ActionListener {
         public void actionPerformed(ActionEvent e) {
       	  	 htmlLabel.setText(ITA);
       	  	 htmlLabel.setBorder(solidBorder);
       	  	 htmlLabel.setIcon(new ImageIcon("ITA.gif"));
           
         }
     }
 
     public static void main(String[] args) {
          javax.swing.SwingUtilities.invokeLater(new Runnable() {
               public void run() {
                    Frame frame = new Frame();
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
               }
          });
     }
}