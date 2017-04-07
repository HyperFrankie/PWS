package PWS;

public class contentPane extends JPanel {
	
	public float transparancy;
	
	public contentPane(int width, int height, float transparancy) {
		this.setSize(width, height);
		this.transparancy = transparancy;
	}
	
	public paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		this.setBackground(0, 0, 0);
		g2.setComposite(transparancyComposite(composite.PLAIN, this.transparancy));
	}
	
	
}
