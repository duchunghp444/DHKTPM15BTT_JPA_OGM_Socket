package entity;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Embeddable
@Table(name = "bang_congs")
public class bangCong  implements Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1469687596062804516L;


	@ManyToOne
	@JoinColumn(name = "congViec_Id")
	private CongViec congViec ;
	

	@ManyToOne
	@JoinColumn(name = "nhanSu_Id")
	private NhanSu nhanSu ;
	
	
	
	@Column(name="ngay_thamgia")
	private String ngayThamGia;
	@Column(name="ngay_hoanThanh")
	private String ngayHoanThanh;
	@Column(name="so_NgayCong")
	private String soNgayCong;
	
	public bangCong() {
		// TODO Auto-generated constructor stub
	}

	

	public bangCong(String ngayThamGia, String ngayHoanThanh, String soNgayCong) {
		super();
		this.ngayThamGia = ngayThamGia;
		this.ngayHoanThanh = ngayHoanThanh;
		this.soNgayCong = soNgayCong;
	}



	



	



	public CongViec getCongViec() {
		return congViec;
	}

	public void setCongViec(CongViec congViec) {
		this.congViec = congViec;
	}

	public NhanSu getNhanSu() {
		return nhanSu;
	}

	public void setNhanSu(NhanSu nhanSu) {
		this.nhanSu = nhanSu;
	}

	public String getNgayThamGia() {
		return ngayThamGia;
	}

	public void setNgayThamGia(String ngayThamGia) {
		this.ngayThamGia = ngayThamGia;
	}

	public String getNgayHoanThanh() {
		return ngayHoanThanh;
	}

	public void setNgayHoanThanh(String ngayHoanThanh) {
		this.ngayHoanThanh = ngayHoanThanh;
	}

	public String getSoNgayCong() {
		return soNgayCong;
	}

	public void setSoNgayCong(String soNgayCong) {
		this.soNgayCong = soNgayCong;
	}

	@Override
	public String toString() {
		return "bangCong [ngayThamGia=" + ngayThamGia + ", ngayHoanThanh=" + ngayHoanThanh + ", soNgayCong="
				+ soNgayCong + "]";
	}
	
	

}

