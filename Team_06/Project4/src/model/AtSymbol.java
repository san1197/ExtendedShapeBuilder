package model;
import java.awt.Color;
import java.awt.Graphics;

import controller.Drag;
import controller.ShapeMouseListener;
import controller.UserInput;

public class AtSymbol extends Shape{
	
	public AtSymbol(int x, int y, boolean rightPanel){
		super("@",x,y);
		if(rightPanel) {
			new ShapeMouseListener(this);
			this.add(new ConnectorDot(getSize().width - 20, getSize().height * 3 / 4, type.OUTPUT));
			this.add(new ConnectorDot(getSize().width - 20, getSize().height * 1 / 4, type.OUTPUT));
			this.add(new ConnectorDot(20, getSize().height * 3 / 4, type.INPUT));
			this.add(new ConnectorDot(20, getSize().height * 1 / 4, type.INPUT));
			new Drag(this);
		}
	}



	@Override
	protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.lightGray);
        } 
        else {
            g.setColor(getBackground());
        }
        //g.fillRect(0, 0, getSize().width, getSize().height);
        super.paintComponent(g);
    }
	
    protected void paintBorder(Graphics g) 
    {
        g.setColor(getForeground());
        g.drawRect(0, 0, getSize().width, getSize().height);
        g.fillRect(getSize().width - 20, getSize().height * 3 / 4, 10, 10);
        g.fillRect(getSize().width - 20, getSize().height * 1 / 4, 10, 10);
        g.fillRect(20, getSize().height * 3 / 4, 10, 10);
        g.fillRect(20, getSize().height * 1 / 4, 10, 10);
    }
}