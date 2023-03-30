// TicTacToe game on a GUI that contains PVE (that doesn't lose) and PVP modes


import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static final JButton[][] boardOfButtons = {
        {new JButton(), new JButton(), new JButton()},
        {new JButton(), new JButton(), new JButton()},
        {new JButton(), new JButton(), new JButton()}
    };
    
    
    
    
    
    
    /********************************** MAIN **********************************/
    public static void main(String[] args) {
        for (int i = 0; i < boardOfButtons.length; i++)
            for (int j = 0; j < boardOfButtons[i].length; j++)
                boardOfButtons[i][j].setFont(new Font("Arial", Font.PLAIN, 64));
        /***************************** HOME FRAME *****************************/
        JFrame homeFrame = new JFrame("XO Program");
        JLabel welcome = new JLabel("Welcome to the XO Program!");
        welcome.setFont(new Font("Arial", Font.PLAIN, 32));
        JLabel mode = new JLabel("Choose a Mode:");
        mode.setFont(new Font("Arial", Font.PLAIN, 20));
        JLabel madeBy = new JLabel("Made by: Developers Club - SEG");
        JButton pvp = new JButton("PVP");
        pvp.setSize(50, 50);
        pvp.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                homeFrame.setVisible(false);
                pvp();
            }
        });
        JButton yes = new JButton("Yes");
        yes.setSize(50, 50);
        yes.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                homeFrame.setVisible(false);
                pve(true);
            }
        });
        JButton no = new JButton("No");
        no.setSize(50, 50);
        no.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                homeFrame.setVisible(false);
                pve(false);
            }
        });
        JButton pve = new JButton("PVE");
        pve.setSize(50, 50);
        pve.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                mode.setText("Do you want to start?");
                homeFrame.remove(pvp);
                homeFrame.remove(pve);
                homeFrame.remove(madeBy);
                homeFrame.add(yes);
                homeFrame.add(no);
            }
        });
        homeFrame.add(welcome);
        homeFrame.add(mode);homeFrame.add(pvp);homeFrame.add(pve);
        homeFrame.add(madeBy);
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 50));
        homeFrame.setSize(500, 300);
        homeFrame.setLocationRelativeTo(null);
        homeFrame.setVisible(true);
        homeFrame.getContentPane().requestFocus();
    }
    /***************************** HOME FRAME *****************************/
    /********************************** MAIN **********************************/
    
    
    
    
    
    
    
    
    
    
    
    /********************************** MODE **********************************/
    //method for pve
    @SuppressWarnings("empty-statement")
    public static void pve(boolean start) {
        boolean[] allow = {true};
        final int[] round = {1};
        for (int i = 0; i < boardOfButtons.length; i++)
            for (int j = 0; j < boardOfButtons[i].length; j++) {
                boardOfButtons[i][j].setText("");
                boardOfButtons[i][j].setEnabled(true);
            }
        
        JFrame pveFrame = new JFrame("XO Program");
        
        final JLabel title1 = new JLabel("Player", JLabel.RIGHT);
        final JLabel title2 = new JLabel("vs", JLabel.CENTER);
        final JLabel title3 = new JLabel("Computer", JLabel.LEFT);
        final JLabel belowTLeft = new JLabel("");
        final JLabel turn = new JLabel("Your Turn", JLabel.CENTER);
        final JLabel belowTRight = new JLabel("");
        title1.setFont(new Font("Arial", Font.PLAIN, 48));
        title2.setFont(new Font("Arial", Font.PLAIN, 48));
        title3.setFont(new Font("Arial", Font.PLAIN, 48));
        final JLabel info = new JLabel("Choose a spot", JLabel.CENTER);
        turn.setFont(new Font("Arial", Font.PLAIN, 40));
        info.setFont(new Font("Arial", Font.PLAIN, 32));
        final JLabel bottomLeft = new JLabel("", JLabel.CENTER);
        final JLabel bottomRight = new JLabel("", JLabel.CENTER);
        final JButton playAgain = new JButton("Play Again");
        playAgain.setFont(new Font("Arial", Font.PLAIN, 48));
        
        
        
        pveFrame.add(title1);pveFrame.add(title2);pveFrame.add(title3);
        pveFrame.add(belowTLeft);pveFrame.add(turn);pveFrame.add(belowTRight);
        for (int i = 0; i < boardOfButtons.length; i++)
            for (int j = 0; j < boardOfButtons[i].length; j++)
                pveFrame.add(boardOfButtons[i][j]);
        pveFrame.add(bottomLeft);pveFrame.add(info);pveFrame.add(bottomRight);
        
        pveFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pveFrame.setLayout(new GridLayout(6, 3, 0, 0));
        pveFrame.setSize(500, 500);
        pveFrame.setLocationRelativeTo(null);
        pveFrame.setVisible(true);
        pveFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        pveFrame.getContentPane().requestFocus();
        
        ActionListener task = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                computerTurn(toArr(), round[0]);
                round[0]++;
                if (checkWin(toArr())) {
                    turn.setText("Computer Won!");
                    for (int i = 0; i < boardOfButtons.length; i++)
                        for (int j = 0; j < boardOfButtons[i].length; j++)
                            boardOfButtons[i][j].setEnabled(false);
                    pveFrame.remove(bottomRight);
                    pveFrame.remove(info);
                    pveFrame.add(playAgain);
                    pveFrame.add(bottomRight);
                    pveFrame.getContentPane().requestFocus();
                    return;
                }
                if (checkDraw(toArr())) {
                    turn.setText("Draw!");
                    for (int i = 0; i < boardOfButtons.length; i++)
                        for (int j = 0; j < boardOfButtons[i].length; j++)
                            boardOfButtons[i][j].setEnabled(false);
                    pveFrame.remove(bottomRight);
                    pveFrame.remove(info);
                    pveFrame.add(playAgain);
                    pveFrame.add(bottomRight);
                    pveFrame.getContentPane().requestFocus();
                    return;
                }
                allow[0] = true;
                turn.setText("Your Turn");
                info.setText("Choose a spot");
            }
        };
        
        //change 2000 to 0 if you're testing
        Timer timer = new Timer(2000, task);
        timer.setRepeats(false);
        
        ActionListener buttons = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (allow[0]) {
                    if (((JButton) e.getSource()).getText().equals("")) {
                        allow[0] = false;
                        ((JButton) e.getSource()).setText("X");
                        round[0]++;
                        if (checkWin(toArr())) {
                            turn.setText("You Won!");
                            for (int i = 0; i < boardOfButtons.length; i++)
                                for (int j = 0; j < boardOfButtons[i].length; j++)
                                    boardOfButtons[i][j].setEnabled(false);
                            pveFrame.remove(bottomRight);
                            pveFrame.remove(info);
                            pveFrame.add(playAgain);
                            pveFrame.add(bottomRight);
                            pveFrame.getContentPane().requestFocus();
                            return;
                        }
                        if (checkDraw(toArr())) {
                            turn.setText("Draw!");
                            for (int i = 0; i < boardOfButtons.length; i++)
                                for (int j = 0; j < boardOfButtons[i].length; j++)
                                    boardOfButtons[i][j].setEnabled(false);
                            pveFrame.remove(bottomRight);
                            pveFrame.remove(info);
                            pveFrame.add(playAgain);
                            pveFrame.add(bottomRight);
                            pveFrame.getContentPane().requestFocus();
                            return;
                        }
                        turn.setText("Computer's Turn");
                        info.setText("Computer is Thinking");
                        timer.start();
                    }
                    else {
                        info.setText("<html>"
                            + "<div style=\"text-align: center;\">"
                            + "Spot already filled"
                            + "<br>Choose another spot"
                            + "</div></html>");
                    }
                }
            }
        };
        
        ActionListener playAgainAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pveFrame.setVisible(false);
                String[] args = {"0"};
                main(args);
            }
        };
        for (int i = 0; i < boardOfButtons.length; i++)
            for (int j = 0; j < boardOfButtons.length; j++)
                boardOfButtons[i][j].addActionListener(buttons);
        playAgain.addActionListener(playAgainAction);
        
        if (!start) {
            turn.setText("Computer's Turn");
            info.setText("<html>Computer is<br>Thinking...</html>");
            allow[0] = false;
            computerTurn(toArr(), round[0]);
            round[0]++;
            allow[0] = true;
            turn.setText("Your Turn");
            info.setText("Choose a spot");
        }
    }
    
    //method for pvp
    public static void pvp() {
        for (int i = 0; i < boardOfButtons.length; i++)
            for (int j = 0; j < boardOfButtons[i].length; j++) {
                boardOfButtons[i][j].setText("");
                boardOfButtons[i][j].setEnabled(true);
            }
        
        final String[] current = {"X"};
        
        
        JFrame pvpFrame = new JFrame("XO Program");
        
        final JLabel title1 = new JLabel("Player", JLabel.RIGHT);
        final JLabel title2 = new JLabel("vs", JLabel.CENTER);
        final JLabel title3 = new JLabel("Player", JLabel.LEFT);
        final JLabel belowTLeft = new JLabel("");
        final JLabel turn = new JLabel("X's Turn", JLabel.CENTER);
        final JLabel belowTRight = new JLabel("");
        title1.setFont(new Font("Arial", Font.PLAIN, 48));
        title2.setFont(new Font("Arial", Font.PLAIN, 48));
        title3.setFont(new Font("Arial", Font.PLAIN, 48));
        final JLabel info = new JLabel("Choose a spot", JLabel.CENTER);
        turn.setFont(new Font("Arial", Font.PLAIN, 40));
        info.setFont(new Font("Arial", Font.PLAIN, 32));
        final JLabel bottomLeft = new JLabel("", JLabel.CENTER);
        final JLabel bottomRight = new JLabel("", JLabel.CENTER);
        final JButton playAgain = new JButton("Play Again");
        playAgain.setFont(new Font("Arial", Font.PLAIN, 48));
        
        
        
        pvpFrame.add(title1);pvpFrame.add(title2);pvpFrame.add(title3);
        pvpFrame.add(belowTLeft);pvpFrame.add(turn);pvpFrame.add(belowTRight);
        for (int i = 0; i < boardOfButtons.length; i++)
            for (int j = 0; j < boardOfButtons[i].length; j++)
                pvpFrame.add(boardOfButtons[i][j]);
        pvpFrame.add(bottomLeft);pvpFrame.add(info);pvpFrame.add(bottomRight);
        
        pvpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pvpFrame.setLayout(new GridLayout(6, 3, 0, 0));
        pvpFrame.setSize(500, 500);
        pvpFrame.setLocationRelativeTo(null);
        pvpFrame.setVisible(true);
        pvpFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        pvpFrame.getContentPane().requestFocus();
        
        ActionListener buttons = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (((JButton) e.getSource()).getText().equals("")) {
                    ((JButton) e.getSource()).setText(current[0]);
                    if (checkWin(toArr())) {
                        turn.setText(current[0] + " Won!");
                        for (int i = 0; i < boardOfButtons.length; i++)
                            for (int j = 0; j < boardOfButtons[i].length; j++)
                                boardOfButtons[i][j].setEnabled(false);
                        pvpFrame.remove(bottomRight);
                        pvpFrame.remove(info);
                        pvpFrame.add(playAgain);
                        pvpFrame.add(bottomRight);
                        pvpFrame.getContentPane().requestFocus();
                        return;
                    }
                    if (checkDraw(toArr())) {
                        turn.setText("Draw!");
                        for (int i = 0; i < boardOfButtons.length; i++)
                            for (int j = 0; j < boardOfButtons[i].length; j++)
                                boardOfButtons[i][j].setEnabled(false);
                        pvpFrame.remove(bottomRight);
                        pvpFrame.remove(info);
                        pvpFrame.add(playAgain);
                        pvpFrame.add(bottomRight);
                        pvpFrame.getContentPane().requestFocus();
                        return;
                    }
                    if (current[0].equals("X")) {
                        current[0] = "O";
                        turn.setText("O's Turn");
                    }
                    else {
                        current[0] = "X";
                        turn.setText("X's Turn");
                    }
                    info.setText("Choose a spot");
                }
                else {
                    info.setText("<html>"
                            + "<div style=\"text-align: center;\">"
                            + "Spot already filled"
                            + "<br>Choose another spot"
                            + "</div></html>");
                }
            }
        };
        
        ActionListener playAgainAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pvpFrame.setVisible(false);
                String[] args = {"0"};
                main(args);
            }
        };
        for (int i = 0; i < boardOfButtons.length; i++)
            for (int j = 0; j < boardOfButtons.length; j++)
                boardOfButtons[i][j].addActionListener(buttons);
        playAgain.addActionListener(playAgainAction);
    }
    /********************************** MODE **********************************/
    
    
    
    
    
    
    
    
    
    
    
    /********************************** TURN **********************************/
    //method for computer's turn
    public static void computerTurn(char[][] board, int round) {
        
        //guide the computer through the first 4 rounds
        //(r1&3 if computer starts, or r2&4 if user starts)
        //and then the computer is on its own.
        
        //if computer starts
        if (round == 1) {
            board[0][0] = 'O';        
            toBoard(board);
            return;
        }
                
        if (round == 3)
            if (board[1][1] == ' ') {
                board[1][1] = 'O';        
                toBoard(board);
                return;
            }
            else {
                board[2][0] = 'O';        
                toBoard(board);
                return;
            }
        
        
        //if user starts
        if (round == 2)
            if (board[1][1] == ' ') {
                board[1][1] = 'O';                
                toBoard(board);
                return;
            }
            else {
                board[0][0] = 'O';                
                toBoard(board);
                return;
            }
        
        if (round == 4) {
            if (defend(board))
                return;
            if (board[1][1] == 'O') {
                if (board[2][1] == 'X'
                        && board[1][2] == 'X') {
                    board[2][2] = 'O';
                    toBoard(board);
                    return;
                }
                if ((board[0][0] == 'X'
                        && board[2][2] == 'X')
                        || (board[0][2] == 'X'
                        && board[2][0] == 'X')) {
                    board[0][1] = 'O';                                    
                    toBoard(board);
                    return;
                }
                if ((board[0][1] == 'X'
                        && board[2][1] == 'X')
                        || (board[1][0] == 'X'
                        && board[1][2] == 'X')) {
                    board[0][0] = 'O';                                    
                    toBoard(board);
                    return;
                }
                
                //4 connected cases
                //1
                if ((board[0][0] == 'X'
                        && board[1][2] == 'X')) {
                    board[2][1] = 'O';                                    
                    toBoard(board);
                    return;
                }
                if ((board[0][0] == 'X'
                        && board[2][1] == 'X')) {
                    board[1][2] = 'O';                                    
                    toBoard(board);
                    return;
                }
                
                //2
                if ((board[2][0] == 'X'
                        && board[0][1] == 'X')) {
                    board[1][2] = 'O';                                    
                    toBoard(board);
                    return;
                }
                if ((board[2][0] == 'X'
                        && board[1][2] == 'X')) {
                    board[0][1] = 'O';                                    
                    toBoard(board);
                    return;
                }
                
                //3
                if ((board[2][2] == 'X'
                        && board[1][0] == 'X')) {
                    board[0][1] = 'O';                                    
                    toBoard(board);
                    return;
                }
                if ((board[2][2] == 'X'
                        && board[0][1] == 'X')) {
                    board[1][0] = 'O';                                    
                    toBoard(board);
                    return;
                }
                
                //4
                if ((board[0][2] == 'X'
                        && board[1][0] == 'X')) {
                    board[2][1] = 'O';                                    
                    toBoard(board);
                    return;
                }
                if ((board[0][2] == 'X'
                        && board[2][1] == 'X')) {
                    board[1][0] = 'O';                                    
                    toBoard(board);
                    return;
                }
            }
            
            if (board[0][0] == 'O'
                    && board[2][2] == 'X') {
                board[0][2] = 'O';                                    
                toBoard(board);
                return;
            }
        }
        
        //after the first 4 rounds
        //first priority
        if (findWin(board))
            return;
        //second priority
        if (defend(board))
            return;
        //third priority
        if (attack(board))
            return;
        //last option
        fillEmpty(board);
    }
    /********************************** TURN **********************************/
    
    
    
    
    
    
    
    
    
    
    
    /*************************** COMPUTER'S METHODS ***************************/
    //if a win exists, this method will find it
    public static boolean findWin(char[][] board) {
        //rows
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                if (board[i][j] == 'O'
                        && board[i][(j+1) % 3] == 'O'
                        && board[i][(j+2) % 3] == ' ') {
                    board[i][(j+2) % 3] = 'O';                                    
                    toBoard(board);
                    return true;
                }
        
        //columns
        for (int j = 0; j < board[0].length; j++)
            for (int i = 0; i < board.length; i++)
                if (board[i][j] == 'O'
                        && board[(i+1) % 3][j] == 'O'
                        && board[(i+2) % 3][j] == ' ') {
                    board[(i+2) % 3][j] = 'O';                                    
                    toBoard(board);
                    return true;
                }
        
        //main diagonal
        for (int i = 0; i < board.length; i++)
            if (board[i][i] == 'O'
                    && board[(i+1) % 3][(i+1) % 3] == 'O'
                    && board[(i+2) % 3][(i+2) % 3] == ' ') {
                board[(i+2) % 3][(i+2) % 3] = 'O';                                    
                toBoard(board);
                return true;
            }
        //anti-diagonal
        for (int i = 0, j = 2; i < board.length; i++, j--) {
            int jm1 = ((j-1) % 3 < 0)? (j-1) % 3 + 3
                                     : (j-1) % 3;
            int jm2 = ((j-2) % 3 < 0)? (j-2) % 3 + 3
                                     : (j-2) % 3;
            if (board[i][j] == 'O'
                    && board[(i+1) % 3][jm1] == 'O'
                    && board[(i+2) % 3][jm2] == ' ') {
                board[(i+2) % 3][jm2] = 'O';                                    
                toBoard(board);
                return true;
            }
        }
        //else
        return false;
    }
    
    //if user is close to winning, this function will defend
    public static boolean defend(char[][] board) {
        //rows
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                if (board[i][j] == 'X'
                        && board[i][(j+1) % 3] == 'X'
                        && board[i][(j+2) % 3] == ' ') {
                    board[i][(j+2) % 3] = 'O';                                    
                    toBoard(board);
                    return true;
                }
        
        //columns
        for (int j = 0; j < board[0].length; j++)
            for (int i = 0; i < board.length; i++)
                if (board[i][j] == 'X'
                        && board[(i+1) % 3][j] == 'X'
                        && board[(i+2) % 3][j] == ' ') {
                    board[(i+2) % 3][j] = 'O';                                    
                    toBoard(board);
                    return true;
                }
        
        //main diagonal
        for (int i = 0; i < board.length; i++)
            if (board[i][i] == 'X'
                    && board[(i+1) % 3][(i+1) % 3] == 'X'
                    && board[(i+2) % 3][(i+2) % 3] == ' ') {
                board[(i+2) % 3][(i+2) % 3] = 'O';                                    
                toBoard(board);
                return true;
            }
        //anti-diagonal
        for (int i = 0, j = 2; i < board.length; i++, j--) {
            int jm1 = ((j-1) % 3 < 0)? (j-1) % 3 + 3
                                     : (j-1) % 3;
            int jm2 = ((j-2) % 3 < 0)? (j-2) % 3 + 3
                                     : (j-2) % 3;
            if (board[i][j] == 'X'
                    && board[(i+1) % 3][jm1] == 'X'
                    && board[(i+2) % 3][jm2] == ' ') {
                board[(i+2) % 3][jm2] = 'O';                                    
                toBoard(board);
                return true;
            }
        }
        //else
        return false;
    }
    
    //if user isn't attacking, this method will find an attack
    public static boolean attack(char[][] board) {
        //rows
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                if (board[i][j] == ' '
                        && board[i][(j+1) % 3] == 'O'
                        && board[i][(j+2) % 3] == ' ') {
                    board[i][j] = 'O';                                    
                    toBoard(board);
                    return true;
                }
        
        //columns
        for (int j = 0; j < board[0].length; j++)
            for (int i = 0; i < board.length; i++)
                if (board[i][j] == ' '
                        && board[(i+1) % 3][j] == 'O'
                        && board[(i+2) % 3][j] == ' ') {
                    board[i][j] = 'O';                                    
                    toBoard(board);
                    return true;
                }
        
        //main diagonal
        for (int i = 0; i < board.length; i++)
            if (board[i][i] == ' '
                    && board[(i+1) % 3][(i+1) % 3] == 'O'
                    && board[(i+2) % 3][(i+2) % 3] == ' ') {
                board[i][i] = 'O';                                    
                toBoard(board);
                return true;
            }
        //anti-diagonal
        for (int i = 0, j = 2; i < board.length; i++, j--) {
            int jm1 = ((j-1) % 3 < 0)? (j-1) % 3 + 3
                                     : (j-1) % 3;
            int jm2 = ((j-2) % 3 < 0)? (j-2) % 3 + 3
                                     : (j-2) % 3;
            if (board[i][j] == ' '
                    && board[(i+1) % 3][jm1] == 'O'
                    && board[(i+2) % 3][jm2] == ' ') {
                board[(i+2) % 3][jm2] = 'O';                                    
                toBoard(board);
                return true;
            }
        }
        //else
        return false;
    }
    
    //if there are no available plays, fill an empty spot
    public static void fillEmpty(char[][] board) {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board.length; j++)
                if (board[i][j] == ' ') {
                    board[i][j] = 'O';                                    
                    toBoard(board);
                    return;
                }
    }
    /*************************** COMPUTER'S METHODS ***************************/
    
    
    
    
    
    
    
    
    
    
    
    /******************************** CHECKING ********************************/
    //method to check if someone won
    public static boolean checkWin(char[][] board) {
        return checkRows(board)
            || checkColumns(board)
            || checkDiagonals(board);
    }
    
    //method to check if someone won on a row
    public static boolean checkRows(char[][] board) {
        for (int i = 0; i < board.length; i++)
            if (board[i][0] == board[i][1]
                    && board[i][0] == board[i][2]
                    && board[i][0] != ' ')
                return true;
        return false;
    }
    
    //method to check if someone won on a column
    public static boolean checkColumns(char[][] board) {
        for (int j = 0; j < board.length; j++)
            if (board[0][j] == board[1][j]
                    && board[0][j] == board[2][j]
                    && board[0][j] != ' ')
                return true;
        return false;
    }
    
    //method to check if someone won on a diagonal
    public static boolean checkDiagonals(char[][] board) {
        return (board[0][0] == board[1][1]
                && board[0][0] == board[2][2]
                && board[0][0] != ' ')
                || (board[1][1] == board[0][2]
                && board[1][1] == board[2][0]
                && board[1][1] != ' ');
    }
    
    //method to check if there is a draw
    public static boolean checkDraw(char[][] board) {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }
    /******************************** CHECKING ********************************/
    
    
    
    
    
    
    
    
    
    
    
    /******************************* GUI METHODS ******************************/
    public static char[][] toArr() {
        char[][] board = new char[3][3];
        String s;
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++) {
                s = boardOfButtons[i][j].getText();
                if (s.length() == 0)
                    board[i][j] = ' ';
                else
                    board[i][j] = s.charAt(0);
            }
                
        
        return board;
    }
    
    public static void toBoard(char[][] board) {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ')
                    boardOfButtons[i][j].setText("");
                else
                    boardOfButtons[i][j].setText("" + board[i][j]);
            }
                
    }
    /******************************* GUI METHODS ******************************/
}
