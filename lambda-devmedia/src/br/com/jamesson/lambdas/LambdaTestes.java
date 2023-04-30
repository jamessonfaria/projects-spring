package br.com.jamesson.lambdas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;

public class LambdaTestes {

	private static JButton button = new JButton("Teste");
	private static List<String> lista = Arrays.asList(new String[] {"C", "A", "B", "G"});
	
	public static void main(String[] args) {
		double res = Calc.calcular(30d, 20d, (x, y) -> x / y);	
		System.out.println(res);
		
		lista.forEach(System.out::println);
		
		long cont = lista.stream().filter(s -> s.equals("B")).count();
		System.out.println(cont);
		
		lista.stream().forEachOrdered(s -> System.out.println(s));
	}
	
	private void initButton() {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Botão clicado");
			}
		});
	}
	
	private void initButtonLambda() {
		button.addActionListener(event -> imprimiTexto(event));
	}
	
	private void imprimiTexto(ActionEvent event) {
		System.out.println("Botão clicado");
		System.out.println("Botão clicado 2");	
	}
	
}
