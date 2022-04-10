import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartingFrame extends JFrame implements ActionListener {
    public static SearchFrame search;
    JButton newModpack = new JButton("Install new modpack");
    JButton configure_modpacks = new JButton("Configure modpacks");
    public StartingFrame() {
        Border border = BorderFactory.createLineBorder(Color.RED, 3);
        int width = 800, height = 500;
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

        double screenHeight = dimension.getHeight();
        double screenWidth = dimension.getWidth();
        this.setLocation((int)(screenWidth / 2) - (width / 2), (int)(screenHeight / 2) - (height / 2));
        newModpack.setBounds(0,0, 180, 40);
        newModpack.setLocation((width / 2) - (newModpack.getWidth() / 2),(height/2) - (newModpack.getHeight()/2) - 40);
        newModpack.setFocusable(false);
        newModpack.addActionListener(this);
        configure_modpacks.setBounds(0,0, 180, 40);
        configure_modpacks.setLocation((width / 2) - (configure_modpacks.getWidth() / 2),(height/2) - (configure_modpacks.getHeight()/2) + 40);
        configure_modpacks.setFocusable(false);
        configure_modpacks.addActionListener(this);
        this.setSize(width,height);
        this.setLayout(null);
        this.setTitle("LinuxCurse");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(newModpack);
        this.add(configure_modpacks);

        this.setVisible(true);
        this.getContentPane().setBackground(Color.GRAY);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == newModpack) {
            this.dispose();
            search = new SearchFrame();
        }
        if(e.getSource() == configure_modpacks) {
            this.dispose();
            new LaunchFrame();
        }
    }
}
