package entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Embeddable
@Table(name = "ngay_CongNSs")
public class NgayCongNhanSu implements Serializable{
	
	
	

	@ManyToOne
	@JoinColumn(name = "nhanSu_id")
	private NhanSu nhanSu ;
	
	
	@ManyToOne
	@JoinColumn(name = "congViec_id")
	private CongViec congViec  ;
	

	@Column(name="ngay_thamgia")
	private String ngayThamGiaCv;
	@Column(name="ngay_hoanThanh")
	private String ngayHoanThanhCV;
	@Column(name="so_NgayCong")
	private String soNgayCong;
	public NgayCongNhanSu() {
	
	}
	
	public NgayCongNhanSu(CongViec congViec, String ngayThamGia, String ngayHoanThanh, String soNgayCong) {
		super();
		this.congViec = congViec;
		this.ngayThamGiaCv = ngayThamGia;
		this.ngayHoanThanhCV = ngayHoanThanh;
		this.soNgayCong = soNgayCong;
	}

	public NhanSu getNhanSu() {
		return nhanSu;
	}
	public void setNhanSu(NhanSu nhanSu) {
		this.nhanSu = nhanSu;
	}
	public CongViec getCongViec() {
		return congViec;
	}
	public void setCongViec(CongViec congViec) {
		this.congViec = congViec;
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
	public String getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(String soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	@Override
	public String toString() {
		return "NgayCongNhanSu [ngayThamGiaCv=" + ngayThamGiaCv + ", ngayHoanThanhCV=" + ngayHoanThanhCV
				+ ", soNgayCong=" + soNgayCong + "]";
	}
	
	


}

