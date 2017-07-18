/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author gonca
 */
public class WorkShop {

    /**
     * @param args the command line arguments
     */
    
    
    static int board[][]=new int[][]{
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
    };
    
    static int checkBoard(){
        for(int j=0;j<=4;j++){
            for(int i=0;i<=3;i++){
                if(board[j][i]==board[j][i+1]&&board[j][i]==board[j][i+2]&&board[j][i]==board[j][i+3]&&board[j][i]!=0){
                    return board[j][i];
                }

            }
        }
        
        for(int j=0;j<=6;j++){
            for(int i=0;i<=1;i++){
                if(board[i][j]==board[i+1][j]&&board[i][j]==board[i+2][j]&&board[i][j]==board[i+3][j]&&board[i][j]!=0){
                    return board[i][j];
                }
                
            

            }
        }

        
        
        return 0;
    }
    
    
    static void printBoard(){
        System.out.println("Imprimindo tabuleiro:");
        for(int j=0;j<=4;j++){
            for(int i=0;i<=6;i++){
                System.out.print(board[j][i]+" ");
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }
    
    static void putPiece(int collumn, int player){
        for(int i=4;i>=0;i--){
            if(board[i][collumn]==0){
                System.out.println("ola");
                board[i][collumn]=player;
                return;
            }
        }
    }
    
    static void startGame(){
        Scanner sc=new Scanner(System.in);
        int player=0;
        printBoard();
        while(true){
            int collumn=sc.nextInt();
            putPiece(collumn-1, player+1);
            player=(player+1)%2;
            int check=checkBoard();
            
            printBoard();
            if(check!=0){
                System.out.println("O player "+check+" ganhou");
                return;
            }
        } 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        startGame();
        
    }
    
}
