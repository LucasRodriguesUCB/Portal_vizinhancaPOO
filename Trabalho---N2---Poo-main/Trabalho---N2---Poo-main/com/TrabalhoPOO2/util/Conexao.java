package com.TrabalhoPOO2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL =
            "jdbc:mysql://localhost:3306/portal_vizinhanca";

    private static final String USUARIO = "root";

    private static final String SENHA = "1234";

    public static Connection conectar() {

        try {

            Connection con = DriverManager.getConnection(URL, USUARIO, SENHA);

            System.out.println("Conectado ao banco!");

            return con;

        } catch (SQLException e) {

            System.out.println("Erro na conexão:");

            e.printStackTrace();

            return null;
        }

    }

}
