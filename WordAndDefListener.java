/**
 * WordAndDefListener.java
 * Assignment: Flashcard Program
 * Purpose: Use the knowledge gained this year to create a fun, useful program
 * 
 * @version 6/16/15
 * @author Jessica Agus
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WordAndDefListener implements ActionListener {

   //public FlashcardGroup[] words;
   private JFrame frame;
   private JPanel panel;
   private String word; 
   private String def;     
   private JTextField wordTextField;
   private JTextField defTextField;
   
   public WordAndDefListener(JFrame mainFrame, JPanel rightPanel, JTextField field1, JTextField field2) {
      frame = mainFrame;
      panel = rightPanel;
      word = "";
      def = "";
      wordTextField = field1;
      defTextField = field2;
      
   }

   public void actionPerformed(ActionEvent event) { 
      String text = wordTextField.getText();
      JToggleButton flashcardButton = new JToggleButton(text);
      String[] wordGroup = new String[4];
      panel.add(flashcardButton);
      wordTextField.setText("");   
      frame.add(panel, BorderLayout.CENTER);
      

      /*if (buttonWord.isSelected() == false) {
         buttonWord.setText(word);
      } else {
         buttonDef.setText(definition);
      }  */ 
      /*words = new FlashcardGroup[4];
      }
      
      for (int i = 0; i < 4; i++) {
         JToggleButton button = new JToggleButton();
         rightPanel.add(button);
         words[i] = new Flashcard[];
      }*/
   }
}