package org.example.HelloWorld.service;

import org.example.HelloWorld.Components.IplTeam;
import org.example.HelloWorld.DAO.Dao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Dao dao;

    public List<IplTeam> getIplTeams(){
        List<IplTeam> iplTeamList=dao.getAllTeams();
        return iplTeamList;
    }
}
