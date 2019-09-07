package se.iuh.minhkha.entity;

public class NhanVien {
	private int maNV;
	private String tenNV;
	private String cmnd;
	private String gioitinh;
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhanVien(int maNV, String tenNV, String cmnd, String gioitinh) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.cmnd = cmnd;
		this.gioitinh = gioitinh;
	}
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
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", tenNV=" + tenNV + ", cmnd=" + cmnd + ", gioitinh=" + gioitinh + "]";
	}
	
}
