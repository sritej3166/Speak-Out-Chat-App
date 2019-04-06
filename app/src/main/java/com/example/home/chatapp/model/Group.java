package com.example.home.chatapp.model;



public class Group extends Room{
    public String id;
    public ListFriend listFriend;

    public Group(){
        listFriend = new ListFriend();
    }
}
