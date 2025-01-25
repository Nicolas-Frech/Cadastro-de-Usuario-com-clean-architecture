<b>Projeto de API para Cadastro de Usuários seguindo padrões da Clean Architecture!</b>

Alguns desses padrões são:
- <b>Independência de Framework:</b>
    A arquitetura não depende da existência de alguma biblioteca de software repleto de recursos.
    Isso permite que você use essas estruturas como ferramentas, em vez de ter que sobrecarregar seu sistema com suas restrições limitadas.

- <b>Testabilidade:</b>
    As regras de negócios podem ser testadas sem UI, banco de dados, servidor Web ou qualquer outro elemento externo.

- <b>Independência de UI:</b>
    A UI pode mudar facilmente, sem alterar o resto do sistema. Uma UI da Web pode ser substituída por uma UI de console, por exemplo, sem alterar as regras de negócios.

- <b>Independência de Banco de Dados:</b>
    Você pode trocar Oracle ou SQL Server por Mongo, BigTable, CouchDB ou qualquer outra coisa. Suas regras de negócios não estão vinculadas ao banco de dados.

- <b>Independência de agente externo:</b>
    Na verdade, suas regras de negócios simplesmente não sabem absolutamente nada sobre o mundo exterior.


Para saber mais sobre Clean Arch: https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html
