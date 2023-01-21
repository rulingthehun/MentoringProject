package OCA_quastion._14_10_22.Q11;

import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        Shape a = new Shape();
//        Answers:
//        A. FALSE
//        Shape b = new Shape();
//        B. TRUE
        Shape b = new Rectangle();
//        C. TRUE
//        Rectangle b = new Rectangle();
//        D. FALSE
//        Rectangle b = new Shape();
//        E. FALSE
//        Shape b = ((Rectangle)new Shape());
//        F. FALSE
//        Rectangle b = ((Rectangle)new Shape());
        a.print();
        b.print();
    }
}
