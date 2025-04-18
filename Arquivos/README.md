# 📁 Capítulo: Trabalhando com Arquivos

Este capítulo aborda como realizar operações de leitura e escrita de arquivos em Java, utilizando principalmente as classes `File`, `BufferedReader`, `BufferedWriter` e estruturas como `try-with-resources`.

## 📚 Conteúdo abordado

- Caminhos de arquivos (`Path`, `File`)
- Leitura de arquivos com `BufferedReader` e `FileReader`
- Escrita em arquivos com `BufferedWriter` e `FileWriter`
- Bloco `try-with-resources` para gerenciamento automático de recursos
- Manipulação de dados lidos de arquivos (`split()`, `parseInt`, `parseDouble`)
- Criação de listas de objetos a partir de arquivos `.csv`
- Tratamento de exceções com `IOException`

## 📌 Exemplo prático

Foi utilizado um arquivo CSV (`pathh.csv`) com o seguinte conteúdo:


Cada linha representa um produto com:
- Nome
- Preço
- Quantidade

### 🧱 Classe `Product`

A classe `Product` contém:
- Atributos: `name`, `price`, `quantity`
- Método `finalPrice()` para calcular o valor total (`price * quantity`)
- Getters e possíveis sobrescritas de `toString()`

### 🧪 Resultado esperado (exemplo)

```bash
Product Name: TV LED | Final Price: R$ 1290.99
Product Name: Video Game Chair | Final Price: R$ 1051.50
Product Name: Iphone X | Final Price: R$ 1800.00
Product Name: Samsung Galaxy 9 | Final Price: R$ 1700.00
