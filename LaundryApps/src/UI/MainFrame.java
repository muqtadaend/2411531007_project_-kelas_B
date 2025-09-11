package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.	
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Laundry Apps");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(119, 0, 292, 71);
		contentPane.add(lblNewLabel);
		
		JButton btnPesanan = new JButton("Pesanan");
		btnPesanan.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnPesanan.setBounds(33, 99, 126, 60);
		contentPane.add(btnPesanan);
		
		JButton btnLayanan = new JButton("Layanan");
		btnLayanan.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnLayanan.setBounds(197, 99, 126, 60);
		contentPane.add(btnLayanan);
		
		JButton btnPelanggan = new JButton("Pelanggan");
		btnPelanggan.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPelanggan.setBounds(370, 99, 126, 60);
		contentPane.add(btnPelanggan);
		
		JButton btnPengguna = new JButton("Pengguna");
		btnPengguna.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPengguna.setBounds(33, 220, 126, 60);
		contentPane.add(btnPengguna);
		
		JButton btnLaporan = new JButton("Laporan");
		btnLaporan.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnLaporan.setBounds(197, 220, 126, 60);
		contentPane.add(btnLaporan);
		
		JButton btnProfil = new JButton("Profil");
		btnProfil.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnProfil.setBounds(370, 220, 126, 60);
		contentPane.add(btnProfil);
		
		JButton btnKeluar = new JButton("Keluar");
		btnKeluar.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnKeluar.setBounds(33, 324, 463, 25);
		contentPane.add(btnKeluar);
	}

}
