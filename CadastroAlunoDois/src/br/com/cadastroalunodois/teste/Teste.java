package br.com.cadastroalunodois.teste;


import br.com.cadastroalunodois.beans.Aluno;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno ();
		
		String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola: ");
		
		aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
		aluno.setIdade(22);
		aluno.setRm(99150);
		aluno.setPeso(59.50);
		
		//simular peso so sapato
		
		System.out.println(aluno.pesoTotal(2));
		
		System.out.println("O nome do aluno é " + aluno.getNome());
		
		//System.out.println("O nome da escola é " + nomeEscola);
		

	}

}
