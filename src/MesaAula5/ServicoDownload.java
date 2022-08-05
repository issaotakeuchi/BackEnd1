package MesaAula5;

import java.sql.SQLOutput;

public class ServicoDownload implements  Download{
    @Override
    public void baixarMusica(String nome, String tipoUsuario) {
        System.out.println("download de musica efetuada com sucesso");
    }
}
