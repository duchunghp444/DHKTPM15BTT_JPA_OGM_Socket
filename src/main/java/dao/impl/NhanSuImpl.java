package dao.impl;

import java.rmi.RemoteException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.hibernate.Transaction;
import org.hibernate.ogm.OgmSession;
import org.hibernate.ogm.OgmSessionFactory;

import dao.NhanSuDao;

import entity.NhanSu;
import util.HibernateUtil;

public class NhanSuImpl implements NhanSuDao {

	private EntityManager em;

	public NhanSuImpl(EntityManager em) {
		// TODO Auto-generated constructor stub
		super();
		this.em = em;
	}

	public boolean addNhanSu(NhanSu nhanSu) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();
			em.persist(nhanSu);
			tr.commit();

			return true;
		} catch (Exception e) {
			tr.rollback();
		}

		return false;
	}

	public NhanSu getNhanSu(String id) {
		// TODO Auto-generated method stub
		return em.find(NhanSu.class, id);

	}

	public boolean updateNhansu(NhanSu nhanSu) {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();
			em.merge(nhanSu);
			tr.commit();

			return true;
		} catch (Exception e) {
			tr.rollback();
		}

		return false;
	}

	@Override
	public boolean deleteProduct(String id) {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();
			em.remove(em.find(NhanSu.class, id));
			tr.commit();

			return true;
		} catch (Exception e) {
			tr.rollback();
		}

		return false;
	}

}
