import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String respuesta = "";

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

    //Task 1: See if the user wants to play. 
    respuesta = scan.nextLine();

    if(respuesta.equals("yes")){
        System.out.println("Excelent let's play!");//keep everything in english
        String seleccionJugador = scan.nextLine();
        String seleccionComput = scan.nextLine();
        String resultado = result(seleccionJugador, seleccionComput); //RB:cambie el metodo resultado (que no existia) a result que esta abajoi

    }
        {
        
    }


    /*Task 2: Set up the game
    

       • if the answer is yes: 
             – print: Great!
             – print: rock – paper – scissors, shoot!
             – pick up user's choice.
             – get the computer choice (can only be done after task 3).
             – get the result (can only be done after task 4)
             – print everything (can only be done after task 5).

       • else:
             – print: Darn, some other time...!        
    */
              

        scan.close();
    }


    //Task 3  – Write a function where the computer picks a random choice.
    public static String seleccionComput(){ //RB:cambie el metodo de void a string para que los returns no tengan que ser vacios
        double randomNumber = Math.random() *3; 
        int integer =(int) randomNumber;


        switch(integer){
            case 0: return "Piedra";
            case 1: return "Papel";
            case 2: return "Tijeras";
            default: return ""; 

        }
        
    }
    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */




    //Task 4  – Write a function that compares the choices and returns the result.

    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   1. result is "You win" if:
     * 
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     * 
     *   2. result is "You lose" if:
     * 
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     * 
     *   3. result is "It's a tie" if:
     * 
     *       your choice equals computer choice.
     *   
     */

    public static String result(String seleccionJugador, String seleccionComput) {
        String result = "";

            if(seleccionJugador.equals("Piedra") || seleccionComput.equals("Papel")){
                result ="has perdido Tio";
            } else if (seleccionJugador.equals("Papel") || seleccionComput.equals("Tijeras")){
                result = "Has perdido Tio";
            } else if (seleccionJugador.equals("Tijeras") || seleccionComput.equals("Papel")){
                result = "has Ganao Tio";
            } else if(seleccionJugador.equals("Piedra") || seleccionComput.equals("Tijeras")){
                result = "Has Ganao Tio";
            } else if (seleccionJugador.equals("Papel") || seleccionComput.equals("Piedra")){
                result = "Has Ganao Tio";
            }else if (seleccionJugador.equals("Papel") || seleccionComput.equals("Tijeras")){
                result = "has perdido Tio";

            }else if(seleccionJugador.equals(seleccionComput)){
                result = "es un empate";
            }

        return result;
      }
 
     //Task 5  – Write a function that prints your choice, the computer's, and the result.
      public static void printresultados(){
        
      }
    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     
     * 
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */

}
