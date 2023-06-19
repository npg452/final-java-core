package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class color extends JFrame implements ItemListener {
    // Tao danh sach mau
    JComboBox colorList = new JComboBox();

    // Tao noi luu truu cac component
    Container con;

    // Ham khoi tao
    public color(String title) {
        super(title);

        con = this.getContentPane();
        con.setLayout(new FlowLayout());

        // Thiet lap mau
        colorList.addItem("White");
        colorList.addItem("Black");
        colorList.addItem("Red");
        colorList.addItem("Yellow");
        colorList.addItem("Pink");
        con.add(colorList);
        colorList.addItemListener(this);

        // Thiet lap mau mac dinh
        con.setBackground(Color.white);
    }

 

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		// Lay vi tri mau duoc chon
        int index = colorList.getSelectedIndex();

        // Thiet lap mau cho giao dien
        if (index == 0) {
            con.setBackground(Color.white);
        } else if (index == 1) {
            con.setBackground(Color.black);
        } else if (index == 2) {
            con.setBackground(Color.red);
        } else if (index == 3) {
            con.setBackground(Color.yellow);
        } else {
            con.setBackground(Color.pink);
        }

	}
	/*public static void main(String[] args) {
        // Tao giao dien va hien thi
        color colors = new color("Choose Color");
        colors.setVisible(true);
        colors.setSize(400, 400);
    }*/
}