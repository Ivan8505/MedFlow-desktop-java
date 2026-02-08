<div align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=28&duration=4000&pause=1000&color=4CAF50&center=true&vCenter=true&width=600&lines=MedFlow+Desktop;%7C+Java+Swing+ERP+%7C+Gest%C3%A3o+Farm%C3%A1cia+%7C" alt="Typing SVG" />
</div>

<br />

# MedFlow Desktop

**MedFlow** é um sistema desktop de gestão (ERP-like) desenvolvido em **Java com Swing**, projetado inicialmente para ambientes como **farmácias** ou empresas do setor de saúde/farmacêutico.  
O foco é praticar arquitetura limpa, separação de responsabilidades e boas práticas de OOP em aplicações desktop reais.

**Objetivo principal**: Construir uma base sólida e expansível para módulos de autenticação, gerenciamento de usuários, produtos, vendas, estoque e relatórios — tudo com baixo acoplamento e testabilidade futura.

**Status atual**: Fase inicial de desenvolvimento (estrutura + autenticação funcional).  
- Login e navegação entre telas implementados.  
- Autenticação mockada (sem banco de dados ainda).  
- Arquitetura em camadas + MVC-ish aplicada.  
- Refatoração ativa (commits recentes melhorando controle de usuários e perfis).  
- Ainda sem persistência real, CRUD completo de produtos/vendas ou relatórios.

### Tecnologias e Stack
- **Java** (JDK 8+ recomendado, compatível com 17+)
- **Java Swing** — interface gráfica (JFrames, CardLayout para troca de telas, tela cheia)
- **OOP avançado** — encapsulamento, interfaces, contratos
- **Arquitetura em Camadas** + MVC-ish:
  - **UI** → telas e layouts
  - **Controller** → lógica de orquestração
  - **Rules / Business** → regras de negócio e validações
- **Sem banco de dados ainda** (autenticação mockada; próximo passo: JDBC/MySQL ou similar)
- **IDE**: NetBeans

### Arquitetura Atual
Pacotes principais (baseado na estrutura `dev.ivanrodrigues.medflow`):
- `ui` → AppUI, Main, Login, Dashboard (telas com CardLayout)
- `controller` → AppUIController, AuthenticationController (controle de fluxo e eventos)
- `rules` → Authentication, AuthenticationRule (regras de negócio, contratos)
- Fluxo: UI → Controller → Rule → Implementação (baixo acoplamento)

**Controle de acesso**:
- Credenciais de teste (mock): **usuário: admin** | **senha: 123456**

### Funcionalidades Implementadas
- Tela de login com validação mockada
- Navegação para dashboard após autenticação
- Controle de acesso por perfil (admin/user)
- Interface modular preparada para expansão (novos módulos via CardLayout)
- Tratamento básico de exceções e feedback ao usuário

**Pendências principais**:
- Integração com banco de dados (JDBC + MySQL para usuários/produtos/vendas)
- CRUD completo (produtos, clientes, vendas, estoque)
- Gerenciamento de usuários e permissões reais
- Relatórios básicos (ex: vendas diárias)
- Melhorias em UI/UX (ícones, validações visuais)
- Testes unitários (JUnit futuro)

### Como Rodar o Projeto
1. **Pré-requisitos**:
   - Java JDK instalado (8+)
   - Git para clonar

2. **Clone o repositório**:
   ```bash
   git clone https://github.com/Ivan8505/MedFlow-desktop-java.git
   cd MedFlow-desktop-java
   ```

3. **Execute** (via IDE ou linha de comando):
   - Abra o projeto na sua IDE (IntelliJ/Eclipse/Netbeans) e rode a classe principal `MedFlow.java`
   - Ou compile e rode manualmente:
     ```bash
     javac -d bin src/dev/ivanrodrigues/medflow/*.java  # ajuste paths
     java -cp bin dev.ivanrodrigues.medflow.MedFlow  # ajuste main class
     ```

   **Nota**: Como não há Maven/Gradle configurado ainda, use a IDE para build/run. Futuramente, adiconarei Maven para dependências e build padronizado.

4. **Teste login**:
   - Usuário: `admin`
   - Senha: `123456`
   - Após login → dashboard abre.

<!-- ### Capturas de Tela (em breve)
Adicione prints reais aqui (commit em `docs/images/`):
- Tela de Login
- Dashboard principal
- Exemplo de módulo futuro

![Tela de Login](docs/images/login.png)  
![Dashboard](docs/images/dashboard.png) -->

### Próximos Passos e Roadmap
1. Implementar persistência (JDBC + MySQL)
2. Substituir auth mockada por real
3. Adicionar módulos: Produtos, Vendas, Estoque
4. Melhorar UI (temas, ícones, responsividade básica)
5. Adicionar logs e tratamento de erros robusto
6. Testes unitários/integração
7. Possível migração parcial para JavaFX (futuro)

### Lições Aprendidas Até Aqui
- Importância da separação de camadas (UI não deve saber de regras de negócio).
- Mocking facilita prototipagem rápida, mas BD real é essencial para validação.
- Refatorar cedo evita dívida técnica (ex: commits recentes ajustando controle de usuários).

### Contato & Contribuição
Quer discutir Java desktop, Swing vs JavaFX, arquitetura em camadas, integração JDBC, ou como aplicar isso em homelab (ex: API backend para app desktop)?  
- LinkedIn: [ivan8505](https://www.linkedin.com/in/ivan8505)  
- Portfólio: [ivanrodrigues.dev](https://ivanrodrigues.dev)  
- Wiki técnica: [xwiki.ivanrodrigues.dev](https://xwiki.ivanrodrigues.dev)

Issues, sugestões e PRs são super bem-vindos — especialmente ajuda com BD, testes ou UI!

Obrigado por visitar! 🚀  
Projetos como esse mostram que aprendizado real vem de construir e evoluir código dia a dia.

---
Última atualização: Fevereiro 2026
