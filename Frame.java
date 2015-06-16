import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame {
   public JFrame frame = new JFrame();
   public JPanel topPanel = new JPanel();
   public JPanel bottomPanel = new JPanel();
   public JPanel rightPanel = new JPanel();
   public JPanel leftPanel = new JPanel();
   
   public Frame(JFrame mainFrame) {  
      frame = mainFrame;
   }
   
   public void setFrame() {
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(new Dimension(800, 500));
      frame.setTitle("Flash Cards in a Flash!");
      
      frame.setLayout(new BorderLayout()); 
   }  
   
   public void setPanel() {
      // Program title
      JPanel topPanel = new JPanel(new FlowLayout());
      JLabel title = new JLabel("Flashcards in a Flash");
      title.setFont(title.getFont().deriveFont(28.0f));
      topPanel.add(title, BorderLayout.NORTH);
      
      frame.add(topPanel, BorderLayout.NORTH);
      
      //Name of flash card program
      JPanel leftPanel = new JPanel(new GridLayout(1,1));
      leftPanel.add(new JLabel());
      frame.add(leftPanel, BorderLayout.WEST);
      
            //flash cards
      JPanel rightPanel = new JPanel(new GridLayout(2, 2, 5, 5));
         for (int i = 1; i <= 4; i++) {
            JToggleButton button = new JToggleButton();
            rightPanel.add(button);
         }
      frame.add(rightPanel, BorderLayout.CENTER);  
   }
}