package mavenproject.mavenproject;

import java.awt.Label;
import java.awt.Panel;

public class addHTMLPanel extends Panel {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public addHTMLPanel (String id) {
		//super(id);
	    // TODO Auto-generated constructor stub

	    //String dynamicHtml = createDynamicHtml("divIdName");
	    //Label divLabel = new Label("divLabel",dynamicHtml );
	    //divLabel.setEscapeModelStrings(false);
	    //add(divLabel);
     
        /*
         * created label here for adding dynamic html code as a string. Constructor of Label contains 
         * two parameters, first parameter is "wicket:id" by which label is identified in markup.
         * Second parameter is the String variable "dynamicHtml " which contains our dynamic html code as a string.
         */
        //Label divLabel = new Label("divLabel",dynamicHtml );
    
        //Setted EscapeModelStrings False for the label
        //divLabel.setEscapeModelStrings(false);
    
        //added label to panel here
        //add(divLabel);    
      }

       /*
         * method which returns <div> tag content as a string required to add in html file
          */
       public String createDynamicHtml(String div_id) {
        
        //created a instance named "divSB " of StringBuilder here
        StringBuilder divSB = new StringBuilder(512);
        
        /*
         *appended dynamic html code to divscriptSB instance of StringBuilder
         */
        divSB.append("<div id=\"");
        divSB.append(div_id);
        divSB.append("\"></div>");
        
        //return StringBuilder instance as a String which contains our dynamic html code
        return divSB.toString();    
    }
}
