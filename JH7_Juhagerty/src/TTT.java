import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.*;
import javax.swing.JFrame;

public class TTT {
	ArrayList<String> Board = new ArrayList<String>();
	String Player1;
	String Player2;
	String Winner;
	Scanner userInput = new Scanner(System.in);
	
	TTT(String userInputPlayer1, String userInputPlayer2){
		//create player names
		this.Player1 = userInputPlayer1;
		this.Player2 = userInputPlayer2;
		
		for(int i = 0; i < 9; i++){
			Board.add("-");
		}
	}
	public void PrintBoard(){
		System.out.println("Tic Tac Toe Board");
		System.out.println("------------------");
		for(int i = 0; i < this.Board.size(); i++){
			System.out.print("[");
			System.out.print(this.Board.get(i));
			System.out.print("]");
			System.out.print(i + 1 + " ");
			
			if(i == 2){
				System.out.println(" ");
			}
			if(i == 5){
				System.out.println(" ");
			}
			
			
		}
		System.out.println(" ");
		System.out.println("------------------");

	}
	public void PlacePiece(int index, String input){
		this.Board.set(index - 1, input);
	}
	public void Player1Turn(){
		int indexBuffer;
		System.out.print(this.Player1 + ", Please mark where you want to put your X (Example: 1-9): ");
		indexBuffer = userInput.nextInt();
		this.PlacePiece(indexBuffer, "X");
		this.PrintBoard();
	}
	public void Player2Turn(){
		int indexBuffer;
		System.out.print(this.Player2 + ", Please mark where you want to put your Y (Example: 1-9): ");
		indexBuffer = userInput.nextInt();
		this.PlacePiece(indexBuffer, "Y");
		this.PrintBoard();
	}
	public void SpeedPlayer1Turn(int input){
		int indexBuffer;
		indexBuffer = input;
		this.PlacePiece(indexBuffer, "X");
		this.PrintBoard();
	}
	public void SpeedPlayer2Turn(int input){
		int indexBuffer;
		indexBuffer = input;
		this.PlacePiece(indexBuffer, "X");
		this.PrintBoard();
	}
	public Boolean isWinner(){
		Boolean isThereAWinner = false;
		String P = "X";
		for(int x = 0; x < 8; x = x + 3){
			if(this.Board.get(x) == P && this.Board.get(x + 1) == P && this.Board.get(x + 2) == P){
				isThereAWinner = true;
				this.Winner = P;
			}
		}
		for(int x = 0; x < 3; x++){
			if(this.Board.get(x) == P && this.Board.get(x+3) == P && this.Board.get(x+6) == P){
				isThereAWinner = true;
				this.Winner = P;
			}
		}
		int c = 0;
			if(this.Board.get(c) == P && this.Board.get(c+4) == P && this.Board.get(c+8) == P){
				isThereAWinner = true;
				this.Winner = P;
			}
		
			if(this.Board.get(c+6) == P && this.Board.get(c+4) == P && this.Board.get(c+2) == P){
				isThereAWinner = true;
				this.Winner = P;
			}
			//Now Check if Y is winner
			P = "Y";
			
			for(int x = 0; x < 8; x = x + 3){
				if(this.Board.get(x) == P && this.Board.get(x + 1) == P && this.Board.get(x + 2) == P){
					isThereAWinner = true;
					this.Winner = P;
				}
			}
			for(int x = 0; x < 3; x++){
				if(this.Board.get(x) == P && this.Board.get(x+3) == P && this.Board.get(x+6) == P){
					isThereAWinner = true;
					this.Winner = P;
				}
			}
			c = 0;
				if(this.Board.get(c) == P && this.Board.get(c+4) == P && this.Board.get(c+8) == P){
					isThereAWinner = true;
					this.Winner = P;
				}
			
				if(this.Board.get(c+6) == P && this.Board.get(c+4) == P && this.Board.get(c+2) == P){
					isThereAWinner = true;
					this.Winner = P;
				}
		
		return isThereAWinner;
	}
	public boolean isFull(){
		boolean isFullBoard = false;
		if(!(this.Board.contains("-"))){
			isFullBoard = true;
		}
		return isFullBoard;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TTT newGame = new TTT("Justin", "Brandon");
		while(!(newGame.isFull())){
			newGame.PrintBoard();
			newGame.Player1Turn();
			if(newGame.isFull() && newGame.isWinner() == false){
				System.out.println("The Game Is A Cats Game.");
				break;
				}else{if(newGame.isWinner()){
					System.out.println(newGame.Player1 + ", Has Won.");
					break;
				}}
			newGame.Player2Turn();
			if(newGame.isFull() && newGame.isWinner() == false){
				System.out.println("The Game Is A Cats Game.");
				break;
				}else{if(newGame.isWinner()){
					System.out.println(newGame.Player2 + ", Has Won.");
					break;
				}}
		}
	}
}

