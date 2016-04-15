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
	
     String USA = "<html><h1>США</h1>" +
             "<font face=’verdana’ size = 2>" +
             " <b><font style='color:green'>Полное название:</font></b> Соединенные Штаты Америки.<br>" +
             " <b><font style='color:green'>Столица:</font></b> Вашингтон. <br>" +
             " <b><font style='color:green'>Площадь:</font></b> 9 629 091 км2. <br>" +
             " <b><font style='color:green'>Расположение:</font></b> США по величине четвертое государство в мире.<br>" +
             " Располагается на территории от Тихого до Атлантического океана. <br>" +
             " От Скалистых гор и Кордельер на западе до Аппалачских гор на востоке. <br>" +
             " <b><font style='color:green'>Административное деление:</font></b> 50 штатов входит в состав США:<br>" +
             " федеральный (столичный) округ Колумбия и 48 смежных штатов,<br>" +
             " а так же Гавайи и Аляска.<br>" +
             " <b><font style='color:green'>Форма правления: </font></b>Республика с федеративным государственным устройством.<br>" +
             " <b><font style='color:green'>Государственный язык:</font></b> Английский.</html>";
     
     String RU = "<html><h1>Россия</h1>" +
    		 "<font face=’verdana’ size = 2>" +
             " <b><font style='color:green'>Полное название:</font></b> Российская Федерация.<br>" +
             " <b><font style='color:green'>Столица:</font></b> Москва.<br>" +
             " <b><font style='color:green'>Площадь:</font></b> 17 101 500 км2<br>" +
             " <b><font style='color:green'>Расположение:</font></b> Государство расположено на двух континентах–Азии и Европе.<br>" +
             " На юго-востоке и на юге – граничит с Китаем, на юго-востоке – с Северной Кореей,<br>" +
             " на юге–с Казахстаном, Грузией, Азербайджаном <br>" +
             " и Монголией, на юго-западе–с Украиной,<br>" +
             " на западе – с Беларусью, Латвией, Эстонией, Норвегией и Финляндией.<br>" +
             " <b><font style='color:green'>Административное деление:</font></b> В состав Российской Федерации входят <br>" +
             " 49 областей, 22 республики, 6 краев, 10 автономных округов, автономная область,<br>" +
             " города федерального значения Санкт-Петербург, Москва и Севастополь.<br>" +
             " <b><font style='color:green'>Форма правления:</font></b> Республика с федеративным государственным устройством.<br>" +
             " <b><font style='color:green'>Государственный язык:</font></b> Русский.</html>";
     
     String ITA = "<html><h1>Италия</h1>" +
    		 "<font face=’verdana’ size = 2>" +
             " <b><font style='color:green'>Полное название:</font></b> Итальянская республика<br>" +
             " <b><font style='color:green'>Столица:</font></b> Рим<br>" +
             " <b><font style='color:green'>Площадь:</font></b> 301 340 км?<br>" +
             " <b><font style='color:green'>Расположение:</font></b> Граничит с Францией на северо-западе, <br>" +
             " со Швейцарией и Австрией — на севере и со Словенией—на северо-востоке.<br>" +
             " также имеет внутренние границы с Ватиканом (3,2 км) и Сан-Марино (39 км).<br>" +
             " Занимает Апеннинский полуостров, Балканский полуостров (небольшую часть),<br>" +
             " Паданскую равнину, южные склоны Альп, острова Сицилия, <br>" +
             " Сардиния и ряд мелких островов.<br>" +
             " <b><font style='color:green'>Административное деление:</font></b> В состав Итальянской республики входят <br>" +
             " 20 областей. В областях есть свои парламенты — областные советы <br>" +
             " и правительства — джунты<br>" +
             " Все области, кроме Валле-д’Аоста, делятся на провинции, которых насчитывается 110<br>" +
             " <b><font style='color:green'>Форма правления:</font></b> Парламентская республика<br>" +
             " <b><font style='color:green'>Государственный язык:</font></b> Итальянский. </html>";
     
     JPanel htmlPanel = new JPanel();
     JLabel htmlLabel = new JLabel();
     Font font;
     Icon icon;
     Border solidBorder = BorderFactory.createLineBorder(Color.BLUE, 2);
 
     public Frame() {
          super("Справочник стран");
          createGUI();
     }
 
     public void createGUI() {
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
          JPanel panel = new JPanel();
          panel.setLayout(new FlowLayout());
          
          JButton button1 = new JButton("США", new ImageIcon("United-States.gif"));
          panel.add(button1);
 
          JButton button2 = new JButton("Россия", new ImageIcon("Russia.gif"));
          panel.add(button2);
 
          JButton button3 = new JButton("Италия", new ImageIcon("Italy.gif"));
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