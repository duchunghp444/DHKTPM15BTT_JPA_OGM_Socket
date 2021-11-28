package app;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.ogm.OgmSession;

import dao.impl.NhanSuImpl;
import entity.CongViec;
import entity.NhanSu;
import util.HibernateUtil;

public class App {
	public static void main(String[] args) throws RemoteException, IllegalStateException, SystemException {

		EntityManager em = HibernateUtil.getInstance().getEntityManager();
		NhanSuImpl nvImpl = new NhanSuImpl(em);
		NhanSu nhanSu1 = new NhanSu("1231",  "NguyenDucHuy11",  "Nam",  "28/01/2000", "Chu","hcm", "hcm", "Tu Do", "01233445565", "Thuong", "12461413242");
		CongViec congViec = new CongViec("12", "12", "12", "12", "12", "12", "12");
		congViec.setMaCongViec("12");
		nhanSu1.addDetail(congViec, "12", "12", "12");
		
		NhanSu nhanSu2 = new NhanSu("1232",  "NguyenDucHuy11",  "Nam",  "28/01/2000", "Chu","hcm", "hcm", "Tu Do", "01233445565", "Thuong", "12461413242");
		CongViec congViec2 = new CongViec("12", "12", "12", "12", "12", "12", "12");
		congViec.setMaCongViec("12");
		nhanSu1.addDetail(congViec2, "12", "12", "12");
		
		NhanSu nhanSu3 = new NhanSu("1233",  "NguyenDucHuy11",  "Nam",  "28/01/2000", "Chu","hcm", "hcm", "Tu Do", "01233445565", "Thuong", "12461413242");
		CongViec congViec3 = new CongViec("12", "12", "12", "12", "12", "12", "12");
		congViec.setMaCongViec("12");
		nhanSu1.addDetail(congViec3, "12", "12", "12");
		
		NhanSu nhanSu4 = new NhanSu("1234",  "NguyenDucHuy11",  "Nam",  "28/01/2000", "Chu","hcm", "hcm", "Tu Do", "01233445565", "Thuong", "12461413242");
		CongViec congViec4 = new CongViec("12", "12", "12", "12", "12", "12", "12");
		congViec.setMaCongViec("12");
		nhanSu1.addDetail(congViec4, "12", "12", "12");
		
//		nvImpl.addNhanSu(nhanSu1);
//		nvImpl.addNhanSu(nhanSu2);
//		nvImpl.addNhanSu(nhanSu3);
//		nvImpl.addNhanSu(nhanSu4);
//		NhanSu getNhanSu = nvImpl.getNhanSu("1235");
//		if(getNhanSu == null)
//			System.out.println("Not found!");
//		else
//			System.out.println(getNhanSu);
//		
		

	}
}
