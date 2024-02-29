import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PetDisplayApp extends JFrame implements ActionListener {
    private JLabel petLabel;
    private JRadioButton dogButton, catButton, birdButton, fishButton, rabbitButton;

    public PetDisplayApp() {
        setTitle("Pet Display App");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1));

        petLabel = new JLabel("No pet selected");
        panel.add(petLabel);

        dogButton = new JRadioButton("Dog");
        dogButton.addActionListener(this);
        panel.add(dogButton);

        catButton = new JRadioButton("Cat");
        catButton.addActionListener(this);
        panel.add(catButton);

        birdButton = new JRadioButton("Bird");
        birdButton.addActionListener(this);
        panel.add(birdButton);

        fishButton = new JRadioButton("Fish");
        fishButton.addActionListener(this);
        panel.add(fishButton);

        rabbitButton = new JRadioButton("Rabbit");
        rabbitButton.addActionListener(this);
        panel.add(rabbitButton);

        ButtonGroup group = new ButtonGroup();
        group.add(dogButton);
        group.add(catButton);
        group.add(birdButton);
        group.add(fishButton);
        group.add(rabbitButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == dogButton) {
            petLabel.setText("Displaying a dog");
        } else if (e.getSource() == catButton) {
            petLabel.setText("Displaying a cat");
        } else if (e.getSource() == birdButton) {
            petLabel.setText("Displaying a bird");
        } else if (e.getSource() == fishButton) {
            petLabel.setText("Displaying a fish");
        } else if (e.getSource() == rabbitButton) {
            petLabel.setText("Displaying a rabbit");
        }
    }

    public static void main(String[] args) {
        new PetDisplayApp();
    }
}
