import java.util.Scanner;
 //Task 1: See if the user wants to play. 
public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String respuesta = "";

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
   
        respuesta = scan.nextLine();

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
        if(respuesta.equals("yes")){
            System.out.println("Excelent let's play!");//keep everything in english
            System.out.println("Rock - Paper - Scissors ... Shoot");
            String seleccionComput = seleccionComput();
            String seleccionJugador = scan.nextLine();
            String resultado = result(seleccionJugador, seleccionComput); //RB:cambie el metodo resultado (que no existia) a result que esta abajoi
            printresultados(seleccionJugador, seleccionComput, resultado);
        }else{
            System.out.println("Well we will play in another time! cya");
        }
        scan.close();
    }


    //Task 3  – Write a function where the computer picks a random choice.
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

    public static String result(String seleccionJugador, String seleccionComput) { //este se puede mejorar usando mejor los ifs igual lo cambio luego
        String resultado = "";
            //se cambiaron los operadores || que es un or por los && que es un and, para que se cumplan las condiciones
            if(seleccionJugador.equals("Piedra") && seleccionComput.equals("Papel")){
                resultado ="you lose!";
            }
            else if(seleccionJugador.equals("Piedra") && seleccionComput.equals("Tijeras")){
                resultado = "you win!";
            }
            else if (seleccionJugador.equals("Piedra") && seleccionComput.equals("Piedra")){
                resultado = "it is a tie!";
            }
            if(seleccionJugador.equals("Papel") && seleccionComput.equals("Papel")){
                resultado ="it is a tie";
            }
            else if(seleccionJugador.equals("Papel") && seleccionComput.equals("Tijeras")){
                resultado = "you lose!";
            }
            else if (seleccionJugador.equals("Papel") && seleccionComput.equals("Piedra")){
                resultado = "you win!";
            }           
            if(seleccionJugador.equals("Tijeras") && seleccionComput.equals("Papel")){
                resultado ="you win!";
            }
            else if(seleccionJugador.equals("Tijeras") && seleccionComput.equals("Tijeras")){
                resultado = "it is a tie";
            }
            else if (seleccionJugador.equals("Tijeras") && seleccionComput.equals("Piedra")){
                resultado = "you lose!";
            }
            
        return resultado;
      }
 
     //Task 5  – Write a function that prints your choice, the computer's, and the result.
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
      public static void printresultados(String seleccionJugador, String seleccionComput, String resultado){
        System.out.println("\nEscogiste: " + seleccionJugador);
        System.out.println("\nCPU Escogio: " + seleccionComput);
        System.out.println(resultado);
      }


}
