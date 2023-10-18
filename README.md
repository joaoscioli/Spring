# Spring
⛺TheCodingCabin 👋 Vamos conhecer um pouco desse framework. 
![Spring](https://user-images.githubusercontent.com/105243897/208307870-6c786728-2fae-4633-ae9a-6f84f3768aaa.png)

# Resumo
O Spring Framework é um framework open source para a plataforma Java que oferece um modelo de programação e configuração abrangente para aplicações empresariais modernas. Ele se baseia nos padrões de projeto inversão de controle e injeção de dependência, que permitem criar soluções menos acopladas, mais coesas e mais fáceis de manter. O Spring também fornece suporte a diversas tecnologias, como persistência de dados, integração, segurança, testes, desenvolvimento web e linguagens dinâmicas. O Spring não requer um servidor de aplicação para funcionar, podendo ser executado em qualquer ambiente Java.

# Módulos
#### [Spring Boot](https://spring.io/projects/spring-boot)
O Spring Boot é um framework que facilita o desenvolvimento de aplicações web com o Spring. Ele oferece uma forma rápida e simples de configurar e executar aplicações Spring, sem a necessidade de arquivos XML ou anotações excessivas. O Spring Boot também possui recursos prontos para produção, como métricas, verificações de saúde e configuração externa. O Spring Boot é baseado no Spring Framework, mas não requer o seu conhecimento prévio. 
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-boot 
#### [Spring Framework](https://spring.io/projects/spring-framework#overview) 
O Spring Framework é um dos módulos principais do framework Spring, que oferece suporte ao desenvolvimento de aplicações Java baseadas em injeção de dependências e programação orientada a aspectos. O Spring Framework facilita a criação de aplicações empresariais robustas e escaláveis, com baixo acoplamento e alta coesão. O Spring Framework também integra-se com diversos outros frameworks e tecnologias, como Hibernate, JPA, JMS, REST, etc. 
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-framework#overview 
#### [Spring Data](https://spring.io/projects/spring-data)
O módulo Spring Data do framework Spring é uma solução para facilitar o acesso a dados em aplicações Java. Ele oferece uma abstração para diversas fontes de dados, como bancos relacionais, NoSQL, LDAP, REST e outros. Com o Spring Data, é possível criar repositórios de dados com pouca ou nenhuma codificação, usando convenções de nomes e anotações. Além disso, o Spring Data integra-se com outras tecnologias do Spring, como o Spring Boot, o Spring Security e o Spring MVC. 
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-data 
#### [Spring Cloud](https://spring.io/projects/spring-cloud)
O Spring Cloud é um módulo do framework Spring que oferece soluções para o desenvolvimento de aplicações distribuídas baseadas em microserviços. O Spring Cloud permite integrar facilmente recursos como configuração centralizada, descoberta de serviços, balanceamento de carga, circuit breaker, roteamento dinâmico e monitoramento. O Spring Cloud é compatível com vários provedores de nuvem e plataformas como Netflix OSS, Consul, Kubernetes e Cloud Foundry.
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-cloud 
#### [Spring Cloud Data Flow](https://spring.io/projects/spring-cloud-dataflow)
O Spring Cloud Data Flow é um modulo do framework Spring que permite criar, implantar e gerenciar pipelines de dados complexos usando uma interface gráfica ou uma API REST. O modulo facilita a integração de fontes de dados diversas, como bancos de dados, sistemas de mensagens, serviços web e aplicações em nuvem. O modulo também oferece suporte a padrões de programação reativa e funcional, bem como a escalabilidade e resiliência dos pipelines de dados.
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-cloud-dataflow 
#### [Spring Security](https://spring.io/projects/spring-security)
Spring Security é um módulo do framework Spring que oferece soluções de segurança para aplicações web baseadas em Java. Ele permite configurar o controle de acesso, a autenticação e a autorização dos usuários, além de fornecer recursos como proteção contra ataques CSRF, criptografia de senhas e integração com OAuth2. Spring Security é uma ferramenta poderosa e flexível para garantir a segurança das aplicações web Spring.
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-security 
#### [Spring Authorization Server](https://spring.io/projects/spring-authorization-server)
O Spring Authorization Server é um módulo do framework Spring que permite implementar um servidor de autorização compatível com o padrão OAuth 2.0. Esse módulo facilita a criação de aplicações seguras e escaláveis, que podem delegar a autenticação e a autorização de usuários e recursos para um serviço centralizado. O Spring Authorization Server oferece suporte a vários fluxos de concessão do OAuth 2.0, como authorization code, client credentials, password e refresh token.
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-authorization-server 
#### [Spring for GraphQL](https://spring.io/projects/spring-graphql)
O modulo Spring for GraphQL é uma biblioteca que permite integrar o GraphQL com o framework Spring. O GraphQL é uma linguagem de consulta e manipulação de dados que oferece uma alternativa ao REST. Com o Spring for GraphQL, é possível criar APIs GraphQL que se beneficiam das funcionalidades do Spring, como injeção de dependência, segurança, validação e cache.
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-graphql 
#### [Spring Session](https://spring.io/projects/spring-session)
O Spring Session é um módulo do framework Spring que permite gerenciar o estado da sessão de forma transparente e consistente em diferentes ambientes. O Spring Session oferece suporte a vários mecanismos de armazenamento de sessão, como Redis, MongoDB, JDBC e Hazelcast, e permite integrar facilmente com o Spring Security e o Spring WebFlux.
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-session 
#### [Spring Integration](https://spring.io/projects/spring-integration)
O Spring Integration é um módulo do framework Spring que permite a integração de diferentes sistemas e aplicações usando padrões de projeto de integração corporativa (EIP). O Spring Integration oferece uma abstração de alto nível para enviar e receber mensagens entre componentes, usando canais, adaptadores, filtros, transformadores e roteadores. O Spring Integration facilita a implementação de fluxos de integração complexos e escaláveis com baixo acoplamento e alta coesão.
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-integration 
#### [Spring HATEOAS](https://spring.io/projects/spring-hateoas)
O módulo Spring HATEOAS do framework spring permite criar APIs REST que seguem os princípios do HATEOAS (Hypermedia as the Engine of Application State). Isso significa que as respostas das APIs contêm links para outros recursos relacionados, facilitando a navegação e a descoberta dos dados. O módulo Spring HATEOAS oferece classes e interfaces para modelar e manipular os links, assim como suporte para vários formatos de hypermedia, como HAL, JSON:API e Siren.
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-hateoas 
#### [Spring REST Docs](https://spring.io/projects/spring-restdocs)
O Spring REST Docs é um módulo do framework Spring que permite gerar documentação de APIs REST de forma automatizada e precisa. Ele usa os testes de integração da aplicação para extrair informações sobre os endpoints, os parâmetros, os exemplos de requisição e resposta, e as validações. O Spring REST Docs facilita a criação de documentação de alta qualidade que é consistente com o comportamento real da API.
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-restdocs 
#### [Spring Batch](https://spring.io/projects/spring-batch)
Spring Batch é um framework leve e abrangente que permite o desenvolvimento de aplicações robustas de processamento em lote. Ele fornece funções reutilizáveis que são essenciais para processar grandes volumes de dados, como gerenciamento de transações, leitura e escrita declarativas, estatísticas de execução, reinício, pulo e gerenciamento de recursos. Ele também oferece serviços e recursos técnicos mais avançados que possibilitam a otimização e a particionamento de jobs de alto volume e alto desempenho. Um resumo sobre o módulo Spring Batch do framework Spring é que ele facilita a criação e a execução de jobs de processamento em lote, seguindo uma arquitetura tradicional onde um repositório de jobs é responsável pelo agendamento e pela interação com os jobs. Um job pode ter mais de um step, e cada step normalmente segue a sequência de ler dados, processá-los e escrevê-los. O Spring Batch suporta a versão 6 do Spring e a versão 17 do Java.
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-batch 
#### [Spring AMQP](https://spring.io/projects/spring-amqp)
O Spring AMQP é uma solução de mensagens baseada no framework Spring que usa o protocolo AMQP. Ele oferece uma camada de abstração para enviar e receber mensagens, além de suportar POJOs orientados a mensagens com um "container de listener". O Spring AMQP facilita o gerenciamento dos recursos do AMQP, ao mesmo tempo que promove o uso de injeção de dependência e configuração declarativa .
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-amqp 
#### [Spring  Flo](https://spring.io/projects/spring-flo)
O módulo Spring Flo do framework spring é uma ferramenta para criar e gerenciar fluxos de trabalho visuais. Ele permite definir tarefas, eventos, condições e transições entre eles, usando uma interface gráfica baseada em drag-and-drop. O Spring Flo facilita a implementação de processos complexos e dinâmicos, integrando-se com outros componentes do spring, como o Spring Boot, o Spring Cloud e o Spring Data.
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-flo 
#### [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
O modulo Spring for Apache Kafka é uma biblioteca que permite a integração entre aplicações Spring e o sistema de mensagens Kafka. Ele oferece suporte a anotações para configurar produtores e consumidores de mensagens, bem como templates para simplificar as operações comuns. Além disso, ele permite o uso de recursos avançados do Kafka, como transações, partições e serialização personalizada.
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-kafka
#### [Spring LDAP](https://spring.io/projects/spring-ldap) 
O módulo Spring LDAP do framework spring é uma biblioteca que facilita o acesso e a manipulação de dados armazenados em um servidor LDAP. Ele oferece uma abstração de alto nível para interagir com o LDAP usando objetos Java, além de suportar transações, pooling de conexões e autenticação. O modulo Spring LDAP também se integra com outros componentes do framework spring, como o Spring Security e o Spring Data.
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-ldap 
#### [Spring Shell](https://spring.io/projects/spring-shell) 
O Spring Shell é um módulo do framework Spring que permite criar aplicações interativas baseadas em linha de comando. Ele usa o Spring Boot para configurar e executar a aplicação, e oferece recursos como auto-completar, coloração, conversão de tipos e suporte a scripts.
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-shell 
#### [Spring Statemachine](https://spring.io/projects/spring-statemachine) 
O módulo Spring Statemachine é um framework que permite aos desenvolvedores de aplicações usar conceitos de máquina de estados com aplicações Spring. Uma máquina de estados é uma forma de representar o comportamento de um sistema ou parte dele em termos de estados finitos e transições entre eles. O módulo Spring Statemachine é construído e testado com o JDK 8 e o Spring Framework 5.2.12.RELEASE. Ele não requer nenhuma outra dependência fora do Spring Framework em seu sistema central. Outras partes opcionais (como Zookeeper) têm dependências adicionais além do framework em si. Além disso, os recursos opcionais de segurança e acesso a dados têm dependências nos módulos Spring Security e Spring Data.
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-statemachine 
#### [Spring Web Flow](https://spring.io/projects/spring-webflow)
O módulo Spring Web Flow é uma extensão do framework Spring que permite criar fluxos de navegação dinâmicos e controlados em aplicações web. O Spring Web Flow usa um arquivo XML para definir os estados, as transições e as ações de um fluxo, que pode ser integrado com diferentes tecnologias de apresentação, como JSP, JSF ou Thymeleaf. O Spring Web Flow facilita o desenvolvimento de aplicações web complexas e interativas, oferecendo recursos como conversação, subfluxos, exceções e segurança.
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-webflow 
#### [Spring Web Service](https://spring.io/projects/spring-ws)
O modulo Spring Web Service é uma parte do framework Spring que permite criar e consumir serviços web baseados em SOAP. Ele usa o modelo de contrato-primeiro, ou seja, a definição do serviço é feita a partir de um documento XML chamado WSDL. O módulo Spring Web Service também oferece suporte a diversas funcionalidades como validação, segurança, transformação e monitoramento dos serviços web.
Para sabre mais sobre esse módulo acesse o link: https://spring.io/projects/spring-ws 

# Versões / Atualizações
A versão atual do Spring Framework é a 6.0.13, lançada em novembro de 2022. Essa versão trouxe diversas novidades e melhorias, como:
- Um novo modelo de programação e configuração baseado em Jakarta EE 9, que substituiu o antigo Java EE 8.
- Um suporte aprimorado ao JDK 17, que é a versão mais recente e estável do Java.
- Uma integração mais fácil e eficiente com o GraalVM, que permite a criação de imagens nativas das aplicações Spring.
- Uma simplificação e otimização dos módulos e artefatos do Spring, reduzindo o tamanho e a complexidade das dependências.
Além disso, o Spring Framework está em constante evolução e já está planejando a próxima versão, a 6.1.x, que deve ser lançada em novembro de 2023. Essa versão deve trazer suporte às novas especificações do Jakarta EE 10 e 11, bem como aos JDKs 18, 19, 20 e 21.
O Spring Framework é um framework que se adapta às mudanças e às necessidades dos desenvolvedores Java. Ele oferece uma solução completa e integrada para a criação de aplicações web modernas e de alta qualidade.

# Projetos
Ao verificar os projetos em cada branch, é importante ler os arquivos README dentro de cada projeto.
- Branch 01: 
- Branch 02: 

# Códigos Livros
Os códigos dos livros estão organizados em pastas individuais, cada uma com o nome correspondente a um livro específico. Os códigos originais podem ser encontrados nos links indicados nos arquivos de nota contidos em cada pasta associada a um livro. Por outro lado, os códigos apresentados nas pastas foram desenvolvidos pelo proprietário deste repositório.
- Pasta: Spring_in_Action.
- Pasta: Learning_Spring_Boot.
- Pasta: Pro_Spring_6_An_In_Depth.
- Pasta: Modern_API_Development.

# Livros / Canais / Blogs / Links
Livros:
- Spring in Action, Fifth Edition (Craig Walls)
- Learning Spring Boot 3.0: Simplify the development..., 3rd Edition (Greg L. Turnquist), (Dave Syer), (Mark Heckler), (Josh Long)
- Pro Spring 6 An In-Depth Guide to the Spring Framework, 6th Edition (Iuliana Cosmina, Rob Harrop, Chris Schaefer etc.)
- Modern API Development with Spring and Spring Boot: Design highly... (Sourabh Sharma).
Canais:

Blogs:

Links: