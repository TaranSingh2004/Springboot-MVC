package org.example.HelloWorld.DAO;

import org.example.HelloWorld.Components.IplTeam;
import org.example.HelloWorld.DbConnect;
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
        Connection con = DbConnect.dbconnect();
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

    public String insertIplTeam(IplTeam iplTeam) throws ClassNotFoundException, SQLException {
        Connection con = DbConnect.dbconnect();
        PreparedStatement ps = con.prepareStatement("insert into iplTeams values(?, ?, ?, ?)");
        ps.setString(1, iplTeam.getTeamName());
        ps.setInt(2, iplTeam.getTrophies());
        ps.setString(3, iplTeam.getTeamOwnerName());
        ps.setString(4, iplTeam.getTeamCaptainName());
        ps.executeUpdate();
        return "item inerted";

    }

}
