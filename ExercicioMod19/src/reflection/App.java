package reflection;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
public class App {

	public static void main(String[] args) {
		
		Class<ClasseTabela> classe = ClasseTabela.class;
		Tabela tabela = classe.getAnnotation(Tabela.class);
		System.out.println("Nome da Tabela: "+ tabela.value());

	}

}
