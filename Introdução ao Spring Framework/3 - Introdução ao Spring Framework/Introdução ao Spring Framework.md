# Spring Framework
- Conciste em vários recursos organizados em cerca de 20 módulos
- O Core Container consiste nos módulos Core, Beans, Context e Expression Language
- Core é o núcleo principal do Spring
## Spring Core
#### Core e Beans
- Fornecem a estrutura principal, partes fundamentais do Spring
- IoC - Inversão de Controles
- Injeção de Dependências
- BeanFactory - fábrica de objetos em tempo de execução
#### Context
- Módulo construído sobre a base sólida fornecida pelos módulos Core e Beans
- Herda as características do módulo Beans e adiciona suporte à **internacionalização** a partir de mensagens, comunicação entre componentes, carregamento de arquivos e a criação de contextos especificos.
- ApplicationContext - interface, extensão da BeanFactory
#### Expression Language
- Define através de xml ou anotações em tempo de execução, valores e comportamentos do Beans.
### Spring IoC Container (inversão de controles)
- É um princípio de design de programas de computadores onde a sequência (controle) de chamadas dos métodos é invertida em realção à programação tradicional, o useja, ela não é determinada diretamente pelo programador.
- Eu não vou escrever minhas classes, meus métodos e vou montar minha estrutura, mas quem vai decidir o que deve ser chamado pra executar corretamente não vai ser quem ta programando, vai ser o Spring.
### Application Context (interface)
- Instanciar, configurar e montar os beans
- Configuração:
	- O container pega as instruções sobre quais objetos instanciar, configurar e montar lendo os metadados de configuração.
	- A configuração poder ser representada em XML, anotações Java ou código Java  
	- Criar um arquivo geralmente com o nome application-context.xml
	- Passar para ele a tag beans e dentro da tag falar o que o Spring vai monitorar nessa aplicação.
	- Para cada componente da aplicação que queremos que o Spring monitore, precisamos passar o identificador e onde a classe que estamos monitorando está.

## Spring Beans
- É qualquer objeto gerenciado pelo Spring loc.
### Stereotypes
- Anotações Spring Bean
	- @Repository: é uma anotação usada em nivel de classes que representam a camada DAO, ou seja, qualquer classes que tenha alguma interação com banco de dados, e o uso dessa anotação já faz a tradução de exceções de persistência, então qualquer erro de banco de dados ja vai ser traduzido pra um erro java.
	- @Service: onde geralmente vai ficar a logica da aplicação, as nossas regras de negocio 
	- @Controller/@RestController: fica nas classes que representam os controladores no Spring MVC, ou seja, ela que vai controlar as chamadas das telas do nosso sistema. E a evolução da @Controller é a @RestController, que também é usada em classes controladoras mas não são usadas pra retornar nossas paginas e sim pra retornar dados em JSON.  
	- @Configuration: indica uma classe que declara 1 ou mais metodos com @Bean como a gente ja viu na criação do nosso Bean
	- @Component:  é uma anotação usada em classes pra gerar um bean genérico, a gente usa ela quando a classe não se encaixa nas demais.
  
A @Component foi a última que a gente viu, porque ela é uma anotação de estereótipo mais genérica, e as @Controller, @Service e @Repository são especificações da @Component pra usos mais especificos, como apresentação de telas, regras de negócio e persistência de dados.  
  
### Escopos e ciclo de vida
No total temos 6 escopos de beans:  
- Singleton: significa que só vai existir uma única instância desse bean, por padrão quando a gente não fala explicitamente qual o escopo, o Spring já utiliza o Singleton.
- Prototype: bem diferente do singleton que cria só uma instância, aqui uma instância diferente é criada cada vez que o bean é solicitado.
- Request: não usa a mesma anotação das 2 anteriores, a @RequestScope é uma anotação diferente, mas é uma especificação da @Scope e cria uma instancia de bean pra uma unida solicitação HTTP.
- Session: a @SessionScope também é uma especificação de @Scope mas essa já cria uma instância de bean pra cada sessão HTTP.
- Application: também uma especialização da @Scope pra indicar um bean com ciclo de vida vinculado com um aplicativo web.
- WebSocket: o escopo de webSocket utiliza a mesma @Scope das primeiras, mas com a diferença de falar o atributo proxyMode, porque quando o contexto do app web é instanciado, não tem solicitação ativa, então o spring vai criar um proxy pra ser injetado como dependência e vai instanciar o nosso bean quando precisar em uma solicitação.

## Injeção de dependências
É uma forma de aplicar **inversão de controle** em uma classe que utiliza funcionalidades de outras classes
### Proxies Setter  
É o modo com que o Spring procura e injeta as nossas dependências.   
#### Autowired
- Propriedades
- Construtores
- Métodos
### Suporte a CDI
O CDI é a especificação Java que define a injeção de dependência e inversão de controle para aplicações JavaEE. 

## Para Estudar 
https://docs.spring.io/spring-framework/docs/current/reference/html/core.html

https://mkyong.com/tutorials/spring-boot-tutorials/

https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/overview.html

## Agradecimentos
[Professor Kaique Costa](https://www.linkedin.com/in/kaique-arantes/)