# Example-DependencyInjection
Dependency injection example

Injeção de dependência: é um padrão de projeto que visa manter o acoplamento baixo entre diferentes 
módulos de um sistema, separar a implementação das regras de negocio.

Os módulos não são definidos programaticamente e sim por configuração de infraestrutura (Container) que é responsável 
por "injetar" em cada componente suas dependências declaradas.
Dependendo da alteração se torna penoso a alteração da implementação.
Ex: Injetando um notificador na instanciação do AtivacaoClienteService.

No exemplo não depende mais da implementação se é e-mail ou sms, simplesmente segue o contrato da interface notificador.
Não precisa saber qual tipo de notificação, somente que precisa notificar.
Quem define qual será o tipo de notificação é feito de fora, invertendo o controle.

Inversão de controle (IoC): o controle não é feito de dentro da classe e sim por alguma força de fora.
Passando um notificador ele simplesmente vai seguir o contrato do notificador

Em linhas gerais injeção de dependência é uma forma de inversão de controle, onde injeta uma determinada
dependência em uma classe. Baixo acoplamento nas classes de servico.
