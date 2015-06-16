/**
 * MessageListener.java
 * Assignment: Flashcard Program
 * Purpose: Use the knowledge gained this year to create a fun, useful program
 * 
 * @version 6/16/15
 * @author Jessica Agus
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MessageListener implements ActionListener {

   public JFrame frame;
   
   public MessageListener(JFrame mainFrame) {
      frame = mainFrame;
   }
   
   public void actionPerformed(ActionEvent event) {   
      JPanel rightPanel = new JPanel(new GridLayout(2, 2, 5, 5));
      for (int i = 1; i <= 4; i++) {
         JToggleButton button = new JToggleButton("Yay");
         rightPanel.add(button);
      }
      frame.setVisible(true);
   }
   
   /*public String[] words() {
      String[] wordList = {word1, word2, word3, word4};
      return wordList;
   }*/
   
}
   