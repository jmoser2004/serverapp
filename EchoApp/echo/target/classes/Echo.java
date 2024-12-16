package dev.joemoser.echo;

import java.time.LocalDateTime;

public class Echo
{
    private String input;
    private LocalDateTime sentTime;
    private LocalDateTime recievedTime;
    
    public Echo()
    {
        this.input = "";
        this.sentTime = null;
        this.recievedTime = null;
    }

    public Echo(String input)
    {
        this.input = input;
        this.sentTime = LocalDateTime.now();
        this.recievedTime = null;
    }

    public Echo(String input, LocalDateTime sentTime)
    {
        this.input = input;
        this.sentTime = sentTime;
        this.recievedTime = LocalDateTime.now();
    }

    public void setInput(String input){this.input = input;}

    public String getInput(){return this.input;}
    public LocalDateTime getSentTime(){return this.sentTime;}
    public LocalDateTime getReceivedTime(){return this.recievedTime;}
}
