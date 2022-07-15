# Introdução ao Git e ao GitHub

## Comandos no Prompt de Comando

- cmd - para abrir
- cd - ir até diretório/pasta
- dir - listar pastas
- mkdir - criar uma pasta
- cd .. - voltar para pasta anterior
- del - deleta arquivo
- rmdir - deleta pasta
- cls - limpar tela
- seta pra cima - volta nos comandos anteriores
- echo arquivo > arquivo.txt (criando um novo arquivo escrito arquivo)

## Termos e significados
### Como o GIT funciona?

- **SHA1** - Security Hash Algorithm
	- conjunto de funções hash criptográficas projetadas pela NSA (Agência de Segurança Nacional dos EUA)
	- a encriptação gera conjunto de caracteres identificador de 40 DÍGITOS.
### Objetos básicos do GIT

1. Blobs
	- contêm o tipo do objeto
	- tamanho da string ou do arquivo
	- \0
	- conteúdo do arquivo
	- armazena metadados do GIT

2. Trees
	- armazena **Blobs**
	- contêm metadados
	- guarda o nome do arquivo
	- estrutura de onde estão os arquivos

3. Commit
	- "JUNTA TUDO"
	- também possuem encriptação (SHA1)

- Sistema distribuído e seguro

## Passo a passo
#### Gerar chave SSH - para se conectar de forma segura ao GitHub

**No Git Bash**
- ssh-keygen -t -C < e-mail >
- cd/c/Users/ircm1/.ssh
- ls
- cat id_ed... .pub
- copia chave
- cola no github
- eval $(ssh -agent -s)
- ssh -add id_ed (sem .pub)

 ***REVISAR MAIS PRA FRENTE DO CURSO***

#### Clonar um repositório do GitHub para seu repositório local

**No Git Bash**
- git clone + link SSH do GitHub do repo.

#### Criando um repositório local e fazendo uma COMMIT

**Git Bash** 
- git init (cria repositório)
- git add
- git commit

**Git Bash Here**
- ls - listar arquivos
- cd < nome da pasta >
- ctrl + L - limpa a tela
- mkdir + < arquivo que deseja criar >
- ls para conferir e cd + < nome do arquivo >
- **git init**
    - ls -a (mostra arquivos ocultos)
- git status - verificar arquivos pendentes
- git add . ou git add * - adiciona todos os arquivos pendentes
- git commit -m "descrição"

#### Mandar arquivos commitados para o GITHUB

**No GitHub**
- Criar repositório
    - Se já tiver um README, não seleciona a opção.
- Copiar a URL

**No Git Bash**
- git remote add origin < URL >
- git status 
- git push origin main

**Atualizar repositório**
- git status
- git add .
- git status
- git commit -m "descrição"
- git push origin main

**Se houver conflito de merge**

Qunado existe duas alterações na mesma linha
- git pull origin master

*REVISAR TUDO, MAIS PRA FRENTE DO CURSO*

# Links para download

[Git](https://git-scm.com/downloads)

# Agradecimentos

[Professor Otávio Reis Perkles](https://www.linkedin.com/in/operkles/)