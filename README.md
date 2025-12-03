# 📝 Gerenciador de Tarefas — JavaFX

Aplicação desktop desenvolvida em **JavaFX** com gerenciamento completo de tarefas (CRUD).  
O projeto permite adicionar, listar, editar, excluir e marcar tarefas como concluídas, com filtro por status e prioridade.

---

## 🚀 Funcionalidades

| Função | Status |
|-------|:-----:|
| Criar tarefas | ✔️ |
| Editar tarefas | ✔️ |
| Remover tarefas | ✔️ |
| Marcar como concluída | ✔️ |
| Lista com tabela interativa | ✔️ |
| Filtro por status (todas, concluídas, pendentes) | ✔️ |
| Prioridade da tarefa (baixa, média, alta) | ✔️ |
| Persistência em memória (ObservableList) | ✔️ |

---

## 🏗 Tecnologias utilizadas

- Java 17+
- JavaFX (FXML)
- Maven (Gerenciador de dependências)
- MVC — Model / View / Controller

---

## 📂 Estrutura do projeto

GerenciadorTarefas/
├── pom.xml
├── README.md
└── src/
└── main/
├── java/com/projeto/
│ ├── Main.java
│ ├── model/Task.java
│ ├── controller/MainController.java
│ ├── controller/TaskDialogController.java
│ └── service/TaskService.java
└── resources/
├── view/main-view.fxml
├── view/task-dialog.fxml
└── css/styles.css


## ▶️ Como executar

Requisitos:  
✔ Java 17 ou superior  
✔ Maven instalado  
