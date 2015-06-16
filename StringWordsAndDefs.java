import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StringWordsAndDefs extends JTextField {  
      private String word;
      private String def;     
      private JTextField wordTextField;
      private JTextField defTextField;
   
   public StringWordsAndDefs() {
      word = "";
      def = "";
      wordTextField = new JTextField(8);
      defTextField = new JTextField(12);
   }
   
   public JTextField wordField() {
      return new JTextField(8);
   }
   
   public JTextField defField() {
      return new JTextField(12);
   }
   
   public String getWord() {
      word = wordTextField.getText();
   }
   
   public String getDef() {      
      def = defTextField.getText();
      return def;
   }
   
   /*public String[] wordAndDef() {
      String[] wordAndDef = {word, def};
      return wordAndDef;
   }*/
   
   public String toString() {
      return word;
   }
   
   public String defToString() {
      return def;
   }
   
   
   
}