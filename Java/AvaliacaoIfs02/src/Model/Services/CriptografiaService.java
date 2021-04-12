package Model.Services;

import org.jasypt.util.password.ConfigurablePasswordEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;

public class CriptografiaService {
		
	public static String CriptografarTexto( String textoOriginal, String senhaAluno, String senhaProfessor) {
		BasicTextEncryptor textEncryptor1 = new BasicTextEncryptor();
		textEncryptor1.setPasswordCharArray(senhaAluno.toCharArray());
		String textoCriptografado = textEncryptor1.encrypt(textoOriginal);
		BasicTextEncryptor textEncryptor2 = new BasicTextEncryptor();
		textEncryptor2.setPasswordCharArray(senhaProfessor.toCharArray());
		textoCriptografado = textEncryptor2.encrypt(textoCriptografado);
		return textoCriptografado;
	}
	
	public static String DescriptografarTexto(String textoCriptografado, String senhaAluno, String senhaProfessor) {
		BasicTextEncryptor textEncryptor1 = new BasicTextEncryptor();
		textEncryptor1.setPasswordCharArray(senhaProfessor.toCharArray());
		String textoOriginal = textEncryptor1.decrypt(textoCriptografado);
		BasicTextEncryptor textEncryptor2 = new BasicTextEncryptor();
		textEncryptor2.setPasswordCharArray(senhaAluno.toCharArray());
		textoOriginal = textEncryptor2.decrypt(textoCriptografado);
		return textoOriginal;
	}
	
	public static String CriptografarSenha(String senha) {
		ConfigurablePasswordEncryptor passwordEncryptor = new ConfigurablePasswordEncryptor();
			passwordEncryptor.setAlgorithm("SHA-1");
			passwordEncryptor.setPlainDigest(true);
		String senhaCriptografada = passwordEncryptor.encryptPassword(senha);
		return senhaCriptografada;
	}
	
	public static boolean ValidarSenha(String senhaInformada, String senhaCriptografada) {
		ConfigurablePasswordEncryptor passwordEncryptor = new ConfigurablePasswordEncryptor();
		return passwordEncryptor.checkPassword(senhaInformada, senhaCriptografada);
	}
}
