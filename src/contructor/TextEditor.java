package contructor;

public class TextEditor {
	   private SpellChecker spellChecker;
	   private StringArgGenerator strarg;

	   public TextEditor(SpellChecker spellChecker, StringArgGenerator strarg) {
	      System.out.println("Inside TextEditor constructor." );
	      this.spellChecker = spellChecker;
	      this.strarg = strarg;
	   }
	   
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
	   
	   public StringArgGenerator getStrarg() {
			return strarg;
	   }
	}
