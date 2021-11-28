package entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity

@Table(name = "phongBans")
public class PhongBan implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -8438702664216255493L;
	@Id
	private String maPhongBan;
	@Column(name = "ten_PhongBan", nullable = false)
	private String tenPhongBan;
	@Column(name = "so_luong")
	private String soLuong;
	
	public PhongBan() {
	
	}

	public PhongBan(String maPhongBan, String tenPhongBan, String soLuong) {
		super();
		this.maPhongBan = maPhongBan;
		this.tenPhongBan = tenPhongBan;
		this.soLuong = soLuong;
	}

	public String getMaPhongBan() {
		return maPhongBan;
	}

	public void setMaPhongBan(String maPhongBan) {
		this.maPhongBan = maPhongBan;
	}

	public String getTenPhongBan() {
		return tenPhongBan;
	}

	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}

	public String getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(String soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		return "PhongBan [maPhongBan=" + maPhongBan + ", tenPhongBan=" + tenPhongBan + ", soLuong=" + soLuong + "]";
	}
	
	


}

