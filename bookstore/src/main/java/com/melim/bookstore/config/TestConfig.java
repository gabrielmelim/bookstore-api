package com.melim.bookstore.config;

import com.melim.bookstore.services.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    private DatabaseService databaseService;

    // método cria e adiciona os arquivos no banco de dados h2 , aperte ctr e clique em cima do instanciaBaseDeDados
    // para ser redirecionado a classe que o método está puxando.
    @Bean
    public void instanciaBaseDeDados() {
        this.databaseService.instanciaBaseDeDados();
    }


// Método que cria o banco de dados h2 em memoria, e toda vez que a aplicação rodar ele irá verificar se o banco existe
// se existir ele sobe o banco existente, se não ele cria o banco, porém este método não adiciona os dados do método
// Instancia base de dados ,os dados devem ser adicionados manualmente.

/*    @Value("${spring.datasource.url}")
    private String strategy;

    @Bean
    public boolean instanciaBaseDeDados() {
        if (strategy.equals("jdbc:h2:~/test")) {
            this.databaseService.instanciaBaseDeDados();
        }
        return false;
  } */

}
