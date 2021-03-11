package com.d89rodrigues.di.service;

import com.d89rodrigues.di.modelo.Cliente;
import com.d89rodrigues.di.modelo.Produto;
import com.d89rodrigues.di.notificacao.Notificador;

public class EmissaoNotaFiscalService {

    private Notificador notificador;
	
	public EmissaoNotaFiscalService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void emitor(Cliente cliente, Produto produto) {
		// TODO emite nota fiscal aqui...
		this.notificador.notificar(cliente, "Nota fiscal do produto " + produto.getNome() + " foi emitida!");
	}

}
