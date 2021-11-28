package entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "congViecs")
public class CongViec implements Serializable {
	
	
	 

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5239920026346903351L;
	public CongViec() {
		// TODO Auto-generated constructor stub
	}
	@ManyToOne
	@JoinColumn(name = "duAn_Id")
	private DuAn duAn;
	
	@Id
	private String maCongViec;
	@Column(name = "so_LuongNV")
	private String soluongNV;
	@Column(name = "cong_viec")
	private String CongViec;
	@Column(name = "so_luongHC")
	private String soLuongNhanSuHienCo;
	@Column(name = "ngay_thamGia")
	private String ngayThamGiaCv;
	@Column(name = "ngay_hoanThanh")
	private String ngayHoanThanhCV;
	@Column(name = "trang_Thai")
	private String trangThaiCV;
	
	
	
	
	
	@ElementCollection(fetch = FetchType.EAGER)
	private List<bangCong> bangCongs;









	public CongViec(String maCongViec, String soluongNV, String congViec, String soLuongNhanSuHienCo,
			String ngayThamGiaCv, String ngayHoanThanhCV, String trangThaiCV) {
		super();
		this.maCongViec = maCongViec;
		this.soluongNV = soluongNV;
		CongViec = congViec;
		this.soLuongNhanSuHienCo = soLuongNhanSuHienCo;
		this.ngayThamGiaCv = ngayThamGiaCv;
		this.ngayHoanThanhCV = ngayHoanThanhCV;
		this.trangThaiCV = trangThaiCV;
	}





	public DuAn getDuAn() {
		return duAn;
	}





	public void setDuAn(DuAn duAn) {
		this.duAn = duAn;
	}





	public String getMaCongViec() {
		return maCongViec;
	}





	public void setMaCongViec(String maCongViec) {
		this.maCongViec = maCongViec;
	}





	public String getSoluongNV() {
		return soluongNV;
	}





	public void setSoluongNV(String soluongNV) {
		this.soluongNV = soluongNV;
	}





	public String getCongViec() {
		return CongViec;
	}





	public void setCongViec(String congViec) {
		CongViec = congViec;
	}





	public String getSoLuongNhanSuHienCo() {
		return soLuongNhanSuHienCo;
	}





	public void setSoLuongNhanSuHienCo(String soLuongNhanSuHienCo) {
		this.soLuongNhanSuHienCo = soLuongNhanSuHienCo;
	}





	public String getNgayThamGiaCv() {
		return ngayThamGiaCv;
	}





	public void setNgayThamGiaCv(String ngayThamGiaCv) {
		this.ngayThamGiaCv = ngayThamGiaCv;
	}





	public String getNgayHoanThanhCV() {
		return ngayHoanThanhCV;
	}





	public void setNgayHoanThanhCV(String ngayHoanThanhCV) {
		this.ngayHoanThanhCV = ngayHoanThanhCV;
	}





	public String getTrangThaiCV() {
		return trangThaiCV;
	}





	public void setTrangThaiCV(String trangThaiCV) {
		this.trangThaiCV = trangThaiCV;
	}





	public List<bangCong> getBangCongs() {
		return bangCongs;
	}





	public void setBangCongs(List<bangCong> bangCongs) {
		this.bangCongs = bangCongs;
	}





	@Override
	public String toString() {
		return "CongViec [maCongViec=" + maCongViec + ", soluongNV=" + soluongNV + ", CongViec=" + CongViec
				+ ", soLuongNhanSuHienCo=" + soLuongNhanSuHienCo + ", ngayThamGiaCv=" + ngayThamGiaCv
				+ ", ngayHoanThanhCV=" + ngayHoanThanhCV + ", trangThaiCV=" + trangThaiCV + ", bangCongs=" + bangCongs
				+ "]";
	}





	
	
	
	
	
	

	
	
	

	

}

