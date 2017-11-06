package com.dhirajkumarcoder.android.newsfeed;

/**
 * Created by DHIRAJ KUMAR JAIN on 07-11-2017.
 */

public class NewsResponse {

    private News[] newses;

    public NewsResponse(News[] newses) {
        this.newses = newses;
    }

    public News[] getNewses()
    {
        return newses;
    }
}
