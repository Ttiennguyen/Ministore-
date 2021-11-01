package Mini_Store;

import java.util.Scanner;

public class Quan_Ly {
	
	// dat bien khoa 
	private String gio_hang;
	private String khach_hang;
	private String thoat;
	private String san_pham;
	private int sl;
	// tao sp 
	san_pham sp_1 = new san_pham(1,"thit","kg");
	san_pham sp_2 = new san_pham(2,"ca","con");
	san_pham sp_3 = new san_pham(3,"rau","bo");
	// thanh toan 3 sp 
	Thanh_toan Kh1 = new Thanh_toan();
	
	Nhan_vien nv_1 = new Nhan_vien(2201567, "tien");
	
	
	Scanner input = new Scanner(System.in);
	
	// get set 
	public String getGio_hang() {
		return gio_hang;
	}
	public void setGio_hang(String gio_hang) {
		this.gio_hang = gio_hang;
	}
	public String getKhach_hang() {
		return khach_hang;
	}
	public void setKhach_hang(String khach_hang) {
		this.khach_hang = khach_hang;
	}
	
	public String getThoat() {
		return thoat;
	}
	public void setThoat(String thoat) {
		this.thoat = thoat;
	}
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	// quan li nhap vao don hang
	public Quan_Ly(String gio_hang, String khach_hang,int sl) 
	{
		this.gio_hang = gio_hang;
		this.khach_hang = khach_hang;
		this.sl =sl;
	}
	
	//in ra man hinh s
	public void show()
	{
		System.out.println("Cam on khach hang: "+khach_hang+"; da mua gio hang :"+gio_hang);
		System.out.println("So luong ban mua la: "+sl+"; Don hang la:");
		sp_1.in();
		sp_2.in();
		sp_3.in();
		Kh1.show_thanhtoan();
		nv_1.in_nhanvien();
	
	}
	
	
	
	
	
	

}
