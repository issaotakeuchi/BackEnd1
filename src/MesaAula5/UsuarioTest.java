package MesaAula5;

import org.junit.jupiter.api.Test;

public class UsuarioTest {
    @Test
    public void downloadMusica(){
        Usuario u1 = new Usuario("issao", "PREMIUM");
        Usuario u2 = new Usuario("marina", "FREE");

        ServicoDownloadProxy servicoDownloadProxy = new ServicoDownloadProxy();

        servicoDownloadProxy.baixarMusica(u1.getNome(), u1.getTipoUsuario());
        servicoDownloadProxy.baixarMusica(u2.getNome(), u2.getTipoUsuario());

    }
}
