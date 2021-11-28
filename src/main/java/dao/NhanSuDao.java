package dao;

import java.rmi.RemoteException;

import entity.NhanSu;

public interface NhanSuDao {
public boolean addNhanSu(NhanSu nhanSu) ;
	
	public NhanSu getNhanSu(String name);
	public boolean updateNhansu(NhanSu nhanSu);
	
	public boolean deleteProduct(String id);
}
