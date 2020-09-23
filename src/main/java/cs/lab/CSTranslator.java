package cs.lab;

import java.util.logging.Logger;
import com.google.cloud.translate.*;

public class CSTranslator {

    static final Logger logger = Logger.getLogger(CSTranslator.class.getName());    

    public String translate(String toBeTranslated) throws TooLongException {

        if(toBeTranslated.length()>500) {
            throw new TooLongException("La cadena " + toBeTranslated + " es demasiado larga para ser traducida");
        }

        Translate translate = TranslateOptions.getDefaultInstance().getService();
        Translation translation = translate.translate(toBeTranslated);
        return translation.getTranslatedText();
        
    }
    
}