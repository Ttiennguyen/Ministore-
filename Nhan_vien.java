package Mini_Store;

public class Nhan_vien {
	
	private int maNV;
	private String tenNV;
	
	// get set 
	public int getMaNV() {
		return maNV;
	}
	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	// cons
	public Nhan_vien(int maNV, String tenNV) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
	}
	
	//in ra man hinh
	public void in_nhanvien()
	{
		System.out.println("Ten nhan vien thuc hien "+tenNV+"; ma nhan vien: "+maNV);
	}
	
	
	
	
	

}
