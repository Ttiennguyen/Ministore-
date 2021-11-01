package Mini_Store;

public class Thanh_toan {
	
	private double tong_tien;
	
	// set sp ben day giong ben kia de thanh toan 
	san_pham sp_1 = new san_pham(1,"thit","kg");
	san_pham sp_2 = new san_pham(2,"ca","con");
	san_pham sp_3 = new san_pham(3,"rau","bo");

	// get set 
	public double getTong_tien() {
		return tong_tien;
	}

	public void setTong_tien(double tong_tien) {
		this.tong_tien = tong_tien;
	}

	public Thanh_toan(double tong_tien) {
		this.tong_tien = tong_tien;
	}			
	public Thanh_toan() {
	}
	
	// show thanh toan ra man hinh 
	public void show_thanhtoan()
	{	
		tong_tien=sp_1.so_luong*3000+sp_2.so_luong*4000+sp_3.so_luong*5000;
		System.out.println("so tien la "+tong_tien);
	}
	
	

}
