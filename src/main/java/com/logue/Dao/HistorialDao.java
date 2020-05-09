package com.logue.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.logueo.model.TbHistorial;



public class HistorialDao {
	
	
	public void agregarhistorial(TbHistorial his) {
		
		
		EntityManager em;
  	  EntityManagerFactory emf; 
  	  emf=Persistence.createEntityManagerFactory("logueo-hibernate");
  	  
  	  em=emf.createEntityManager();
  	  
  	  
		em.getTransaction().begin();
		
		em.persist(his);
		em.flush();
		em.getTransaction().commit();
	}
	
	
	public List<Object> historial(){
		List<Object> lista=new ArrayList<>();
		
		EntityManager em;
		EntityManagerFactory emf;
		
		emf=Persistence.createEntityManagerFactory("logueo-hibernate");
		em=emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			lista=em.createQuery("SELECT his.idHistorial, his.tbUsuariop.idUsuariop,his.fecha,"
					+ "usu.nombre_usuario"
					+ "FROM TbHistorial AS his INNER JOIN TbUsuariop AS usu ON"
					+ "usu.idUsuariop").getResultList();
			em.getTransaction().commit();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return lista;
		
	}
	
}
