import com.d89rodrigues.di.modelo.Cliente;
import com.d89rodrigues.di.notificacao.NotificacaoEmail;
import com.d89rodrigues.di.notificacao.Notificador;
import com.d89rodrigues.di.service.AtivacaoClienteService;

public class Main {
	
	public static void main(String[] args) {
	    Cliente joao = new Cliente("João", "joao@xyz.com", "34999999999");
		Cliente maria = new Cliente("Maria", "maria@xyz.com", "11888888888");
		
		Notificador notificador = new NotificacaoEmail();
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
	}

}
