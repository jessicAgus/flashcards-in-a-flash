import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Current Version
public class flashcardFrameGUI {
   
   public static void main(String[] args) {
   
      //make JFrame
      JFrame mainFrame = new JFrame();
      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mainFrame.setSize(new Dimension(800, 500));
      mainFrame.setTitle("Flash Cards in a Flash!");
      
      mainFrame.setLayout(new BorderLayout());   
      
      // Program title
      JPanel topPanel = new JPanel(new FlowLayout());
      JLabel title = new JLabel("Flashcards in a Flash");
      title.setFont(title.getFont().deriveFont(28.0f));
      topPanel.add(title, BorderLayout.NORTH);
      
      mainFrame.add(topPanel, BorderLayout.NORTH);
      
        
      //Name of flash card program
      JPanel leftPanel = new JPanel(new GridLayout(1,1));
      leftPanel.add(new JLabel());
      mainFrame.add(leftPanel, BorderLayout.WEST);
      
      //Create the bottom panel
      JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 5));
      
      JTextField field1 = new JTextField(8);
      JTextField field2 = new JTextField(12);
      JLabel label1 = new JLabel("Word: ");
      JLabel label2 = new JLabel("Definition: ");     
      bottomPanel.add(label1, BorderLayout.SOUTH);
      bottomPanel.add(field1, BorderLayout.SOUTH);
      bottomPanel.add(label2, BorderLayout.SOUTH);
      bottomPanel.add(field2, BorderLayout.SOUTH); 
      
      //"Back" and "Next" buttons
      JButton button1 = new JButton("Next");
      button1.addActionListener(new MessageListener(mainFrame));
      JButton button2 = new JButton("Back"); 
      bottomPanel.add(button2);
      bottomPanel.add(button1);     

      mainFrame.add(bottomPanel, BorderLayout.SOUTH);       
      mainFrame.setVisible(true);
            
      //flashcards      
      JPanel rightPanel = new JPanel(new GridLayout(2, 2, 5, 5));
         /*for (int i = 1; i <= 4; i++) {
            JToggleButton button = new JToggleButton();
            rightPanel.add(button);
         }
      mainFrame.add(rightPanel, BorderLayout.CENTER);*/
      
      //Responds to a word typed in the textfield
      field1.addActionListener(new WordAndDefListener(mainFrame, rightPanel, field1, field2));
 
      
  
   } 

}