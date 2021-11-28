package entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name = "ChucVus")
public class ChucVu  implements Serializable{
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1665367636133589432L;
	@Id
	private String maChucVu;
	@Column(name="ten_nhanVien", nullable = false, unique = true)
	private String tenNhanVien;
	@Column(name="chuc_vu")
	private String chuvu;
	@Column(name="vai_tro")
	private String vaiTro;
	public ChucVu() {
		
	}
	public ChucVu(String maChucVu, String tenNhanVien, String chuvu, String vaiTro) {
		super();
		this.maChucVu = maChucVu;
		this.tenNhanVien = tenNhanVien;
		this.chuvu = chuvu;
		this.vaiTro = vaiTro;
	}
	public String getMaChucVu() {
		return maChucVu;
	}
	public void setMaChucVu(String maChucVu) {
		this.maChucVu = maChucVu;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public String getChuvu() {
		return chuvu;
	}
	public void setChuvu(String chuvu) {
		this.chuvu = chuvu;
	}
	public String getVaiTro() {
		return vaiTro;
	}
	public void setVaiTro(String vaiTro) {
		this.vaiTro = vaiTro;
	}
	@Override
	public String toString() {
		return "ChucVu [maChucVu=" + maChucVu + ", tenNhanVien=" + tenNhanVien + ", chuvu=" + chuvu + ", vaiTro="
				+ vaiTro + "]";
	}
	

}

