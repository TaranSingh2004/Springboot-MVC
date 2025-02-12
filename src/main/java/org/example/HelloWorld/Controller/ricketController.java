package org.example.HelloWorld.Controller;

import org.example.HelloWorld.Components.IplTeam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ricketController {

    @GetMapping("/iplTeams")
    public String[] home(){
        String[] str= {"mi", "csk", "pun", "gj", "rcb", "hyd"};
        return str;
    }

    @GetMapping("/teaminfo/{teamName}")
    public ArrayList<IplTeam> teamData(@PathVariable String teamName){
        System.out.println(teamName);
        ArrayList<IplTeam> list = new ArrayList<>();

        IplTeam iplTeam1=new IplTeam("mi", 5, "Ambani", "Rohit Sharma");
        list.add(iplTeam1);
        IplTeam iplTeam2=new IplTeam("csk", 5, "Ambani", "Rohit Sharma");
        list.add(iplTeam2);
        IplTeam iplTeam3=new IplTeam("pun", 5, "Ambani", "Rohit Sharma");
        list.add(iplTeam3);

        ArrayList<IplTeam> temp = new ArrayList<>();
        for(IplTeam team : list){
            if (team.getTeamName().equalsIgnoreCase(teamName)) {
                temp.add(team);
            }

        }
        return temp;
    }
}
