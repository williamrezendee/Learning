package Model.Services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoService {
	
	public static void GerarArquivoTexto(String textoCriptografado, String codigoAluno) {
		try (FileWriter arquivoTexto = new FileWriter(new File(codigoAluno + ".txt"))) {
			arquivoTexto.write(textoCriptografado);
			arquivoTexto.close();
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	public static String LerArquivoTexto(String codigoAluno) {
		String path = "C:\\temp\\" + codigoAluno + ".txt";
		try (BufferedReader arquivo = new BufferedReader(new FileReader(path))) {
			String linhas = arquivo.readLine();
			String arquivoLido = "";
			while (linhas != null) {
				arquivoLido = linhas;
				linhas = arquivo.readLine();
			}
			return arquivoLido;
		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}
		return null;
	}
	
	public static boolean GerarPastaTemporaria() {
		return new File("c:\\temp").mkdir();
	}
}
