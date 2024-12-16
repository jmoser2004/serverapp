package dev.joemoser.echo.JSONTemplates;

public class Input
{
    private String input;
    private Timestamp stamp;

    public Input()
    {
        this.input = null;
        this.stamp = null;
    }

    public Input(String input, Timestamp stamp)
    {
        this.input = input;
        this.stamp = stamp;
    }

    public String getInput(){return this.input;}
    public Timestamp getStamp(){return this.stamp;}
}
