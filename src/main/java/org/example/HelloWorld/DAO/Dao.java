package org.example.HelloWorld.DAO;

import org.example.HelloWorld.Components.IplTeam;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class Dao {
    List<IplTeam> iplTeams = Arrays.asList(new IplTeam("MI", 2, "Ambani", "Rohit Sharma"),
            new IplTeam("CSK", 3, "cwd", "Rorma"),
            new IplTeam("ui", 4, "Ambajnjni", "Ro"),
            new IplTeam("tan", 5, "Amvvbani", "Rarma"));
    public List<IplTeam> getAllTeams(){
        return iplTeams;
    }
}
