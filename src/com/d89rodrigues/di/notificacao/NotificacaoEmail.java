package com.d89rodrigues.di.notificacao;

import com.d89rodrigues.di.modelo.Cliente;

public class NotificacaoEmail implements Notificador{

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
