// Decompiled by DJ v3.10.10.93 Copyright 2007 Atanas Neshkov  Date: 3/20/2018 11:15:10 AM
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Aplicatie.java


public class Aplicatie
{

    private Aplicatie()
    {
        instance = null;
    }

    public boolean ConfirmareLogIn()
    {
        return false;
    }

    public void Afis()
    {
    }

    public Aplicatie getInstance()
    {
        if(instance == null)
            instance = new Aplicatie();
        return instance;
    }

    private Aplicatie instance;
    private Bazadedate myBazadedate;
}