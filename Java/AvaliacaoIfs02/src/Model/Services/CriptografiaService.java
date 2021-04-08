package Model.Services;

import org.jasypt.util.password.ConfigurablePasswordEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;

public class CriptografiaService {
	
	private static BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
	private static ConfigurablePasswordEncryptor passwordEncryptor = new ConfigurablePasswordEncryptor();
	
	public static String CriptografarTexto( String textoOriginal, String senhaAluno, String senhaProfessor) {
		textEncryptor.setPasswordCharArray(senhaAluno.toCharArray());
		String textoCriptografado = textEncryptor.encrypt(textoOriginal);
		textEncryptor.setPasswordCharArray(senhaProfessor.toCharArray());
		textoCriptografado = textEncryptor.encrypt(textoCriptografado);
		return textoCriptografado;
	}
	
	public static String DescriptografarTexto(String textoCriptografado, String senhaAluno, String senhaProfessor) {
		textEncryptor.setPasswordCharArray(senhaProfessor.toCharArray());
		String textoOriginal = textEncryptor.decrypt(textoCriptografado);
		textEncryptor.setPasswordCharArray(senhaAluno.toCharArray());
		textoOriginal = textEncryptor.decrypt(textoCriptografado);
		return textoOriginal;
	}
	
	public static String CriptografarSenha(String senha) {
		passwordEncryptor.setAlgorithm("SHA-1");
		passwordEncryptor.setPlainDigest(true);
		String senhaCriptografada = passwordEncryptor.encryptPassword(senha);
		return senhaCriptografada;
	}
	
	public static boolean ValidarSenha(String senhaInformada, String senhaCriptografada) {
		return passwordEncryptor.checkPassword(senhaInformada, senhaCriptografada);
	}
}
