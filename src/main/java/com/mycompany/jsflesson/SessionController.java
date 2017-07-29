/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsflesson;

import com.mycompany.jsflesson.model.User;
import javax.inject.Named;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author RENT
 */
@ManagedBean(name = "sessionController")
@SessionScoped
public class SessionController implements Serializable {
    
    private String login;
    private String password;
    
    private boolean loggedIn = false;

    /**
     * Creates a new instance of SessionController
     */
    
    private User user = new User();
    
    private Integer counter = 0;
    
    public SessionController() {
    }
    
    
    
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    public void isPasswordCorrect(){
        if (login.equals(this.user.getUser()) && password.equals(this.user.getPassword()))
        loggedIn = true;
        else loggedIn = false;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
    
    

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }
    
    public void addCount() {
        counter += 1;
    }
    
    
    
}
