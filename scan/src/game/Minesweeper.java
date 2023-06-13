package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Minesweeper extends JFrame implements ActionListener {
    private int rows;
    private int cols;
    private int mines;
    private JButton[][] buttons;
    private boolean[][] minesArray;
    private boolean[][] revealedArray;
    private boolean gameOver;

    public Minesweeper(int rows, int cols, int mines) {
        this.rows = rows;
        this.cols = cols;
        this.mines = mines;
        this.buttons = new JButton[rows][cols];
        this.minesArray = new boolean[rows][cols];
        this.revealedArray = new boolean[rows][cols];
        this.gameOver = false;

        // Create the game board
        JPanel boardPanel = new JPanel(new GridLayout(rows, cols));
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                JButton button = new JButton();
                button.addActionListener(this);
                boardPanel.add(button);
                buttons[i][j] = button;
            }
        }

        // Add the game board to the window
        add(boardPanel);

        // Set the window properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Minesweeper");
        setSize(500, 500);
        setVisible(true);

        // Generate the mines
        generateMines();
    }

    private void generateMines() {
        int count = 0;
        while (count < mines) {
            int row = (int) (Math.random() * rows);
            int col = (int) (Math.random() * cols);
            if (!minesArray[row][col]) {
                minesArray[row][col] = true;
                count++;
            }
        }
    }

    private void reveal(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols || revealedArray[row][col]) {
            return;
        }
        revealedArray[row][col] = true;
        if (minesArray[row][col]) {
            gameOver();
            return;
        }
        int adjacentMines = countAdjacentMines(row, col);
        if (adjacentMines == 0) {
            reveal(row - 1, col - 1);
            reveal(row - 1, col);
            reveal(row - 1, col + 1);
            reveal(row, col - 1);
            reveal(row, col + 1);
            reveal(row + 1, col - 1);
            reveal(row + 1, col);
            reveal(row + 1, col + 1);
        } else {
            buttons[row][col].setText(Integer.toString(adjacentMines));
        }
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;
        if (row > 0 && col > 0 && minesArray[row - 1][col - 1]) count++;
        if (row > 0 && minesArray[row - 1][col]) count++;
        if (row > 0 && col < cols - 1 && minesArray[row - 1][col + 1]) count++;
        if (col > 0 && minesArray[row][col - 1]) count++;
        if (col < cols - 1 && minesArray[row][col + 1]) count++;
        if (row < rows - 1 && col > 0 && minesArray[row + 1][col - 1]) count++;
        if (row < rows - 1 && minesArray[row + 1][col]) count++;
        if (row < rows - 1 && col < cols - 1 && minesArray[row + 1][col + 1]) count++;
        return count;
    }

    private void gameOver() {
        JOptionPane.showMessageDialog(this, "Game Over!");
        gameOver = true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameOver) {
            return;
        }
        JButton button = (JButton) e.getSource();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (button == buttons[i][j]) {
                    reveal(i, j);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        new Minesweeper(10, 10, 10);
    }
}