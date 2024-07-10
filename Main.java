package com.snake;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        
        JFrame canva = new JFrame();
        canva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canva.setSize(600,600);
        canva.setResizable(false);
        canva.setVisible(true);

        Game snake_game = new Game();
        canva.add(snake_game);
        canva.pack();
        snake_game.requestFocus();
    }
}