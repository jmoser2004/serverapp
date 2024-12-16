package dev.joemoser.echo.JSONTemplates;

import java.time.LocalDateTime;

public class Timestamp
{
    private String device;
    private LocalDateTime stamp;

    public Timestamp()
    {
        this.device = null;
        this.stamp = null;
    }

    public Timestamp(String device, LocalDateTime stamp)
    {
        this.device = device;

        if(stamp == null) this.stamp = LocalDateTime.now();
        else this.stamp = stamp;
    }

    public void setDevice(String device){this.device = device;}

    public String getDevice(){return this.device;}
    public LocalDateTime getStamp(){return this.stamp;}
}
