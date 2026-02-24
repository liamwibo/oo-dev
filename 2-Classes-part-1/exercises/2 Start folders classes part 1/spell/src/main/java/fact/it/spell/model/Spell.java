package fact.it.spell.model;

public class Spell {
    private String text;
    private int numberOperations;

    public Spell() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumberOperations() {
        return numberOperations;
    }

    public void echo(){
        this.text += this.text;
        this.numberOperations += 1;
    }

    public void completeWith(String word){
        this.text += word;
        this.numberOperations += 1;
    }

    public void addAt(String word, char location){
        switch (location){
            case 'f':
                this.text = word + this.text;
                break;
            case 'b':
                this.text += word;
                break;
            case 's':
                this.text = word + this.text + word;
                break;
        }
        this.numberOperations += 1;
    }


}
