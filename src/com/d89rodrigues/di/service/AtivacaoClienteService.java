package com.d89rodrigues.di.service;

import com.d89rodrigues.di.modelo.Cliente;
import com.d89rodrigues.di.notificacao.Notificador;

public class AtivacaoClienteService {
	
	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		this.notificador.notificar(cliente, "Seu cadastro está ativo!");
	}

}
