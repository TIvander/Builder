# Builder
Atividade escolar utilizando padrão de projeto Builder.

Como exemplo, utilizei uma classe que representa um passaporte. 
Um passaporte contém diversas informações, excelente caso para aplicar o padrão builder.
A criação de um passaporte é realizada através da classe PassaporteBuilder, classe responsável por criar o passaporte e 
fazer as devidas críticas nos campos. Utilizei 3 tipos de validação: 
Nome não pode ser vazio;
Data de validade do passaporte não pode ser igual o dia atual e nem inferior a data atual;
Numero de caracteres do campo RG deve ser superior a 9 digitos.
Se as críticas forem validadas, é retornado um objeto criado pela classe PassaporteBuilder para um objeto da classe Passaporte,se não forem validadas, é retornado um IllegalArgumentException pré definido em cada condição.


