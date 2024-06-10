package com.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.AC;
import com.entity.ElectronicStore;
import com.entity.Mobile;
import com.entity.TV;


public class Check{
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(ElectronicStore.class);
		cfg.addAnnotatedClass(TV.class);
		cfg.addAnnotatedClass(Mobile.class);
		cfg.addAnnotatedClass(AC.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		ArrayList<TV> tvlis = new ArrayList<TV>();
		tvlis.add(new TV("SoneyUltraHD", "Soney", 70000)) ;
		
		ArrayList<Mobile> moblis = new ArrayList<Mobile>();
		moblis.add(new Mobile("Note4", "Mi", 90000)) ;
		
		
		ArrayList<AC> acList = new ArrayList<AC>();
		acList.add( new AC("MIAC", 800000)); 
		
		ElectronicStore estore = new ElectronicStore(678,"Abhi", "sdjknsd", 74899990, tvlis, moblis, acList);
		
		System.out.println(estore);
		session.save(estore);
		tx.commit();
		
		
		
		
		
		
	}
	
}
