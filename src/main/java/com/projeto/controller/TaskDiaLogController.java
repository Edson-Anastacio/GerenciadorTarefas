package com.projeto.controller;

import com.projeto.model.Task;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class TaskDialogController {

    @FXML private TextField tfTitulo;
    @FXML private TextArea taDescricao;
    @FXML private ComboBox<String> cbPrioridade;
    @FXML private Button btnSalvar;
    @FXML private Button btnCancelar;

    private Task taskResult = null;

    @FXML
    public void initialize(){
        cbPrioridade.getItems().addAll("Baixa", "Média", "Alta");
        cbPrioridade.setValue("Média");
    }

    public void setTask(Task t){
        tfTitulo.setText(t.getTitulo());
        taDescricao.setText(t.getDescricao());
        cbPrioridade.setValue(t.getPrioridade());
        // keep reference to edit directly
        taskResult = t;
    }

    public Task getResult(){
        return taskResult;
    }

    @FXML
    public void onSalvar(){
        String titulo = tfTitulo.getText().trim();
        if (titulo.isEmpty()){
            Alert a = new Alert(Alert.AlertType.WARNING, "Título é obrigatório.");
            a.showAndWait();
            return;
        }
        if (taskResult == null){
            // novo
            taskResult = new Task(titulo, taDescricao.getText(), cbPrioridade.getValue());
        } else {
            // editar o existente
            taskResult.setTitulo(titulo);
            taskResult.setDescricao(taDescricao.getText());
            taskResult.setPrioridade(cbPrioridade.getValue());
        }
        close();
    }

    @FXML
    public void onCancelar(){
        // se era edição, não altera; se era novo, taskResult fica null
        if (taskResult != null && (tfTitulo.getText()==null || tfTitulo.getText().isBlank())) {
            // nothing
        }
        taskResult = (taskResult != null && taskResult.getTitulo() != null && !taskResult.getTitulo().isBlank()) ? taskResult : null;
        close();
    }

    private void close(){
        Stage s = (Stage) btnSalvar.getScene().getWindow();
        s.close();
    }
}
