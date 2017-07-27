/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsflesson;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author RENT
 */
@Named(value = "aboutController")
@RequestScoped
public class AboutController {

    /**
     * Creates a new instance of AboutController
     */
    public AboutController() {
    }
    
}
