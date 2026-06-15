# 🏘️ Portal da Vizinhança

Sistema desenvolvido em Java com integração ao banco de dados MySQL para gerenciamento e interação entre moradores de uma comunidade.

---

# 📋 Requisitos

Antes de executar o projeto, certifique-se de possuir:

* Java JDK
* NetBeans IDE
* MySQL Server
* MySQL Workbench (opcional)
* Driver MySQL Connector/J

---

# 📁 Estrutura do Projeto

```text
Portal_vizinhancaPOO/
├── src/ (Trabalho---N2---Poo-main)
├── lib/
│   └── mysql-connector-j-9.7.0.jar
├── database/
│   └── portal_vizinhanca.sql
├── nbproject/
├── build.xml
├── manifest.mf
└── .gitignore
```

---

# 🗄️ Configuração do Banco de Dados

## 1. Criar o Banco

Abra o MySQL Workbench e execute o script:

```text
database/portal_vizinhanca.sql
```

O script criará automaticamente o banco de dados e suas tabelas.

## 2. Verificar a Conexão

Na classe responsável pela conexão, configure:

```java
String url = "jdbc:mysql://localhost:3306/portal_vizinhanca";
String usuario = "root";
String senha = "SUA_SENHA";
```

Substitua os valores conforme sua instalação do MySQL.

---

# ⚙️ Configuração do Projeto

## Adicionar o Driver JDBC

Verifique se o arquivo abaixo está presente:

```text
lib/mysql-connector-j-9.7.0.jar
```

Caso necessário:

1. Clique com o botão direito em **Libraries**.
2. Selecione **Add JAR/Folder**.
3. Escolha o arquivo `mysql-connector-j-9.7.0.jar`.

---

# ▶️ Como Executar

## Passo 1

Abra o projeto no NetBeans.

## Passo 2

Certifique-se de que o banco de dados foi criado corretamente.

## Passo 3

Verifique se o driver MySQL está configurado.

## Passo 4

Compile e execute o projeto.

---

# ✨ Funcionalidades

* Cadastro de usuários
* Gerenciamento de informações da vizinhança
* Integração com banco de dados MySQL
* Interface gráfica desenvolvida em Java

---

# 👨‍💻 Autor

**Jéssika Cardoso, Júlia de Almeida, Lucas Gabriel Vigerns, Lucas Alves Rodrigues**

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos.

