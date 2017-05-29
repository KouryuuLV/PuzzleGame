import java.awt.event.*;

import javax.swing.*;

public class Main {
	static JFrame frame;
	static Puzzle puzzle;
	
	public static void main(String [] args) {
		frame = new JFrame("Puzzlegame RVT Logo");
                CodeTimer CodeTimer = new CodeTimer();
                boolean ended = false;		frame.setSize(327, 348);
		
		puzzle = new Puzzle(new ImageIcon(Main.class.getResource("/RVT_1.png")).getImage());
		
		frame.add(puzzle);
		
		frame.setLocationRelativeTo(null);
		
		frame.setResizable(false);
		frame.setVisible(true);
		
		frame.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (!puzzle.started) 
                                {
                                    puzzle.start();
                                    CodeTimer.StartTimer();
                                }
				else if (puzzle.mixing) puzzle.mixing = false;
				else puzzle.onClick(e);
                                {
                                                    
                                    if ( ended == true )
                                        
                                        CodeTimer.StopTimer();
                                    System.out.println(CodeTimer.getTime());
                                }
			}
		});
	}

}
