package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Classe responsável pela conexão com o banco de dados MySQL (via phpMyAdmin)
 * e validação de usuário.
 */
public class User {

    // Método para conectar ao MySQL
    public Connection conectarBD() {
        Connection conn = null;
        try {
            // Carrega o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Conexão com o mesmo MySQL que o phpMyAdmin acessa
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";     // Usuário criado no phpMyAdmin
            String password = "";   // Senha do usuário

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Conexão bem-sucedida com o banco de dados!");

        } catch (Exception e) {
            System.out.println("❌ Erro ao conectar: " + e.getMessage());
        }

        return conn;
    }

    // Método para verificar login e senha de um usuário
    public boolean verificarUsuario(String login, String senha) {
        boolean autenticado = false;
        String sql = "SELECT nome FROM usuarios WHERE login = ? AND senha = ?";

        try (Connection conn = conectarBD();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, login);
            pst.setString(2, senha);

            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    String nome = rs.getString("nome");
                    System.out.println("Usuário encontrado: " + nome);
                    autenticado = true;
                } else {
                    System.out.println("Usuário não encontrado.");
                }
            }

        } catch (Exception e) {
            System.out.println("Erro ao verificar usuário: " + e.getMessage());
        }

        return autenticado;
    }

    // Teste do sistema
    public static void main(String[] args) {
        User user = new User();
        boolean ok = user.verificarUsuario("maria", "senha456");

        if (ok) {
            System.out.println("✅ Login realizado com sucesso!");
        } else {
            System.out.println("❌ Login inválido!");
        }
    }
}
