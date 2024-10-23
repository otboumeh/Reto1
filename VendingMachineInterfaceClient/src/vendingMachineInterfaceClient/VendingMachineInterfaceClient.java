package vendingMachineInterfaceClient;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class VendingMachineInterfaceClient extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public ImageIcon[] imagenes = new ImageIcon[5];
	private JTextField textFieldProductUno1;
	public int i = 0, o = 0, p = 0, a = 0;
	private JTextField textFieldProductoDos1;
	private JTextField textFieldProductotres1;
	private JTextField textFieldProductocuatro1;
	private JTable table;
	private JPanel TipoRefrescos = new JPanel();
	private JPanel TipoSnacks = new JPanel();
	private JPanel TipoSandwitch = new JPanel();
	private JPanel TipoDulces = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VendingMachineInterfaceClient frame = new VendingMachineInterfaceClient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Fonction to put image
	private void PutImg() {

		imagenes[0] = new ImageIcon(this.getClass().getResource("0.jpg"));
		imagenes[1] = new ImageIcon(this.getClass().getResource("Bocadillos.png"));
		imagenes[2] = new ImageIcon(this.getClass().getResource("Dulces.png"));
		imagenes[3] = new ImageIcon(this.getClass().getResource("Refrescos.png"));
		imagenes[4] = new ImageIcon(this.getClass().getResource("Snacks.png"));

	}

	private void ChangePanelRefresco() {
		CardLayout layout = (CardLayout) getContentPane().getLayout();
		layout.show(getContentPane(), "TipoRefresco");
	}

	private void ChangePanelSandwitch() {
		CardLayout layout = (CardLayout) getContentPane().getLayout();
		layout.show(getContentPane(), "TipoSandwitch");
	}

	private void ChangePanelDulce() {
		CardLayout layout = (CardLayout) getContentPane().getLayout();
		layout.show(getContentPane(), "TipoDulces");
	}

	private void ChangePanelSnack() {
		CardLayout layout = (CardLayout) getContentPane().getLayout();
		layout.show(getContentPane(), "TipoSnacks");
	}

	private void ChangePanelTipo() {
		CardLayout layout = (CardLayout) getContentPane().getLayout();
		layout.show(getContentPane(), "Tipos");
	}

	private void RefrescosHandler() {

		contentPane.add(TipoRefrescos, "TipoRefresco");
		TipoRefrescos.setLayout(null);
		JButton BtnMenosproductoUno1 = new JButton("-");
		JButton BtnplusProductoCuatro1 = new JButton("+");
		JButton BtnVolverRef = new JButton("Volver");
		JButton BtnMenosproductoDos1 = new JButton("-");
		JButton BtnplusProductoDos1 = new JButton("+");
		JButton BtnplusProductoTres1 = new JButton("+");
		JButton BtnplusProductoUno1 = new JButton("+");
		JButton BtnMenosproductoTres1 = new JButton("-");
		JButton BtnMenosproductoCuatro1 = new JButton("-");

		BtnMenosproductoUno1.setBounds(8, 381, 45, 23);
		BtnplusProductoUno1.setBounds(98, 381, 45, 23);
		BtnVolverRef.setBounds(109, 484, 89, 23);
		BtnMenosproductoTres1.setBounds(375, 381, 45, 23);
		BtnMenosproductoDos1.setBounds(192, 381, 45, 23);
		BtnplusProductoTres1.setBounds(485, 381, 45, 23);
		BtnMenosproductoCuatro1.setBounds(568, 381, 45, 23);
		BtnplusProductoCuatro1.setBounds(673, 381, 45, 23);
		BtnplusProductoDos1.setBounds(300, 381, 45, 23);

		TipoRefrescos.add(BtnMenosproductoUno1);
		TipoRefrescos.add(BtnplusProductoUno1);
		TipoRefrescos.add(BtnVolverRef);
		TipoRefrescos.add(BtnMenosproductoDos1);
		TipoRefrescos.add(BtnplusProductoDos1);
		TipoRefrescos.add(BtnMenosproductoTres1);
		TipoRefrescos.add(BtnplusProductoCuatro1);
		TipoRefrescos.add(BtnplusProductoTres1);
		TipoRefrescos.add(BtnMenosproductoCuatro1);
		textFieldProductUno1 = new JTextField();
		textFieldProductUno1.setBounds(55, 382, 40, 20);
		textFieldProductUno1.setText(Integer.toString(i)); // Converts int i to String
		textFieldProductUno1.setEditable(false);
		TipoRefrescos.add(textFieldProductUno1);
		textFieldProductUno1.setColumns(10);

		textFieldProductoDos1 = new JTextField();
		textFieldProductoDos1.setText(Integer.toString(o)); // Converts int o to String
		textFieldProductoDos1.setEditable(false);
		textFieldProductoDos1.setColumns(10);
		textFieldProductoDos1.setBounds(247, 382, 40, 20);
		TipoRefrescos.add(textFieldProductoDos1);

		textFieldProductotres1 = new JTextField();
		textFieldProductotres1.setText(Integer.toString(p)); // Converts int p to String
		textFieldProductotres1.setEditable(false);
		textFieldProductotres1.setColumns(10);
		textFieldProductotres1.setBounds(430, 382, 40, 20);
		TipoRefrescos.add(textFieldProductotres1);

		textFieldProductocuatro1 = new JTextField();
		textFieldProductocuatro1.setText(Integer.toString(a)); // Converts int a to String
		textFieldProductocuatro1.setEditable(false);
		textFieldProductocuatro1.setColumns(10);
		textFieldProductocuatro1.setBounds(623, 382, 40, 20);
		TipoRefrescos.add(textFieldProductocuatro1);

		BtnVolverRef.addMouseListener(new MouseAdapter() { // Add return button
			@Override
			public void mouseClicked(MouseEvent e) { // Add event in return button
				ChangePanelTipo();

			}
		});
		BtnplusProductoUno1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i++;
				textFieldProductUno1.setText(Integer.toString(i));
			}
		});
		BtnMenosproductoUno1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (i > 0) {
					i--;
					textFieldProductUno1.setText(Integer.toString(i));
				}
			}
		});

		BtnMenosproductoDos1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (o > 0) {
					o--;
					textFieldProductoDos1.setText(Integer.toString(o));
				}
			}
		});
		BtnplusProductoTres1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				p++;
				textFieldProductotres1.setText(Integer.toString(p));
			}
		});

		BtnMenosproductoCuatro1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (a > 0) {
					a--;
					textFieldProductocuatro1.setText(Integer.toString(a));
				}
			}
		});
		BtnplusProductoDos1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				o++;
				textFieldProductoDos1.setText(Integer.toString(o));
			}
		});

		BtnMenosproductoTres1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (p > 0) {
					p--;
					textFieldProductotres1.setText(Integer.toString(p));
				}
			}
		});

		BtnplusProductoCuatro1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				a++;
				textFieldProductocuatro1.setText(Integer.toString(a));
			}
		});

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(39, 129, 118, 221);
		TipoRefrescos.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(220, 111, 111, 256);
		TipoRefrescos.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(393, 146, 111, 221);
		TipoRefrescos.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(565, 163, 98, 186);
		TipoRefrescos.add(lblNewLabel_3);

		carroCreator();

	}


		
	private void carroCreator() {
	    // ScrollPane for TipoRefrescos
	    JScrollPane scrollPaneRefrescos = new JScrollPane();
	    scrollPaneRefrescos.setBounds(715, 29, 249, 276);
	    TipoRefrescos.add(scrollPaneRefrescos);

	    // Create table model with column names
	    DefaultTableModel modeloRefrescos = new DefaultTableModel();
	    modeloRefrescos.addColumn("Producto"); // Column 1
	    modeloRefrescos.addColumn("Precio");   // Column 2

	    // Add rows to the table model
	    modeloRefrescos.addRow(new Object[]{"Coca-Cola", "1.00"});  // Row 1
	    modeloRefrescos.addRow(new Object[]{"Pepsi", "0.95"});      // Row 2
	    modeloRefrescos.addRow(new Object[]{"Fanta", "0.90"});      // Row 3

	    // Create the table using the model
	    JTable tableRefrescos = new JTable(modeloRefrescos);
	    tableRefrescos.getTableHeader().setFont(new Font("Arial", Font.BOLD, 13));
	    scrollPaneRefrescos.setViewportView(tableRefrescos);

	    // Repeat for other panels (TipoDulces, TipoSnacks, TipoSandwitch)

	    // ScrollPane for TipoDulces
	    JScrollPane scrollPaneDulces = new JScrollPane();
	    scrollPaneDulces.setBounds(715, 29, 249, 276);
	    TipoDulces.add(scrollPaneDulces);

	    // Create table model for Dulces
	    DefaultTableModel modeloDulces = new DefaultTableModel();
	    modeloDulces.addColumn("Producto");
	    modeloDulces.addColumn("Precio");

	    // Add rows for Dulces
	    modeloDulces.addRow(new Object[]{"Chocolate", "1.50"});
	    modeloDulces.addRow(new Object[]{"Caramelos", "0.50"});
	    modeloDulces.addRow(new Object[]{"Galletas", "1.20"});

	    JTable tableDulces = new JTable(modeloDulces);
	    tableDulces.getTableHeader().setFont(new Font("Arial", Font.BOLD, 13));
	    scrollPaneDulces.setViewportView(tableDulces);

	    // Repeat for TipoSnacks and TipoSandwitch similarly
	}


	

	public VendingMachineInterfaceClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		PutImg();
		JPanel PanelBienvenida = new JPanel(); // Create Panel
		contentPane.add(PanelBienvenida, "PanelBienvenida");
		PanelBienvenida.setLayout(null);

		JLabel LabelImg = new JLabel("New label");
		LabelImg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // event when we click on the image
				ChangePanelTipo(); // Call the Panel Tipos
			}
		});
		LabelImg.setBounds(0, 0, 865, 518);
		PanelBienvenida.add(LabelImg);
		LabelImg.setIcon(imagenes[0]);

		JPanel PanelTipos = new JPanel();
		contentPane.add(PanelTipos, "Tipos");
		PanelTipos.setLayout(null);

		JLabel lblTipo1 = new JLabel("New label");
		lblTipo1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanelSandwitch();
			}
		});
		lblTipo1.setBounds(32, 93, 170, 266);
		PanelTipos.add(lblTipo1);
		lblTipo1.setIcon(imagenes[1]);

		JLabel lblTipo2 = new JLabel("New label");
		lblTipo2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanelDulce();
			}
		});
		lblTipo2.setBounds(261, 93, 170, 266);
		PanelTipos.add(lblTipo2);
		lblTipo2.setIcon(imagenes[2]);

		JLabel lblTipo3 = new JLabel("New label");
		lblTipo3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanelRefresco();
			}
		});
		lblTipo3.setBounds(463, 93, 170, 266);
		PanelTipos.add(lblTipo3);
		lblTipo3.setIcon(imagenes[3]);

		JLabel lblTipo4 = new JLabel("New label");
		lblTipo4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanelSnack();
			}
		});
		lblTipo4.setBounds(685, 93, 170, 266);
		PanelTipos.add(lblTipo4);
		lblTipo4.setIcon(imagenes[4]);

		RefrescosHandler();

		contentPane.add(TipoDulces, "TipoDulces");
		TipoDulces.setLayout(null);

		JButton BtnVolverDulces = new JButton("Volver");
		BtnVolverDulces.addMouseListener(new MouseAdapter() { // Add return button
			@Override
			public void mouseClicked(MouseEvent e) { // Add event in return button
				ChangePanelTipo();

			}
		});
		BtnVolverDulces.setBounds(382, 209, 89, 23);
		TipoDulces.add(BtnVolverDulces);

		contentPane.add(TipoSnacks, "TipoSnacks");

		JButton BtnVolverSnack = new JButton("Volver"); // Add return button
		BtnVolverSnack.setBounds(340, 206, 89, 23);
		BtnVolverSnack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // Add event in return button
				ChangePanelTipo();
			}
		});
		TipoSnacks.setLayout(null);
		TipoSnacks.add(BtnVolverSnack);

		contentPane.add(TipoSandwitch, "TipoSandwitch");
		TipoSandwitch.setLayout(null);

		JButton BtnVolverSandwitch = new JButton("Volver"); // Add return button
		BtnVolverSandwitch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // Add event in return button
				ChangePanelTipo();

			}
		});
		BtnVolverSandwitch.setBounds(406, 223, 89, 23);
		TipoSandwitch.add(BtnVolverSandwitch);
	}
}