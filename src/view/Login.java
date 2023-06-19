package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import controller.ConnectionDB;

public class Login extends JFrame {
	JTextField tfTkhoan, tfMkhau;
	public Login() {
		super("Login");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ConnectionDB dbCon = new ConnectionDB();
		
		
		JPanel pnCenter = new JPanel();
		pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.X_AXIS));
		pnCenter.setBackground(Color.BLUE);
			JPanel pnCenter1 = new JPanel();
			pnCenter1.setLayout(new GridLayout(4,1,30,30));
			
			JPanel pndangnhap = new JPanel();
			pndangnhap.setLayout(new FlowLayout());
			JLabel lbdangnhap = new JLabel("ĐĂNG NHẬP"
					+ " HỆ THỐNG QUẢN LÍ THUÊ NHÀ");
			lbdangnhap.setForeground(Color.BLACK);
			pndangnhap.add(lbdangnhap);
			
			JPanel pntaikhoan = new JPanel();
			pntaikhoan.setLayout(new GridLayout(2,2,10,10));
			JLabel tkhoan = new JLabel("Tài Khoản");
			tfTkhoan = new JTextField(20);
			JLabel mkhau = new JLabel("Mật Khẩu");
			tfMkhau = new JTextField(20);
			pntaikhoan.add(tkhoan);
			pntaikhoan.add(tfTkhoan);
			pntaikhoan.add(mkhau);
			pntaikhoan.add(tfMkhau);
			
			JPanel pnCenter2 = new JPanel();
			pnCenter2.setLayout(new FlowLayout());
			JLabel pt = new JLabel();
			pt.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(Login.class.getResource("VKU.png"))));
			pnCenter2.add(pt);
			
		JPanel pndnhap = new JPanel();
		JButton btdnhap = new JButton("Đăng nhập");
		btdnhap.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(Login.class.getResource("login (1).png"))));
		btdnhap.setBackground(Color.LIGHT_GRAY);
		pndnhap.add(btdnhap);
		
		pnCenter1.add(pndangnhap);
		pnCenter1.add(pntaikhoan);
		pnCenter1.add(pndnhap);
		Border border = BorderFactory.createLineBorder(Color.BLUE, 1);
		TitledBorder tborder = new TitledBorder(border);
		pnCenter1.setBorder(tborder);
		
		pnCenter.add(pnCenter2);
		pnCenter.add(pnCenter1);
		
		
		
		btdnhap.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(tfTkhoan.getText().equals("") && tfMkhau.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Tài Khoản hoặc Mật Khẩu trống!", "Thông báo",JOptionPane.ERROR_MESSAGE );
				}
				if(tfTkhoan.getText().equals("1") && tfMkhau.getText().equals("1")) {
					JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
					new QLTN().setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Đăng nhập thất bại!");
				}
			}
		});
		

		
		Container cn = this.getContentPane();
		cn.add(pnCenter);
		
		
	}
	public static void main(String[] args) {
		Login x = new Login();
		x.setSize(500, 300);
		x.setVisible(true);
		x.setLocationRelativeTo(null);
	}
	 

    
	
    
    
	

}
