package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class NguoiThueNhaInputForm extends JPanel{
	JTextField tfIDNTN;
	JTextField tfName;
	JTextField tfNgaysinh;
	JTextField tfPhone;
	JTextField tfGender;
	JTextField tfCccd;
	JTextField tfAddress;
	JTextField tfNgayVaoO;
	JTextField tfTiendien;
	JTextField tfTiennuoc;
	JTextField tfTiennha;
	JTextField tfNgaytratien;
	JTextField tfTinhtrangnoptien;
	
	
	
	public NguoiThueNhaInputForm() {
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		TitledBorder tborder = BorderFactory.createTitledBorder(border,"Người Thuê Nhà");
		setBorder(tborder);
		setLayout(new BorderLayout());
		
		JPanel Center1 = new JPanel();
		Center1.setLayout(new GridLayout(7,1));
		
		JPanel Center2 = new JPanel();
		Center2.setLayout(new GridLayout(6,1));
		
		
		JLabel lbIDNTN = new JLabel("IDNTN: ");
		tfIDNTN = new JTextField(20);
		Center1.add(lbIDNTN);
		Center1.add(tfIDNTN);
		
		JLabel lbName = new JLabel("Tên: ");
		tfName = new JTextField(20);
		Center1.add(lbName);
		Center1.add(tfName);
		
		JLabel lbNgaysinh = new JLabel("Ngày sinh: ");
		tfNgaysinh = new JTextField(20);
		Center1.add(lbNgaysinh);
		Center1.add(tfNgaysinh);
		
		JLabel lbPhone = new JLabel("SĐT: ");
		tfPhone = new JTextField(20);
		Center1.add(lbPhone);
		Center1.add(tfPhone);
		
		JLabel lbGender = new JLabel("Giới tính:  ");
		tfGender = new JTextField(20);
		Center1.add(lbGender);
		Center1.add(tfGender);
		
		JLabel lbCCCD = new JLabel("CCCD: ");
		tfCccd = new JTextField(20);
		Center1.add(lbCCCD);
		Center1.add(tfCccd);
		
		JLabel lbAddress = new JLabel("Địa chỉ: ");
		tfAddress = new JTextField(20);
		Center1.add(lbAddress);
		Center1.add(tfAddress);
		
		JLabel lbNgayVaoO = new JLabel("Ngày vào ở: ");
		tfNgayVaoO = new JTextField(20);
		Center2.add(lbNgayVaoO);
		Center2.add(tfNgayVaoO);
		
		JLabel lbTiendien = new JLabel("Tiền điện: ");
		tfTiendien = new JTextField(20);
		Center2.add(lbTiendien);
		Center2.add(tfTiendien);
		
		JLabel lbTiennuoc = new JLabel("Tiền nước");
		tfTiennuoc = new JTextField(20);
		Center2.add(lbTiennuoc);
		Center2.add(tfTiennuoc);
		
		JLabel lbTiennha = new JLabel("Tiền nhà: ");
		tfTiennha = new JTextField(20);
		Center2.add(lbTiennha);
		Center2.add(tfTiennha);
		
		JLabel lbNgaytratien = new JLabel("Ngày trả tiền: ");
		tfNgaytratien = new JTextField(20);
		Center2.add(lbNgaytratien);
		Center2.add(tfNgaytratien);
		
		JLabel lbTinhtrangnoptien = new JLabel("Tình trạng nộp tiền: ");
		tfTinhtrangnoptien = new JTextField(20);
		Center2.add(lbTinhtrangnoptien);
		Center2.add(tfTinhtrangnoptien);
		
		
		add(Center1,BorderLayout.WEST);
		add(Center2,BorderLayout.EAST);
	}

}
