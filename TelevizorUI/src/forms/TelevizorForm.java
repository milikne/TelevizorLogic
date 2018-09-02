package forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Televizor;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelevizorForm extends JFrame {

	private JPanel contentPane;
	private JButton btnOn;
	private JButton btnOff;
	private JButton btnKanalUp;
	private JButton btnKanalDown ;
	private JButton btnVolumeUp;
	private JButton btnVolumeDown;
	private JLabel lblKanal; 
	private JLabel lblVolume;

	protected Televizor Televizor;
	
	public TelevizorForm(){
		frame();
		this.Televizor = new Televizor();
		OffStanje();
	}
	
	public void OffStanje(){
		Televizor.StanjeOff();
		lblVolume.setText("");
		lblKanal.setText("");
		btnOn.setEnabled(true);
		btnOff.setEnabled(false);
		btnKanalUp.setEnabled(false);
		btnKanalDown.setEnabled(false);
		btnVolumeUp.setEnabled(false);
		btnVolumeDown.setEnabled(false);
	}
	
	public void OnStanje(){
		Televizor.StanjeOn();
		lblVolume.setText(String.valueOf(Televizor.getVolume()));
		lblKanal.setText(String.valueOf(Televizor.getKanal()));
		btnOn.setEnabled(false);
		btnOff.setEnabled(true);
		btnKanalUp.setEnabled(true);
		btnKanalDown.setEnabled(true);
		btnVolumeUp.setEnabled(true);
		btnVolumeDown.setEnabled(true);
	}
	
	

	/**
	 * Create the frame.
	 */
	public void frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		getContentPane().setLayout(null);
		
		btnOn = new JButton("ON");
		btnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OnStanje();
			}
		});
		btnOn.setBounds(23, 28, 89, 23);
		getContentPane().add(btnOn);
		
		btnOff = new JButton("OFF");
		btnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OffStanje();
			}
		});
		btnOff.setBounds(23, 67, 89, 23);
		getContentPane().add(btnOff);
		
		btnKanalUp = new JButton("KanalUp");
		btnKanalUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Televizor.kanalUp();
				lblKanal.setText(String.valueOf(Televizor.getKanal()));
			}
		});
		btnKanalUp.setBounds(136, 28, 89, 23);
		getContentPane().add(btnKanalUp);
		
		btnKanalDown = new JButton("KanalDown");
		btnKanalDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Televizor.kanalDown();
				lblKanal.setText(String.valueOf(Televizor.getKanal()));
			}
		});
		btnKanalDown.setBounds(136, 67, 89, 23);
		getContentPane().add(btnKanalDown);
		
		btnVolumeUp = new JButton("VolumeUp");
		btnVolumeUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Televizor.volumeUp();
				lblVolume.setText(String.valueOf(Televizor.getVolume()));
			}
		});
		btnVolumeUp.setBounds(270, 28, 89, 23);
		getContentPane().add(btnVolumeUp);
		
		btnVolumeDown = new JButton("VolumeDown");
		btnVolumeDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Televizor.volumeDown();
				lblVolume.setText(String.valueOf(Televizor.getVolume()));
			}
		});
		btnVolumeDown.setBounds(270, 67, 154, 23);
		getContentPane().add(btnVolumeDown);
		
		lblKanal = new JLabel("");
		lblKanal.setBounds(166, 140, 46, 14);
		getContentPane().add(lblKanal);
		
		lblVolume = new JLabel("");
		lblVolume.setBounds(313, 140, 46, 14);
		getContentPane().add(lblVolume);
	}
}
