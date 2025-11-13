# 🧪 Teste de Caixa Branca — Atividade de UX/UI  

![Java](https://img.shields.io/badge/Java-17+-orange?logo=java)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen)
![Test Type](https://img.shields.io/badge/Teste-Caixa%20Branca-blue)
![License](https://img.shields.io/badge/Licença-Acadêmica-lightgrey)

---

## 📘 Descrição da Atividade  

Esta atividade teve como objetivo realizar um **teste de caixa branca** sobre um código Java fornecido pelo professor.  
O foco foi compreender o **fluxo de execução**, calcular a **complexidade ciclomática** e identificar os **caminhos básicos** do programa.

Durante o desenvolvimento, foram realizados os seguintes passos:

- 📄 Responder uma **planilha** com 5 perguntas sobre o código;  
- 🧠 Criar o **Grafo de Fluxo** do código;  
- 🧮 Calcular a **Complexidade Ciclomática**;  
- 🧭 Identificar os **Caminhos Básicos**;  
- 🧰 Executar o código após as correções necessárias.  

---

## 📊 Planilha de Análise  

<img width="661" height="412" alt="Planilha de Análise" src="https://github.com/user-attachments/assets/562c1b80-e847-48d2-bf57-88fd69a8773e" />

---

## 🧩 Grafo de Fluxo  

<img width="416" height="622" alt="Grafo de Fluxo" src="https://github.com/user-attachments/assets/147515ed-76b2-408d-8b41-0a87ff95449d" />

---

## 🧮 Cálculo da Complexidade Ciclomática  

A **complexidade ciclomática (M)** mede o número de **caminhos lineares independentes** em um programa.  
A fórmula segue a definição de **Gonçalvez et al. (2019)**:

\[
M = E - N + 2P
\]

**Onde:**
- **E** → número de arestas (transições entre blocos no grafo)  
- **N** → número de nós (blocos de código ou decisões)  
- **P** → número de componentes conectados (geralmente 1)

### 🔹 Cálculo

| Elemento | Descrição | Valor |
|-----------|------------|--------|
| **E** | Arestas do grafo | 11 |
| **N** | Nós identificados | 12 |
| **P** | Componentes conectados | 1 |

Aplicando a fórmula:

\[
M = 11 - 12 + 2(1) = 1
\]

No entanto, o código possui **decisões condicionais** (`if`, `try/catch`, etc.), o que altera o valor final:

\[
M = (\text{número de decisões}) + 1 = 4 + 1 = 5
\]

✅ **Complexidade ciclomática final: 5**

---

## 🧭 Caminhos Básicos  

| Caminho | Fluxo | Descrição |
|----------|--------|------------|
| **1** | `1 → 2 → 3 → 4 → 5 → 6 → 8` | Fluxo normal, sem erros, usuário encontrado. |
| **2** | `1 → 2 → 3 → 4 → 5 → 7 → 9` | Usuário não encontrado (`rs.next()` falso). |
| **3** | `1 → 2 → 10 → 12` | Falha na conexão (`conn == null`). |
| **4** | `1 → 2 → 3 → 4 → 5 → 6 → 8 → catch` | Exceção lançada durante a consulta SQL. |
| **5** | `main() → verificarUsuario() → return false` | Login inválido no método principal. |

---

## 📈 Interpretação  

A **complexidade ciclomática igual a 5** indica que são necessários **cinco casos de teste independentes** para garantir cobertura total do código.  
Quanto maior o valor de M, maior é a probabilidade de **erros lógicos** e **dificuldade de manutenção**.

Essa métrica também auxilia a:
- Identificar **pontos críticos** de decisão;
- Melhorar a **qualidade e legibilidade** do código;
- Garantir **testes mais eficazes** e completos.

---

## 🗄️ Conexão BD  

<img width="565" height="313" alt="Captura de tela 2025-11-13 131635" src="https://github.com/user-attachments/assets/661b1288-61da-4f13-b7d7-019e4a75f553" />

---
##  Console  

**Usuário encontrado**

<img width="320" height="58" alt="Captura de tela 2025-11-13 132734" src="https://github.com/user-attachments/assets/e3b70052-0d74-42ec-9e95-b1fa0fc2c8d4" />

**Usuário não encontrado**

<img width="331" height="57" alt="Captura de tela 2025-11-13 132046" src="https://github.com/user-attachments/assets/69b43ba9-fea7-4106-99df-b43660d586dc" />

**Falha na conexão**

<img width="779" height="55" alt="Captura de tela 2025-11-13 132242" src="https://github.com/user-attachments/assets/82e19f35-b1b0-4f85-806c-d00008610a93" />



---
## 💡 Conclusão  

A partir da análise, o código foi avaliado, corrigido e testado com sucesso.  
A aplicação da métrica de **complexidade ciclomática** e a elaboração do **grafo de fluxo** permitiram uma compreensão mais profunda do comportamento do programa e das suas estruturas de decisão.

---

## 👩‍💻 Tecnologias Utilizadas  

- ☕ **Java** (versão 17+)   
- 🧾 **GitHub Markdown** para documentação  
- 🧠 **Teste de Caixa Branca**
- 🧱 **JDBC (MySQL Connector/J)**
- 🌐 **WampServer / phpMyAdmin** 

---

## 📚 Referência  

> GONÇALVEZ, Priscila de F.; BARRETO, Jeanine dos S.; ZENKER, Aline M.; *et al.*  
> **Testes de software e gerência de configuração**, 2019.

---
### ✨ Autor  
**Nome:** *Gabriel Alberto de Oliveira*  
**Disciplina:** UX/UI — Teste de Caixa Branca  
**Professor:** *Daniel Ohata*  
**Data:** Novembro / 2025
