/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematica;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Matematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
       boolean vencedor = false;
       
       int count = 0, killsTot = 0, deathsTot = 0, assistsTot = 0;
       
       while (vencedor == false) {
           int kills, deaths, assists;
           
           count++;
           
           System.out.print("Rodada "+count);
           
           System.out.print("Quantas Kills?");
           kills = sc.nextInt();
           
           if (kills >= 20){
               System.out.println("\nMaster\n");
           }  else if (kills <= 5){
               System.out.println("\nNoob\n");        
           }
           
           System.out.println("Quantas Deaths?");
           deaths = sc.nextInt();
           
           if (deaths >=20){
                System.out.println("\nHouston, we have a problem\n");
           }
           
           System.out.println("Quantas Assists?");
           assists = sc.nextInt();
           
           if (assists >= 20){
               System.out.println("\nTeam Work\n");
           }
           
           killsTot = killsTot + kills;
           deathsTot = deathsTot + deaths;
           assistsTot = assistsTot + assists;
           
           System.out.println("Total de pontos da Rodada "+count+":\n");
            System.out.println("Kills da Rodada "+kills);
            System.out.println("Deaths da Rodada "+deaths);
             System.out.println("Assists da Rodada "+assists);
             
             System.out.println("Total de pontos do Campeonato:\n");
             System.out.println("Total de Kills; "+killsTot);
             System.out.println("Total de Deaths; "+deathsTot);
              System.out.println("Total de Assists; "+assistsTot);
              
              System.out.println("Há um vencedor? true/false");
              vencedor = sc.nextBoolean();
           }
                  sc.close();
                  
                  System.out.println("Fim do Campeonato");
       }
       }
    
    

