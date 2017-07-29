/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsflesson;

import com.mycompany.jsflesson.model.Post;
import java.util.Date;
import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author RENT
 */
@ManagedBean(name = "guestsController")
@RequestScoped
public class GuestsController {
    
    
    @ManagedProperty (value = "#{applicationController}")
    private ApplicationController applicationController;
    
    @ManagedProperty (value = "#{sessionController}")
    private SessionController sessionController;
    
    
    
    private Post post = new Post();

    /**
     * Creates a new instance of GuestsController
     */
    public GuestsController() {
        
    }
    
    @PostConstruct
    public void after(){
        sessionController.addCount();
    }

    public SessionController getSessionController() {
        return sessionController;
    }

    public void setSessionController(SessionController sessionController) {
        this.sessionController = sessionController;
    }
    
    
    public ApplicationController getApplicationController() {
        return applicationController;
    }

    public void setApplicationController(ApplicationController applicationController) {
        this.applicationController = applicationController;
    }
    
    

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
    
    public void save() {
        
        
        EntityManager em = applicationController.getEntityManager();

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        post.setAdddate(new Date());
        em.persist(post);
        transaction.commit();
        
        


    }
    
    
}
