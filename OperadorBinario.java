package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (num1, num2) -> (num1 + num2) /2;
		System.out.println(media.apply(8.5, 6.8));
		
		BiFunction<Double, Double, String> resultado = (num1, num2) -> {
			double notaFinal = (num1 + num2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";		
		};
		System.out.println(resultado.apply(9.5, 4.1));
		
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(media.andThen(conceito).apply(7.7, 8.5));
	}

}
