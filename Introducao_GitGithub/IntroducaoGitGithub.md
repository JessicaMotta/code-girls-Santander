## ➔ Introdução ao GIT/Github 

Aula ministrada por: [Otávio Reis](https://www.linkedin.com/in/operkles/)

[Download Git](https://git-scm.com/downloads)

* Comandos no Prompt de Comando:

  cmd - para abrir 

  cd - ir até diretório/pasta

  dir - listar pastas

  mkdir - criar uma pasta

  cd .. - voltar para pasta anterior

  del - deleta arquivo

  rmdir - deleta pasta

  cls - limpar tela

  seta pra cima - volta nos comandos anteriores

  echo arquivo > arquivo.txt (criando um novo arquivo escrito arquivo)

  

## ➔ SHA-1

* _O QUE É ?_

  - conjunto de funções hash criptográficas projetadas pela NSA (Agência de Segurança Nacional dos EUA) - 40 digitos.

    

  ### Gerar chave SSH

  _no git bash:_

  * ssh-keygen -t -C < e-mail >

  * cd/c/Users/ircm1/.ssh

  * ls

  * cat id_ed... .pub

  * copia chave

  * cola no github

  * eval $(ssh -agent -s)

  * ssh -add id_ed (sem .pub).

    

  ### Clone de um repositório  no GitHub para um repositório local

  _no git bash:_

  * git clone + link SSH do GitHub do repositório.

  ### Criação de um repositório local e realizando um commit 

  * git init - cria um repositório
  * git add . - para adicionar tudo 
  * git add nome - selecionando o que quer que seja diciondo 
  * ls - listar arquivos
  * cd < nome da pasta >
  * ctrl + L - limpa a tela
  * mkdir + < arquivo que deseja criar >
  * ls para conferir e cd + < nome do arquivo >
  * git init
    - ls -a (mostra arquivos ocultos)
  * git status - verificar arquivos pendentes
  * git add . ou git add * - adiciona todos os arquivos pendentes
  * git commit -m "descrição"

  ### Mandar arquivos commitados para o GITHUB

  **_No GitHub:_**

  - Criar repositório
    - Se já tiver um README, não seleciona a opção.
  - Copiar a URL

  **_No Git Bash:_**

  - git remote add origin < URL >
  - git status
  - git push origin main

  **_Atualizar repositório_**

  - git status
  - git add .
  - git status
  - git commit -m "descrição"
  - git push origin main

  **_Se houver conflito de merge_**

  Qunado existe duas alterações na mesma linha

  - git pull origin master

  

  
