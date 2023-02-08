package br.com.carlosguilherme;

import java.lang.reflect.Field;

import br.com.carlosguilherme.annotations.Tabela;
import br.com.carlosguilherme.entities.TipoTabela;

public class app {

	public static void main(String[] args) {

		TipoTabela tabela = new TipoTabela();
		tabela.setNome("Premiada");
		tabela.setDescricao("Tabela usada para premiações");
		TipoTabela tabela2 = new TipoTabela();
		tabela2.setNome("Classificatoria");
		tabela2.setDescricao("Tabela usada para mostrar classificações em campeonatos");
		
		
		
		mostrarValores(tabela);
		mostrarValores(tabela2);
	}

		
	
	public static void mostrarValores(TipoTabela obj) {
		
		Class clazz = obj.getClass();
				
		for (Field fields : clazz.getDeclaredFields()) {
			if (fields.isAnnotationPresent(Tabela.class)) {
				try {
					
					Tabela t = fields.getAnnotation(Tabela.class);
					String nomeTabela = t.value();
					
				 											
					System.out.println(fields.getName() + ": " + obj.getTipo() );
				}

				catch (IllegalArgumentException  | SecurityException e) {
					e.printStackTrace();
				}
			}

		}
		
	}
	
}
