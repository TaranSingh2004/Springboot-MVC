package org.example.HelloWorld.Controller;

import org.example.HelloWorld.Components.IplTeam;
import org.example.HelloWorld.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serial;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    Service service;

    @GetMapping("/ipl")
    public List<IplTeam> getIplTeams(){
        List<IplTeam> teamList = service.getIplTeams();
        return teamList;
    }
    @GetMapping("/iplJDBC")
    public ArrayList<IplTeam> getTeams() throws SQLException, ClassNotFoundException {
        ArrayList<IplTeam> teamList = service.getTeamsJDBC();
        return teamList;
    }
}
