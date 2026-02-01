# MedFlow

Sistema desktop desenvolvido em **Java (Swing)** com foco em **arquitetura organizada, boas práticas de Programação Orientada a Objetos (OOP)** e **separação de responsabilidades**, inspirado em sistemas ERP utilizados em ambientes reais.

O projeto está em **fase inicial de desenvolvimento**, porém já conta com uma base sólida de arquitetura, autenticação e controle de telas.

---

## 🎯 Objetivo do Projeto

O **MedFlow** tem como objetivo simular um **sistema completo de gestão (ERP)** para ambientes como farmácias ou empresas do setor de saúde, contemplando:

- Autenticação e controle de acesso
- Interface modular com múltiplas telas
- Separação clara entre UI, Controllers e regras de negócio
- Estrutura preparada para crescimento do sistema (banco de dados, permissões, relatórios, etc.)

---

## 🧱 Arquitetura do Projeto

O projeto segue uma abordagem inspirada em **MVC + Arquitetura em Camadas**, com responsabilidades bem definidas.

### Estrutura de pacotes
```
dev.ivanrodrigues.medflow
├── ui
│   ├── AppUI
│   └── layouts
│       ├── Main
│       ├── Login
│       └── Dashboard
│
├── controller
│   ├── AppUIController
│   └── AuthenticationController
│
├── rules
│   ├── Authentication
│   └── contracts
│       └── AuthenticationRule
│
└── MedFlow
```
### Fluxo de autenticação

UI (Login)
↓
Controller (AuthenticationController)
↓
Rule (AuthenticationRule)
↓
Implementação (Authentication)

A interface gráfica **não acessa regras de negócio diretamente**, garantindo baixo acoplamento e maior facilidade de manutenção.

---

## 🔐 Autenticação (Estado Atual)

Atualmente, a autenticação é **mockada**, utilizada apenas para validação da arquitetura e do fluxo do sistema.

Credenciais de teste:

- **Usuário:** `admin`
- **Senha:** `1234`

> A autenticação será futuramente substituída por validação via banco de dados.

---

## 🖥️ Interface Gráfica

- Desenvolvida utilizando **Java Swing**
- Uso de **CardLayout** para alternância entre telas (Login / Dashboard)
- Interface em tela cheia
- Estrutura preparada para múltiplos módulos

---

## 🔑 Controle de Acesso

O sistema já implementa controle de nível de acesso, permitindo adaptação da interface e das funcionalidades conforme o perfil do usuário:

- `ACCESS_ADMIN_ROLE`
- `ACCESS_USER_ROLE`

---

## 🚧 Status do Projeto

✔ Estrutura inicial definida  
✔ Arquitetura organizada  
✔ Login funcional  
✔ Controle de telas  
🔄 Integração com banco de dados  
🔄 Implementação completa das regras de negócio  
🔄 Persistência de dados e relatórios  

---

## 🛠️ Tecnologias Utilizadas

- **Java**
- **Java Swing**
- **Programação Orientada a Objetos (OOP)**
- **Arquitetura em Camadas / MVC**

---

## 📌 Próximos Passos

- Implementar camada de persistência (Banco de Dados)
- Substituir autenticação mockada por autenticação real
- Criar gerenciamento de usuários
- Evoluir regras de negócio
- Melhorar tratamento de exceções e logs

---

## 👤 Autor

**Ivan Rodrigues**  
Projeto desenvolvido para estudo, prática de arquitetura e consolidação de conceitos em sistemas desktop.

---

Este projeto faz parte do meu portfólio técnico e está em constante evolução.
