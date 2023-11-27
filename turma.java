public class Curso {

    // Atributos
    private String nomeCurso;
    private String coordenador;
    private String disciplina;
    private String professor;

    // Construtor
    public Curso(String nomeCurso,  String coordenador,  String disciplina, String professor) {
        this.nomeCurso = nomeCurso;
        this.coordenador = coordenador;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    // Método para ter os nomes dos cursos
    public String getNomeCurso() {
         return nomeCurso;
    }

    // para exibir informações sobre os cursos,disciplina,coordenadores e professores.
    public void exibirInformacoes() {
        
        System.out.println();
        System.out.println("Nome do Curso: " + nomeCurso);
        System.out.println("Coordenador: " + coordenador);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Professor: " + professor);
    }

    // esquema principal para demonstrações
    public static void main(String[] args) {
        // Criando instâncias da classe Curso
    Curso cursoA = new Curso ("Programação em Java","ANA","Programação Java,BD,Redes de Computadores,Algoritmos,Inteligência Artificial","Alice,Lucas,Lorena,Marcos,Ana" );
    Curso cursoB = new Curso ("Programação em C", "Maria", "Sistemas Operacionais,Segurança da Informação,Engenharia de Software,Interface de Usuário,Análise de Dados","Maria,Marcia,Mateus,Marta,Luan" );
    Curso cursoC = new Curso ("Programação em C++", "Jose", "Computação Gráfica,Linguagens de Programação,Criptografia,Computação em Nuvem,Internet das Coisas","Jose,Lucia,Paula,Jovana,Odete" );
    Curso cursoD = new Curso ("Programação em Python", "João", "Desenvolvimento Web,Robótica,Arquitetura de Computadores,Testes de Software,Programação Orientada a Objetos","João,Pedro,Augusto,Jordana,Amanda" );
    Curso cursoE = new Curso ("Programação em Javascript", "Silvia", "Data Science,Computação Movel,Business Intelligence,Big Data, Virtualização","Silvia,Flavia,Luis,Eduarda,Divino" );

        // para exibir todas as informações
        cursoA.exibirInformacoes();
        cursoB.exibirInformacoes();
        cursoC.exibirInformacoes();
        cursoD.exibirInformacoes();
        cursoE.exibirInformacoes();
    }
}
