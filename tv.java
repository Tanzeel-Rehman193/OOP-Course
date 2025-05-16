import javax.print.DocFlavor.CHAR_ARRAY;

public class tv {
    private int ch = 01;
    private int vol = 0;
    private boolean on = false;

    tv() {

    }

    public void Turnon() {
        on = true;
    }

    public void Turnoff() {
        on = false;
    }

    public void Volup() {
        if (on && vol < 10) {
            vol++;
        }
    }

    public void voldown() {
        if (on && vol > 0) {
            vol--;
        }
    }

    public void chup() {
        if (on && ch < 250) {
            ch++;
        }
    }

    public void chdown() {
        if (on && ch > 0) {
            ch--;
        }
    }
    public void Setch (int c){
        if ( on && c>=0&& c<=250) {
            ch = c;
        }
    }
    public static void main(String[] args) {
        tv obj = new tv();
        obj.Turnon();
        obj.Turnoff();
        obj.Volup();
        obj.voldown();
        obj.Setch(35);
        
     }
}
