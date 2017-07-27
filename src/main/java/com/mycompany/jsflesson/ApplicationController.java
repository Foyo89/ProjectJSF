/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsflesson;

import com.mycompany.jsflesson.model.Post;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author RENT
 */
@Named(value = "applicationController")
@ApplicationScoped
public class ApplicationController {
    
    private String ver = "0.6.6.6";
    
    private List<Post> posts = new ArrayList<>();
   

    /**
     * Creates a new instance of ApplicationController
     */
    public ApplicationController() {
        
        
    }

    public String getVer() {
        return ver;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
    
    public void addPost(Post p) {
        posts.add(p);
    }
    
    
    
    
    
}
