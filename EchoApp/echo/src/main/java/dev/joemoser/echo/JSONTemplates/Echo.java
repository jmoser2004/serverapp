package dev.joemoser.echo.JSONTemplates;

import java.util.ArrayList;
import java.util.List;

public class Echo
{
    public String message;
    public List<Timestamp> stamps;

    public Echo()
    {
        this.message = null;
        this.stamps = new ArrayList<Timestamp>();
    }

    public Echo(String message)
    {
        this.message = message;

        Timestamp recvStamp = new Timestamp("server_in", null);
        stamps = new ArrayList<Timestamp>();
        
        stamps.add(recvStamp);
    }

    public Echo(String message, Timestamp sentStamp)
    {
        this.message = message;

        Timestamp recvStamp = new Timestamp("server_in", null);
        stamps = new ArrayList<Timestamp>();

        stamps.add(sentStamp);
        stamps.add(recvStamp);
    }

    public void addToStamps(Timestamp stamp)
    {
        stamps.add(stamp);
    }

    public String getMessage(){return this.message;}
    public List<Timestamp> getStamps(){return this.stamps;}
}
