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

@Table(name = "taiKhoans")
public class TaiKhoan  implements Serializable{
	
	
	

	@ManyToOne
	@JoinColumn(name = "chucVu_id")
	private ChucVu chucVu;
	
	@Column(name="ten_Tk")
	private String tenTK;
	@Column(name="mat_Khau")
	private String matKhau;
	public TaiKhoan() {
		
	}
	public TaiKhoan(ChucVu chucVu, String tenTK, String matKhau) {
		super();
		this.chucVu = chucVu;
		this.tenTK = tenTK;
		this.matKhau = matKhau;
	}
	public ChucVu getChucVu() {
		return chucVu;
	}
	public void setChucVu(ChucVu chucVu) {
		this.chucVu = chucVu;
	}
	public String getTenTK() {
		return tenTK;
	}
	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	@Override
	public String toString() {
		return "TaiKhoan [chucVu=" + chucVu + ", tenTK=" + tenTK + ", matKhau=" + matKhau + "]";
	}
	
	

}

