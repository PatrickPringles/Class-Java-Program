package com.mycompany.weapon;

class Weapons
{
    String name;
    
    public Weapons(String name)
    {
        this.name = name;
    }
    
    public void displayWeapons()
    {
        System.out.println("Gun: " + name);
    }
}

class Assault_Rifle extends Weapons
{
    public Assault_Rifle(String name)
    {
        super(name);
    }
}

class SMG extends Weapons
{
    public SMG(String name)
    {
        super(name);
    }
}

class Marksman extends Weapons
{
    public Marksman(String name)
    {
        super(name);
    }
}



public class Weapon 
{

    public static void main(String[] args) 
    {
        System.out.println("Weapons");
        Weapons assault_rifle = new Assault_Rifle("Krig 6");
        Weapons smg = new SMG("MP5");
        Weapons marksman = new Marksman("Kar98k");
        
        assault_rifle.displayWeapons();
        smg.displayWeapons();
        marksman.displayWeapons();
    }
}
