/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsflesson;

import com.mycompany.jsflesson.model.Post;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author RENT
 */
@Named(value = "guestsController")
@RequestScoped
public class GuestsController {
    
    
    @ManagedProperty (value = "#{applicationController}")
    private ApplicationController applicationController;
    
    private Post post = new Post();

    /**
     * Creates a new instance of GuestsController
     */
    public GuestsController() {
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
    
    public void save() {
        applicationController.addPost(post);
    }
    
    
}
