package org.example.Actions;

public enum Doing {

    uncover(" раскрыл "),

    release(" выделил "),
    put(" положил "),

    understand(" понял "),


    ;


    private String pastVerb;

    Doing(String  verb)
    {
        this.pastVerb=verb;
    }

    public String getVerb()
    {
        return this.pastVerb;
    }
}
