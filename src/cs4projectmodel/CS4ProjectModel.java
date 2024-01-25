/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4projectmodel;

/**
 *
 * @author Gabriel Gutierrez
 */
public class CS4ProjectModel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scenario 1
        
           Weapon sword = new Weapon();
           Character player = new Character();
           Monster monster =  new Monster();
        
                Item selectedWeapon = sword;
                Location.add(player);
                Location.add(monster);
                
                player.attack(monster);

                monster.attack(player);
                
                if (monster.health <= 0) {
                    // Monster dies and drops an Item
                    Item droppedItem = monster.dropItem();
                    player.addToInventory(droppedItem);
                
    }
    }



    }
    

