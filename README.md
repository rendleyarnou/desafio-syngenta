# desafio-syngenta

Desafio para seleção de estágio na Syngenta.

## Objetivos

- Contar a quantidade de pixels verdes na imagem 'Syngenta.bmp'.
- Descobrir qual a mensagem escondida na imagem.

## Passos

1. Declarar a variável _imagem_ do tipo **BufferedImage** para que fosse possível manipular o arquivo utilizando a linguagem de programação.

2. Carregar o arquivo **.bmp** para a variável _imagem_, utilizando **ImageIO** e o método _read_ instanciando um novo arquivo de **File** convertendo a _String_ "Syngenta.bmp" em um nome de caminho abstrato.

3. Declarar as variáveis _height_ e _width_ e atribuir os valores retornados dos métodos _getHeight_ e _getWidth_ da subclasse **BufferedImage**.

4. Declarar as variáveis _qtdGreen_, _pixelValue_, _red_, _redOutput_, _green_, _greenOutput_, _blue_, _blueOutput_ e instanciá-las.

5. Percorrer a imagem com _for_ aninhado de acordo com as variáveis _height_ e _width_.

6. São atribuídos valores para as variáveis declaradas no **item 4**. Para _pixelValue_ é atribuído o retorno do método _.getRGB()_ que retorna um pixel inteiro no modelo de cor RGB padrão (TYPE*INT_ARGB) e espaço de cor sRGB padrão. Em seguida as variáveis \_red*, _green_, _blue_ recebem o retorno das operações para obter os valores RGB em um inteiro, com um byte para cada componente.

7. Uma condição é utilizada para verificar se o valor do pixel se encaixa em um tom de verde, caso verdadeiro a variável _qtdGreen_ incrementa +1, e também as variáveis _redOutput_, _greenOutput_, _blueOutput_ recebem os valores referente ao tom de verde como inteiros.

8. Por fim, são exibidas via terminal a quantidade de pixels verdes contidos na imagem e os valores de cada cor no formato RGB.

- **BufferedImage** - Esta subclasse descreve uma imagem com um buffer acessível de dados de imagem.

- **ImageIO** - Uma classe que contém métodos de conveniência estáticos para localizar ImageReaders e ImageWriters e realizar codificação e decodificação simples.

- **File** - Cria uma nova instância de File convertendo a string de nome de caminho fornecida em um nome de caminho abstrato.

## Plus

- O código comentado contém o algoritmo para alocar em uma matriz de String a posição dos pixels verdes, e exibir via terminal.

- _obs_ - no algoritmo para exibir a matriz tem duas alternativas de formatos a primeira é no formato como a matriz foi preenchida naturalmente e a segunda é no formato RGB, Ex: **#ZZZZZZ**.
