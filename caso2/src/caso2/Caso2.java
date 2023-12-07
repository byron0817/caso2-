/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso2;

/**
 *
 * @author sombr
 */
public class Caso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       friends[] amigos = new friends[6];

        amigos[0] = new friends("Joshua");
        amigos[1] = new friends("Greivin");
        amigos[2] = new friends("Guillermo");
        amigos[3] = new friends("Andres");
        amigos[4] = new friends("Tavo");
        amigos[5] = new friends("David");

        //Arreglo de movimientos
        int cantMove = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de move extra a dijitar:"));
        movement[] move = new movement[7 + cantMove];
        
        String dolares = "Dolares";
        
        //Arreglo Ejemplo 1 
        friends[] participantesMov1 = {amigos[0], amigos[1], amigos[2], amigos[3], amigos[4], amigos[5]};
        move[0] = new movement("Desayuno coffePrime", participantesMov1, amigos[2], 120, dolares);
        
        //Arreglo Ejemplo 2 
       friends[] participantesmov2 = {amigos[0],amigos[1],amigos[2],amigos[3],amigos[4]};
        move[1] = new movement("Almuerzo Pig factory", participantesmov2, amigos[2], 200,dolares);
        
        //Arreglo Ejemplo 3 
        friends[] participantesmov3 = {amigos[0],amigos[5]};
        move[1] = new movement("Cena FastFood", participantesmov3, amigos[5], 50,dolares);
        
        //Arreglo Ejemplo 4 
        friends[] participantesmov4 = {amigos[2],amigos[3],amigos[1],amigos[4]};
        move[1] = new movement("Pizza Hut",participantesmov4 ,amigos[4] , 100,dolares);
        
        //Arreglo Ejemplo 5 
        friends[] participantesmov5 = {amigos[2]};
        move[1] = new movement("Quicksilver Store", participantesmov5, amigos[1], 150,dolares);
        //Arreglo Ejemplo 6
        friends[] participantesmov6 = {amigos[3]};
        move[1] = new movement("Apple Store", participantesmov6, amigos[0], 200, dolares);
        
        //Arreglo Ejemplo 7
        friends[] participantesmov7 = {amigos[0], amigos[1], amigos[2], amigos[3], amigos[4], amigos[5]};
        move[1] = new movement("Desayuno chilis", participantesmov7, amigos[1], 150, dolares);
        
        //Arreglo Ejemplo 8
        friends[] participantesmov8 = {amigos[0], amigos[1], amigos[2], amigos[3], amigos[4], amigos[5]};
        move[1] = new movement("Almuerzo Hooters", participantesmov8, amigos[4], 180,dolares);
    }
    
}
