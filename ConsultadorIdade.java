import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConsultadorIdade {

    public static void main(String[] args) {
        String nome = "Maria"; // Exemplo de nome
        try {
            String resposta = consultarIdadePorNome(nome);
            System.out.println(resposta);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String consultarIdadePorNome(String nome) throws Exception {
        String url = "https://api.agify.io/?name=" + nome;
        HttpURLConnection conexao = (HttpURLConnection) new URL(url).openConnection();
        conexao.setRequestMethod("GET");

        BufferedReader leitor = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
        StringBuilder resposta = new StringBuilder();
        String linha;

        while ((linha = leitor.readLine()) != null) {
            resposta.append(linha);
        }
        leitor.close();

        // Aqui você deve fazer o parse da resposta JSON para obter informações específicas
        return resposta.toString();
    }
}