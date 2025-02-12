package org.example.HelloWorld.DAO;

import org.example.HelloWorld.Components.IplTeam;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
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

    public ArrayList<IplTeam> getIplTeams() throws ClassNotFoundException, SQLException {
        ArrayList<IplTeam> list = new ArrayList<IplTeam>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database", "root", "2004");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from iplTeams");
        while(rs.next()){
            String teamName = rs.getString("teamName");
            int trophies = rs.getInt("trophies");
            String teamOwnerName = rs.getString("teamOwnerName");
            String teamCaptainName = rs.getString("teamCaptainName");

            IplTeam iplTeam= new IplTeam(teamName, trophies, teamOwnerName, teamCaptainName);
            list.add(iplTeam);
        }
        return list;
    }

}
