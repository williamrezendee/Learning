package Model.Services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoService {
	
	private static String path = "C:\\temp\\";
	
	public static void CriarArquivo(String texto, File pathFile) {
		try (BufferedWriter arquivoTexto = new BufferedWriter(new FileWriter(pathFile))) {
			arquivoTexto.write(texto);
			arquivoTexto.close();
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	public static File VerificarArquivo(String codigoAluno) {
		File pathFile = new File(path + codigoAluno + ".txt");
		if (pathFile.exists()) {
			return pathFile;
		}
		else {
			return null;
		}	
	}
	
	public static boolean VerificarDiretorio() {
		File pathDir = new File(path);
		if (pathDir.exists()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean CriarDiretorio() {
		return new File(path).mkdir();
	}
	
	public static String LerArquivo(String codigoAluno) {
		File pathFile = new File(path + codigoAluno + ".txt");
		try (BufferedReader arquivo = new BufferedReader(new FileReader(pathFile))) {
			String linhas = arquivo.readLine();
			String texto = null;
			while (linhas != null) {
				texto = linhas;
				linhas = arquivo.readLine();
			}
			return texto;
		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}
		return null;
	}
	
	
}
