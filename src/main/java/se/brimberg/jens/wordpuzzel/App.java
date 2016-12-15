package se.brimberg.jens.wordpuzzel;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class App {
	public static void main(String[] args) {
		JOptionPane pane = new JOptionPane();
		String answer = null;
		while (answer == null || !answer.toLowerCase().equals("feifei")) {
			answer = showInputDialog(null, "Heeeejjj!! Vad heter duuu?", "Feifei", QUESTION_MESSAGE);
		}
		int i = showConfirmDialog(null, "Yaaaayy!","MAGIC",INFORMATION_MESSAGE);
	}
}
