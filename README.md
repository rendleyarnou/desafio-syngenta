# desafio-syngenta

Desafio para seleção de estágio na Syngenta.

## Objetivos

- Contar a quantidade de pixels verdes na imagem 'Syngenta.bmp'.
- Descobrir qual a mensagem escondida na imagem.

## Passos

1. Declarar a variável _imagem_ do tipo **BufferedImage** para que fosse possível manipular o arquivo utilizando a linguagem de programação.

2. Carregar o arquivo **.bmp** utilizando **ImageIO** e o método _read_ instanciando um novo arquivo de **File** convertendo a _String_ "Syngenta.bmp" em um nome de caminho abstrato.

3. Declarar as variáveis _height_ e _width_ e atribuir à elas os valores retornados dos métodos _getHeight_ e _getWidth_ da subclasse **BufferedImage**.

4. Declarar as variáveis _qtdGreen_, _pixelValue_, _red_, _redOutput_

**BufferedImage** - Esta subclasse descreve uma imagem com um buffer acessível de dados de imagem.

- **ImageIO** - Uma classe que contém métodos de conveniência estáticos para localizar ImageReaders e ImageWriters e realizar codificação e decodificação simples.
