/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sun.tools.javac.util.List;

/**
 *
 * @author David Kolesar
 */
@Controller
public class GameController {
    
    private DVDDao dvdDao;
    private NoteDao noteDao;
    
    @Inject
    public GameController(DVDDao dvdDao, NoteDao noteDao) {
        this.dvdDao = dvdDao;
        this.noteDao = noteDao;
    }
    
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String home(Map model) {
        
        List<DVD> dvdList = dvdDao.list();
        model.put("dvdList", dvdList);
        model.put("addDVDCommand", new AddDVDCommand());
        
        return "home";
        
    }
    
}
