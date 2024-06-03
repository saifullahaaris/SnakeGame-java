import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;

public class GameFrame extends JFrame{

    GameFrame(){
        JLabel scoreLabel;

        scoreLabel = new JLabel("Score: 0");
        scoreLabel.setFont(new Font("Arial", Font.PLAIN, 25));
        this.add(scoreLabel, BorderLayout.NORTH);

        GamePanel panel = new GamePanel(scoreLabel);
        this.add(panel);
        
        // this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

}
