/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaapplication_uml;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author NAMITHA SHREE
 */
class Positioning{
    int x;
    int y;
    
    public Positioning(int x,int y){
        this.x=x;
        this.y=y;
    }
}

class SubmarineType{
    String color;
    
    public SubmarineType(String color){
        this.color=color;
    }
}
class Submarine{
    int noofSubmarine;
    int size;
    int value;
    List<SubmarineType>typeOfSubmarine;
    List<Positioning>position;
    
    public int getNoofSubmarine() {
        return noofSubmarine;
    }
    
    public int getSize() {
        return size;
    }
    
    public Submarine(int noofSubmarine,int size){
        this.noofSubmarine=noofSubmarine;
        this.size=size;
        this.value=value;
        this.position=new ArrayList<>();
        this.typeOfSubmarine=new ArrayList<>();
    }
}
enum GameType{
    Player1vsPlayer2,
    ComputervsPlayer
}
class Torpedo{
    int x_cord;
    int y_cord;
    boolean hit;
    public Torpedo(int x_cord,int y_cord){
        this.x_cord=x_cord;
        this.y_cord=y_cord;
    }
    
    public boolean hit(){
        return hit;
    }
}

class Player{
    String name;
    int ID;
    int score;
    List<Torpedo>torpedo;
    List<Submarine>submarine;
    
    public Player(String name, int ID,int score) {
        this.name = name;
        this.ID = ID;
        this.score = score;
        this.torpedo = new ArrayList<>();
        this.submarine= new ArrayList<>();
    }
    
}
class Rounds{
    int noofRounds;
    public Rounds(int rounds){
        this.noofRounds=rounds;
    }
}

class Outcome{
    String result;
    public Outcome(String result){
        this.result=result;
    }
}

class BattleshipGame{
    Date startTime;
    Date endTime; 
    List<Rounds>rounds;
    List<Player>player;
    List<Player>result;
    
    public BattleshipGame(){
       this.rounds=new ArrayList<>();
        this.result=new ArrayList<>();
        this.player=new ArrayList<>();
    }
}
public class JavaApplication_uml {

    public static void main(String[] args) {
        BattleshipGame game= new BattleshipGame();
        

    }
}
