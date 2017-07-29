/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsflesson;


import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

/**
 *
 * @author RENT
 */
@ManagedBean(name = "applicationController")
@ApplicationScoped
public class ApplicationController {
    
    private String ver = "0.6.6.6";
    
    //private List<Post> posts = new ArrayList<>();
   
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    

    public ApplicationController(){
        emf = Persistence.createEntityManagerFactory("pu");
        em = emf.createEntityManager();
    }

    public EntityManager getEntityManager(){
        return em;
    }


    /**
     * Creates a new instance of ApplicationController
     */
    
    
    public String getVer() {
        return ver;
    }

//    public List<Post> getPosts() {
//        return posts;
//    }
//
//    public void setPosts(List<Post> posts) {
//        this.posts = posts;
//    }
//    
//    public void addPost(Post p) {
//        posts.add(p);
//    }
    
    
    
    
    
}
