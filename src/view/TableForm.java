package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import controller.ConnectionDB;

public class TableForm extends JPanel{
	ConnectionDB dbCon;
	DefaultTableModel dm;
	public TableForm(ConnectionDB dbCon,NguoiThueNhaInputForm ntnf) {
		this.dbCon = dbCon;
		setLayout(new BorderLayout());
		
		
		dm = new DefaultTableModel();
		dm.addColumn("IDNTN");
		dm.addColumn("Tên");
		dm.addColumn("Ngày sinh");
		dm.addColumn("SĐT");
		dm.addColumn("Giới tính");
		dm.addColumn("Cccd");
		dm.addColumn("Địa chỉ");
		dm.addColumn("Ngày vào ở");
		dm.addColumn("Tiền điện");
		dm.addColumn("Tiền nước");
		dm.addColumn("Tiền nhà");
		dm.addColumn("Ngày trả tiền");
		dm.addColumn("Tình trạng nộp tiền");
		
		final JTable table = new JTable(dm);
		putDataToTableNTN();
		
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(10, 10, 300, 200);
		
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		TitledBorder tborder = BorderFactory.createTitledBorder(border,"Danh sách người thuê nhà");
		setBorder(tborder);
		
		
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int row = table.getSelectedRow();
				String idntn = (String) table.getValueAt(row, 0);
				String name = (String) table.getValueAt(row, 1);
				String ngaysinh = (String) table.getValueAt(row, 2);
				String phone = (String) table.getValueAt(row, 3);
				String gender = (String) table.getValueAt(row, 4);
				String cccd = (String) table.getValueAt(row, 5);
				String address = (String) table.getValueAt(row, 6);
				String ngayVaoO = (String) table.getValueAt(row, 7);
				String tiendien = (String) table.getValueAt(row, 8);
				String tiennuoc = (String) table.getValueAt(row, 9);
				String tiennha = (String) table.getValueAt(row, 10);
				String ngaytratien = (String) table.getValueAt(row, 11);
				String tinhtrangnoptien = (String) table.getValueAt(row, 12);
				
				ntnf.tfIDNTN.setText(idntn);
				ntnf.tfName.setText(name);
				ntnf.tfNgaysinh.setText(ngaysinh);
				ntnf.tfPhone.setText(phone);
				ntnf.tfGender.setText(gender);
				ntnf.tfCccd.setText(cccd);
				ntnf.tfAddress.setText(address);
				ntnf.tfNgayVaoO.setText(ngayVaoO);
				ntnf.tfTiendien.setText(tiendien);
				ntnf.tfTiennuoc.setText(tiennuoc);
				ntnf.tfTiennha.setText(tiennha);
				ntnf.tfNgaytratien.setText(ngaytratien);
				ntnf.tfTinhtrangnoptien.setText(tinhtrangnoptien);
			}
		});
		
		JScrollPane sp = new JScrollPane(table);
		add(sp,BorderLayout.CENTER);
		
		
	}
	public void putDataToTableNTN() {
		ResultSet rs = dbCon.selectAll("nguoithuenha");
		try {
			while(rs.next()) {
				String idntn = rs.getString(1);
				String name = rs.getString(2);
				String ngaysinh = rs.getString(3);
				String phone = rs.getString(4);
				String gender = rs.getString(5);
				String cccd = rs.getString(6);
				String address = rs.getString(7);
				String ngayVaoO = rs.getString(8);
				String tiendien = rs.getString(9);
				String tiennuoc = rs.getString(10);
				String tiennha = rs.getString(11);
				String ngaytratien = rs.getString(12);
				String tinhtrangnoptien = rs.getString(13);
				dm.addRow(new String [] {idntn, name,ngaysinh,phone,gender,cccd, address, ngayVaoO, tiendien +"",tiennuoc+"",tiennha+"",ngaytratien, tinhtrangnoptien});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
