import java.util.Scanner;

public class GameLoop {
    private Game game;
    private Scanner input = new Scanner(System.in);

    public GameLoop(){
        this.game = new Game();
    }

    public void runGame(){

        System.out.println(this.game.getStartingInfo());
        while(!this.game.isOver()){
            System.out.println("What would you like to do?");
            String userInput = input.nextLine();

            if (userInput.equals("age")) {
                this.game.advance();
            }
        }
    }

}
