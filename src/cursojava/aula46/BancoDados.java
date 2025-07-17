package cursojava.aula46;

// Posso fazer várias exteções por causa que todas elas são interfaces, se no caso fosse classes, só poderiamos fazer uma extenção.
public interface BancoDados extends SqlDCL, SqlDML, SqlDDL{

    void abrirConexao();
    void fecharConexao();
}
