package Mini_Store;

public class san_pham {
	
	// dat 
	public int so_luong;
	private String ten_sp;
	private String dvt;
	
	
	// get set
	public int getSo_luong() {
		return so_luong;
	}
	public void setSo_luong(int so_luong) {
		this.so_luong = so_luong;
	}
	public String getTen_sp() {
		return ten_sp;
	}
	public void setTen_sp(String ten_sp) {
		this.ten_sp = ten_sp;
	}
	public String getDvt()
	{
		return dvt;
	}
	public void setDvt(String dvt)
	{
		this.dvt= dvt;
	}
	// consturtor 
	public san_pham(int so_luong, String ten_sp, String dvt) {
		this.so_luong = so_luong;
		this.ten_sp = ten_sp;
		this.dvt = dvt;
	}
	// in so luong vs ten sp ra  man hinh
	public void in()
	{
		System.out.println("Ban mua so luong l: "+so_luong+"; Ten san pham la: "+ten_sp+", don vi tinh theo: "+dvt);
	}
	
	
	

}
