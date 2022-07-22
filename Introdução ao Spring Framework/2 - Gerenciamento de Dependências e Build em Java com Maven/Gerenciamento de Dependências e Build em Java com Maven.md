# Gerenciamento de Dependências e Build em Java com Maven
## Apache Maven
- É uma ferramenta para gerenciar build e dependências de um projeto
- Primeira versão em julho de 2004, mantido pela Apache Software Foundation
- Executa testes de forma automatizada
- Compila todas as classes Java que existem na aplicação
- Facilita a compreensão do desenvolvedor
- Fornecer informações de qualidade
- Endereça como o software foi construido e suas dependÊncias através do POM (Project Object Model)
- Assegura a qualidade do projeto
- Trabalha com o conceito de Herança

### Instalação e Configuração Windows

[Link Download](https://maven.apache.org/download.cgi)
- Descompactar em um diretório de sua preferência
- Painel de controle -> Sistemas e Segurança -> Sistema -> Configurações Avançadas do Sistema
- Variáveis de Ambiente -> Path -> Novo -> colocar endereço da pasta onde você descompactou o arquivo (\bin)
- Conferir se deu certo no Prompt de Comando -> mvn --version
- Instalado!!

## Comandos Úteis
1. Compilar: compile
2. Testar: test
3. Empacotar: package
4. Limpar diretório de trabalho: clean

#### Para saber mais

https://www.baeldung.com/maven-compiler-plugin  
https://mkyong.com/maven/how-to-run-unit-test-with-maven/  
http://tutorials.jenkov.com/maven/maven-commands.html   
https://maven.apache.org/guides/

## Criando diferentes tipos de projetos

- Maven archetype - Template que possibilita a personalização e configuração de como um projeto vai ser construido.
- "maven archetype list" - pesquisar e procurar pelas instruçoes de execução do comando mvn archetype.
- https://maven.apache.org/archetypes/
- https://github.com/openjfx/javafx-maven-archetypes
- https://mvnrepository.com/

## POM, Dependências e Repositórios
### Project Object Model (POM)
- Unidade fundamental de trabalho
- Formato XML
- Detalha o projeto
- Detalha como construir o ptojeto
- Maven sempre procura pelo pom.xml para realizar sua execução
  
**Mais detalhes pom.xml**  
- Nome do projeto
- Dependências
- Módulos
- Configurações de build
- Detalhes do projeto (nome, descrição, licença, url)
- Configurações de ambiente (repositórios, tracking, profiles)
- pom.xml ---extends---> SUPER POM (conceito de Herança)

### Repositórios
- São locais onde podemos encontrar plugins e bibliotecas que o Maven provê
- Dois tipos: Local e Remoto
  
**Repositório Remoto**  
- É o local central utilizado pelo Maven para buscar os artefatos.
- Configurado automaticamente pelo Super POM para utilizar o [Maven Central](https://repo.maven.apache.org/maven2/)
- Configuração via pom.xml do projeto (tags: project, repositories, repository)
- Modificar a configuração global do Apache Maven instalado na máquina para utilizar um repo específico
	- Via settings.xml
	- Localização: pasta_apache_maven/conf/settings.xml
  
**Repositório Remoto** 
- é o repositório na máquina utilizado pelo Maven para buscar os artefatos.
- Estratégia de caching.
- Localizações
	- Windows: %USERPROFILE%\.m2\repository
	- Linux: $HOME/.m2/repository

### Como adicionar dependências
- Ir até o arquivo pom.xml
- Procurar pela Tag *dependencies*
- Adicionar a Tag *dependency*
- Especificar:
	- groupId: é como se fosse o id da organização. Segue as regras de nomes de pacote Java.
	- artifactId: nome do projeto em si
	- version: número da versão que será utilizada
  
**Para saber mais**  
https://docs.oracle.com/javase/specs/jls/se6/html/packages.html#7.7  
https://maven.apache.org/guides/mini/guide-naming-conventions.html  
https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html  
https://mvnrepository.com/  

## Gerenciamento de Dependências
- Comando: mvn install - publica localmente o componente do projeto, dependência passível de uso
### Tipos de Dependências
- Direta: dependências declaradas no pom.xml
- Transitivas: dependências obrigatórias das dependências declaradas no pom.xml

### Transitividade e Escopos
- O problema de dependências transitivas: outras dependências que o componente esta utilizando, além das que a gente quer usar
	- Aplicação muito grande
	- Conflitos de versão
  
**Escopos**  
Para lidar com esse problema, o Maven provê escopos para limitar a transitividade das dependências. Existem 6 tipos de escopos que podemos utilizar;  
  
**Classpath**: referência que a aplicação tem para o momento de execução  
- Runtime
- Teste
- Compile

#### Escopo default (compile)
- Padrão
- Dependência transitiva
- Disponível em todos os classpaths

#### Escopo provided
- Indica que a dependência será fornecida em tempo de execução por uma implementação na JDK ou via container
- Exemplos:
	- Servlet API
	- Java EE APIs
- A dependência com esse escopo é adicionado no classpath usado para compilação(compile) e teste(test) mas não em runtime
- Não é transitiva

#### Escopo runtime
- Indica que a dependência é necessária para execução e não para compilação
- Maven inclui no classpath dos escopos de runtime e test

#### Escopo test
- Disponível somente para compilação e execução de testes
- Não é transitivo

#### Escopo system
- Similar ao escopo provided exceto por ser necessário prover o JAR explicitamente
- A dependência com esse escopo é adicionado no classpath usado para compilação(compile) e teste(test) mas não em runtime
- Não é transitivo

#### Escopo import
- Este escopo é disponível apenas com uma dependência do tipo pom e com tag <dependencyManagement>
- Indica um processo de reutilizar dependências de um projeto

### Ver o classpath
**Comandos**  
mvn dependency:build-classpath –DincludeScope=compile  
mvn dependency:build-classpath –DincludeScope=test  
mvn dependency:build-classpath –DincludeScope=runtime  

### Dependências Opicionais
Utilizado quando uma dependência não é necessária para os projetos que irão reutilizar seu componente.  
  
### Exclusions
Utilizado quando o componente que você usa compartilha uma biblioteca que você já tem ou não quer ter disponível.  

## Maven Build Lifecycle
- Conceito de ciclo de vida de construção
- Conceito e os comandos da ferramenta
- Composto por 3 ciclos de vida
- Cada ciclo possui fases (Maven Phases)
- Cada fase possui objetivos (Maven Goals)

### 1- Default Lifecycle
- Principal ciclo
- Responsável pelo deploy local
- Composto por 23 fases
  
**Principais fases - comandos**  
- validate
- compile
- test-compile
- test
- integration-test
- package
- install
- deploy

### 2- Clean Lifecycle
- Ciclo intermediário
- Responsável pela limpeza do projeto
- Composto por 3 fases
  
**Fases - comandos**  
- pre-clean
- clean
- post-clean

### 3- Site Lifecycle
- Ciclo final
- Responsável pela criação do site de documentação do projeto
- Composto por 4 fases
  
**Fases - comandos** 
- pre-site
- site
- post-site
- site-deploy

## Projetos Multi-módulos
- Existe um projeto agregador e seus componentes internos são chamados de sub módulos.
- mvn archetype:generate... (no terminal)
- alteração no pom.xml - tag packaging
- entrar no projeto pelo terminal e criar projeto core
- criar projeto service
- criar módulo controler

**Para estudar**  
https://www.baeldung.com/maven-multi-module  
https://maven.apache.org/guides/mini/guide-multiple-modules.html  

## Plugins
- A maioria das funcionalidades são providas por plugins
- Estilo arquitetural para extensibilidade (criar seu próprio plugin)
- Escrito prioritariamente em Java e disponibilizados comumente como JARs

**Mais utilizados**  
- eclipse
- jacoco
- ear
- war
- compile
- clean
- checkstyle
- javadoc
  
**Comando para uso**  
mvn [plugin-name]:[goal-name]  
  
**Para estudar**  
https://maven.apache.org/plugins/  
https://maven.apache.org/guides/introduction/introduction-to-plugins.html  

## Agradecimentos

[Professor Willyan Caetano](https://www.linkedin.com/in/willyancaetanodev/)






