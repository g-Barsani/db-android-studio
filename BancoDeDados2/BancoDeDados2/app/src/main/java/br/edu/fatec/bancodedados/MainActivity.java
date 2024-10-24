//package br.edu.fatec.bancodedados;
//
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuInflater;
//import android.view.View;
//import android.widget.EditText;
//import android.widget.SearchView;
//import android.widget.Toast;
//
//import androidx.activity.EdgeToEdge;
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//
//import java.util.List;
//
//import br.edu.fatec.bancodedados.dao.AlunoDAO;
//import br.edu.fatec.bancodedados.model.Aluno;
//
//public class MainActivity extends AppCompatActivity {
//
//        private EditText edtId;
//        private EditText edtNome;
//        private EditText edtCpf;
//        private EditText edtTelefone;
//        private EditText edtListar;
//        private AlunoDAO dao;
//        private List<Aluno> alunos;
//        private Aluno aluno;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//
//
//        edtId = findViewById(R.id.edtId);
//        edtNome = findViewById(R.id.edtNome);
//        edtCpf = findViewById(R.id.edtCpf);
//        edtTelefone = findViewById(R.id.edtTelefone);
//        edtListar = findViewById(R.id.edtListar);
//    }
//
////    @Override
////    public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) {
////        getMenuInflater().inflate(R.menu.menu, menu);
////        return true;
////    }
//
//    public void Novo(View view){
//        edtNome.setText(null);
//        edtCpf.setText(null);
//        edtTelefone.setText(null);
//        edtListar.setText(null);
//    }
//
//    public void salvar(View view){
//        // pegar os dados da tela
//        aluno = new Aluno();
//        aluno.setNome(edtNome.getText().toString());
//        aluno.setCpf(edtCpf.getText().toString());
//        aluno.setTelefone(edtTelefone.getText().toString());
//        // abrir o BD
//        dao = new AlunoDAO(this);
//        // Salvear
//        long id = dao.insert(aluno);
//        Toast.makeText(getApplicationContext(),
//                "Aluno inserido com o ID "+id, Toast.LENGTH_LONG).show();
//    }
//
//    public void buscar(View view) {
//        dao = new AlunoDAO(this);
//        Aluno a = dao.read(Integer.parseInt(edtId.getText().toString()));
//        edtNome.setText(a.getNome());
//        edtCpf.setText(a.getCpf());
//        edtTelefone.setText(a.getTelefone());
//    }
//
//    public void listar(View view) {
//        dao = new AlunoDAO(this);
//        alunos = dao.obterTodos();
//        for (Aluno aluno : alunos) {
//            edtListar.append("ID   : "+aluno.getId()+ "\n");
//            edtListar.append("Nome   : "+aluno.getNome()+ "\n");
//            edtListar.append("CPF   : "+aluno.getCpf()+ "\n");
//            edtListar.append("Telefone   : "+aluno.getTelefone()+ "\n");
//        }
//    }
//}