package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "par"
				: "impar";

		Function<String, String> oResultado = valor -> "O resultado é: " + valor;
		
		String resultadoFinal = parOuImpar.andThen(oResultado).apply(13);
		
		System.out.println(resultadoFinal);
		System.out.println(parOuImpar.apply(12));
	}
}
