package entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name = "duAns")
public class DuAn implements Serializable{

	
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -8156073607585542107L;
	@Id
	private String maDuAn;
	@Column(name="ten_duAn", nullable = false, unique = true)
	
	private String tenDuAn;
	@Column(name="chu_dauTu")
	private String chuDauTu;
	@Column(name="trang_Thai")
	private String trangThai;
	@Column(name="ngay_capPhep")
	private Date ngayCapPhep;
	@Column(name="ngay_khoiCong")
	private Date ngayKhoiCong;
	@Column(name="ngay_hoanThanh")
	private Date ngayHoanThanh;
	@Column(name="dia_diem")
	private String diaDiemThiCong;
	@Column(name="so_Luong")
	private String soLuongNhanSu;
	@Column(name="ghi_chu")
	private String ghiChu;
	
	
	
	public DuAn() {
		
	}



	public DuAn(String maDuAn, String tenDuAn, String chuDauTu, String trangThai, Date ngayCapPhep, Date ngayKhoiCong,
			Date ngayHoanThanh, String diaDiemThiCong, String soLuongNhanSu, String ghiChu) {
		super();
		this.maDuAn = maDuAn;
		this.tenDuAn = tenDuAn;
		this.chuDauTu = chuDauTu;
		this.trangThai = trangThai;
		this.ngayCapPhep = ngayCapPhep;
		this.ngayKhoiCong = ngayKhoiCong;
		this.ngayHoanThanh = ngayHoanThanh;
		this.diaDiemThiCong = diaDiemThiCong;
		this.soLuongNhanSu = soLuongNhanSu;
		this.ghiChu = ghiChu;
	}



	public String getMaDuAn() {
		return maDuAn;
	}



	public void setMaDuAn(String maDuAn) {
		this.maDuAn = maDuAn;
	}



	public String getTenDuAn() {
		return tenDuAn;
	}



	public void setTenDuAn(String tenDuAn) {
		this.tenDuAn = tenDuAn;
	}



	public String getChuDauTu() {
		return chuDauTu;
	}



	public void setChuDauTu(String chuDauTu) {
		this.chuDauTu = chuDauTu;
	}



	public String getTrangThai() {
		return trangThai;
	}



	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}



	public Date getNgayCapPhep() {
		return ngayCapPhep;
	}



	public void setNgayCapPhep(Date ngayCapPhep) {
		this.ngayCapPhep = ngayCapPhep;
	}



	public Date getNgayKhoiCong() {
		return ngayKhoiCong;
	}



	public void setNgayKhoiCong(Date ngayKhoiCong) {
		this.ngayKhoiCong = ngayKhoiCong;
	}



	public Date getNgayHoanThanh() {
		return ngayHoanThanh;
	}



	public void setNgayHoanThanh(Date ngayHoanThanh) {
		this.ngayHoanThanh = ngayHoanThanh;
	}



	public String getDiaDiemThiCong() {
		return diaDiemThiCong;
	}



	public void setDiaDiemThiCong(String diaDiemThiCong) {
		this.diaDiemThiCong = diaDiemThiCong;
	}



	public String getSoLuongNhanSu() {
		return soLuongNhanSu;
	}



	public void setSoLuongNhanSu(String soLuongNhanSu) {
		this.soLuongNhanSu = soLuongNhanSu;
	}



	public String getGhiChu() {
		return ghiChu;
	}



	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}



	@Override
	public String toString() {
		return "DuAn [maDuAn=" + maDuAn + ", tenDuAn=" + tenDuAn + ", chuDauTu=" + chuDauTu + ", trangThai=" + trangThai
				+ ", ngayCapPhep=" + ngayCapPhep + ", ngayKhoiCong=" + ngayKhoiCong + ", ngayHoanThanh=" + ngayHoanThanh
				+ ", diaDiemThiCong=" + diaDiemThiCong + ", soLuongNhanSu=" + soLuongNhanSu + ", ghiChu=" + ghiChu
				+ "]";
	}
	
	
	
	

}

