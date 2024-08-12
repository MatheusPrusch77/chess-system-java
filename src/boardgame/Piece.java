/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boardgame;

/**
 *
 * @author lenovo
 */
public class Piece {
    protected Position position;
    private Board board;

    
    public Piece(Board board) {
        this.board = board;
        position = null; //por padrao o java ja joga no valor null, nao precisa declarar a position nesse caso
    }

    protected Board getBoard() {
        return board;
    }
    
    
}
