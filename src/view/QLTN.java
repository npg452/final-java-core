package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

import controller.ConnectionDB;

public class QLTN extends  JFrame {
	DefaultTableModel dm;
	ArrayList<NguoiThueNha> ntn;
	JComboBox cbtk, cbtt;
	JComboBox comSX;
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
	public 	QLTN() {
		super ("Quản lí thuê nhà");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1300, 700);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		ConnectionDB dbCon = new ConnectionDB();
		 tfIDNTN=new JTextField();
		 tfName=new JTextField();
		 tfNgaysinh=new JTextField();
		 tfPhone=new JTextField();
		 tfGender=new JTextField();
		 tfCccd=new JTextField();
		 tfAddress=new JTextField();
		 tfNgayVaoO=new JTextField();
		 tfTiendien=new JTextField();
		 tfTiennuoc=new JTextField();
		 tfTiennha=new JTextField();
		 tfNgaytratien=new JTextField();
		 tfTinhtrangnoptien=new JTextField();
		
		JMenuBar mnbar = new JMenuBar();
		setJMenuBar(mnbar);
		JMenu mnFile = new JMenu("File");
		JMenu mnEdit = new JMenu("Edit");
		mnbar.add(mnFile);
		mnbar.add(mnEdit);
		JMenuItem mnFileNew = new JMenuItem("New");
    	mnFileNew.setAccelerator(KeyStroke.getKeyStroke('N', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
		JMenuItem mnFileOpen = new JMenuItem("Open");
		JMenuItem mnFileExit = new  JMenuItem("Exit");
		mnFile.add(mnFileNew);
		mnFile.add(mnFileOpen);
		mnFile.addSeparator();
		mnFile.add(mnFileExit);
		
		JMenuItem menuEditCopy = new JMenuItem("Copy");
        menuEditCopy.setAccelerator(KeyStroke.getKeyStroke('C', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        JMenuItem menuEditPaste = new JMenuItem("Paste");
        menuEditPaste.setAccelerator(KeyStroke.getKeyStroke('V', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        JMenuItem menuEditDelete = new JMenuItem("Delete");
        mnEdit.add(menuEditCopy);
        mnEdit.add(menuEditPaste);
        mnEdit.add(menuEditDelete);
		
		mnFileExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		JPanel pnCard = new JPanel();
		pnCard.setLayout(new CardLayout());
	
	
		
		JPanel pnCenterNTN = new JPanel();
		pnCenterNTN.setLayout(new GridLayout(2,1));
		
			JPanel pnNTN1 =new JPanel();
			pnNTN1.setLayout(new BorderLayout());
			
			Border border= BorderFactory.createLineBorder(Color.BLACK);
			TitledBorder tborder = BorderFactory.createTitledBorder(border,"Control");
			JPanel pnNTNC = new JPanel();
			pnNTNC.setLayout(new GridLayout(5,1));
			pnNTNC.setBorder(tborder);
			
			JButton themntn = new JButton("Thêm");
			themntn.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QLTN.class.getResource("Create.png"))));
			themntn.setBackground(Color.LIGHT_GRAY);
			JButton suantn = new JButton("Sửa");
			suantn.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QLTN.class.getResource("Edit.png"))));
			suantn.setBackground(Color.LIGHT_GRAY);
			JButton xoantn = new JButton("Xóa");
			xoantn.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QLTN.class.getResource("Delete.png"))));
			xoantn.setBackground(Color.LIGHT_GRAY);
			JButton lammoi = new JButton("Làm mới");
			lammoi.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QLTN.class.getResource("reload.png"))));
			lammoi.setBackground(Color.LIGHT_GRAY);
			JButton exitntn = new JButton("Thoát");
			exitntn.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QLTN.class.getResource("Exit.png"))));
			exitntn.setBackground(Color.LIGHT_GRAY);
			
			pnNTNC.add(themntn);
			pnNTNC.add(suantn);
			pnNTNC.add(xoantn);
			pnNTNC.add(lammoi);
			pnNTNC.add(exitntn);
			
			
			
			NguoiThueNhaInputForm ntnf = new NguoiThueNhaInputForm();
			lammoi.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//System.out.println("hhh");
					// TODO Auto-generated method stub
					ntnf.tfIDNTN.setText("");
					ntnf.tfName.setText("");
					ntnf.tfNgaysinh.setText("");
					ntnf.tfPhone.setText("");
					ntnf.tfGender.setText("");
					ntnf.tfCccd.setText("");
					ntnf.tfAddress.setText("");
					ntnf.tfNgayVaoO.setText("");
					ntnf.tfTiendien.setText("");
					ntnf.tfTiennuoc.setText("");
					ntnf.tfTiennha.setText("");
					ntnf.tfNgaytratien.setText("");
					ntnf.tfTinhtrangnoptien.setText("");
					
				}
			});
			
			pnNTN1.add(ntnf,BorderLayout.CENTER);
			pnNTN1.add(pnNTNC,BorderLayout.EAST);
			
			JPanel pnNTN2 = new JPanel();
			pnNTN2.setLayout(new BorderLayout());
			TableForm table = new TableForm(dbCon, ntnf);
			pnNTN2.add(table,BorderLayout.CENTER);
		pnCenterNTN.add(pnNTN1);
		pnCenterNTN.add(pnNTN2);
		JPanel pnTK = new JPanel();
		pnTK.setLayout(new FlowLayout(15));
		JLabel lbbd = new JLabel("Tìm kiếm: ");
		JTextField tfbd = new JTextField(25);
		String [] Timkiem = new String[] {"-Chọn-","Cccd","SDT", "Giới tính", "Địa chỉ", "Ngày vào ở", "Ngày trả tiền", "Tình trạng nộp tiền"};
		 cbtk = new JComboBox(Timkiem);
	
		
		JButton btTK = new JButton("Tìm kiếm");
		JButton btkt = new JButton("OK");
		btkt.setBackground(Color.LIGHT_GRAY);
		btTK.setBackground(Color.LIGHT_GRAY);
		btTK.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QLTN.class.getResource("Search.png"))));
		btkt.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QLTN.class.getResource("Accept.png"))));
		pnTK.add(lbbd);
		pnTK.add(tfbd);
		pnTK.add(cbtk);
		pnTK.add(btTK);
		pnTK.add(btkt);
		
		
		pnNTN1.add(pnTK, BorderLayout.SOUTH);
			
		
		JPanel pnbetween = new JPanel();
		pnbetween.setLayout(new FlowLayout(15));
		JLabel lbtngay = new JLabel("Từ ngày: ");
		JTextField tftn = new JTextField(20);
		JLabel lbdngay = new JLabel("Đến ngày: ");
		JTextField tfdn = new JTextField(20);
		pnbetween.add(lbtngay);
		pnbetween.add(tftn);
		pnbetween.add(lbdngay);
		pnbetween.add(tfdn);
		pnNTN2.add(pnbetween, BorderLayout.NORTH);
		
		JButton btTK1 = new JButton("Tìm kiếm");
		JButton btkt1 = new JButton("OK");
		btkt1.setBackground(Color.LIGHT_GRAY);
		btTK1.setBackground(Color.LIGHT_GRAY);
		btTK1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QLTN.class.getResource("Search.png"))));
		btkt1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QLTN.class.getResource("Accept.png"))));
		pnbetween.add(btTK1);
		pnbetween.add(btkt1);
		
		
		btTK1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String bdau = tftn.getText();
				String kthuc = tfdn.getText();
				ResultSet rs2 =dbCon.selectBT(bdau, kthuc);
				try {
					table.dm.setRowCount(0);
					while(rs2.next()) {
						String idntn = rs2.getString(1);
						String name = rs2.getString(2);
						String ngaysinh = rs2.getString(3);
						String phone = rs2.getString(4);
						String gender = rs2.getString(5);
						String cccd = rs2.getString(6);
						String address = rs2.getString(7);
						String ngayVaoO = rs2.getString(8);
						String tiendien = rs2.getString(9);
						String tiennuoc = rs2.getString(10);
						String tiennha = rs2.getString(11);
						String ngaytratien = rs2.getString(12);
						String tinhtrangnoptien = rs2.getString(13);
						
						table.dm.addRow(new String [] { idntn, name,ngaysinh, phone, gender, cccd, address, ngayVaoO, tiendien, tiennuoc,tiennha, ngaytratien,tinhtrangnoptien});
					}
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		btkt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				table.dm.setRowCount(0);
				table.putDataToTableNTN();
			}
		});
		
		btTK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(cbtk.getSelectedItem().toString().equals("Cccd")) {
					String batdau = tfbd.getText();
					ResultSet rs1 = dbCon.selectcccd(batdau);
					try {
						table.dm.setRowCount(0);
						while(rs1.next()) {
							String idntn = rs1.getString(1);
							String name = rs1.getString(2);
							String ngaysinh = rs1.getString(3);
							String phone = rs1.getString(4);
							String gender = rs1.getString(5);
							String cccd = rs1.getString(6);
							String address = rs1.getString(7);
							String ngayVaoO = rs1.getString(8);
							String tiendien = rs1.getString(9);
							String tiennuoc = rs1.getString(10);
							String tiennha = rs1.getString(11);
							String ngaytratien = rs1.getString(12);
							String tinhtrangnoptien = rs1.getString(13);
							
							table.dm.addRow(new String [] { idntn, name,ngaysinh, phone, gender, cccd, address, ngayVaoO, tiendien, tiennuoc,tiennha, ngaytratien,tinhtrangnoptien});}
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				}else if (cbtk.getSelectedItem().toString().equals("Giới tính")) {
					String batdau1 = tfbd.getText();
					ResultSet rs1 = dbCon.selectgt(batdau1);
					try {
						table.dm.setRowCount(0);
						while(rs1.next()) {
							String idntn = rs1.getString(1);
							String name = rs1.getString(2);
							String ngaysinh = rs1.getString(3);
							String phone = rs1.getString(4);
							String gender = rs1.getString(5);
							String cccd = rs1.getString(6);
							String address = rs1.getString(7);
							String ngayVaoO = rs1.getString(8);
							String tiendien = rs1.getString(9);
							String tiennuoc = rs1.getString(10);
							String tiennha = rs1.getString(11);
							String ngaytratien = rs1.getString(12);
							String tinhtrangnoptien = rs1.getString(13);
							
							table.dm.addRow(new String [] { idntn, name,ngaysinh, phone, gender, cccd, address, ngayVaoO, tiendien, tiennuoc,tiennha, ngaytratien,tinhtrangnoptien});
						}
					} catch (Exception e3) {
						// TODO: handle exception
						e3.printStackTrace();
					}
				}
				else if(cbtk.getSelectedItem().toString().equals("Địa chỉ")) {
					String batdau2 = tfbd.getText();
					ResultSet rs1 = dbCon.selectdc(batdau2);
					try {
						table.dm.setRowCount(0);
						while(rs1.next()) {
							String idntn = rs1.getString(1);
							String name = rs1.getString(2);
							String ngaysinh = rs1.getString(3);
							String phone = rs1.getString(4);
							String gender = rs1.getString(5);
							String cccd = rs1.getString(6);
							String address = rs1.getString(7);
							String ngayVaoO = rs1.getString(8);
							String tiendien = rs1.getString(9);
							String tiennuoc = rs1.getString(10);
							String tiennha = rs1.getString(11);
							String ngaytratien = rs1.getString(12);
							String tinhtrangnoptien = rs1.getString(13);
							
							table.dm.addRow(new String [] { idntn, name,ngaysinh, phone, gender, cccd, address, ngayVaoO, tiendien, tiennuoc,tiennha, ngaytratien,tinhtrangnoptien});
						}
					} catch (Exception e4) {
						// TODO: handle exception
						e4.printStackTrace();
					}
				}
				else if(cbtk.getSelectedItem().toString().equals("Ngày vào ở")) {
					String batdau3 = tfbd.getText();
					ResultSet rs1 = dbCon.selectnvo(batdau3);
					try {
						table.dm.setRowCount(0);
						while(rs1.next()) {
							String idntn = rs1.getString(1);
							String name = rs1.getString(2);
							String ngaysinh = rs1.getString(3);
							String phone = rs1.getString(4);
							String gender = rs1.getString(5);
							String cccd = rs1.getString(6);
							String address = rs1.getString(7);
							String ngayVaoO = rs1.getString(8);
							String tiendien = rs1.getString(9);
							String tiennuoc = rs1.getString(10);
							String tiennha = rs1.getString(11);
							String ngaytratien = rs1.getString(12);
							String tinhtrangnoptien = rs1.getString(13);
							
							table.dm.addRow(new String [] { idntn, name,ngaysinh, phone, gender, cccd, address, ngayVaoO, tiendien, tiennuoc,tiennha, ngaytratien,tinhtrangnoptien});
						}
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				}
				else if(cbtk.getSelectedItem().toString().equals("Ngày trả tiền")) {
					String batdau4 = tfbd.getText();
					ResultSet rs1 = dbCon.selectntt(batdau4);
					try {
						table.dm.setRowCount(0);
						while(rs1.next()) {
							String idntn = rs1.getString(1);
							String name = rs1.getString(2);
							String ngaysinh = rs1.getString(3);
							String phone = rs1.getString(4);
							String gender = rs1.getString(5);
							String cccd = rs1.getString(6);
							String address = rs1.getString(7);
							String ngayVaoO = rs1.getString(8);
							String tiendien = rs1.getString(9);
							String tiennuoc = rs1.getString(10);
							String tiennha = rs1.getString(11);
							String ngaytratien = rs1.getString(12);
							String tinhtrangnoptien = rs1.getString(13);
							
							table.dm.addRow(new String [] { idntn, name,ngaysinh, phone, gender, cccd, address, ngayVaoO, tiendien, tiennuoc,tiennha, ngaytratien,tinhtrangnoptien});
						}
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				}
				else if(cbtk.getSelectedItem().toString().equals("Tình trạng nộp tiền")) {
					String batdau5 = tfbd.getText();
					ResultSet rs1 = dbCon.selectttnt(batdau5);
					try {
						table.dm.setRowCount(0);
						while(rs1.next()) {
							String idntn = rs1.getString(1);
							String name = rs1.getString(2);
							String ngaysinh = rs1.getString(3);
							String phone = rs1.getString(4);
							String gender = rs1.getString(5);
							String cccd = rs1.getString(6);
							String address = rs1.getString(7);
							String ngayVaoO = rs1.getString(8);
							String tiendien = rs1.getString(9);
							String tiennuoc = rs1.getString(10);
							String tiennha = rs1.getString(11);
							String ngaytratien = rs1.getString(12);
							String tinhtrangnoptien = rs1.getString(13);
							
							table.dm.addRow(new String [] { idntn, name,ngaysinh, phone, gender, cccd, address, ngayVaoO, tiendien, tiennuoc,tiennha, ngaytratien,tinhtrangnoptien});
						}
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				}
				else if (cbtk.getSelectedItem().toString().equals("SDT")) {
					String batdau6 = tfbd.getText();
					ResultSet rs1 = dbCon.selectsdt(batdau6);
					try {
						table.dm.setRowCount(0);
						while(rs1.next()) {
							String idntn = rs1.getString(1);
							String name = rs1.getString(2);
							String ngaysinh = rs1.getString(3);
							String phone = rs1.getString(4);
							String gender = rs1.getString(5);
							String cccd = rs1.getString(6);
							String address = rs1.getString(7);
							String ngayVaoO = rs1.getString(8);
							String tiendien = rs1.getString(9);
							String tiennuoc = rs1.getString(10);
							String tiennha = rs1.getString(11);
							String ngaytratien = rs1.getString(12);
							String tinhtrangnoptien = rs1.getString(13);
							
							table.dm.addRow(new String [] { idntn, name,ngaysinh, phone, gender, cccd, address, ngayVaoO, tiendien, tiennuoc,tiennha, ngaytratien,tinhtrangnoptien});
						}
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				}
			
			}
		});
		
		btkt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				table.dm.setRowCount(0);
				table.putDataToTableNTN();
			}
		});
		
		
		themntn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String idntn = ntnf.tfIDNTN.getText();
				String name = ntnf.tfName.getText();
				String ngaysinh = ntnf.tfNgaysinh.getText();
				String phone = ntnf.tfPhone.getText();
				String gender = ntnf.tfGender.getText();
				String cccd = ntnf.tfCccd.getText();
				String address = ntnf.tfAddress.getText();
				
				String ngayVaoO = ntnf.tfNgayVaoO.getText();
				int tiendien = Integer.parseInt(ntnf.tfTiendien.getText());
				int tiennuoc = Integer.parseInt(ntnf.tfTiennuoc.getText());
				int tiennha = Integer.parseInt(ntnf.tfTiennha.getText());
				String ngaytratien = ntnf.tfNgaytratien.getText();
				String tinhtrangnoptien = ntnf.tfTinhtrangnoptien.getText();
				dbCon.addNguoiThueNha(idntn, name,ngaysinh, phone, gender, cccd, address, ngayVaoO, tiendien, tiennuoc, tiennha, ngaytratien, tinhtrangnoptien);
				table.dm.setRowCount(0);
				table.putDataToTableNTN();
			}
		});
		xoantn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String idntn = ntnf.tfIDNTN.getText();
				dbCon.deleteNTN(idntn);
				table.dm.setRowCount(0);//xóa hết dữ liệu trong bảng
				table.putDataToTableNTN();// cập nhât lại dữ liệu trong bảng
			}
		});
		suantn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String idntn = ntnf.tfIDNTN.getText();
				String name = ntnf.tfName.getText();
				String ngaysinh = ntnf.tfNgaysinh.getText();
				String phone = ntnf.tfPhone.getText();
				String gender = ntnf.tfGender.getText();
				String cccd = ntnf.tfCccd.getText();
				String address = ntnf.tfAddress.getText();
				String ngayVaoO = ntnf.tfNgayVaoO.getText();
				int tiendien = Integer.parseInt(ntnf.tfTiendien.getText());
				int tiennuoc = Integer.parseInt(ntnf.tfTiennuoc.getText());
				int tiennha = Integer.parseInt(ntnf.tfTiennha.getText());
				String ngaytratien = ntnf.tfNgaytratien.getText();
				String tinhtrangnoptien = ntnf.tfTinhtrangnoptien.getText();
				dbCon.updateNTN(idntn, name,ngaysinh, phone, gender, cccd, address, ngayVaoO, tiendien, tiennuoc, tiennha, ngaytratien, tinhtrangnoptien);
				table.dm.setRowCount(0);
				table.putDataToTableNTN();;
			}
		});
		
		exitntn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		
		
		pnCard.add(pnCenterNTN, "ntn");
		
		
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BorderLayout());
		
		
		
		pnMain.add(pnCard,BorderLayout.CENTER);
		
		Container cn = getContentPane();
		cn.add(pnMain);
	}
}	
