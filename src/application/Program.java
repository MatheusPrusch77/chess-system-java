/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

/**
 *
 * @author lenovo
 */
public class Program {
    public static void main(String[] args){
        
       ChessMatch chessMatch = new ChessMatch();
       UI.printBoard(chessMatch.getPieces());
      
    }
}