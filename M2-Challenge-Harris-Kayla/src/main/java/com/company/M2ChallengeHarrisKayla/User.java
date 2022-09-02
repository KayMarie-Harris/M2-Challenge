package com.company.M2ChallengeHarrisKayla;

import java.util.List;

public class User
{
    private String name;
    private List<ChatterPost> chatterPosts;

    public User(String name)
    {
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setChatterPosts(List<ChatterPost> asList)
    {
        this.chatterPosts = asList;
    }

    public List<ChatterPost> getChatterPosts()
    {
        return this.chatterPosts;
    }
}