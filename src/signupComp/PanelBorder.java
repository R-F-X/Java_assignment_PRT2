
package signupComp;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLayeredPane;

public class PanelBorder extends JLayeredPane {
    
    public PanelBorder() {
        
    }
    
    @Override
    protected void paintComponent(Graphics graphs) {
        super.paintComponent(graphs);
        Graphics2D g2 = (Graphics2D) graphs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 25);
    }
}
