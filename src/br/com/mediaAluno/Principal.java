package br.com.mediaAluno;
import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BO media = new BO();
		
		String resp = JOptionPane.showInputDialog("Informe o primeiro valor: ");
		String resp1 = JOptionPane.showInputDialog("Informe o segundo valor: ");
		String resp2 = JOptionPane.showInputDialog("Informe o terceiro valor: ");
		
		double valor = Double.parseDouble(resp);
		double valor1 = Double.parseDouble(resp1);
		double valor2 = Double.parseDouble(resp2);
		
		
		JOptionPane.showMessageDialog(null, "Resultado da média do aluno é de " + String.format("%.2f" ,media.calcularMedia(valor, valor1, valor2)));
		
	
		
		if(media.calcularMedia(valor, valor1, valor2) >= 7) {
			JOptionPane.showMessageDialog(null, "Aluno aprovado");
	}else  
			JOptionPane.showMessageDialog(null, "Aluno reprovado");
	
		
	}
		

}
