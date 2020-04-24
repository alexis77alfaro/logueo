package com.logue.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.logueo.model.TbUsuariop;


public class tb_usuariopdao {
      public List<TbUsuariop> ingresoUsuario(TbUsuariop user){
    	  
    	  List<TbUsuariop> usuarios=new ArrayList();
    	  EntityManager em;
    	  EntityManagerFactory emf; 
    	  emf=Persistence.createEntityManagerFactory("logueo-hibernate");
    	  
    	  em=emf.createEntityManager();
    	  
    	  
    	  try {
    		  em.getTransaction().begin();
    		  
    		  usuarios=em.createQuery("from TbUsuariop as u where u.usuario='"+user.getUsuario()+"'and u.contrasenia='"+user.getContrasenia()+"'").getResultList();
    				  
    		   em.getTransaction().commit(); 
    		  
    	  }catch(Exception e ) {
    		 System.out.println(e);
    	  }
    	  
    	  
    	  return usuarios;
      }
}
