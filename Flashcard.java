import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Flashcard extends JTextField{
   public String word;
   public String definition;
   
   public Flashcard() {
   }
   
   public Flashcard(JTextField field1, JTextField field2) {
      word = field1.getText();
      definition = field2.getText();
   }
   
   public String returnWord() {
      return word;
   }
   
   public String returnDef() {
      return definition;
   }
}
         
   