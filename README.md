Estrutura do Projeto
Portal_vizinhancaPOO/
├── src (Trabalho---N2---Poo-main)
├── lib/
│   └── mysql-connector-j-9.7.0.jar
├── database/
│   └── portal_vizinhanca.sql
├── nbproject/
├── build.xml
└── manifest.mf

Configuração do Banco de Dados
Abra o MySQL Workbench.
Crie uma nova conexão com seu servidor MySQL.
Abra o arquivo:
database/portal_vizinhanca.sql

Configuração da Conexão
Na classe "conexão" em "util" faça:
String url = "jdbc:mysql://localhost:3306/portal_vizinhanca";
String usuario = "root";
String senha = "sua senha do mySql";

Executando o Projeto
Abra o projeto no NetBeans.
Verifique se o arquivo mysql-connector-j-9.7.0.jar está adicionado nas bibliotecas do projeto.
Compile o projeto.
Execute a aplicação.

Funcionalidades
Cadastro de usuários
Gerenciamento de informações da vizinhança
Integração com banco de dados MySQL
Autor

Jessika Cardoso, Júlia de Almeda, Lucas Alves, Lucas Gabriel
