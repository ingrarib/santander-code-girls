# Principais Protocolos de Comunicação da Internet
## Protocolo de comunicação Web HTTP
### Mensagens HTTP - Request & Response
#### HTTP Request  
- Estrutura: (texto em ASCII)  
**Request Line**  
Get:/somedir/page.htmlHTTP/1.1    
**Header Line**  
Host: www.someschool.edu  
Connection: close  
User-agent: Mozilla/5.0  
Accept-language: fr  

#### Métodos  
- **Get** - solicita um recurso do servidor (MAIS UTILIZADO)
- **Post** - submete uma entidade a um recurso
- Head - GET sem corpo de resposta
- Put - substituição de recursos pelos dados da requisição
- Delete - remoção de um recurso
- Trace - chamada de loop-back a um determinado recurso
- Option - opções de comunicação com recurso
- Connect - tunelamento identificado pelo recurso
- Patch - modificação parcial

- MÉTODOS SEGUROS (Read-only) - quando executados não modificam o estado do servidor
	- Get
	- Head
	- Option

#### HTTP Response 
- Estrutura: 
**Staus Line**  
HTTP/1.1 200 OK      
**Headers Line**  
Connection: close  
Date: Tue, 09 Aug 2011 15:44:04 GMT  
Server: Apache/2.2.3 (CentOS)  
Last-Modified: Tue, 09 Aug 2011 15:11:03 GMT  
Content-Lenght: 6821  
Content-Type: text/html  
**Enity body**  
(data, data, ....)  

#### Mensagens HTTP - Response
- Versão do protocolo
- Status code

**Status da mensagem**  
  
- 200 OK: request bem sucedida e objeto enviado
- 301 Moved Permanently: objeto realocado nova URL no campo Location
- 400 Bad Request: resposta genêrica - servidor não entendeu a mensagem
- 404 Not Found: o documento solicitado é inexistente
- 505 HTTP version Not Supported: versão do protocolo não suportada pelo servidor

**Classificação dos Status Code**

- Information response (100-199)
- Successful response (200-299)
- Redirection response (300-399)
- Client error response (400-499)
- Server error response (500-599)

**WebDav** - Web Distributed Authoring and Versioning  
- Permite adicionar, deletar ou recuperar informações
- Link de páginas
- Criação de conjunto de documentos
- 102 - Processing
- 207 - Multi-status
- 208 - Already Reported
- 422 - Unprocessable Entity
- 423 - Locked
- 424 - Failed Dependency

### Cookies e Cache
**Cookies**  
- TRACK
- Pequenos pedaços ou blocos de dados criados e utilizados pelo servidor para persistir dados no dispositivo do cliente
- Especificação: RFC 6265
- Estão dentro do Header File
- de Persistentes e de Sessão
- Manter logins ativos
- Informação de website
- Carrinho de ecommerce

**Caching**
- Repetição de dados
- HOL - Head of Line Blocking
- Foco: css/js e gzip
- Entidade: Web Cache/Proxy server

### HTTP 2.0
- Estabelecer uma conexão principal e persistente entre o cliente e o servidor e a partir dai enviar as requisições dentro da conexão de maneira independente
- Mapeamento melhorado
- Multiplexação 
- Comunicação mais eficiente
- Priorização de recursos utilizando pesos (prioridade)
- UX mais elegante
- Segmentação e compactação
- Reutilização do Header
- Server Push, não é habilitado por default
- Negociação no handshake

### Servidores/Sistemas
- APACHE (1995) - Opensource & free
    - Modular, dinÂmico e carrefável
    - Multiple Request Processing modes (MPMs)
    - Altamente escalável (+ 10.000 conexões simultâneas - fácil)
    - Lida com arquivos estáticos, index, auto indexing e negociação de conteúdo
    - TLS/SSL via OpenSSL ou wolfSSL
    - Servidores virtuais com endereços baseados em IP ou nome
    - Compatibilidade com IPV6
    - Suporte à versão 2.0 do HTTP
    - Proxy reverso, websocket
    - LINUX e Windows
    - 35% de uso
- XAMPP
    - é um pacote, não servidor
    - Usa o Apache server
    - MariaDB
    - Interpretadores script - PHP/Perl
    - Linux, Windows, MAC
    - Teste e desenvolvimento sem acesso a internet
- NGINX (2004)
    - Web server
    - Proxy reverso
    - Load balancer
    - Mail proxy
    - HTTP cache
    - +10mil conexões simultâneas
    - Lida com arquivos estáticos, index, auto-indexing
    - TLS/SSL com SNI via OpenSSL
    - Suporte à HTTP 2.0
    - Compatível com IPV6
    - FastCGI SCGI, uWSGI com cache
    - Suporte a gRPC (v. 1.13.10)
    - Servidores virtuais baseados em IP e nome
    - WebSocket desde 1.3.13
    - URL rewriting and redirection[35][36]
    - 33% de uso

## HTTPS
### Segurança da informação
- Criptografia por chave
    - Chave assimétrica privada - Assinatura, criptografia
    - Chave assimétrica pública - verificação de autenticidade
    - Chave simétrica única privada - conhecimento prévio da chave
        - Substituição da letra pela k-ésima do alfabeto, Rotatividade do alfabeto
        - Cifra de fluxo - mapeamento bit a bit (bits pseudo-aleatório)
        - Cifra de bloco - SSL, PGP, Ipsec (bloco de bits) - mapeamento por permutação 
- Certificado digital
    - Entidade certificadora - Certification Authority
        - Verificação de identidade (Alta confiabilidade)
        - Emissão de certificados
        - IETF - especificação de um servço de autenticação e sintaxe de certificados
        - RFC 14 22 - gerenciamento de chaves baseado em CA em emails seguros

### Protocolo SSL - Secure Socket Layer
- Protocolo de segurança de conexão que funciona por cima do TCP
- Confiabilidade
- Integridade
- Autenticidade end-point
- YouTube, ebay, Amazon, Lojas Americanas, Google Store
- Dados confiáveis
#### Operações do SSL
- Handshake
    - similar ao HTTP
    - Verificação de autencidade
    - Envio da Master Secret Key
- Key Derivation
    - MS - Chave simétrica
    - SessionEncryptation key
    - Verificação da chave MS
- Data Transfer
    - - Transferência efetiva de dados
    - Record+Mac
    - Verificação de integridade da mensagem

## Material
[Slides](https://drive.google.com/file/d/1IeS6XI7uc3Xy3X7kA2rgjKHClwxeP3hR/view)

## Agradecimentos

[Professora Juliana Mascarenhas](https://www.linkedin.com/in/juliana-mascarenhas-ds/)