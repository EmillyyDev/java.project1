package gui;
	import javax.swing.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	
	public class InterfaceGrafica extends JFrame{
		private static final long serialVersionUID = 1L;
		private JTextField nomeField, idadeField, matriculaField;
		private JButton exibirButton;
		JLabel resultadoLabel;
	
	public InterfaceGrafica() {
		setTitle ("cadastro de aluno");
		setSize (400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		JLabel nomeLabel = new JLabel("nome:");
		nomeLabel.setBounds(20, 20, 80, 25);
		add (nomeLabel);
		nomeField = new JTextField();
		nomeField.setBounds(20, 165, 80, 25);
		add (nomeField);
		
		JLabel idadeLabel = new JLabel ("idade:");
		nomeLabel.setBounds(20, 60, 80, 25);
		add (idadeLabel);
		idadeField = new JTextField();
		idadeField.setBounds(100, 60, 165, 25);
		add (idadeField);
		
		JLabel matriculaLabel = new JLabel("matricula:");
		matriculaLabel.setBounds(20, 100, 80, 25);
		add (matriculaLabel);
		matriculaField = new JTextField();
		matriculaField.setBounds(100, 100, 165, 25);
		add(matriculaField);
		
		exibirButton = new JButton("exibir dados");
		exibirButton.setBounds(100, 140, 165, 25);
		add(exibirButton);
		
		resultadoLabel = new JLabel ("resultado");
		resultadoLabel.setBounds(20, 180, 300, 25);
		add(resultadoLabel);
		
		  exibirButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String nome = nomeField.getText();
	                int idade = Integer.parseInt(idadeField.getText());
	                String matricula = matriculaField.getText();

	                Aluno aluno = new Aluno(nome, idade, matricula);
	                resultadoLabel.setText(aluno.exibirDados());
	            }
	        });
	    }

	    public static void main(String[] args) {
	        InterfaceGrafica tela = new InterfaceGrafica();
	        tela.setVisible(true);

		
	}
		
}