package MesaAula5;

import Aula5.ServicoVacinarProxy;

public class ServicoDownloadProxy implements Download{
    @Override
    public void baixarMusica(String nome, String tipoUsuario) {
        if (tipoUsuario.equalsIgnoreCase("premium")){
            //ServicoDownload servicoDownload = new ServicoDownload();
            //servicoDownload.baixarMusica(nome, tipoUsuario);
            System.out.println(nome + ", download de musica concluido");
        } else {
            System.out.println(nome +", usuario do tipo FREE nao podem efetuar download");
        }
    }
}
