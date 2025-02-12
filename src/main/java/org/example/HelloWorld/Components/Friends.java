package org.example.HelloWorld.Components;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Friends {
    List<String> friends;


    @PostConstruct
    public void init(){
        System.out.println("init started");
        friends= new ArrayList<>();
        friends.add("gunit");
        friends.add("manit");
        friends.add("mummy");
        friends.add("papa");
        friends.add("nani");
    }

    public List<String> getAllFriends(){
        return friends;
    }

    public int getFriendsCount(){
        return friends.size();
    }

    public void addFriends(String name){
        friends.add(name);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy started");
        friends.clear();
    }

}
