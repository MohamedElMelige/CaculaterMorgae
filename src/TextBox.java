public class TextBox {
    private String text = "";
    public void setText(String text) {
        this.text = text;
    }
    public void clear() {
        text = "";
    }
    public String getText() {
        return text;
    }
}
