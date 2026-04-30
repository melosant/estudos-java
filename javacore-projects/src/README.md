
---

# ☕ Trilha de Estudos Java: Do Core ao Spring

Este repositório foi criado para documentar minha jornada de especialização na linguagem Java. O objetivo é construir uma base sólida nos fundamentos da linguagem e Orientação a Objetos antes de avançar para o ecossistema Spring.

## 📌 Status do Roadmap

Baseado no meu planejamento estratégico de estudos, sigo o cronograma abaixo:

- [x] **Fase 1: Fundamentos POO** (Objetos, Classes, Encapsulamento, Construtores)
- [ ] **Fase 2: Core POO** (Herança, Polimorfismo, Enums, Interfaces, API de Datas)
- [ ] **Fase 3: Estrutura de Dados** (Collections, Generics)
- [ ] **Fase 4: Tratamento e Programação Funcional** (Exceptions, Lambdas, Streams API)
- [ ] **Fase 5: Design Patterns & Arquitetura** (Arquitetura em Camadas)
- [ ] **Projeto Final: API Simulada de Transações Financeiras**

---

## 🚀 Fase 1: Fundamentos de POO (Mini Projeto: Gestão de Treinos)

Nesta primeira fase, desenvolvi uma aplicação de console para registrar sessões de natação, aplicando conceitos essenciais de robustez de código.

### 🛠️ Conceitos Aplicados:
* **Encapsulamento:** Atributos privados e métodos de acesso (Getters/Setters).
* **Validação de Dados:** Implementação de regras de negócio nos métodos `set`, impedindo que valores negativos sejam atribuídos a tempo ou distância.
* **Sobrecarga de Construtores:** Permite a criação de treinos com ou sem a definição explícita do estilo de nado (default: "Não Definido").
* **Lógica de Negócio:** Método para cálculo de *Pace* médio (ritmo) baseado na distância e tempo.

### 📋 Exemplo de Código (Classe Training)
```java
public void setDistanceMeters(int distanceMeters) {
    if (distanceMeters >= 0) {
        this.distanceMeters = distanceMeters;
    }
}

public double getAveragePace() {
    if (this.distanceMeters == 0 || this.timeSec == 0.0) {
        return 0.0;
    }
    return this.distanceMeters / this.timeSec;
}
```

---

## 🗺️ Roadmap Completo

O planejamento visual que guia este repositório:



### 1. Fundamentos POO
- Modelagem de classes e objetos.
- Regras de proteção de dados (Encapsulamento).

### 2. Core POO
- Reuso de código com Herança.
- Flexibilidade com Polimorfismo.
- Trabalhando com datas modernas (`LocalDate`, `LocalDateTime`).

### 3. Estrutura de Dados
- Uso eficiente de `List`, `Set` e `Map`.

### 4. Java Funcional
- Manipulação de coleções com Streams (Map, Filter, Reduce).
- Tratamento de erros customizados com `Try-Catch`.

### 5. Projeto Final (API de Transações)
- Simulação de um sistema bancário utilizando arquitetura em camadas (Model, Repository, Service, Controller).

---

## 🔧 Como executar os exemplos

1. Certifique-se de ter o **JDK 17+** instalado.
2. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```
3. Acesse a pasta da fase desejada e compile o código:
   ```bash
   javac Main.java
   java Main
   ```

---
⭐ *“A base é o que sustenta o prédio. Codando um degrau de cada vez.”*