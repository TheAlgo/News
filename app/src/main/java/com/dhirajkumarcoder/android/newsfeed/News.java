package com.dhirajkumarcoder.android.newsfeed;

/**
 * Created by DHIRAJ KUMAR JAIN on 07-11-2017.
 */

public class News {
    private String author;
    private String title;
    private String description;

    public News(String author, String title, String description) {
        this.author = author;
        this.title = title;
        this.description = description;
    }


    public String getAuthor()
    {
    return  author;
    }

    public String getTitle()
    {
        return title;
    }

    public String getDescription()
    {
        return description;
    }
}
