package banhang.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DMHang")
public class ProductEntity {
	@Id
	@Column (name = "MaHang")
	private String maHang;
	@Column(name="TenHang")
	private String tenHang;
	@Column(name="DonVi")
	private String donVi;
	@Column(name="Gia")
	private float gia;
	@Column(name="Anh")
	private String anh;
	@Column(name="LoaiHang")
	private String loaiHang;
	@Column(name="ChiTiet")
	private String chiTiet;
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public String getDonVi() {
		return donVi;
	}
	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public String getLoaiHang() {
		return loaiHang;
	}
	public void setLoaiHang(String loaiHang) {
		this.loaiHang = loaiHang;
	}
	
	public String getChiTiet() {
		return chiTiet;
	}
	public void setChiTiet(String chiTiet) {
		this.chiTiet = chiTiet;
	}
	public ProductEntity(String maHang, String tenHang, String donVi, float gia, String anh, String loaiHang, String chiTiet) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donVi = donVi;
		this.gia = gia;
		this.anh = anh;
		this.loaiHang = loaiHang;
		this.chiTiet = chiTiet;
	}
	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
