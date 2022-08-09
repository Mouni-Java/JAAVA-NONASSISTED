package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Product;

public class ProductDao {

		public int storeProduct(Product product) {
			try {
				Configuration con = new Configuration();
				con.configure("hibernate.cfg.xml");
				SessionFactory sf = con.buildSessionFactory();
				Session session = sf.openSession();
				
				Transaction tran = session.getTransaction();
				tran.begin();
						session.save(product);
				tran.commit();
				return 1;
			} catch (Exception e) {
				System.out.println(e);
				return 0;
			}
		}
		
		
		
	
}


