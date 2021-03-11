package com.d89rodrigues.di.notificacao;

import com.d89rodrigues.di.modelo.Cliente;

public interface Notificador {
	
	void notificar(Cliente cliente, String mensagem);

}
