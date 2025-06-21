TRABALHO da Disciplina de Sistemas Distribuídos


JEFERSON MATEUS LOPES ALVES - 538653\
DAVID SILVA FERNANDES DE OLIVEIRA - 539402

Trabalho 2 – Remote Method Invocation (RMI)
Estrutura do Projeto:
Baseado na imagem fornecida, a estrutura do projeto é GestaoSupermercadoRMI_Protocolo. As classes que representam as entidades do sistema incluem: Funcionario.java, Caixa.java, Vendedor.java, Balconista.java, Gerente.java, Supermercado.java, Escala.java


A implementação do RMI e do protocolo de requisição-resposta é indicada pelas classes: ProtocoloRemoto.java, ProtocoloRemotoImpl.java, ClientMain.java, ServerMain.java
EscalaImpl.java

A presença do arquivo gson-2.8.9.jar sugere que a serialização e desserialização de dados (representação externa de dados) será feita utilizando JSON, o que atende aos requisitos do trabalho.

Como é arquitetado:

Modelos: As classes Funcionario.java, Caixa.java, Vendedor.java, Balconista.java, Gerente.java, Supermercado.java, e Escala.java representam as entidades e estruturas do supermercado.
Arquitetura Cliente-Servidor: A arquitetura cliente-servidor é baseada em RMI e no protocolo de requisição-resposta. ClientMain.java e ServerMain.java atuam como pontos de entrada para o cliente e o servidor, respectivamente.
Implementação RMI: ProtocoloRemoto.java e ProtocoloRemotoImpl.java (e provavelmente EscalaImpl.java) são as interfaces e implementações dos serviços remotos.
Representação Externa de Dados: A presença da biblioteca GSON (gson-2.8.9.jar) indica que as mensagens de requisição/resposta, incluindo argumentos e resultados, serão serializadas/desserializadas utilizando JSON para a passagem de parâmetros por valor.