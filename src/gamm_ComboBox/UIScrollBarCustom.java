package gamm_ComboBox;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class UIScrollBarCustom extends JScrollBar {

    public UIScrollBarCustom() {
        setUI(new UIModernScrollBar());
        setPreferredSize(new Dimension(8, 8));
        setForeground(new Color(48, 144, 216));
        setBackground(Color.WHITE);
    }
}
