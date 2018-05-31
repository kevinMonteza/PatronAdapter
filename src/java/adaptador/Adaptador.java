
package adaptador;

import libreria.InternationalJournal;
import libreria.TranslatorEng2Esp;

public class Adaptador implements IFTarget {

    private InternationalJournal journal;
    private TranslatorEng2Esp transate;

    public Adaptador() {
        this.journal = new InternationalJournal();
        this.transate = new TranslatorEng2Esp();
    }
    
    @Override
    public String getTittle() {
        return this.getTranslation(journal.getTittle());
    }

    @Override
    public String getAbstract() {
        return this.getTranslation(journal.getAbstract());
    }

    @Override
    public String getIndex() {
        return this.getTranslation(journal.getIndex());
    }

    @Override
    public String getBody() {
        return this.getTranslation(journal.getBody());
    }

    @Override
    public String getConclusions() {
        return this.getTranslation(journal.getConclusions());
    }

    @Override
    public String getTranslation(String text) {
        return transate.Translate(text);
    }

}
