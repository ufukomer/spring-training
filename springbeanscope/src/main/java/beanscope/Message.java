package beanscope;

/**
 * Created by Ufuk on 17-04-15.
 */
public class Message {

    public Text text;

    public Message(Text text) {
        this.text = text;
    }

    public String getMessage() {
        return text.getText();
    }

    public void setMessage(String text) {
        this.text.setText(text);
    }
}
