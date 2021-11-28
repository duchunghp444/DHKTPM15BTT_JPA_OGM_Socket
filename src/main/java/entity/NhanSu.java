package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.ogm.options.shared.IndexOption;
import org.hibernate.ogm.options.shared.IndexOptions;

@Entity
@Table(name="nhansus", indexes = {
		@Index(columnList = "nhansu_name", name="nhansu_name_text")
})
@IndexOptions(@IndexOption(forIndex = "nhansu_name_text", options = "{text:true}"))
public class NhanSu implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -661979011821823495L;
	@Id
	private String maNhanSu;
	@Column(name = "nhansu_name", nullable = false)
	private String hoTen;
	@Column(name = "gioi_tinh")
	private String gioiTinh;
	@Column(name = "ngay_sinh")
	private String ngaySinh;
	@Column(name = "ten_phong")
	private String tenPhongBan;
	@Column(name = "que_quan")
	private String queQuan;
	@Column(name = "dia_chi")
	private String diachiLienHe;
	@Column(name = "trang_thai")
	private String trangthai;
	@Column(name = "so_dt")
	private String sdt;
	@Column(name = "loai_ns")
	private String loaiNhanSu;
	@Column(name = "so_cmnn")
	private String soCMNN;
	
	
	@ElementCollection
	private List<NgayCongNhanSu> empls = new ArrayList<>();

	
	
	
	
	@ManyToOne
	@JoinColumn(name = "phongBan_id")
	private PhongBan  phongBan ;
	
	
	@ManyToOne
	@JoinColumn(name = "chucVu_id")
	private ChucVu chucVu  ;
	public NhanSu() {
		
	}
	
	
	
	
	public NhanSu(String maNhanSu, String hoTen, String gioiTinh, String ngaySinh, String tenPhongBan, String queQuan,
			String diachiLienHe, String trangthai, String sdt, String loaiNhanSu, String soCMNN) {
		super();
		this.maNhanSu = maNhanSu;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.tenPhongBan = tenPhongBan;
		this.queQuan = queQuan;
		this.diachiLienHe = diachiLienHe;
		this.trangthai = trangthai;
		this.sdt = sdt;
		this.loaiNhanSu = loaiNhanSu;
		this.soCMNN = soCMNN;
	}




	public String getMaNhanSu() {
		return maNhanSu;
	}




	public void setMaNhanSu(String maNhanSu) {
		this.maNhanSu = maNhanSu;
	}




	public String getHoTen() {
		return hoTen;
	}




	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}




	public String getGioiTinh() {
		return gioiTinh;
	}




	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}




	public String getNgaySinh() {
		return ngaySinh;
	}




	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}




	public String getTenPhongBan() {
		return tenPhongBan;
	}




	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}




	public String getQueQuan() {
		return queQuan;
	}




	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}




	public String getDiachiLienHe() {
		return diachiLienHe;
	}




	public void setDiachiLienHe(String diachiLienHe) {
		this.diachiLienHe = diachiLienHe;
	}




	public String getTrangthai() {
		return trangthai;
	}




	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}




	public String getSdt() {
		return sdt;
	}




	public void setSdt(String sdt) {
		this.sdt = sdt;
	}




	public String getLoaiNhanSu() {
		return loaiNhanSu;
	}




	public void setLoaiNhanSu(String loaiNhanSu) {
		this.loaiNhanSu = loaiNhanSu;
	}




	public String getSoCMNN() {
		return soCMNN;
	}




	public void setSoCMNN(String soCMNN) {
		this.soCMNN = soCMNN;
	}




	public List<NgayCongNhanSu> getEmpls() {
		return empls;
	}




	public void setEmpls(List<NgayCongNhanSu> empls) {
		this.empls = empls;
	}




	public PhongBan getPhongBan() {
		return phongBan;
	}




	public void setPhongBan(PhongBan phongBan) {
		this.phongBan = phongBan;
	}




	public ChucVu getChucVu() {
		return chucVu;
	}




	public void setChucVu(ChucVu chucVu) {
		this.chucVu = chucVu;
	}




	public void addDetail( CongViec congViec, String ngayThamGia, String ngayHoanThanh,  String soNgayCong) {
		NgayCongNhanSu detail = new NgayCongNhanSu(congViec, ngayThamGia, ngayHoanThanh, soNgayCong);
		empls.add(detail);
		
	}
	



	@Override
	public String toString() {
		return "NhanSu [maNhanSu=" + maNhanSu + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh
				+ ", tenPhongBan=" + tenPhongBan + ", queQuan=" + queQuan + ", diachiLienHe=" + diachiLienHe
				+ ", trangthai=" + trangthai + ", sdt=" + sdt + ", loaiNhanSu=" + loaiNhanSu + ", soCMNN=" + soCMNN
				+ "]";
	}
	
	
	
	
	
	
	
	

}

