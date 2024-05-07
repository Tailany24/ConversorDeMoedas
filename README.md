## Conversor de  moedas

**Descrição:**

Este é um desafio de programação em Java que consiste em um conversor de moedas. O programa permite que o usuário converta valores entre diferentes moedas selecionadas (USD, ARS, BRL, COP) usando a taxa de câmbio atual obtida de uma API de conversão de moedas.

**Funcionalidades:**

O programa inicia exibindo um menu de seleção de opções.
O usuário pode escolher uma das opções do menu para realizar uma conversão de moeda específica.
As opções do menu incluem pares de moedas pré-definidos, como Dólar para Peso Argentino, Peso Argentino para Dólar, Dólar para Real Brasileiro, Real Brasileiro para Dólar, Dólar para Peso Colombiano, Peso Colombiano para Dólar, ou sair do programa.
Para cada opção selecionada, o programa solicita ao usuário que insira o valor a ser convertido.
Em seguida, o programa faz uma solicitação à API de taxas de câmbio para obter a taxa de câmbio atualizada entre as moedas selecionadas.
Com base na taxa de câmbio obtida, o programa realiza a conversão e exibe o valor convertido.

**Instruções de Uso:**

Execute o programa.
Siga as instruções exibidas no menu para selecionar uma opção.

![Captura de tela 2024-05-07 174713](https://github.com/Tailany24/ConversorDeMoedas/assets/139998931/809b9d0d-4f36-448f-af05-96ae7eba5984)


Insira o valor a ser convertido quando solicitado.
O programa fornecerá o valor convertido com base na taxa de câmbio atual.

![Captura de tela 2024-05-07 175020](https://github.com/Tailany24/ConversorDeMoedas/assets/139998931/092bf895-2760-4682-8b10-b57ebf5c21e2)
![Captura de tela 2024-05-07 175217](https://github.com/Tailany24/ConversorDeMoedas/assets/139998931/ab4cb31a-823d-429d-8bee-b22251fb54d9)



## Requisitos

Java Development Kit (JDK)
Conexão com a Internet para acessar a API de taxas de câmbio.

## Tecnologias Utilizadas:

Java

Biblioteca Gson para manipulação de JSON

Biblioteca HttpClient para fazer requisições HTTP

## Observações:

Este é um projeto simples para demonstrar a implementação básica de um conversor de moedas em Java.
A API de taxas de câmbio usada neste projeto pode exigir uma chave de API para acesso. Certifique-se de ter uma chave de API válida e substitua-a conforme necessário no código.
Este programa pode ser estendido e aprimorado com recursos adicionais, como tratamento de erros mais robusto, suporte a mais moedas, interface gráfica de usuário (GUI), etc.
