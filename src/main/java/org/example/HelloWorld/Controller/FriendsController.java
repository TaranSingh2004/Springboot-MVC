package org.example.HelloWorld.Controller;

import org.example.HelloWorld.Components.Friends;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FriendsController {
    @Autowired
    Friends friends;

    @RequestMapping("/friends")
    public List<String> getAllFriends(){
        return friends.getAllFriends();
    }

    @RequestMapping("/friends/count")
    public int count(){
        return friends.getFriendsCount();
    }

    @RequestMapping("/friends/add/{name}")
    public List<String> addFriends(@PathVariable(name="name") String name){
        friends.addFriends(name);
        return friends.getAllFriends();

    }
}
