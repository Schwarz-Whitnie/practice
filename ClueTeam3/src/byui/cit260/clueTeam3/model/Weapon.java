/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Cameron
 */
public enum Weapon implements Serializable {
    
    Candlestick,
    Knife,
    Rope,
    Dumbbell,
    Poison,
    LeadPipe,
    Revolver,
    Wrench;
    
    private final String description;
    private final String location;
    private final String weaponType;

    private Room[] room;
    private Clue[] clue;

    public Room[] getRoom() {
        return room;
    }

    public void setRoom(Room[] room) {
        this.room = room;
    }

    public Clue[] getClue() {
        return clue;
    }

    public void setClue(Clue[] clue) {
        this.clue = clue;
    }
    
    Weapon(String description) {
        
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public String getWeaponType() {
        return weaponType;
    }

    @Override
    public String toString() {
        return "Weapon{" + "description=" + description + ", location=" + location + ", weaponType=" + weaponType + '}';
    }
}
