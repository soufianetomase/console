package fr.souf;

import static org.fusesource.jansi.Ansi.ansi;
import static org.fusesource.jansi.Ansi.Color.GREEN;
import static org.fusesource.jansi.Ansi.Color.RED;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.fusesource.jansi.AnsiConsole;
//http://patorjk.com/software/taag/#p=testall&h=0&v=1&c=bash&f=Rectangles&t=Type%20Something%20
public class Main {
	public static void main(String[] args) throws IOException {
		AnsiConsole.systemInstall();
		AnsiConsole.out.println("Hello World");
		System.out.println(ansi().eraseScreen().fg(RED).a("Hello").fg(GREEN).a(" World").reset());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter String");
		String s = br.readLine();
		System.out.print("Enter Integer:");
		try {
			int i = Integer.parseInt(br.readLine());
		} catch (NumberFormatException nfe) {
			System.err.println("Invalid Format!");
		}
	}
}