package view;

public class NguoiThueNha {
	String IDNTN;
	String Name;
	String Phone;
	String Gender;
	String Cccd;
	String Address;
	String NgayVaoO;
	int tiendien;
	int tiennuoc;
	int tiennha;
	String ngaytratien;
	String tinhtrangnoptien;
	public NguoiThueNha(String iDNTN, String name, String phone, String gender, String cccd, String address,
			String ngayVaoO, int tiendien, int tiennuoc, int tiennha, String ngaytratien, String tinhtrangnoptien) {
		super();
		IDNTN = iDNTN;
		Name = name;
		Phone = phone;
		Gender = gender;
		Cccd = cccd;
		Address = address;
		NgayVaoO = ngayVaoO;
		this.tiendien = tiendien;
		this.tiennuoc = tiennuoc;
		this.tiennha = tiennha;
		this.ngaytratien = ngaytratien;
		this.tinhtrangnoptien = tinhtrangnoptien;
	}
	public NguoiThueNha() {
		super();
	}
	public String getIDNTN() {
		return IDNTN;
	}
	public void setIDNTN(String iDNTN) {
		IDNTN = iDNTN;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getCccd() {
		return Cccd;
	}
	public void setCccd(String cccd) {
		Cccd = cccd;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getNgayVaoO() {
		return NgayVaoO;
	}
	public void setNgayVaoO(String ngayVaoO) {
		NgayVaoO = ngayVaoO;
	}
	public int getTiendien() {
		return tiendien;
	}
	public void setTiendien(int tiendien) {
		this.tiendien = tiendien;
	}
	public int getTiennuoc() {
		return tiennuoc;
	}
	public void setTiennuoc(int tiennuoc) {
		this.tiennuoc = tiennuoc;
	}
	public int getTiennha() {
		return tiennha;
	}
	public void setTiennha(int tiennha) {
		this.tiennha = tiennha;
	}
	public String getNgaytratien() {
		return ngaytratien;
	}
	public void setNgaytratien(String ngaytratien) {
		this.ngaytratien = ngaytratien;
	}
	public String getTinhtrangnoptien() {
		return tinhtrangnoptien;
	}
	public void setTinhtrangnoptien(String tinhtrangnoptien) {
		this.tinhtrangnoptien = tinhtrangnoptien;
	}


	
	
}
