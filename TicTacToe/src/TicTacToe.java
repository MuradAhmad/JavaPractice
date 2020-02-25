import java.lang.reflect.Array;
import java.util.*;

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static void main(String[] args){

        System.out.println("welcome!");
        System.out.println();
        char[][] gameBoard = {
                {' ','|',' ', '|',' ' },
                {'-','+','-', '+','-' },
                {' ','|',' ', '|',' ' },
                {'-','+','-', '+','-' },
                {' ','|',' ', '|',' ' },
        };

        printGameBoard(gameBoard);

        while (true){

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your placement from (1 - 9): ");
            int pos = scan.nextInt();
            System.out.println(pos);

            while (playerPositions.contains(pos) || cpuPositions.contains(pos)){
                System.out.println("Position taken! enter correct position");
                pos = scan.nextInt();
            }



            placeTic(gameBoard,pos,"player");

            Random random = new Random();
            int cpuPos = random.nextInt(9)+1;
            while (playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)){
                
                 cpuPos = random.nextInt(9)+1;
            }

            placeTic(gameBoard,cpuPos,"cpu");

            printGameBoard(gameBoard);
            String result = checkWinner();
            System.out.println(result);

        }




    }

    public static void printGameBoard(char [][] gameBoard){


        for(char[] row : gameBoard){
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
        }

    }

    public static void placeTic(char[][] gameBoard, int pos, String user){

        char symbol = ' ';
        if(user.equals("player")){
            symbol = 'X';
            playerPositions.add(pos);
        }else if(user.equals("cpu")){
            symbol = '0';
            cpuPositions.add(pos);
        }

        switch (pos){
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }

    }

    public static String checkWinner(){

        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7, 8, 9);

        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(3,6,9);


        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(7,5,3);

        List<List> winner = new ArrayList<List>();
        winner.add(topRow);
        winner.add(midRow);
        winner.add(botRow);
        winner.add(leftCol);
        winner.add(midCol);
        winner.add(rightCol);
        winner.add(cross1);
        winner.add(cross2);

        for(List l : winner){
            if(playerPositions.containsAll(l)){
                return "Congratulations!";
            }
            else if(cpuPositions.containsAll(l)){
                return "CPU Wins!";
            }
            else if(playerPositions.size() + cpuPositions.size() == 9){
                return "Draw";

            }
        }





        return "";
    }
}
