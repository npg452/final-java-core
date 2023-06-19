package controller;

//import java.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import view.NguoiThueNha;

public class ConnectionDB {
	Statement stmt;
	public ConnectionDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// tải driver của mysql vào hệ thống
			try {
				Connection dbCon = DriverManager.getConnection("jdbc:mySQL://localhost:3306/qltn2","root","");
				  stmt = (Statement) dbCon.createStatement();
				System.out.println("connected");// tạo một đối tượng Statement từ đối tượng Connection để thực thi các truy vấn SQL.
				} catch (Exception e) {
				// TODO: handle exception
					e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	// Statement cung cấp phương thức để tạo ra đối tượng Result Set
	public static void main(String[] args) {
		
		new ConnectionDB();
	}
	public void addNguoiThueNha(String idntn, String name,String ngaysinh, String phone, String gender, String cccd, String address, String ngayVaoO
			, int tiendien, int tiennuoc, int tiennha, String ngaytratien, String tinhtrangnoptien) {
		String sql = "insert into nguoithuenha(idntn, name,ngaysinh, phone, gender, cccd, address, ngayVaoO, tiendien,tiennuoc, tiennha, ngaytratien, tinhtrangnoptien) values (\'" +idntn + "\', \'"
	                    + name +"\', \'"+ ngaysinh +"\', \'"+ phone +"\', \'"+ gender 
	                    +"\', \'"+cccd +"\', \'"+address +"\', \'"+ngayVaoO+"\', \'"+ tiendien +"\', \'"+ tiennuoc +"\', \'"+ tiennha +"\', \'"+ ngaytratien +"\', \'"+ tinhtrangnoptien +"\')";
		try {
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public ResultSet selectAll(String tableName) {// phương thức trả bề tất cả dữ liệu từ 1 bảng cụ thể trong csdl
		ResultSet rs = null;
		String sql = "select *from "+tableName;
		try {
			
			rs = ((java.sql.Statement) stmt).executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public void deleteNTN(String idntn) {
		String sql = "delete from nguoithuenha where idntn = \'" +idntn+"\'";
		try {
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateNTN(String idntn, String name,String ngaysinh, String phone, String gender, String cccd, String address, String ngayVaoO,
			int tiendien, int tiennuoc, int tiennha, String ngaytratien, String tinhtrangnoptien) {
		String sql = "update nguoithuenha set idntn= \'"+idntn+"\', name= \'"+name+"\', ngaysinh= \'"+ngaysinh+"\', phone= \'"+phone+"\', gender= \'"+gender+"\', cccd= \'"+cccd
				+"\', address= \'"+address+"\', ngayVaoO= \'"+ngayVaoO+"\', tiendien= \'"+tiendien+"\', tiennuoc= \'"+tiennuoc+"\', tiennha= \'"+tiennha
				+"\', ngaytratien= \'"+ngaytratien +"\', tinhtrangnoptien= \'"+tinhtrangnoptien+"\' where idntn= \'" + idntn +"\'";
		try {
			stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
	}
	public ResultSet selectnvo(String ngayVaoO) {
		ResultSet rs = null;
		String sql = "select * from nguoithuenha where ngayVaoO = \'" + ngayVaoO +"\'";
		try {
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rs;
	}
	public ResultSet selectcccd(String cccd) {
		ResultSet rs = null;
		String sql = "select * from nguoithuenha where cccd = \'" + cccd +"\'";
		try {
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rs;
	}
	public ResultSet selectgt(String gender) {
		ResultSet rs = null;
		String sql = "select * from nguoithuenha where gender = \'" + gender +"\'";
		try {
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rs;
	}
	public ResultSet selectdc(String address) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		String sql = "select * from nguoithuenha where address = \'" + address +"\'";
		try {
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rs;
	}
	public ResultSet selectntt(String ngaytratien) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		String sql = "select * from nguoithuenha where ngaytratien = \'" + ngaytratien +"\'";
		try {
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rs;
	}
	public ResultSet selectttnt(String tinhtrangnoptien) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		String sql = "select * from nguoithuenha where tinhtrangnoptien = \'" + tinhtrangnoptien +"\'";
		try {
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rs;
	}
	public ResultSet selectsdt(String phone) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		String sql = "select * from nguoithuenha where phone = \'" + phone +"\'";
		try {
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rs;
	}
	public ResultSet selectBT(String bdau, String kthuc) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		String sql = "select * from nguoithuenha where ngayVaoO between \'" + bdau + "\' and \'" + kthuc + "\'";
		try {
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rs;
	}
}
