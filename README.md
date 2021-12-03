# Ecomercio
atividade proposta em final de semestre
solicitados os seguintes requisitos: 

Itens que devem estar na Aplicação (obrigatório).
Uso de Clean Code - pelo menos 10 itens.
Uso de SOLID - pelo menos 3
Uso de padrão de Projeto - pelo menos 2
Uso de Threads - pelo menos 1
Aplicação deve estar dividido em camadas


onde foi aplicado ?
Uso de SOLID:
1- principio da responsabilidade única (S) > cada classe tem sua responsabilidade, carrinho de compras responsavel pelo tratamento dos produtos (salvar, remover e validar);
e banco de dados somente com o tratamento do cliente.

2- principio do aberto e fechado (O) > foi criado mais de um tipo de produto, sendo que a classe base tem propriedades que podem ser extendidas, não sendo necessário modificar diretamente na classe pai, mas podem ser acrescentadas as modificações nas classes filhas ex: produto importado e produto usado.

3-

uso de padrões de projeto

1-singleton : usado padrão na classe de Banco de dados do cliente, pois não tem a necessidade de instalanciar um novo objeto deste mesmo tipo mais de uma vez

2- 